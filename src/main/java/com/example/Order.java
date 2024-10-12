package com.example;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int orderId;
    private int quantity;
    private double unitPrice;

    public Order(int orderId, int quantity, double unitPrice) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Método que calcula o valor total da ordem
    public double calculateTotal() {
        return quantity * unitPrice;
    }

    // Método que simula um erro de divisão por zero
    public double applyDiscount(int discountRate) {
        // Defeito: Pode ocorrer divisão por zero se o desconto for 0
        return calculateTotal() / discountRate;
    }

    // Método que retorna o número de itens
    public int getNumberOfItems() {
        return quantity;
    }

    // Método para adicionar mais itens ao pedido
    public void addItems(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    // Método para remover itens do pedido
    public void removeItems(int amount) {
        if (amount > 0 && this.quantity >= amount) {
            this.quantity -= amount;
        }
    }
}