package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product;

public class ProductBasket {
    private Product[] productBasket;
    private int weight;

    public ProductBasket(int weight) {
        this.productBasket = new Product[weight];
    }

    private boolean isFreePlace() {
        for (Product product : productBasket) {
            if (product == null){
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(){
        int freePlace = 0;
        for(Product product: productBasket){
            if(product == null){
                freePlace++;
            }
        }
        return freePlace == productBasket.length;
    }

    public void addProduct(Product product) {
        if (!isFreePlace()){
            System.out.println("В корзине нет места. Возмите тележку.");
            return;
        }
        for (int i = 0; i < productBasket.length; i++){
            if (productBasket[i] == null){
                productBasket[i] = product;
                break;
            }
        }
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
        if(isEmpty()){
            System.out.println("Корзина пуста.");
            return;
        }
        for (Product product: productBasket){
            if (product != null){
            System.out.println(product);
        }
      }
        System.out.println("Итого: " + getAllPrice());
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
        if (isEmpty()) {
            System.out.println("Корзина пуста.");
        }
        for (int i = 0; i < productBasket.length; i++) {
            if (productBasket[i] != null){
                productBasket[i] = null;
            }
        }
        System.out.println("Корзина очищена.");
    }
}
