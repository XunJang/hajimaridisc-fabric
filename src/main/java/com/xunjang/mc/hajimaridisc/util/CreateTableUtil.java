package com.xunjang.mc.hajimaridisc.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 14:16
 */
public class CreateTableUtil {

    private CreateTableUtil() {

    }

    public static void addToTools(Item... items) {
        addToGroup(CreativeModeTabs.TOOLS_AND_UTILITIES, entries -> {
            for (Item item : items) {
                entries.accept(item);
            }
        });
    }

    private static void addToGroup(ResourceKey<CreativeModeTab> registryKey, GroupEntries entries) {
        ItemGroupEvents.modifyEntriesEvent(registryKey).register(entries::execute);
    }

    @FunctionalInterface
    interface GroupEntries {
        void execute(FabricItemGroupEntries entries);
    }

}
