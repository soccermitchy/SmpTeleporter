package dev.tycho.SmpTravelPoints.model;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItems {
    public static ItemStack teleporter;
    public static ItemStack enderDiamond;

    public static void init() {
        //Teleporter
        teleporter = new ItemStack(Material.BEACON, 1);
        ItemMeta teleporterMeta = teleporter.getItemMeta();
        teleporterMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Teleporter");
        teleporterMeta.addEnchant(Enchantment.CHANNELING, 1, true);
        teleporter.setItemMeta(teleporterMeta);

        //EnderDiamond
        enderDiamond = new ItemStack(Material.DIAMOND, 1);
        ItemMeta enderDiamondMeta = enderDiamond.getItemMeta();
        enderDiamondMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Ender diamond");
        enderDiamondMeta.addEnchant(Enchantment.CHANNELING, 1, true);
        enderDiamond.setItemMeta(enderDiamondMeta);

    }
}
