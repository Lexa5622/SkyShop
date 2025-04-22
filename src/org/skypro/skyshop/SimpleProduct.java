package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

import java.io.IOException;
import java.util.Comparator;

public class SimpleProduct extends Product {

    protected double price;
    public void checkPrice(double price) throws IllegalArgumentException{
        if (price <= 0){
            throw new IllegalArgumentException("Отрицательная цена");
        }
    }
    public SimpleProduct(String name, double price){
        super(name);
        try {
            checkPrice(price);

        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
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
