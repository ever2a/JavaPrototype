package com.cerberuz.prototype;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class PriceList implements IPrototype {

    private String name;
    private List<Product> productList = new ArrayList<>();

    
    public PriceList(String name) {
        this.name = name;
    }

    @Override
    public IPrototype simpleClone() {
        PriceList simpleClone = new PriceList(name);
        simpleClone.setProductList(productList);
        return simpleClone;
    }

    @Override
    public IPrototype deepClone() {
        PriceList deepClone = new PriceList(name);
        List<Product> ListClone = new ArrayList<>();

        for (Product product:productList){
            Product cloneProduct = (Product) product.simpleClone();
            ListClone.add(cloneProduct);
        }

        deepClone.setProductList(ListClone);
        return deepClone;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +  " - PriceList [name=" + name + 
        ", productList=" + productList + "]";
    }

}
