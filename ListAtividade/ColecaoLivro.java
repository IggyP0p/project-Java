package ListAtividade;
import java.util.List;
import java.util.ArrayList;

public class ColecaoLivro {
	
	List<Livro> estante = new ArrayList<Livro>();
	
	public void adLivro(Livro novoLivro) 
	{
		estante.add(novoLivro);
	}
	
	public void rmLivro(Livro novoLivro) 
	{
		for(int i=0; i<estante.size(); i++) 
		{
			if(estante.get(i).equals(novoLivro))estante.remove(i);	
		}
		
	}
	
	public void imprimeLista() 
	{
		for(int i=0; i<estante.size(); i++)System.out.println(estante.get(i).titulo + " por " + estante.get(i).autor);
	}
	
	public void checkLivro(Livro livro) 
	{
		for(int i=0; i<estante.size(); i++) 
		{
			if(estante.get(i).equals(livro)) 
			{
				System.out.println("\nO livro " + estante.get(i).titulo + " existe na lista!");
				return;
			}
		}
		System.out.println("\nO livro " + livro.titulo + " nao existe na lista!");
		
	}
	
	public void getLivro(Livro livro) 
	{
		for(int i=0; i<estante.size(); i++) 
		{
			if(estante.get(i).isbn == livro.isbn) 
			{
				System.out.println("\nO livro " + estante.get(i).titulo + " existe na lista!");
				return;
			}
		}
		System.out.println("\nO livro " + livro.titulo + " nao existe na lista!");
		
	}
	
	public void ListaVazia() 
	{
		if(listaVazia())System.out.println("Lista esta vazia!");
		else System.out.println("Lista nao esta vazia!");
	}
	
	private boolean listaVazia() 
	{
		for(int i=0; i<estante.size(); i++) 
		{
			if(estante.get(i) != null)return false;
		}
		return true;
	}
}
