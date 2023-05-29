package br.com.alura.screematch.service;

import br.com.alura.screematch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screematch.modelo.Titulo;
import br.com.alura.screematch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConverteJsonParaObjeto {

    private List<Titulo> titulos = new ArrayList<>();

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public List<Titulo> converteJsonParaObjeto(String url) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);

            titulos.add(meuTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Erro NumberFormat: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro IllegalArgument: " + e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        return titulos;
    }
}
