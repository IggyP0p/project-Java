public abstract class Publicacao {

/*
 * O analista ainda observou que o método responsável por imprimir dados da
publicação possui um comportamento diferente nos objetos Livro e Filme, sendo assim ele
definiu um método abstrato para esse comportamento. Os outros métodos da classe são: (i)
Existe um método get para cada atributo da classe; (ii) Essa classe tem um método
construtor que recebe como parâmetro o titulo, autor, ano de publicação, gênero, editora e
quantidade disponível
 */

protected String titulo;
protected String autor;
protected int anoPublicacao;
protected String genero;
protected String editora;
protected int quantidadeDisponivel;

public Publicacao(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel) {
this.titulo = titulo;
this.autor = autor;
this.anoPublicacao = anoPublicacao;
this.genero = genero;
this.editora = editora;
this.quantidadeDisponivel = quantidadeDisponivel;

}


public abstract void ImprimirDados();

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
return quantidadeDisponivel;

}


}