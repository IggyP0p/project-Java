package EstudoCaso;

public class Avaliacoes {

	int peso;
	int nota;
	int qtdPontos;
	int n1;
	int n2;
	int n3;
	int n4;
	
	public Avaliacoes(int peso, int nota) 
	{
		this.peso = peso;
		this.nota = nota;
		qtdPontos = peso * nota;
		
	}
	
	public Avaliacoes(int peso, int n1, int n2, int n3) 
	{
		nota = (n1+n2+n3)/3;
		this.peso = peso;
		qtdPontos = peso * nota;
	}
	
	public Avaliacoes(int peso, int n1, int n2, int n3, int n4) 
	{
		nota = (n1+n2+n3+n4)/4;
		this.peso = peso;
		qtdPontos = peso * nota;
	}
	
	public void pontos() 
	{
		System.out.println(this.qtdPontos);

	}
}
