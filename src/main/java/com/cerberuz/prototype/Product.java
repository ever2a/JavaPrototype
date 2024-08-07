package com.cerberuz.prototype;

@SuppressWarnings("rawtypes")
public class Product implements IPrototype {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public IPrototype simpleClone() {
        Product productoClone = new Product(this.name, this.price);
        return productoClone;
    }

    @Override
    public IPrototype deepClone() {
        return simpleClone();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +  " - Product [name=" + name + 
        ", price=" + price + "]";
    }

}
