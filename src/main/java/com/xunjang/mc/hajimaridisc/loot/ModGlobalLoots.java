package com.xunjang.mc.hajimaridisc.loot;

import com.xunjang.mc.hajimaridisc.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/03
 * @time 19:31
 */
public class ModGlobalLoots {

    static {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) ->
        {
            if (source.isBuiltin() && ModLootTableId.ZOMBIE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .when(LootItemKilledByPlayerCondition.killedByPlayer())
                        .when(LootItemRandomChanceCondition.randomChance(0.0063F))
                        .add(LootItem.lootTableItem(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU));
                tableBuilder.withPool(poolBuilder);
            }

            if (source.isBuiltin() && ModLootTableId.PILLAGER.equals(id) || ModLootTableId.VINDICATOR.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .when(LootItemKilledByPlayerCondition.killedByPlayer())
                        .when(LootItemRandomChanceCondition.randomChance(0.052F))
                        .add(LootItem.lootTableItem(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU));

                tableBuilder.withPool(poolBuilder);
            }

            if (source.isBuiltin() && ModLootTableId.EVOKER.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .when(LootItemKilledByPlayerCondition.killedByPlayer())
                        .when(LootItemRandomChanceCondition.randomChance(0.105F))
                        .add(LootItem.lootTableItem(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU));

                tableBuilder.withPool(poolBuilder);
            }
        });
    }

    private ModGlobalLoots() {

    }

    public static void register() {

    }

}
