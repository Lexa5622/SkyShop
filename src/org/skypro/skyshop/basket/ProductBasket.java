package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product;

import java.util.*;

public class ProductBasket {
    private static int specialProduct = 0;
    private static int numOfBasket = 0;
    private List<Product> basket;
    private String name;
    private Map<String, List<Product>> productBasket;


    public ProductBasket() {
        this.basket = new ArrayList<>();
        this.name = "Корзина № " + numOfBasket;
        numOfBasket ++;
        this.productBasket = new HashMap<>();

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
        if (productBasket.get(name) != null) {
            productBasket.get(name).add(product);
        } else {
            productBasket.put(name, basket);
        }
    }


    public int getAllPrice() {
        int allPrice = 0;
        for (Product products: basket){
            if (products != null){
                allPrice += products.getPrice();
            }
        }
        return allPrice;
    }

    public void printMyBasket(){
        if(isEmpty(basket)){
            System.out.println("Корзина пуста.");
            return;
        }
        for (Product product: basket){
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
        for(Product product: basket){
            if (Objects.equals(product.getName(), productName)){
                System.out.println("Такой продукт есть в корзине");
                return false;
            }
        }
        System.out.println("Такого продукта нет в корзине");
        return true;
    }

    public void clearBasket() {
        if (isEmpty(basket)) {
            System.out.println("Корзина пуста.");
        }
        basket.clear();
        productBasket.clear();
        System.out.println("Корзина очищена.");
    }

    public List<Product> removeAllProductsNamedBy(String name){
        List<Product> removeProducts = new LinkedList<>();
        Iterator<Product> iterator = basket.iterator();
        while(iterator.hasNext()) {
            Product product = iterator.next();
            if (Objects.equals(product.getName(), name)) {
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
