package Models;

public class Musica {

    private String titulo;
    private Integer duracaoSegundos;
    private Pessoa compositor;

    public Musica() {
    }

    public Musica(String titulo, Integer duracaoSegundos, Pessoa compositor) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
        this.compositor = compositor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(Integer duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public Pessoa getCompositor() {
        return compositor;
    }

    public void setCompositor(Pessoa compositor) {
        this.compositor = compositor;
    }
}
