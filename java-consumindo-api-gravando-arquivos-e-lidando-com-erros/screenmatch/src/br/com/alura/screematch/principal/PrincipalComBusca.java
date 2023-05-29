package br.com.alura.screematch.principal;

import br.com.alura.screematch.service.ConverteJsonParaObjeto;
import br.com.alura.screematch.service.ConverteObjetoParaJson;

import java.io.IOException;

import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        String busca = "";

        ConverteJsonParaObjeto jsonParaObjeto = new ConverteJsonParaObjeto();
        ConverteObjetoParaJson objetoParaJson = new ConverteObjetoParaJson();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite o nome de um filme: ");
            busca = sc.nextLine();

            if(busca.equalsIgnoreCase("sair")) {
                break;
            }

            String url = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=557e63d5";

            jsonParaObjeto.converteJsonParaObjeto(url);

        }

        objetoParaJson.converteObjetoParaJson(jsonParaObjeto.getTitulos());

        sc.close();
    }
}
