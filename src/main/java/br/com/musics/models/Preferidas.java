package br.com.musics.models;

public class Preferidas {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo("Harry Style") + " é considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo("HipsTer") + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}
