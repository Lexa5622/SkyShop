package org.skypro.skyshop;

import javax.xml.namespace.QName;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Наименование продукта: " + this.name + " Стоимость: " + this.price;
    }

}
