
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gasperitossbetternether.init;

import net.mcreator.gasperitossbetternether.client.renderer.NecronRenderer;
import net.mcreator.gasperitossbetternether.client.renderer.GaspsRenderer;
import net.mcreator.gasperitossbetternether.client.renderer.DemonGaspsRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class GasperitossBetternetherModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(GasperitossBetternetherModEntities.GASPS, GaspsRenderer::new);
		EntityRendererRegistry.register(GasperitossBetternetherModEntities.DEMON_GASPS, DemonGaspsRenderer::new);
		EntityRendererRegistry.register(GasperitossBetternetherModEntities.NECRON, NecronRenderer::new);
	}
}
