package com.xunjang.mc.hajimaridisc.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 15:39
 */
public class ResourceKeyUtil {

    private ResourceKeyUtil() {

    }

    // Get Item Register Key
    public static ResourceKey<Item> getItemKey(String itemName) {
        return ResourceKey.create(Registries.ITEM, IdentifierUtil.fromPath(itemName));
    }

}
