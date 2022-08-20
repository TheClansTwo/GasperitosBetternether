
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gasperitossbetternether.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.gasperitossbetternether.entity.NecronEntity;
import net.mcreator.gasperitossbetternether.GasperitossBetternetherMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class GasperitossBetternetherModEntities {
	public static EntityType<NecronEntity> NECRON;

	public static void load() {
		NECRON = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(GasperitossBetternetherMod.MODID, "necron"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, NecronEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune()
						.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		NecronEntity.init();
		FabricDefaultAttributeRegistry.register(NECRON, NecronEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1)
				.trackedUpdateRate(64).build();
	}
}
