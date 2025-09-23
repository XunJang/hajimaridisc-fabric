package com.xunjang.mc.hajimaridisc;

import com.xunjang.mc.hajimaridisc.item.ModCreateTables;
import com.xunjang.mc.hajimaridisc.item.ModItems;
import com.xunjang.mc.hajimaridisc.loot.ModGlobalLoots;
import com.xunjang.mc.hajimaridisc.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:08
 */
public class HajimariDisc implements ModInitializer {

    @Override
    public void onInitialize() {
        ModSounds.register();
        ModItems.register();
        ModCreateTables.register();
        ModGlobalLoots.register();
    }

}
