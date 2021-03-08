package io.github.lummertzjoao.shopgui.menumanager.menu;

import io.github.lummertzjoao.shopgui.ShopGui;
import io.github.lummertzjoao.shopgui.menumanager.Menu;
import io.github.lummertzjoao.shopgui.menumanager.PlayerMenuUtility;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class AdminPanelMenu extends Menu {

    public AdminPanelMenu(PlayerMenuUtility playerMenuUtility, ShopGui plugin) {
        super(playerMenuUtility, plugin);
    }

    @Override
    public void setMenuItems() {
        inventory.setItem(11, createItem(Material.CHEST, ChatColor.GREEN + "Stock",
                ChatColor.GRAY + "Click here to manage categories and products"));
        inventory.setItem(15, createItem(Material.CLOCK, ChatColor.GREEN + "Settings",
                ChatColor.GRAY + "Click here to manage plugin settings"));

        inventory.setItem(22, createItem(Material.ARROW, ChatColor.RED + "Back",
                ChatColor.GRAY + "Click here to go back to the shop menu"));
    }

    @Override
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        Material type = event.getCurrentItem().getType();
        switch (type) {
            case CHEST:
                // open categories menu
                break;
            case CLOCK:
                // open settings menu
                break;
            case ARROW:
                new ShopMenu(playerMenuUtility, plugin).open();
                break;
        }
    }

    @Override
    public String getMenuName() {
        return "Admin panel";
    }

    @Override
    public int getSlots() {
        return 27;
    }
}
