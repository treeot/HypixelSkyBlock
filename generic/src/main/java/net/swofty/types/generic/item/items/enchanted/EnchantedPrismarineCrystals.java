package net.swofty.types.generic.item.items.enchanted;


import net.swofty.types.generic.item.ItemType;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.Enchanted;
import net.swofty.types.generic.item.impl.Sellable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;
import net.swofty.types.generic.item.impl.DefaultCraftable;
import net.swofty.types.generic.item.impl.recipes.ShapelessRecipe;

public class EnchantedPrismarineCrystals implements Enchanted, Sellable, DefaultCraftable {
    @Override
    public double getSellValue() {
        return 400;
    }

    @Override
    public SkyBlockRecipe<?> getRecipe() {
        return new ShapelessRecipe(SkyBlockRecipe.RecipeType.FISHING,
                new SkyBlockItem(ItemType.ENCHANTED_PRISMARINE_CRYSTALS), 1)
                .add(ItemType.PRISMARINE_CRYSTALS, 16)
                .add(ItemType.PRISMARINE_CRYSTALS, 16)
                .add(ItemType.PRISMARINE_CRYSTALS, 16)
                .add(ItemType.PRISMARINE_CRYSTALS, 16)
                .add(ItemType.PRISMARINE_CRYSTALS, 16);
    }
}