package br.com.alura.screematch.desafio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        Cartao cartao = new Cartao(limite);

        int opcao = 1;

        Map<String, Double> compras = new HashMap<>();

        while (opcao != 0) {

            if (opcao == 1) {

                System.out.println("Digite a descricao da compra: ");
                String descricao = sc.next();
                System.out.println("Digite o valor da compra: ");
                double valorCompra = sc.nextDouble();

                Compra compra = new Compra(descricao, valorCompra);
                boolean compraRealizada = cartao.addCompra(compra);

                if(compraRealizada) {
                    System.out.println("Compra realizada!");
                    System.out.println("Digite 0 para sair ou 1 para continuar");
                    opcao = sc.nextInt();
                } else {
                    System.out.println("Saldo insulficiente!");
                    opcao = 0;
                }

            } else if(opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida! Digite 0 para sair ou 1 para continuar");
                opcao = sc.nextInt();
            }
        }

        System.out.println("******************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());

        for (Compra c: cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("******************************");

        System.out.printf("Saldo do cartão: %.2f", cartao.getSaldo());

        sc.close();
    }
}
