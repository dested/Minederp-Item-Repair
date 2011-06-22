package com.minederp.itemRepair.listeners;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;

import com.minederp.itemRepair.ItemRepairPlugin;

public class ItemRepairBlockListener extends BlockListener {

	private final ItemRepairPlugin kingdomsPlugin;

	public ItemRepairBlockListener(ItemRepairPlugin kingdomsPlugin) {
		this.kingdomsPlugin = kingdomsPlugin;

	}
 

	public void onBlockBreak(BlockBreakEvent event) { 
	}
}
