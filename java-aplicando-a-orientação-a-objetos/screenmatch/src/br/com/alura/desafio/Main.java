package br.com.alura.desafio;

import br.com.alura.desafio.modelo.Musica;
import br.com.alura.desafio.modelo.Podcast;
import br.com.alura.desafio.modelo.Preferidas;

public class Main {

    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("Forever");
        musica1.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setApresentador("Marcus Mendes");
        podcast1.setTitulo("Bolha Dev");

        for (int i = 0; i < 1500; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);

    }
}
