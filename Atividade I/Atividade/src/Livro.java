
public class Livro extends Publicação {

    public int edicao;
    public long isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidade, int edicao, long isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidade);
        this.edicao = edicao;
        this.isbn = isbn;

    }

    public void ImprimirDados() {
        super.ImprimirDados();

        System.out.println("Edição: "+ edicao +"\nISBN: "+ isbn);
    }


}