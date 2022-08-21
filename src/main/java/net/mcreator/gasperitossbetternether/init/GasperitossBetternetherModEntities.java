
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
import net.mcreator.gasperitossbetternether.entity.GaspsEntity;
import net.mcreator.gasperitossbetternether.entity.DemonGaspsEntity;
import net.mcreator.gasperitossbetternether.GasperitossBetternetherMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class GasperitossBetternetherModEntities {
	public static EntityType<GaspsEntity> GASPS;
	public static EntityType<DemonGaspsEntity> DEMON_GASPS;
	public static EntityType<NecronEntity> NECRON;

	public static void load() {
		GASPS = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(GasperitossBetternetherMod.MODID, "gasps"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, GaspsEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune()
						.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GaspsEntity.init();
		FabricDefaultAttributeRegistry.register(GASPS, GaspsEntity.createAttributes());
		DEMON_GASPS = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(GasperitossBetternetherMod.MODID, "demon_gasps"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, DemonGaspsEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true))
						.fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DemonGaspsEntity.init();
		FabricDefaultAttributeRegistry.register(DEMON_GASPS, DemonGaspsEntity.createAttributes());
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
