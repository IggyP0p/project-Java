/*Sabendo que um Carro para o sistema de cadastro da loja XPTO Veículos
possui as seguintes características: Código, Marca, Cor, Modelo, Ano de
Fabricação, Número de Portas, Tipo de Combustível, Quantidade
Disponível, Preço e se carro é completo ou básico. O objeto Carro possui os
seguintes comportamentos: 

(i) cadastrar e alterar que recebem como
parâmetro as características do Carro; 

(ii) listar – comportamento
responsável por listar as informações do carro. */

public class Carro{
    private int codigo;
    private int ano;
    private int portas;
    private int quantidade;
    private int preco;
    private String modelo;
    private String cor;
    private String ComBas;
    private String gas;
    private String marca;

    public Carro(int codigo, int ano, int portas, int quantidade, int preco, String modelo,String cor, String combas, String gas, String marca){
        this.codigo = codigo;
        this.ano = ano;
        this.portas = portas;
        this.quantidade = quantidade;
        this.preco = preco;
        this.modelo = modelo;
        this.cor = cor;
        this.ComBas = combas;
        this.gas = gas;
        this.marca = marca;


    }

    //GETTERS
    public int getCodigo(){
        return codigo;

    }

    public int getAno(){
        return ano;
        
    }

    public int getPortas(){
        return portas;
        
    }

    public int getQuantidade(){
        return quantidade;
        
    }

    public int getPreco(){
        return preco;
        
    }

    public String getModelo(){
        return modelo;

    }

    public String getCor(){
        return cor;
        
    }

    public String getCombas(){
        return ComBas;
        
    }

    public String getGas(){
        return gas;
        
    }

    public String getMarca(){
        return marca;
        
    }


    //SETTERS
    public void setCodigo(int novoCodigo){
        this.codigo = novoCodigo;

    }

    public void setAno(int novoAno){
        this.ano = novoAno;
        
    }

    public void setPortas(int novoPortas){
        this.portas = novoPortas;
        
    }

    public void setQuantidade(int novoQuantidade){
        this.quantidade = novoQuantidade;
        
    }

    public void setPreco(int novoPreco){
        this.preco = novoPreco;
        
    }

    public void setModelo(String novoModelo){
        this.modelo = novoModelo;

    }

    public void setCor(String novoCor){
        this.cor = novoCor;
        
    }

    public void setComBas(String novoCombas){
        this.ComBas = novoCombas;
        
    }

    public void setGas(String novoGas){
        this.gas = novoGas;
        
    }

    public void setMarca(String novoMarca){
        this.marca = novoMarca;
        
    }





}