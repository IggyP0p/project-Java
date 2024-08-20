package EstudoCaso;

public class Semestre {

	Avaliacoes aval1;
	Avaliacoes aval2;
	Avaliacoes aval3;
	Avaliacoes aval4;
	
	public Semestre(Avaliacoes aval1, Avaliacoes aval2, Avaliacoes aval3, Avaliacoes aval4) 
	{
		if(aval1.peso + aval2.peso + aval3.peso + aval4.peso == 7) 
		{
			this.aval1 = aval1;
			this.aval2 = aval2;
			this.aval3 = aval3;
			this.aval4 = aval4;
		} else 
		{
			System.out.println("A soma do peso das avaliações não é 7");
		}
		
	}
	
	public void media() 
	{
		int a = (aval1.qtdPontos + aval2.qtdPontos + aval3.qtdPontos + aval4.qtdPontos)/4;
		if(a >= 7) 
		{
			System.out.println("VOCÊ ESTA APROVADO!!");
		} else {
			System.out.println("VOCÊ ESTA REPROVADO!!");
		}
	}
	
}
