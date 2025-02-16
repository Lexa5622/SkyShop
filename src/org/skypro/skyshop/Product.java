package org.skypro.skyshop;

import javax.xml.namespace.QName;

public abstract class Product {
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

}
