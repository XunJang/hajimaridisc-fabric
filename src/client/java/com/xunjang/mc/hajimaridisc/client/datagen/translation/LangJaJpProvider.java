package com.xunjang.mc.hajimaridisc.client.datagen.translation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 09:04
 */
public class LangJaJpProvider extends FabricLanguageProvider {

    public LangJaJpProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "ja_jp");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.MUSIC_DISC_JA_JP);
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.MUSIC_DISC_HAJIMARI_NO_KYOKU);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_JA_JP);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC_JA_JP);
    }

}
