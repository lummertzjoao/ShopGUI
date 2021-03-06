package io.github.lummertzjoao.shopgui;

import org.bukkit.plugin.java.JavaPlugin;

public class ShopGui extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("The plugin has been enabled successfully!");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugin has been disabled successfully!");
    }
}
