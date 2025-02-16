package org.skypro.skyshop;

import org.skypro.skyshop.Product;

public class DiscountProduct extends Product {
    protected double basePrice;
    protected int discountInPercent;

    public DiscountProduct(String name, int basePrice, int discountInPercent){
        super(name);
        this.basePrice = basePrice;
        this.discountInPercent = discountInPercent;
    }

    @Override
    public double getPrice() {
        return (basePrice - (basePrice * discountInPercent / 100));
    }

    @Override
    public String toString(){
        return "Наименование продукта со скидкой: " + name + ", Стоимость: " + getPrice() + " (скидка: " + discountInPercent + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
