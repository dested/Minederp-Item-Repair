package com.minederp.itemRepair.games;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import com.sk89q.minecraft.util.commands.CommandContext;

public class GameLogic extends Game {

	List<Game> Games = new ArrayList<Game>();

	public void addGame(Game g) {
		Games.add(g);
		g.onLoad(this);

	}

	@Override
	public void onLoad(GameLogic n) {

	}

	@Override
	public boolean canPlayerJoin(Player player) {
		for (Game g : Games)
			if (g.canPlayerJoin(player))
				return true;
		return false;
	}

	public List<GameItem> blocksForReprint = new ArrayList<GameItem>();

	public void clearReprint(World w, String key) {
		if (blocksForReprint.size() > 0) {
			
			for (int i = blocksForReprint.size() - 1; i >= 0; i--) {
				GameItem it = blocksForReprint.get(i);
				if (it.Key.equals(key)) {
					w.getBlockAt(it.X, it.Y, it.Z).setTypeIdAndData(it.Type, it.Data, false);
					blocksForReprint.remove(i);
				}

			}

		}

	}

	@Override
	public void updatePlayerGamePosition(Player player, Location to) {

		for (Game g : Games)
			g.updatePlayerGamePosition(player, to);

	}

	@Override
	public void joinGame(Player player) {
		for (Game g : Games)
			g.joinGame(player);

	}

	@Override
	public void leaveGame(Player player) {
		for (Game g : Games)
			g.leaveGame(player);
	}

	@Override
	public void processCommand(String msg, CommandContext args, Player player) {
		for (Game g : Games)
			g.processCommand(msg, args, player);
	}

	@Override
	public boolean blockDestroyed(Block block, Player clickedPlayer) {
		for (Game g : Games)
			if (g.blockDestroyed(block, clickedPlayer))
				return true;
		return false;
	}

	@Override
	public boolean blockClick(Block block, Player clickedPlayer) {
		for (Game g : Games)
			if (g.blockClick(block, clickedPlayer))
				return true;
		return false;
	}

	@Override
	public void playerRespawn(Player player) {
		for (Game g : Games)
			g.playerRespawn(player);

	}

	@Override
	public void playerDied(Player player) {
		for (Game g : Games)
			g.playerDied(player);
	}

	@Override
	public boolean playerFight(Player damagee, Player damager) {
		for (Game g : Games)
			if (g.playerFight(damagee, damager))
				return true;
		return false;

	}

	@Override
	public void playerDying(Player entity) {
		for (Game g : Games)
			g.playerDying(entity);
	}

	@Override
	public void entityDied(Entity entity, EntityDeathEvent event) {
		for (Game g : Games)
			g.entityDied(entity, event);

	}

	@Override
	public void entityHurt(Entity entity, EntityDamageEvent event) {
		for (Game g : Games)
			g.entityHurt(entity, event);

	}

	@Override
	public boolean blockPlaced(Block block, Player player) {
		for (Game g : Games)
			if (g.blockPlaced(block, player))
				return true;
		return false;
	}

}
