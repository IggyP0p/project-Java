package bandomysql;

public class Roupas
{
    private String nome;
    private int numero;
    private Integer id;

    //GETTERS
    public String getNome()
    {
        return nome;
    }

    public int getNumero()
    {
        return numero;
    }

    public Integer getId()
    {
        return id;
    }

    //SETTERS
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }  

    public void setNumero(int novoNumero)
    {
        this.numero = novoNumero;
    }  

    public void setId(Integer novoId)
    {
        this.id = novoId;
    }  
}