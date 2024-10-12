package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Criando um pedido com 5 itens, cada um custando 10.0
        Order order = new Order(1, 5, 10.0);

        // Calculando o total do pedido
        double total = order.calculateTotal();
        System.out.println("Total do pedido: " + total);

        // Adicionando mais itens
        order.addItems(3);
        System.out.println("Número de itens após adicionar: " + order.getNumberOfItems());

        // Removendo itens
        order.removeItems(2);
        System.out.println("Número de itens após remover: " + order.getNumberOfItems());

        // Aplicando um desconto (correto)
        double discountedTotal = order.applyDiscount(10);
        System.out.println("Total após desconto: " + discountedTotal);

        // Defeito: Tentando aplicar um desconto de 0%, causando divisão por zero
        try {
            double faultyDiscount = order.applyDiscount(0);  // Isso causará um erro
            System.out.println("Total após desconto inválido: " + faultyDiscount);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero ao aplicar desconto.");
        }
    }
}
