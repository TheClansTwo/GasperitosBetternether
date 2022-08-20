
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gasperitossbetternether.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.gasperitossbetternether.item.WardenhelmetItem;
import net.mcreator.gasperitossbetternether.item.GaspsteelItem;
import net.mcreator.gasperitossbetternether.item.GaspsAlloyItem;
import net.mcreator.gasperitossbetternether.GasperitossBetternetherMod;

public class GasperitossBetternetherModItems {
	public static Item GASPS_ALLOY;
	public static Item GASPSTEEL;
	public static Item WARDENHELMET_HELMET;

	public static void load() {
		GASPS_ALLOY = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gasps_alloy"), new GaspsAlloyItem());
		GASPSTEEL = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "gaspsteel"), new GaspsteelItem());
		WARDENHELMET_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(GasperitossBetternetherMod.MODID, "wardenhelmet_helmet"),
				new WardenhelmetItem.Helmet());
	}
}
