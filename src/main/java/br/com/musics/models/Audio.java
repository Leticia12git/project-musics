package br.com.musics.models;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo(String titulo) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return totalCurtidas;
    }

    public void setCurtidas(int curtidas) {
        this.totalCurtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", totalDeReproducao=" + totalDeReproducao +
                ", curtidas=" + totalCurtidas +
                ", classificacao=" + classificacao +
                '}';
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducao++;
    }
}
