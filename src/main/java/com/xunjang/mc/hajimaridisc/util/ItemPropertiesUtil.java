package com.xunjang.mc.hajimaridisc.util;

import net.minecraft.world.item.Item;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 15:41
 */
public class ItemPropertiesUtil {

    private ItemPropertiesUtil() {

    }

    public static Item.Properties unStackableItem() {
        return new Item.Properties().stacksTo(1);
    }

}
