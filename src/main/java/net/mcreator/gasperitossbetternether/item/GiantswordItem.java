
package net.mcreator.gasperitossbetternether.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.gasperitossbetternether.init.GasperitossBetternetherModItems;

public class GiantswordItem extends SwordItem {
	public GiantswordItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GasperitossBetternetherModItems.GIANTSWORD));
			}
		}, 3, -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}
}
