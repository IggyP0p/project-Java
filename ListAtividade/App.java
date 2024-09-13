package ListAtividade;

public class App {

	public static void main(String args[]) 
	{
		Livro l1 = new Livro(123, "Olavo de Carvalho", "Brasil Paralelo", "Alguma burrice");
		Livro l2 = new Livro(321, "Neil Gaiman", "DC comics", "Sandman");
		Livro l3 = new Livro(321, "Neil Gaiman", "DC comics", "Sandman");
		Livro l4 = new Livro(321, "Neil Gaiman", "DC comics", "Sandman");
		Livro l5 = new Livro(213, "Karl Marx", "Boitempo", "O Manifesto Comunista");
		Livro l6 = new Livro(213, "Karl Marx", "Boitempo", "O Manifesto Comunista");
		Livro l7 = new Livro(333, "Vladmir Lênin", "Boitempo", "Imperialismo, fase superior do Capitalismo");
		Livro l8 = new Livro(333, "Vladmir Lênin", "Boitempo", "Imperialismo, fase superior do Capitalismo");
		
		ColecaoLivro c = new ColecaoLivro();
		
		//ADICIONA LIVRO 1 E LIVRO 2
		c.adLivro(l1);
		c.adLivro(l2);
		//REMOVE LIVRO 1
		c.rmLivro(l1);
		//CHECA SE LIVRO 1 AINDA ESTA LA E SE A LISTA ESTA VAZIA
		c.checkLivro(l1); //DEVE DIZER QUE NÃO HÁ LIVRO 1
		c.ListaVazia(); //DEVE DIZER QUE LISTA NAO ESTA VAZIA
		//REMOVE LIVRO 2 E CHECA SE LISTA ESTA VAZIA
		c.rmLivro(l2); 
		c.ListaVazia(); //DEVE DIZER QUE A LISTA ESTA VAZIA
		
		//ADICIONANDO 3 LIVROS
		c.adLivro(l1);
		c.adLivro(l2);
		c.adLivro(l4);
		//O LIVRO 3 É O MESMO QUE O 2 E O 4 LOGO DEVE ESTAR NA LISTA
		c.getLivro(l3);
		c.checkLivro(l3);
		
		c.adLivro(l5);
		c.adLivro(l6);
		c.adLivro(l7);
		c.adLivro(l8);
	}
}
