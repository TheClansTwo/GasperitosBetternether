
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gasperitossbetternether.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.gasperitossbetternether.item.WardenhelmetItem;
import net.mcreator.gasperitossbetternether.item.NecronarmorItem;
import net.mcreator.gasperitossbetternether.item.GiantswordItem;
import net.mcreator.gasperitossbetternether.item.GaspsteelItem;
import net.mcreator.gasperitossbetternether.item.GaspsheartItem;
import net.mcreator.gasperitossbetternether.item.GaspsAlloyItem;
import net.mcreator.gasperitossbetternether.GasperitossBetternetherMod;

public class GasperitossBetternetherModItems {
	public static Item GASPS_ALLOY;
	public static Item GASPSTEEL;
	public static Item WARDENHELMET_HELMET;
	public static Item NECRON;
	public static Item NECRONARMOR_CHESTPLATE;
	public static Item NECRONARMOR_LEGGINGS;
	public static Item NECRONARMOR_BOOTS;
	public static Item GIANTSWORD;
	public static Item GASPSHEART;

	public static void load() {
		GASPS_ALLOY = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gasps_alloy"), new GaspsAlloyItem());
		GASPSTEEL = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gaspsteel"), new GaspsteelItem());
		WARDENHELMET_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "wardenhelmet_helmet"),
				new WardenhelmetItem.Helmet());
		NECRON = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "necron_spawn_egg"), new SpawnEggItem(
				GasperitossBetternetherModEntities.NECRON, -11206656, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
		NECRONARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "necronarmor_chestplate"),
				new NecronarmorItem.Chestplate());
		NECRONARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "necronarmor_leggings"),
				new NecronarmorItem.Leggings());
		NECRONARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "necronarmor_boots"),
				new NecronarmorItem.Boots());
		GIANTSWORD = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "giantsword"), new GiantswordItem());
		GASPSHEART = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gaspsheart"), new GaspsheartItem());
	}
}
