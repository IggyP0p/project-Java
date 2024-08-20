package TratamentoExcecao;

/*
 * Construa uma classe chamada “ContaCorrente” , com os atributos
“limite” que armazena a quantidade atual disponível do limite da conta que o
usuário possui , o atributo “saldo” que é o valor que realmente é
pertencente ao usuário, e o atributo “valorLimite” que consiste no valor
máximo que o banco lhe fornece como valor de limite, todos float. Construa
os métodos public void, sacar(float valor), depositar(float valor), e
setValorLimite(float valor) .
Na construção dos três métodos faça com que eles lancem exceptions
relacionados aos argumentos, por exemplo, sacar, depositar ou setar um
1
valor negativo para esses eventos. 

Lance também uma exception no caso
de tentar sacar um valor maior que o possível.

Nós métodos lancem a exception “IllegalArgumentException()”
(Java)com o comando adequado, passe o motivo da exception(uma String)
em seu construtor
 */

public class ContaCorrente {

	float limite;
	float saldo;
	float valorLimite;
	
	public void sacar(float valor) throws ValorNegativoException, LimiteException, IllegalArgumentException
	{
		if(valor < 0) 
		{
			ValorNegativoException e = new ValorNegativoException("VALOR INVALIDO: Valor menor do que zero/nTENTE NOVAMENTE");
			throw e;
		}
		if(valor > this.valorLimite) 
		{
			LimiteException e2 = new LimiteException("VALOR INVALIDO: Valor excede limite/nTENTE NOVAMENTE");
			throw e2;
		}
		
		saldo = saldo - valor;
	}
	
	public void depositar(float valor) throws ValorNegativoException, LimiteException, IllegalArgumentException
	{
		if(valor < 0) 
		{
			ValorNegativoException e = new ValorNegativoException("VALOR INVALIDO: Valor menor do que zero/nTENTE NOVAMENTE");
			throw e;
		}
		if(valor > this.valorLimite) 
		{
			LimiteException e2 = new LimiteException("VALOR INVALIDO: Valor excede limite/nTENTE NOVAMENTE");
			throw e2;
		}
		
		saldo = saldo + valor;
	}
	
	public void setValorLimite(float valor) throws ValorNegativoException, IllegalArgumentException
	{
		if(valor < 0) 
		{
			ValorNegativoException e = new ValorNegativoException("VALOR INVALIDO: Valor menor do que zero/nTENTE NOVAMENTE");
			throw e;
		}
		
		
		this.valorLimite = valor;
	}
}
