package Models02;

import java.util.ArrayList;

public class Album02 {
    private String name;
    private int anoLancamento;
    private ArrayList<Musica02> musicas;

    public Album02(String name, int anoLancamento, ArrayList<Musica02> musicas) {
        this.name = name;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }

    public Album02() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public ArrayList<Musica02> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica02> musicas) {
        this.musicas = musicas;
    }
}
