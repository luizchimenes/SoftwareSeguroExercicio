import Models.Album;
import Models02.Album02;
import Models02.Musica02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Musica02> musicas = new ArrayList<>();

        System.out.println("-------EXERCICIO 02-------");

        System.out.println("Quantas músicas o novo álbum possui?");
        int quantidadeMusicas = scanner.nextInt();

        for (int i = 0; i < quantidadeMusicas; i++) {

            System.out.println("Digite o título da música " + (i + 1) + ":");
            String titulo = scanner.next();
            scanner.nextLine();

            System.out.println("Digite a duração da música " + (i + 1) + " em segundos:");
            int duracao = scanner.nextInt();
            scanner.nextLine();

            Musica02 musica = new Musica02(titulo, duracao);

            musicas.add(musica);
            scanner.nextLine();
        }

        System.out.println("Digite o ano do álbum:");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do álbum:");
        String nomeAlbum = scanner.nextLine();

        Album02 album = new Album02();
        album.setAnoLancamento(anoAlbum);
        album.setName(nomeAlbum);
        album.setMusicas(musicas);

        System.out.println("\nAlbum:");
        System.out.println("Nome do album: " + album.getName());
        System.out.println("Ano: " + album.getAnoLancamento());
        System.out.println("Músicas:");
        for (Musica02 musica : album.getMusicas()) {
            System.out.println("- Título: " + musica.getTitulo() + "\n Duração: " + musica.getDuracaoSegundos() + " segundos");
        }

        scanner.close();

    }
}