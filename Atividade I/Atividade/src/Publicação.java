
public class Publicação {
 //titulo, autor, ano de publicação, gênero, editora e quantidade disponível

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String editora;
    private int quantidade;

    //CONSTRUTOR
    public Publicação(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.editora = editora;
        this.quantidade = quantidade; 

    }



    //GETTERS
    public String getTitulo() {
        return titulo;

    }

    public String getAutor() {
        return autor;

    }

    public int getAnoPublicacao() {
        return anoPublicacao;

    }

    public String getGenero() {
        return genero;

    }

    public String getEditora() {
        return editora;

    }

    public int getQuantidade() {
        return quantidade;

    }

    public void ImprimirDados() {
        System.out.println("Titulo: "+ titulo + "\nAutor: "+ autor + "\nAno de publicação: "+ anoPublicacao + "\nGênero: "+ genero +"\nEditora: "+ editora + "\nQuantidade disponível: "+ quantidade +" unidades");

    }



}