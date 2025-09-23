package com.xunjang.mc.hajimaridisc.client.datagen.translation;

import com.xunjang.mc.hajimaridisc.item.ModItems;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/04
 * @time 09:23
 */
public class ModTranslationKey {

    // item "はじまりの曲" music disc text
    public static final String MUSIC_DISC_HAJIMARI_NO_KYOKU;
    public static final String MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC;
    // advancement info text
    public static final String TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU;
    public static final String TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC;

    static {
        MUSIC_DISC_HAJIMARI_NO_KYOKU = ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU.getDescriptionId();
        MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC = MUSIC_DISC_HAJIMARI_NO_KYOKU + ".desc";

        TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU = "text.hajimari_disc.advancement.got_music_disc_hajimari_no_kyoku";
        TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU_DESC = TEXT_ADVANCEMENT_GOT_MUSIC_DISC_HAJIMARI_NO_KYOKU + ".desc";
    }

    private ModTranslationKey() {

    }

}
