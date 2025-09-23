package com.xunjang.mc.hajimaridisc.client.datagen.tag;

import com.xunjang.mc.hajimaridisc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 22:16
 */
public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(
            FabricDataOutput dataGenerator,
            CompletableFuture<HolderLookup.Provider> completableFuture
    ) {
        super(dataGenerator, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU)
                .addOptionalTag(ItemTags.MUSIC_DISCS);
    }
}
