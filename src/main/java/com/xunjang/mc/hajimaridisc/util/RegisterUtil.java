package com.xunjang.mc.hajimaridisc.util;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 16:13
 */
public class RegisterUtil {

    private RegisterUtil() {

    }

    // Item Register
    public static Item itemRegister(ResourceKey<Item> itemKey, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    // SoundEvent Register
    public static SoundEvent soundRegister(String path) {
        ResourceLocation resourceLocation = IdentifierUtil.fromPath(path);

        return Registry.register(
                BuiltInRegistries.SOUND_EVENT,
                resourceLocation,
                SoundEvent.createVariableRangeEvent(resourceLocation)
        );
    }

}
