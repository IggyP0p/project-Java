import java.util.Scanner;

public class ProgramaAnimal {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA ANIMAL XPTO!!!");
        Animal XPTO = new Animal(null, null, null, null, null);
        
        int opcao = 1;
        while(opcao != 4){
            System.out.println("------------------------\n1 - Cadastrar um animal.\n2 - Imprimir Dados.\n3 - Alterar dados.\n4 - Exit.");

            switch(opcao = sc.nextInt()){
                case 1:
                    System.out.println("\nBEM-VINDO AO CADASTRO!!\n------------------------\nQual o nome do animal?");
                    XPTO.setNome(sc.next());

                    System.out.println("------------------------\nQual a especie dele?");
                    XPTO.setEspecie(sc.next());

                    System.out.println("------------------------\nQual o local de nascimento do animal?");
                    XPTO.setLocal(sc.next());

                    System.out.println("------------------------\nQual o registro deste animal?");
                    XPTO.setRegistro(sc.nextLong());

                    System.out.println("------------------------\nQual a data de nascimento do animal?");
                    XPTO.setData(sc.nextLong());
                    System.out.println("------------------------\nCADASTRO REALIZADO COM SUCESSO!!\n\n");


                    break;

                case 2:
                    System.out.println("\n------------------------\nO nome do animal: "+ XPTO.getNome() + "\nO nome da especie: "+ XPTO.getEspecie() +"\nO local do Nascimento dele: "+ XPTO.getLocal() +"\nO registro do animal: "+ XPTO.getRegistro() +"\nA data de Nascimento dele: "+ XPTO.getData());
                    
                    break;

                case 3:
                    int x;
                    System.out.println("Qual dado você gostaria de alterar?\n------------------------\n1 - O Nome do animal.\n2 - A Especie do animal.\n3 - Local de Nascimento.\n4 - Registro do animal.\n5 - Data de nascimento.\n6 - Voltar.\n------------------------");
                    x = sc.nextInt();
                    if(x == 1){
                        System.out.println("Digite o novo Nome: ");
                        XPTO.setNome(sc.next());

                    } else if(x == 2){
                        System.out.println("Digite a nova Especie: ");
                        XPTO.setEspecie(sc.next());

                    } else if(x == 3){
                        System.out.println("Digite o novo Local: ");
                        XPTO.setLocal(sc.next());
                        
                    } else if(x == 4){
                        System.out.println("Digite o novo Registro: ");
                        XPTO.setRegistro(sc.nextLong());
                        
                    } else if(x == 5){
                        System.out.println("Digite a nova Data: ");
                        XPTO.setData(sc.nextLong());
                        
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
