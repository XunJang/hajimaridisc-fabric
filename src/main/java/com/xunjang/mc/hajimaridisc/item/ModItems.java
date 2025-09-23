package com.xunjang.mc.hajimaridisc.item;


import com.xunjang.mc.hajimaridisc.util.RegisterUtil;
import net.minecraft.world.item.Item;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:34
 */
public class ModItems {

    public static final Item MUSIC_DISC_HAJIMARI_NO_KYOKU;

    static {
        MUSIC_DISC_HAJIMARI_NO_KYOKU = RegisterUtil.itemRegister(
                ModItemKeys.MUSIC_DISC_HAJIMARI_NO_KYOKU,
                ModJukeboxItem.HAJIMARI_NO_KYOKU
        );
    }

    private ModItems() {

    }

    public static void register() {

    }

}
