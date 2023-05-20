package br.com.alura.desafio.modelo;

public class Preferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!" );
        } else {
            System.out.println(audio.getTitulo() + " também é um que está em alta!");
        }
    }
}
