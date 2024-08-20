package EstudoCaso;

public class testeAvals {

	public static void main(String[] args) 
	{
		Avaliacoes a1 = new Prova(2, 2);
		Avaliacoes a2 = new Prova(2, 2);
		Avaliacoes a3 = new Trabalho(1, 3, 3, 3);
		Avaliacoes a4 = new Interdisciplinar(2, 2, 2, 2, 4);
		Semestre s = new Semestre(a1,a2,a3,a4);
		
		a1.pontos();
		a2.pontos();
		a3.pontos();
		a4.pontos();
		
		s.media();
	}
}
