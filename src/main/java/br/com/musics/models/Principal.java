package br.com.musics.models;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite aqui uma musica que voce gosta:");
        String favoriteMusic = scanner.nextLine();
        System.out.print("Digite aqui seu podcast preferido:");
        String favoritePodcast = scanner.nextLine();
        System.out.print("Digite aqui o nome do artista da sua música:");
        String artista = scanner.nextLine();
        System.out.print("Digite aqui o nome do apresentador do seu podcast:");
        String host = scanner.nextLine();

        System.out.println("Parabéns! Obrigada por compartilhar conosco.");

        System.out.println("---------------------------------------------------------");



        Musics musics = new Musics();
        musics.setArtist("Harry Style");
        musics.setAlbum("As it was");
        musics.setGenero("Pop");
        musics.curtir();
        musics.reproduzir();

        for (int i = 0; i < 1000; i++) {
            musics.reproduzir();

        }

        for (int i = 0; i < 50; i++) {
            musics.curtir();

        }
        System.out.println("Todas as informações da musica" + musics);

        Podcast podcast = new Podcast();
        podcast.setTitulo("Poddelas");
        podcast.setDuracao(120);
        podcast.setCurtidas(1000);
        podcast.setClassificacao(10);
        podcast.curtir();
        podcast.reproduzir();
        System.out.println("Todas as informações do podcast" + podcast);

        if (podcast.getCurtidas() >= 1000){
            System.out.println("Este podcast é ótimo");
        }else{
                System.out.println("Escute este podcast depois");
            }
     }
    }

