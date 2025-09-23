package com.xunjang.mc.hajimaridisc.client.datagen.translation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 09:04
 */
public class LangLZhProvider extends FabricLanguageProvider {

    public LangLZhProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "lzh");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.MUSIC_DISC_LZH);
        translationBuilder.add(ModTranslationKey.MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.MUSIC_DISC_HAJIMARI_NO_KYOKU);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_LZH);
        translationBuilder.add(ModTranslationKey.TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC, ModTranslationText.ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC_LZH);
    }

}
