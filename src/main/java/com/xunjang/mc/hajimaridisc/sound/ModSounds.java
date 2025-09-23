package com.xunjang.mc.hajimaridisc.sound;

import com.xunjang.mc.hajimaridisc.common.ModConstant;
import com.xunjang.mc.hajimaridisc.util.RegisterUtil;
import net.minecraft.sounds.SoundEvent;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:33
 */
public class ModSounds {

    public static final SoundEvent MUSIC_DISC_HAJIMARI_NO_KYOKU;

    static {
        MUSIC_DISC_HAJIMARI_NO_KYOKU = RegisterUtil.soundRegister(ModConstant.HAJIMARI_NO_KYOKU_SOUND_PATH);
    }

    private ModSounds() {

    }

    public static void register() {

    }

}
