package io.github.lummertzjoao.shopgui.model.entity;

import org.bukkit.Material;

import java.util.List;

public class MenuItem {

    private int slot;
    private Material icon;
    private List<String> lore;

    public MenuItem(int slot, Material icon, List<String> lore) {
        this.slot = slot;
        this.icon = icon;
        this.lore = lore;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Material getIcon() {
        return icon;
    }

    public void setIcon(Material icon) {
        this.icon = icon;
    }

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }
}
