package org.skypro.skyshop;

import org.skypro.skyshop.Product;

import java.util.Comparator;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 100;

    public FixPriceProduct(String name){
        super(name);
    }

    @Override
    public double getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString(){
        return "Наименование продукта с фиксированной ценой: " + name + ", Фиксированная цена: " + FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

}
