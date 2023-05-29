package br.com.alura.screematch.desafio;

import br.com.alura.screematch.modelo.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorJson {

    public void converteObjetoParaJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter(endereco.cep()+".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
