/*Sabendo que um Animal para o sistema de cadastro do Jardim Zoológico
possui as seguintes características: Espécie, Data de Nascimento, Nome,
Número de Registro e Local de Nascimento. O objeto possui os seguintes
comportamentos: 
(i) cadastrar e alterar que recebem como parâmetro as
características do Animal; 
(ii) outro comportamento desse objeto é a
capacidade de imprimir as informações armazenadas nas suas
características. */


public class Animal {
    
    private String Especie;
    private String Nome;
    private String local;
    private Long Registro;
    private Long data;

    //CONSTRUTOR
    public Animal(String especie, String Nome, String local, Long Registro, Long data){
        this.Especie = especie;
        this.Nome = Nome;
        this.local = local;
        this.Registro = Registro;
        this.data = data;

    }

    //SETTERS
    public String getEspecie(){
        return Especie;

    }

    public String getNome(){
        return Nome;

    }

    public String getLocal(){
        return local;

    }

    public Long getRegistro(){
        return Registro;

    }

    public Long getData(){
        return data;

    }

    //GETTERS
    public void setEspecie(String novaEspecie){
        this.Especie = novaEspecie;

    }

    public void setNome(String novoNome){
        this.Nome = novoNome;

    }

    public void setLocal(String novoLocal){
        this.local = novoLocal;

    }

    public void setRegistro(Long novoRegistro){
        this.Registro = novoRegistro;

    }

    public void setData(Long novaData){
        this.data = novaData;
        
    }




}
