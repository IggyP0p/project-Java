/*Sabendo que uma Conta Poupança para o Banco XPTO possui as seguintes
informações: Nome do Correntista, RG, CPF, saldo, número, agência. O
objeto possui os seguintes comportamentos: 
(i) cadastrar e alterar que
recebem como parâmetro as características da Conta Poupança; 
(ii)
Imprimir Saldo - que é responsável por imprimir o Saldo do Correntista. */

public class Poupança{

    private String Nome;
    private int RG;
    private int CPF;
    private int Saldo;
    private int Numero;
    private int Agencia;

    //CONSTRUTOR
    public Poupança(String Nome, int RG, int CPF, int Saldo, int Numero, int Agencia){
        this.Nome = Nome;
        this.RG = RG;
        this.CPF = CPF;
        this.Saldo = Saldo;
        this.Numero = Numero;
        this.Agencia = Agencia;
    }

    //GETTERS
    public String getNome(){
        return Nome;

    }

    public int getRG(){
        return RG;
        
    }

    public int getCPF(){
        return CPF;
        
    }

    public int getSaldo(){
        return Saldo;
        
    }

    public int getNumero(){
        return Numero;
        
    }

    public int Agencia(){
        return Agencia;

    }

    //SETTERS
    public void setNome(String novoNome){
        this.Nome = novoNome;

    }

    public void setRG(int novoRG){
        this.RG = novoRG;

    }

    public void setCPF(int novoCPF){
        this.CPF = novoCPF;

    }

    public void setSaldo(int novoSaldo){
        this.Saldo = novoSaldo;

    }

    public void setNumero(int novoNumero){
        this.Numero = novoNumero;

    }

    public void setAgencia(int novaAgencia){
        this.Agencia = novaAgencia;

    }
}