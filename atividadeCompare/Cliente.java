package atividadeCompare;
import java.util.ArrayList;
import java.util.Collections;

public class Cliente {

	public static void main(String args[]) 
	{
		//CONTAS COM COMPARABLE
		Conta c1 = new Conta(200, 300, 03, "Joao Carvalho");
		Conta c2 = new Conta(150, 600, 01, "Matheus Costa");
		Conta c3 = new Conta(275, 500, 02, "Guilherme Boulos");
		
		//ARRAY DE CONTAS COMPARABLE
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		//ORDENANDO AS CONTAS COMPARABLE PELO NUMERO
		Collections.sort(contas);
		
		for(Conta ct: contas)System.out.println(ct.numero + " " +ct.titular);
		
		//CONTAS COM COMPARE TO
		ContaCompareTo cc1 = new ContaCompareTo();
		ContaCompareTo cc2 = new ContaCompareTo();
		ContaCompareTo cc3 = new ContaCompareTo();
		
		cc1.setTitular("Gustavo");
		cc2.setTitular("Abraao");
		cc3.setTitular("Bianca");
		
		//ARRAY DE CONTAS COMPARE TO
		ArrayList<ContaCompareTo> contasCT = new ArrayList<ContaCompareTo>();
				
		contasCT.add(cc1);
		contasCT.add(cc2);
		contasCT.add(cc3);
		
		ContaCompareTo comparador = new ContaCompareTo();
		
		Collections.sort(contasCT, comparador);
		
		for(ContaCompareTo cct: contasCT)System.out.println(cct.numero + " " +cct.titular);
	}
}
