package org.skypro.skyshop;

import org.skypro.skyshop.Product;

public class DiscountProduct extends Product {
    protected double basePrice;
    protected int discountInPercent;

    public void checkParameters(double basePrice, int discountInPercent) throws  IllegalArgumentException{
        if (basePrice <= 0){
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        if (discountInPercent < 0 || discountInPercent > 100){
            throw new IllegalArgumentException("Значение процента не может выходить из диапазона от 0 до 100 включительно");
        }
    }
    public DiscountProduct(String name, int basePrice, int discountInPercent){
        super(name);
        try{
            checkParameters(basePrice, discountInPercent);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
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
