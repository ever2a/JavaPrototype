package com.cerberuz;

import java.util.List;

import com.cerberuz.prototype.PriceList;
import com.cerberuz.prototype.Product;

public class Main {
    public static void main(String[] args) {

        // Lista de precios inicial
        PriceList priceList = new PriceList("Lista Normal");
        List<Product> productList = List.of(
            new Product("Computadora", 5000),
            new Product("Mouse", 80),
            new Product("Teclado", 50),
            new Product("Pantalla", 1000),
            new Product("Auriculares", 200));
        priceList.setProductList(productList);

        System.out.println(priceList);

        // Segunda Lista de precios - Simple Clone
        PriceList priceList2 = (PriceList) priceList.simpleClone();
        priceList2.setName("Lista Preferencial");

        System.out.println(priceList2);

        // Tercera Lista de precios con descuento - Deep Clone
        PriceList priceList3 = (PriceList) priceList.simpleClone();
        priceList3.setName("Lista Ultima");

        for(Product product : priceList3.getProductList()) {
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList3);

    }
}