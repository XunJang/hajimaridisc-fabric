package com.xunjang.mc.hajimaridisc.item;

import com.xunjang.mc.hajimaridisc.common.ModConstant;
import com.xunjang.mc.hajimaridisc.util.ResourceKeyUtil;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.JukeboxSong;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/14
 * @time 20:39
 */
public class ModJukeboxSongKeys {

    public static final ResourceKey<JukeboxSong> HAJIMARI_NO_KYOKU;

    static {
        HAJIMARI_NO_KYOKU = ResourceKeyUtil.getJukeboxSongKey(ModConstant.HAJIMARI_NO_KYOKU_SOUND_KEY);
    }

    private ModJukeboxSongKeys() {

    }

}
