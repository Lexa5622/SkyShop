package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {

    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket(5);
        System.out.println("Добавление продуктов ");
        productBasket.addProduct(new SimpleProduct("Рыба", 50));
        productBasket.addProduct(new DiscountProduct("Мясо", 100, 20));
        productBasket.addProduct(new FixPriceProduct("Сыр"));
        productBasket.addProduct(new SimpleProduct("Конфеты", 50));
        productBasket.addProduct(new SimpleProduct("Лук", 200));
        System.out.println("Добавление продуктов - нет места");
        productBasket.addProduct(new SimpleProduct("Лук", 200));
        System.out.println("____________________________________");
        System.out.println("Печать корзины");
        productBasket.printMyBasket();
        System.out.println("____________________________________");
        System.out.println("Стоимость корзины");
        int a = productBasket.getAllPrice();
        System.out.println(a);
        System.out.println("____________________________________");
        System.out.println("Поиск товара - есть");
        productBasket.isNoProductInBasket("Рыба");
        System.out.println("____________________________________");
        System.out.println("Поиск товара - нет");
        productBasket.isNoProductInBasket("Пицуня");
        System.out.println("____________________________________");
        System.out.println("Обнулить корзину");
        productBasket.clearBasket();
        System.out.println("____________________________________");
        System.out.println("Печать пустой корзины");
        productBasket.printMyBasket();
        System.out.println("____________________________________");
        System.out.println("Стоимость пустой корзины");
        System.out.println(productBasket.getAllPrice());

    }
}
