package Models02;

import Models.Pessoa;

public class Musica02 {

    private String titulo;
    private int duracaoSegundos;

    public Musica02() {
    }

    public Musica02(String titulo, int duracaoSegundos) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(Integer duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }


}
