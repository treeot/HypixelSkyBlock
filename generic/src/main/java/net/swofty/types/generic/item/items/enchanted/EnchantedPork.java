package net.swofty.types.generic.item.items.enchanted;


import net.swofty.types.generic.item.ItemType;
import net.swofty.types.generic.item.impl.DefaultCraftable;
import net.swofty.types.generic.item.impl.Enchanted;
import net.swofty.types.generic.item.impl.Sellable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;

public class EnchantedPork implements Enchanted, Sellable, DefaultCraftable {
    @Override
    public double getSellValue() {
        return 800;
    }

    @Override
    public SkyBlockRecipe<?> getRecipe() {
        return getStandardEnchantedRecipe(SkyBlockRecipe.RecipeType.FARMING, ItemType.PORKCHOP);
    }
}