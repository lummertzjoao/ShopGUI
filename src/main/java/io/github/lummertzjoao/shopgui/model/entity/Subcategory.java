package io.github.lummertzjoao.shopgui.model.entity;

public class Subcategory extends Category {

    private final Category parentCategory;

    public Subcategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Category getParentCategory() {
        return parentCategory;
    }
}
