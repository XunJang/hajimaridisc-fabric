package com.xunjang.mc.hajimaridisc.util;

import com.xunjang.mc.hajimaridisc.common.ModConstant;
import net.minecraft.resources.ResourceLocation;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 14:01
 */
public class IdentifierUtil {

    private IdentifierUtil() {

    }

    // Get from path
    public static ResourceLocation fromPath(String path) {
        return ResourceLocation.fromNamespaceAndPath(ModConstant.MOD_NAMESPACE, path);
    }

    // Get from id
    public static ResourceLocation fromId(String id) {
        return ResourceLocation.parse(id);
    }

}
