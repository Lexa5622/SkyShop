package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private static int specialProduct = 0;
    private List<Product> productBasket;


    public ProductBasket() {
        this.productBasket = new LinkedList<>();

    }

    private boolean isEmpty(List<Product> productBasket){
        for(Product product: productBasket){
            if(product != null){
                return false;
            }
        }
        return true;
    }

    public void addProduct(Product product) {
        productBasket.add(product);
    }

    public int getAllPrice() {
        int allPrice = 0;
        for (Product products: productBasket){
            if (products != null){
                allPrice += products.getPrice();
            }
        }
        return allPrice;
    }

    public void printMyBasket(){
        if(isEmpty(productBasket)){
            System.out.println("Корзина пуста.");
            return;
        }
        for (Product product: productBasket){
            if (product != null && product.isSpecial()){
                specialProduct ++;
                System.out.println(product);
            } else {
                System.out.println(product);
            }

        }
        System.out.println("Итого: " + getAllPrice());
        System.out.println("Специальных товаров: " + specialProduct);
    }

    public boolean isNoProductInBasket(String productName){
        for(Product product: productBasket){
            if (product.getName() == productName){
                System.out.println("Такой продукт есть в корзине");
                return false;
            }
        }
        System.out.println("Такого продукта нет в корзине");
        return true;
    }

    public void clearBasket() {
        if (isEmpty(productBasket)) {
            System.out.println("Корзина пуста.");
        }
        productBasket.clear();
        System.out.println("Корзина очищена.");
    }

    public List<Product> removeAllProductsNamedBy(String name){
        List<Product> removeProducts = new LinkedList<>();
        Iterator<Product> iterator = productBasket.iterator();
        while(iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName() == name) {
                removeProducts.add(product);
                iterator.remove();
            }
        }
        if (isEmpty(removeProducts)){
            System.out.println("Список пуст");
        }
        return removeProducts;
    }



}
