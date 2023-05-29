package br.com.alura.screematch.desafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {
    public Endereco converteJsonParaObjeto(String cep) throws IOException, InterruptedException {

        URI endereco = URI.create("https://viacep.com.br/ws/"+cep.replace(" ", "+")+"/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {

            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            return new Gson().fromJson(json, Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível localizar um endereço para o cep informado");
        }
    }
}
