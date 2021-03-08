package io.github.lummertzjoao.shopgui.menumanager.menu;

import io.github.lummertzjoao.shopgui.ShopGui;
import io.github.lummertzjoao.shopgui.menumanager.PaginatedMenu;
import io.github.lummertzjoao.shopgui.menumanager.PlayerMenuUtility;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ShopMenu extends PaginatedMenu {

    public ShopMenu(PlayerMenuUtility playerMenuUtility, ShopGui plugin) {
        super(playerMenuUtility, plugin);
    }

    @Override
    public void setMenuItems() {
        super.addMenuBorder();

        if (playerMenuUtility.getPlayer().hasPermission("shopgui.admin")) {
            inventory.setItem(getSlots() - 1, super.createItem(Material.NETHER_STAR,
                    ChatColor.GREEN + "Admin panel",
                    ChatColor.GRAY + "Click here to open the admin panel"));
        }
    }

    @Override
    public void onInventoryClick(InventoryClickEvent event) {
        Material type = event.getCurrentItem().getType();
        Player player = (Player) event.getWhoClicked();

        if (type == Material.NETHER_STAR) {
            new AdminPanelMenu(playerMenuUtility, plugin).open();
        } else if (type == Material.DARK_OAK_DOOR) {
            player.closeInventory();
        }
    }

    @Override
    public String getMenuName() {
        return "Shop";
    }

    @Override
    public int getSlots() {
        return 54;
    }
}
