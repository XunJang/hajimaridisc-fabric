package com.xunjang.mc.hajimaridisc.item;

import com.xunjang.mc.hajimaridisc.util.CreateTableUtil;

/**
 * @author XunJang
 * @version 1.0
 * @date 2025/09/02
 * @time 21:34
 */
public class ModCreateTables {

    private ModCreateTables() {

    }

    public static void register() {
        // Add items to tools create tables
        CreateTableUtil.addToTools(ModItems.MUSIC_DISC_HAJIMARI_NO_KYOKU);
    }

}
