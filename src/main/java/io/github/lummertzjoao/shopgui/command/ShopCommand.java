package io.github.lummertzjoao.shopgui.command;

import io.github.lummertzjoao.shopgui.ShopGui;
import io.github.lummertzjoao.shopgui.menumanager.menu.ShopMenu;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor {

    private final ShopGui plugin;

    public ShopCommand(ShopGui plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command can not be executed from console");
            return false;
        }
        new ShopMenu(plugin.getPlayerMenuUtility((Player) sender), plugin).open();
        return true;
    }
}
