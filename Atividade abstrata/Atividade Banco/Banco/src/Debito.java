public class Debito extends Operacao{

    /*
     * Passo 2: Crie uma classe Debito e outra Credito que herda as
    características de Operacao. O construtor de Debito e Credito deve
    receber o valor da operação e atribuir este valor a variável definida em
    Operacao (superclasse). Estas classes (Debito e Credito) devem ter um
    método operar() que deve ser programado de acordo com sua finalidade:
    operar() da classe Debito retorna o valor negativo pois a operação deve
    ser um debito enquanto a o método operar() de Credito retorna o valor
    positivo.
     */
    public Debito(double valor) {
    super.valor = valor;
    
    }
    
    public double operar() {
    return -valor;
    
    }
    
    }