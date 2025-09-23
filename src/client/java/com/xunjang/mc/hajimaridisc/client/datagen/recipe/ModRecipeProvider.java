package com.xunjang.mc.hajimaridisc.client.datagen.recipe;

import com.xunjang.mc.hajimaridisc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 21:31
 */
public class ModRecipeProvider extends FabricRecipeProvider {

    private final List<ItemLike> itemList = List.of(
            ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU
    );

    public ModRecipeProvider(FabricDataOutput dataGeneration, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(dataGeneration, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput consumer) {
        oreSmelting(
                consumer,
                itemList,
                RecipeCategory.MISC,
                Items.DIAMOND,
                5.0F,
                1200,
                ModRecipeGroup.DIAMOND_INGOT
        );

        oreBlasting(
                consumer,
                itemList,
                RecipeCategory.MISC,
                Items.DIAMOND,
                5.0F,
                600,
                ModRecipeGroup.DIAMOND_INGOT
        );
    }

}
