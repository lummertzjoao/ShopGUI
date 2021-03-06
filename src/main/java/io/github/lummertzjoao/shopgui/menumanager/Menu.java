package io.github.lummertzjoao.shopgui.menumanager;

import io.github.lummertzjoao.shopgui.ShopGui;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public abstract class Menu implements InventoryHolder {

    protected final PlayerMenuUtility playerMenuUtility;
    protected Inventory inventory;
    protected final ItemStack FILLER_GLASS = createItem(Material.GRAY_STAINED_GLASS_PANE, " ");

    protected final ShopGui plugin;

    public Menu(PlayerMenuUtility playerMenuUtility, ShopGui plugin) {
        this.playerMenuUtility = playerMenuUtility;
        this.plugin = plugin;
    }

    public void open() {
        inventory = Bukkit.createInventory(this, getSlots(), getMenuName());
        this.setMenuItems();
        playerMenuUtility.getPlayer().openInventory(inventory);
    }

    public abstract void setMenuItems();

    public abstract void onInventoryClick(InventoryClickEvent event);

    public abstract String getMenuName();

    public abstract int getSlots();

    public ShopGui getPlugin() {
        return plugin;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ItemStack createItem(Material material, String displayName, String... lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }
}
