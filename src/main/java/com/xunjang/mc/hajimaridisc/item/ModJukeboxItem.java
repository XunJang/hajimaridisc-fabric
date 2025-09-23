package com.xunjang.mc.hajimaridisc.item;

import com.xunjang.mc.hajimaridisc.util.ItemPropertiesUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:35
 */
public class ModJukeboxItem {

    public final static Item HAJIMARI_NO_KYOKU;

    static {
        HAJIMARI_NO_KYOKU = new Item(
                ItemPropertiesUtil.unStackableItem()
                        .jukeboxPlayable(ModJukeboxSongKeys.HAJIMARI_NO_KYOKU)
                        .rarity(Rarity.RARE)
        );
    }

    private ModJukeboxItem() {

    }

}

