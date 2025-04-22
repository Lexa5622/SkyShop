package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

import java.io.IOException;

public abstract class  Product implements Searchable {
    private final String TYPE = "PRODUCT";
    protected String name;

    public void checkName(String name) throws IllegalArgumentException {
       if (name == null){
           throw new IllegalArgumentException("Наименование не может быть пустым");
       }
        if (name.isBlank()){
            throw new IllegalArgumentException("Пустое наименование");
        }
    }
    public Product(String name) {
        try {
            checkName(name);
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        this.name = name;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Product otherProduct = (Product) obj;
        return name.equals(otherProduct.name);
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public boolean isSpecial(){
        return false;
    }

    @Override
    public String toString(){
        return "Наименование продукта: " + this.name;
    }

    @Override
    public String searchTerm() {
        return name;
    }

    @Override
    public String searchContent() {
        return TYPE;
    }
}
