package TratamentoExcecao;

public class Excecao extends Exception{

	public Excecao(String message) 
	{
		super(message + " palavra");
	}
}
