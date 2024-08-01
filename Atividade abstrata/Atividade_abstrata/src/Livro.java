public class Livro extends Publicacao{

/*
 * . Na Biblioteca XPTO um Livro possui uma edição e um
isbn que são privados. Sempre que um novo objeto é criado é obrigado informar o titulo,
autor, ano de publicação, gênero, editora, quantidade disponível, edição e o isbn.
 */

private String edicao;
private long isbn;

public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel, String edicao, long isbn) {
super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
this.edicao = edicao;
this.isbn = isbn;

}

public void ImprimirDados() {
System.out.println("titulo: "+ titulo +"\nautor: "+ autor +"\nAno de publicação: "+ anoPublicacao +"\nGênero: "+ genero +"\nEditora: "+ editora +"\nQuantidade disponivel: "+ quantidadeDisponivel +"\nEdição: "+ edicao +"\nISBN: "+ isbn);

}

}