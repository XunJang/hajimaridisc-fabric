package com.xunjang.mc.hajimaridisc.item;

import com.xunjang.mc.hajimaridisc.sound.ModSounds;
import com.xunjang.mc.hajimaridisc.util.ItemPropertiesUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:35
 */
public class ModJukeboxItem {

    public final static Item HAJIMARI_NO_KYOKU;

    static {
        HAJIMARI_NO_KYOKU = new RecordItem(
                15,
                ModSounds.MUSIC_DISC_HAJIMARI_NO_KYOKU,
                ItemPropertiesUtil.unStackableItem().rarity(Rarity.RARE),
                102
        );
    }

    private ModJukeboxItem() {

    }

}

