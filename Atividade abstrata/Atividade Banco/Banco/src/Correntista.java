public class Correntista {

    /*
     * Passo 4: Crie a classe Correntista com os seguintes atributos: nome (do
    tipo String) e conta (do tipo ContaCorrente). O construtor de Correntista
    deve receber seu nome. A classe deve ter 2 métodos: public String
    getNome() e public ContaCorrente getContacorrente(). Estes métodos
    retornam o nome e a conta respectivamente
     */
    
    public String nome;
    public ContaCorrente conta;
    
    public Correntista(String nome) {
    this.nome = nome;
    
    }
    
    public String getNome() {
    return nome;
    
    }
    
    public ContaCorrente getContaCorrente() {
    return conta;
    
    }
    }