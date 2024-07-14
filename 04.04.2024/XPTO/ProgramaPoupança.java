import java.util.Scanner;


public class ProgramaPoupança {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM-VINDO AO PROGRAMA DE POUPANÇA XPTO!!");
        Poupança XPTO = new Poupança(null, 0, 0, 0, 0, 0);

        int opcao = 1;
        while(opcao != 4){
            System.out.println("------------------------\n1 - Cadastro.\n2 - Imprimir Saldo.\n3 - Alterar dados.\n4 - Exit.");

            switch(opcao = sc.nextInt()){
                case 1:
                    System.out.println("\nPROGRAMA DE CADASTRO!!\n------------------------\nQual o nome do correntista?");
                    XPTO.setNome(sc.next());

                    System.out.println("------------------------\nQual o RG do correntista?");
                    XPTO.setRG(sc.nextInt());

                    System.out.println("------------------------\nQual o CPF do correntista?");
                    XPTO.setCPF(sc.nextInt());

                    System.out.println("------------------------\nQual o saldo da conta?");
                    XPTO.setSaldo(sc.nextInt());

                    System.out.println("------------------------\nQual o número do cartão?");
                    XPTO.setNumero(sc.nextInt());

                    System.out.println("------------------------\nQual o número da agencia?");
                    XPTO.setAgencia(sc.nextInt());
                    System.out.println("------------------------\nCADASTRO REALIZADO COM SUCESSO!!\n\n");


                    break;

                case 2:
                    System.out.println("\n------------------------\nO Saldo da conta é de: "+ XPTO.getSaldo());
                    break;

                case 3:
                    int x;
                    System.out.println("Qual dado você gostaria de alterar?\n------------------------\n1 - Nome do correntista.\n2 - RG do correntista.\n3 - CPF do correntista.\n4 - Saldo do correntista.\n5 - O número do cartão.\n6 - O número da Agência.\n7 - Voltar.\n------------------------");
                    x = sc.nextInt();
                    if(x == 1){
                        System.out.println("Digite o novo Nome: ");
                        XPTO.setNome(sc.next());

                    } else if(x == 2){
                        System.out.println("Digite o novo RG: ");
                        XPTO.setRG(sc.nextInt());

                    } else if(x == 3){
                        System.out.println("Digite o novo CPF: ");
                        XPTO.setCPF(sc.nextInt());
                        
                    } else if(x == 4){
                        System.out.println("Digite o novo Saldo: ");
                        XPTO.setSaldo(sc.nextInt());
                        
                    } else if(x == 5){
                        System.out.println("Digite o novo Número do cartão: ");
                        XPTO.setNumero(sc.nextInt());
                        
                    } else if(x == 6){
                        System.out.println("Digite o número da nova Agência: ");
                        XPTO.setAgencia(sc.nextInt());
                        
                    } else {

                        break;
                    }
                    
                    break;

                default:
                    break;
            }
        }






        sc.close();
    }
}
