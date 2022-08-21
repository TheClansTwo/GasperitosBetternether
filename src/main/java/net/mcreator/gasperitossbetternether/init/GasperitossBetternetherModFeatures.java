
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gasperitossbetternether.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.gasperitossbetternether.world.features.ArenaFeature;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class GasperitossBetternetherModFeatures {
	public static void load() {
		register("arena", ArenaFeature.feature(), ArenaFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(Fabric119Mod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep,
				ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(Fabric119Mod.MODID, registryName)));
	}
}
