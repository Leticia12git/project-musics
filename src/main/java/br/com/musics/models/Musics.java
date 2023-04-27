package br.com.musics.models;

public class Musics extends Audio{

    private String album;
    private String artist;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Musics{" +
                "album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
