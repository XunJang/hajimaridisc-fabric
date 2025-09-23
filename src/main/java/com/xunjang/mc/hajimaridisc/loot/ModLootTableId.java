package com.xunjang.mc.hajimaridisc.loot;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/03
 * @time 18:32
 */
public class ModLootTableId {

    public static final ResourceLocation ZOMBIE;
    public static final ResourceLocation PILLAGER;
    public static final ResourceLocation VINDICATOR;
    public static final ResourceLocation EVOKER;

    static {
        ZOMBIE = EntityType.ZOMBIE.getDefaultLootTable();
        PILLAGER = EntityType.PILLAGER.getDefaultLootTable();
        VINDICATOR = EntityType.VINDICATOR.getDefaultLootTable();
        EVOKER = EntityType.EVOKER.getDefaultLootTable();
    }

    private ModLootTableId() {

    }

}
