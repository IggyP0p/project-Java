import java.util.Scanner;

public class ProgramaBiblioteca {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String titulo, autor, genero, editora, direcao, ator, sinopse;
        int anoPublicacao, quantidade, edicao, tempo;
        long isbn;

        System.out.println("Digite o titulo do livro");
        titulo = sc.nextLine();

        System.out.println("Digite o autor do livro");
        autor = sc.nextLine();

        System.out.println("Digite o ano de publicação do livro");
        anoPublicacao = sc.nextInt();

        System.out.println("Digite o genero do livro");
        genero = sc.next();

        System.out.println("Digite o quantidade disponivel do livro");
        quantidade = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite a editora do livro");
        editora = sc.nextLine();

        System.out.println("Digite a edição do livro");
        edicao = sc.nextInt();

        System.out.println("Digite a isbn do livro");
        isbn = sc.nextLong();

        Livro livro = new Livro(titulo,  autor,  anoPublicacao,  genero,  editora,  quantidade,  edicao,  isbn);


        sc.nextLine();
        System.out.println("\n\nDigite o titulo do filme");
        titulo = sc.nextLine();

        System.out.println("Digite o autor do filme");
        autor = sc.nextLine();

        System.out.println("Digite o ano de publicação do filme");
        anoPublicacao = sc.nextInt();

        System.out.println("Digite o genero do filme");
        genero = sc.next();

        sc.nextLine();
        System.out.println("Digite a editora do filme");
        editora = sc.nextLine();

        System.out.println("Digite o quantidade disponivel do filme");
        quantidade = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite a direção do filme");
        direcao = sc.nextLine();

        System.out.println("Digite o ator principal do filme");
        ator = sc.nextLine();

        System.out.println("Digite o sinopse do filme");
        sinopse = sc.nextLine();

        System.out.println("Digite o tempo de duração do filme");
        tempo = sc.nextInt();
        System.out.println("\n\n");

        Filme filme = new Filme(titulo, autor, anoPublicacao, genero, editora, quantidade, direcao, ator, sinopse, tempo);



        Publicação [] publicacao = new Publicação[2];

        publicacao[0] = filme;
        publicacao[1] = livro;


        for(int i=0; i< publicacao.length; i++) {
        publicacao[i].ImprimirDados();
        System.out.println("\n");

        }


     sc.close();
    }



}