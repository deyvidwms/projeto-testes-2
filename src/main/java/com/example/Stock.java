package com.example;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    // Construtor
    public Stock() {
        products = new ArrayList<>();
    }

    // Método para adicionar um novo produto ao estoque
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product " + product.getProductInfo() + " added to stock.");
    }

    // Método para verificar se um produto está disponível no estoque
    public boolean isProductAvailable(String productName) {
        for (Product product : products) {
            if (product.getProductInfo().contains(productName) && product.getQuantity() > 0) {
                System.out.println("Product " + productName + " is available.");
                return true;
            }
        }
        System.out.println("Product " + productName + " is not available.");
        return false;
    }

    // Método para exibir todos os produtos no estoque
    public void displayStock() {
        if (products.isEmpty()) {
            System.out.println("No products in stock.");
        } else {
            System.out.println("Stock Information:");
            for (Product product : products) {
                System.out.println(product.getProductInfo());
            }
        }
    }

    // Método para reabastecer automaticamente produtos com quantidade baixa
    public void autoRestock() {
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                product.addQuantity(10); // Adiciona 10 unidades ao estoque se a quantidade for menor que 5
                System.out.println("Product " + product.getProductInfo() + " automatically restocked.");
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}