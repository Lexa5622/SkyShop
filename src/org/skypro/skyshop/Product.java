package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

public abstract class  Product implements Searchable {
    private final String TYPE = "PRODUCT";
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public boolean isSpecial(){
        return false;
    }

    @Override
    public String toString(){
        return "Наименование продукта: " + this.name;
    }

    @Override
    public String searchTerm() {
        return name;
    }

    @Override
    public String searchContent() {
        return TYPE;
    }
}
