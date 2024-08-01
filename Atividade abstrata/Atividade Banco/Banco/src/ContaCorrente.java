public class ContaCorrente{

    /*
     * Passo 3: Criar a classe ContaCorrente com o atributo valor do tipo
    double que inicia com 0. Esta classe possui um método
    executarOperacao(Operacao opr) que recebe um parâmetro do tipo
    Operacao que vai operar o valor da conta correte (se for debito diminui,
    se for credito soma). Esta classe também possui o método getSaldo() que
    retorna o valor do saldo atual.
     */
    
    public double valor =0;
    
    
    public double executarOperacao(Operacao opr) {
        valor = valor + opr.operar();
        return valor;
    }
    
    public double getSaldo() {
        return valor;
    }
    
}