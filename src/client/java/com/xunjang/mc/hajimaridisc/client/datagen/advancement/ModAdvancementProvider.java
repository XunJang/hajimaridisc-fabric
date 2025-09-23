package com.xunjang.mc.hajimaridisc.client.datagen.advancement;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;

import java.util.function.Consumer;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 06:52
 */
public class ModAdvancementProvider extends FabricAdvancementProvider {

    public ModAdvancementProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        ModAdvancements.singleton().accept(consumer);
    }

}
