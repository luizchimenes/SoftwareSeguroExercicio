import Models.Album;
import Models.Musica;
import Models.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do artista:");
        String nomeArtista = scanner.nextLine();

        System.out.println("Digite a idade do artista:");
        int idadeArtista = scanner.nextInt();
        scanner.nextLine();

        Pessoa artista = new Pessoa(nomeArtista, idadeArtista);

        List<Musica> musicas = new ArrayList<>();

        System.out.println("Quantas músicas o álbum possui?");
        Integer quantidadeMusicas = scanner.nextInt();

        for (Integer i = 0; i < quantidadeMusicas; i++) {

            System.out.println("Digite o título da música " + (i + 1) + ":");
            String titulo = scanner.next();
            scanner.nextLine();

            System.out.println("Digite a duração da música " + (i + 1) + " em segundos:");
            int duracao = scanner.nextInt();
            scanner.nextLine();

            Musica musica = new Musica(titulo, duracao, artista);

            musicas.add(musica);
            scanner.nextLine();
        }

        System.out.println("Digite o gênero do álbum:");
        String generoAlbum = scanner.nextLine();

        System.out.println("Digite o ano do álbum:");
        Integer anoAlbum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do álbum:");
        String nomeAlbum = scanner.nextLine();

        Album album = new Album();
        album.setAno(anoAlbum);
        album.setGenero(generoAlbum);
        album.setNome(nomeAlbum);
        album.setMusicas(musicas);
        album.setArtista(artista);

        System.out.println("\nAlbum:");
        System.out.println("Nome do album: " + album.getNome());
        System.out.println("Artista: " + album.getArtista().getNome());
        System.out.println("Gênero: " + album.getGenero());
        System.out.println("Ano: " + album.getAno());
        System.out.println("Músicas:");
        for (Musica musica : album.getMusicas()) {
            System.out.println("- Título: " + musica.getTitulo() + "\n Duração: " + musica.getDuracaoSegundos() + " segundos");
        }

        scanner.close();

    }
}