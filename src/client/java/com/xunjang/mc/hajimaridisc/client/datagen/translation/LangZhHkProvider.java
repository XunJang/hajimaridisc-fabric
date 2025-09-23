package com.xunjang.mc.hajimaridisc.client.datagen.translation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 09:04
 */
public class LangZhHkProvider extends FabricLanguageProvider {

    public LangZhHkProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "zh_hk");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.MUSIC_DISC_ZH_TW);
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.MUSIC_DISC_HAJIMARI_NO_KYOKU);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_ZH_TW);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC_ZH_TW);
    }

}
