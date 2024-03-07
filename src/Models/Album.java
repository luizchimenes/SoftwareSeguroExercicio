package Models;

import java.util.List;

public class Album {

    private String genero;
    private Integer ano;
    private String nome;
    private Pessoa artista;
    private List<Musica> musicas;

    public Album() {
    }

    public Album(String genero, Integer ano, String nome, Pessoa artista, List<Musica> musicas) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getArtista() {
        return artista;
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
