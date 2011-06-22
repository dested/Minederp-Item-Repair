package com.minederp.itemRepair.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.minederp.itemRepair.ItemRepairPlugin;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;

public class RepairCommands {
	@Command(aliases = { "repair", "r" }, usage = "", desc = "Repair based commands", min = 0, max = 2)
	public static void town(CommandContext args, ItemRepairPlugin plugin, CommandSender sender) throws CommandException {
		if (args.argsLength() == 0 || args.getString(0) == "?"|| args.getString(0).toLowerCase() == "help") {
			sender.sendMessage(ChatColor.YELLOW + "Repair Commands:");
			sender.sendMessage(ChatColor.YELLOW + "  /setid {id}");
			return;
		}

		if (args.argsLength() > 0) {
			if (sender instanceof Player && args.getString(0).equals("setid")) {
				int f = args.getInteger(1);

				Player player = ((Player) sender);
				ItemStack itm = player.getItemInHand();
 
			}

		}
	}

}