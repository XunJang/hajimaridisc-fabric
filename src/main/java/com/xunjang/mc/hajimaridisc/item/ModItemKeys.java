package com.xunjang.mc.hajimaridisc.item;

import com.xunjang.mc.hajimaridisc.common.ModConstant;
import com.xunjang.mc.hajimaridisc.util.ResourceKeyUtil;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:34
 */
public class ModItemKeys {

    public static final ResourceKey<Item> MUSIC_DISC_HAJIMARI_NO_KYOKU;

    static {
        MUSIC_DISC_HAJIMARI_NO_KYOKU = ResourceKeyUtil.getItemKey(ModConstant.HAJIMARI_NO_KYOKU_DISC_ID);
    }

    private ModItemKeys() {

    }

}
