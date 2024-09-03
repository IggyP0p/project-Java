package atividadeCompare;

import java.util.Comparator;

public class ContaCompareTo implements Comparator<ContaCompareTo>{

	public int numero;
	public String titular;
	public int limiteCredito;
	public int saldo;
	

	@Override
	public int compare(ContaCompareTo o1, ContaCompareTo o2) 
	{
		
		return o1.getTitular().compareTo(o2.getTitular());
	}

	public String getTitular() 
	{
		return titular;
	}
	
	public void setTitular(String novoTitular) 
	{
		this.titular = novoTitular;
	}
	
	public void setNumero(int novoNumero) 
	{
		this.numero = novoNumero;
	}
	
	public void setLimite(int novoLimite) 
	{
		this.limiteCredito = novoLimite;
	}
	
	public void setSaldo(int novoSaldo) 
	{
		this.saldo = novoSaldo;
	}
}