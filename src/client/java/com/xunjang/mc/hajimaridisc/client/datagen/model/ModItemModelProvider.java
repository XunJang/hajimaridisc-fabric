package com.xunjang.mc.hajimaridisc.client.datagen.model;

import com.xunjang.mc.hajimaridisc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 20:34
 */
public class ModItemModelProvider extends FabricModelProvider {

    public ModItemModelProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU, ModelTemplates.FLAT_ITEM);
    }

}
