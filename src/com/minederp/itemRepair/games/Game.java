package com.minederp.itemRepair.games;

import org.bukkit.Location;
import org.bukkit.block.Block; 
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import com.sk89q.minecraft.util.commands.CommandContext;

public abstract class Game {

	public abstract void onLoad(GameLogic logic);

	public abstract boolean canPlayerJoin(Player player);

	public abstract void updatePlayerGamePosition(Player player, Location to);

	public abstract void joinGame(Player player);

	public abstract void leaveGame(Player player);

	public abstract void processCommand(String header, CommandContext args, Player player);

	public abstract boolean blockDestroyed(Block block, Player clickedPlayer);

	public abstract boolean blockClick(Block block, Player clickedPlayer);

	public abstract void playerRespawn(Player player);

	public abstract void playerDied(Player player);

	public abstract boolean playerFight(Player damagee, Player damager);

	public abstract void playerDying(Player entity);

	public abstract void entityDied(Entity  entity, EntityDeathEvent event);

	public abstract void entityHurt(Entity entity, EntityDamageEvent event);

	public abstract boolean blockPlaced(Block block, Player player) ;

}