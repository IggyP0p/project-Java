package atividadeCompare;

//possua como características um número, um titular,um limite de crédito e um
//saldo.


public class Conta implements Comparable<Conta>{

	public int numero;
	public String titular;
	public int limiteCredito;
	public int saldo;
	
	public Conta(int saldo, int limiteCredito, int numero, String titular) 
	{
		this.numero = numero;
		this.titular = titular;
		this.limiteCredito = limiteCredito;
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Conta o) {
		if(this.numero > o.numero) 
		{
			return 1;
		}
		
		if(this.numero < o.numero) 
		{
			return -1;
		}
		
		return 0;
	}
}
