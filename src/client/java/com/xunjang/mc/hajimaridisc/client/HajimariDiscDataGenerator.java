package com.xunjang.mc.hajimaridisc.client;

import com.xunjang.mc.hajimaridisc.client.datagen.advancement.ModAdvancementProvider;
import com.xunjang.mc.hajimaridisc.client.datagen.model.ModItemModelProvider;
import com.xunjang.mc.hajimaridisc.client.datagen.recipe.ModRecipeProvider;
import com.xunjang.mc.hajimaridisc.client.datagen.translation.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class HajimariDiscDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        // Advancement
        pack.addProvider(ModAdvancementProvider::new);
        // Translation
        pack.addProvider(LangEnUsProvider::new);
        pack.addProvider(LangZhCnProvider::new);
        pack.addProvider(LangZhTwProvider::new);
        pack.addProvider(LangZhHkProvider::new);
        pack.addProvider(LangLZhProvider::new);
        pack.addProvider(LangJaJpProvider::new);
        // Model
        pack.addProvider(ModItemModelProvider::new);
        // Recipe
        pack.addProvider(ModRecipeProvider::new);
    }

}