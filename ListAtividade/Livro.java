package ListAtividade;

/*
 * Isbn - Número que identifica um livro, livros com
mesmo Isbn são considerados iguais;
autor - Nome do autor da publicação do livro
editora - Nome da editora da publicação do
livro titulo - Nome do livro
 */
public class Livro {
	
	public int isbn;
	public String autor;
	public String editora;
	public String titulo;
	
	public Livro(int isbn, String autor, String editora, String titulo) 
	{
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
		this.titulo = titulo;
	}
	
	public int getISBN() 
	{
		return isbn;
	}
}
