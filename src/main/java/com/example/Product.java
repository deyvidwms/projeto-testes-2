package com.example;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Método para adicionar mais produtos ao estoque
    public void addQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " units of " + name + " added. Current stock: " + quantity);
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }

    // Método para remover produtos do estoque
    public void removeQuantity(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units of " + name + " removed. Current stock: " + quantity);
        } else {
            System.out.println("Invalid quantity to remove or insufficient stock.");
        }
    }

    // Método para ajustar o preço baseado na demanda
    public void adjustPriceByDemand() {
        if (quantity < 5) {
            price += price * 0.10; // Aumenta o preço em 10% se a demanda for alta (poucas unidades no estoque)
            System.out.println("Price increased due to high demand. New price: $" + price);
        } else if (quantity > 20) {
            price -= price * 0.10; // Reduz o preço em 10% se houver muita oferta (muitas unidades no estoque)
            System.out.println("Price decreased due to low demand. New price: $" + price);
        }
    }

    // Método para exibir as informações do produto
    public String getProductInfo() {
        return "Product: " + name + ", Price: $" + price + ", Quantity in stock: " + quantity;
    }

    // Método para retornar a quantidade do produto (usado na classe Stock)
    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
