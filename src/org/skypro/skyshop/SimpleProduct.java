package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

public class SimpleProduct extends Product{

    protected double price;

    public SimpleProduct(String name, double price){
        super(name);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Наименование продукта: " + this.name + ", Стоимость: " + price;
    }




}
