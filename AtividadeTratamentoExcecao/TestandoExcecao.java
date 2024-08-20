package TratamentoExcecao;

public class TestandoExcecao {

	String nome;
	
	public void AcharNome(String nome) throws Excecao 
	{
		if(nome == "Nadson") 
		{
			Excecao e = new Excecao("O nome é Nadson");
			throw e;
		}
		
	}
}
