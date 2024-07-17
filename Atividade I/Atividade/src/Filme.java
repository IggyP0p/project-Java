
public class Filme extends Publicação{

    public String direcao;
    public String ator;
    public String sinopse;
    public int tempo;

    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidade, String direcao, String ator, String sinopse, int tempo) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidade);
        this.direcao = direcao;
        this.ator = ator;
        this.sinopse = sinopse;
        this.tempo = tempo;

    }

    public void ImprimirDados() {
        super.ImprimirDados();
        System.out.println("Direção: "+ direcao +"\nAtor principal: "+ ator +"\nSinopse: "+ sinopse +"\nTempo de duração: "+ tempo +" horas");

    }


}