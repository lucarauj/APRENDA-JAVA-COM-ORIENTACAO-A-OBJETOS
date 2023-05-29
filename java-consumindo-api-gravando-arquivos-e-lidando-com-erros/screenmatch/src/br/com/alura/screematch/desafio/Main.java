package br.com.alura.screematch.desafio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um CEP: ");
        String cep = sc.nextLine();

        BuscaCep buscaCep = new BuscaCep();

        try{
            var endereco = buscaCep.converteJsonParaObjeto(cep);
            System.out.println(endereco);

            GeradorJson geradorJson = new GeradorJson();
            geradorJson.converteObjetoParaJson(endereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
