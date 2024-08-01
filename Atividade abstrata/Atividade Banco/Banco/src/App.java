public class App {
    
    public static void main(String args[])
    {
        String n1 = "João", n2 = "Pedro", n3 = "Henrique";
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();

        Banco banco = new Banco(n1, c1, n2, c2, n3, c3);

        //OS CORRENTISTAS RECEBERAM SEUS SALARIOS
        banco.creditar(n1, 1500);
        banco.creditar(n2, 1500);
        banco.creditar(n3, 1500);

        //O CARRO DO CORRENTISTA JOÃO QUEBROU E TEVE QUE GASTAR 800 REAIS
        banco.debitar(n1, 800.0);

        //A FILHA DO CORRENTISTA PEDRO GANHOU UMA BICICLETA QUE CUSTOU 300 REAIS
        banco.debitar(n2, 300.0);

        //HENRIQUE NÃO TEVE MUITOS GASTOS
        banco.debitar(n3, 50.0);

        //MOSTRANDO O SALDO DOS CORRENTISTAS. JOÃO = 700, PEDRO 1200, HENRIQUE 1450
        System.out.println("------------------------------\n");
        System.out.println(banco.getCorrentista(n1).getNome()+ ": " + banco.getSaldo(n1));
        System.out.println(banco.getCorrentista(n2).getNome()+ ": " + banco.getSaldo(n2));
        System.out.println(banco.getCorrentista(n3).getNome()+ ": " + banco.getSaldo(n3));

        //JOÃO ACABOU TENDO MAIS UM PROBLEMA NO CARRO E GASTOU MAIS 800 REAIS
        System.out.println("\n------------------------------\n");
        banco.debitar(n1, 800);
        System.out.println(banco.getCorrentista(n1).getNome()+ ": " + banco.getSaldo(n1));

        //ACABOU PEDINDO DINHEIRO EMPRESTADO PARA SEU COLEGA HENRIQUE QUE FEZ A TRANSFERENCIA DE 700
        banco.transferir(n3, n1, 700);

        //MOSTRANDO O SALDO DOS CORRENTISTAS. JOÃO = 600, PEDRO 1200, HENRIQUE 750
        System.out.println("\n------------------------------\n");
        System.out.println(banco.getCorrentista(n1).getNome()+ ": " + banco.getSaldo(n1));
        System.out.println(banco.getCorrentista(n2).getNome()+ ": " + banco.getSaldo(n2));
        System.out.println(banco.getCorrentista(n3).getNome()+ ": " + banco.getSaldo(n3));

    }

}
