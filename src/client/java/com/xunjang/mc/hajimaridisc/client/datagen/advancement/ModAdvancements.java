package com.xunjang.mc.hajimaridisc.client.datagen.advancement;

import com.xunjang.mc.hajimaridisc.client.datagen.translation.ModTranslationKey;
import com.xunjang.mc.hajimaridisc.common.ModConstant;
import com.xunjang.mc.hajimaridisc.item.ModItems;
import com.xunjang.mc.hajimaridisc.util.IdentifierUtil;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 07:08
 */
public class ModAdvancements implements Consumer<Consumer<AdvancementHolder>> {

    private static ModAdvancements advancements;

    private ModAdvancements() {

    }

    public static synchronized ModAdvancements singleton() {
        if (advancements == null) {
            advancements = new ModAdvancements();
        }

        return advancements;
    }

    @Override
    public void accept(Consumer<AdvancementHolder> consumer) {
        Advancement rootAdvancement = Advancement.Builder.advancement()
                .display(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU,
                        Component.translatable(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU),
                        Component.translatable(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC),
                        IdentifierUtil.fromId("textures/gui/advancements/backgrounds/adventure.png"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .addCriterion(
                        "got_music_disc_hajimari_no_kyoku",
                        InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU)
                )
                .save(consumer, ModConstant.MOD_NAMESPACE + "/root")
                .value();
    }

}