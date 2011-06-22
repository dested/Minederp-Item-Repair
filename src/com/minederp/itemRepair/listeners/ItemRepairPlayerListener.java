package com.minederp.itemRepair.listeners;

import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

import com.minederp.itemRepair.ItemRepairPlugin;

public class ItemRepairPlayerListener extends PlayerListener {

	private final ItemRepairPlugin kingdomsPlugin;

	public ItemRepairPlayerListener(ItemRepairPlugin kingdomsPlugin) {
		this.kingdomsPlugin = kingdomsPlugin;

	}

	public void onPlayerInteract(PlayerInteractEvent event) {
		switch (event.getAction()) {
		case LEFT_CLICK_AIR:

			break;
		case LEFT_CLICK_BLOCK:
			event.setCancelled(!kingdomsPlugin.blockClick(event.getClickedBlock(), event.getPlayer()));

			break;
		case PHYSICAL:
			break;
		case RIGHT_CLICK_AIR:
			break;
		case RIGHT_CLICK_BLOCK:

			break;

		}

		;

	}
}
