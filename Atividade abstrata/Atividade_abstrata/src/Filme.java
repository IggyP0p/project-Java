public class Filme extends Publicacao{

    public String direcao;
    public String ator;
    public String sinopse;
    public String tempoDeDuracao;

    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidade, String direcao, String ator, String sinopse, String tempoDeDuracao) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidade);
        this.direcao = direcao;
        this.ator = ator;
        this.sinopse = sinopse;
        this.tempoDeDuracao = tempoDeDuracao;

    }

    public void ImprimirDados() {
        System.out.println("titulo: "+ titulo +"\nautor: "+ autor +"\nAno de publicação: "+ anoPublicacao +"\nGênero: "+ genero +"\nEditora: "+ editora +"\nQuantidade disponivel: "+ quantidadeDisponivel +"\nDireção: "+ direcao +"\nAtor principal: "+ ator +"sinopse" +sinopse + tempoDeDuracao);

    }


}