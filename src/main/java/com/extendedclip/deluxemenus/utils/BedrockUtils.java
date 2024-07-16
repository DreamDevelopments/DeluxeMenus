package com.extendedclip.deluxemenus.utils;

import org.bukkit.Bukkit;

public class BedrockUtils {

    private static final boolean bedrockCompatible = Bukkit.getPluginManager().getPlugin("Geyser-Spigot") != null;
    public static boolean isBedrockCompatible() {
        return bedrockCompatible;
    }

    public static boolean isBedrockPlayer(org.bukkit.entity.Player player) {
        boolean b = bedrockCompatible && org.geysermc.api.Geyser.api().isBedrockPlayer(player.getUniqueId());
        return b;
    }

}
