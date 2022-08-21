
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gasperitossbetternether.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.gasperitossbetternether.item.WardenhelmetItem;
import net.mcreator.gasperitossbetternether.item.GiantswordItem;
import net.mcreator.gasperitossbetternether.item.GaspsteelItem;
import net.mcreator.gasperitossbetternether.item.GaspsheartItem;
import net.mcreator.gasperitossbetternether.item.GaspsAlloyItem;
import net.mcreator.gasperitossbetternether.item.CoronaDelReItem;
import net.mcreator.gasperitossbetternether.GasperitossBetternetherMod;

public class GasperitossBetternetherModItems {
	public static Item GASPS_ALLOY;
	public static Item GASPSTEEL;
	public static Item WARDENHELMET_HELMET;
	public static Item GIANTSWORD;
	public static Item GASPSHEART;
	public static Item CORONA_DEL_RE_HELMET;

	public static void load() {
		GASPS_ALLOY = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gasps_alloy"), new GaspsAlloyItem());
		GASPSTEEL = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gaspsteel"), new GaspsteelItem());
		WARDENHELMET_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "wardenhelmet_helmet"),
				new WardenhelmetItem.Helmet());
		GIANTSWORD = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "giantsword"), new GiantswordItem());
		GASPSHEART = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gaspsheart"), new GaspsheartItem());
		CORONA_DEL_RE_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "corona_del_re_helmet"),
				new CoronaDelReItem.Helmet());
	}
}
