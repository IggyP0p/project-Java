package TratamentoExcecao;

/*
 *  No seguinte código ocorre um erro pois o tratador de exceção do primeiro catch é mais
 *  (da superclasse), dessa forma o tratador do segundo catch nunca chega a ser executado
 *  por ser mais especifico (da subclasse). Caso haja a troca do segundo catch com o 
 *  primeiro catch o código compilara normalmente.
 */
public class TratandoExcecoes {
	
	public static void main(String[] args) 
	{
		TestandoExcecao teste = new TestandoExcecao();
		teste.nome = "Nadson";
		
		try
		{
			teste.AcharNome(teste.nome);
		} catch(Exception m) 
		{
			throw m;
		} catch(Excecao v) 
		{
			System.out.println("ERRO: "+ v.getMessage());
		} 
	}
}
