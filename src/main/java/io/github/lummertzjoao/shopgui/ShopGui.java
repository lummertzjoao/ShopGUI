package io.github.lummertzjoao.shopgui;

import io.github.lummertzjoao.shopgui.command.ShopCommand;
import io.github.lummertzjoao.shopgui.listener.MenuListener;
import io.github.lummertzjoao.shopgui.menumanager.PlayerMenuUtility;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class ShopGui extends JavaPlugin {

    private final Map<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    @Override
    public void onEnable() {
        getCommand("shop").setExecutor(new ShopCommand(this));
        getServer().getPluginManager().registerEvents(new MenuListener(), this);

        getLogger().info("The plugin has been enabled successfully!");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugin has been disabled successfully!");
    }

    public PlayerMenuUtility getPlayerMenuUtility(Player player) {
        if (playerMenuUtilityMap.containsKey(player)) {
            return playerMenuUtilityMap.get(player);
        } else {
            PlayerMenuUtility playerMenuUtility = new PlayerMenuUtility(player);
            playerMenuUtilityMap.put(player, playerMenuUtility);
            return playerMenuUtility;
        }
    }
}
