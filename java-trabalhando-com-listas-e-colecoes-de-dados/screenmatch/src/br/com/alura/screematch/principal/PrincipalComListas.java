package br.com.alura.screematch.principal;

import br.com.alura.screematch.modelo.Filme;
import br.com.alura.screematch.modelo.Serie;
import br.com.alura.screematch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.avalia(8);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(9);
        Filme filmeDoLucas = new Filme("The Covenant", 2023);
        meuFilme.avalia(10);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 1) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Lucas");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(lista);



    }
}
