package org.skypro.skyshop;

import org.skypro.skyshop.Search.SearchEngine;
import org.skypro.skyshop.Search.Searchable;
import org.skypro.skyshop.basket.ProductBasket;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket(5);
        System.out.println("Добавление продуктов ");
        productBasket.addProduct(new SimpleProduct("Рыба", 50));
        productBasket.addProduct(new DiscountProduct("Мясо", 100, 20));
        productBasket.addProduct(new FixPriceProduct("Сыр"));
        productBasket.addProduct(new SimpleProduct("Конфеты", 50));
        productBasket.addProduct(new SimpleProduct("Лук", 200));
        System.out.println("Interfaces");

        Searchable searchable = new SimpleProduct("Рыба", 50);
        Searchable searchable1 = new DiscountProduct("Мясо", 100, 20);
        Searchable searchable2 = new FixPriceProduct("Сыр");
        Searchable searchable3 = new Article("Title", "Text");

        SearchEngine searchEngine = new SearchEngine(5);

        searchEngine.add(searchable);
        searchEngine.add(searchable2);
        searchEngine.add(searchable2);
        searchEngine.add(searchable3);
        searchEngine.add(searchable3);

        String s = searchEngine.search("Сыр");
        String s1 = searchEngine.search("Text");
        System.out.println("Продукты");
        System.out.println(s);
        System.out.println("Статьи");
        System.out.println(s1);
//        System.out.println("Добавление продуктов - нет места");
//        productBasket.addProduct(new SimpleProduct("Лук", 200));
//        System.out.println("____________________________________");
//        System.out.println("Печать корзины");
//        productBasket.printMyBasket();
//        System.out.println("____________________________________");
//        System.out.println("Стоимость корзины");
//        int a = productBasket.getAllPrice();
//        SimpleProduct simpleProduct = new SimpleProduct("ntcn", 200);
//        String b = simpleProduct.searchTerm(simpleProduct);
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println("____________________________________");
//        System.out.println("Поиск товара - есть");
//        productBasket.isNoProductInBasket("Рыба");
//        System.out.println("____________________________________");
//        System.out.println("Поиск товара - нет");
//        productBasket.isNoProductInBasket("Пицуня");
//        System.out.println("____________________________________");
//        System.out.println("Обнулить корзину");
//        productBasket.clearBasket();
//        System.out.println("____________________________________");
//        System.out.println("Печать пустой корзины");
//        productBasket.printMyBasket();
//        System.out.println("____________________________________");
//        System.out.println("Стоимость пустой корзины");
//        System.out.println(productBasket.getAllPrice());

    }
}
