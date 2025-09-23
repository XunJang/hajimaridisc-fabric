package com.xunjang.mc.hajimaridisc.client.datagen.translation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 09:04
 */
public class LangZhHkProvider extends FabricLanguageProvider {

    public LangZhHkProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "zh_hk", registryLookup);
    }

    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.MUSIC_DISC_ZH_TW);
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.MUSIC_DISC_HAJIMARI_NO_KYOKU);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_ZH_TW);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC_ZH_TW);
    }

}
