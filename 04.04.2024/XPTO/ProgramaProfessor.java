import java.util.Scanner;

public class ProgramaProfessor {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PROFESSOR XPTO!!!");
        Professor XPTO = new Professor(null, null, null, null, 0, 0);
        
        int opcao = 1;
        while(opcao != 4){
            System.out.println("------------------------\n1 - Cadastrar um professor.\n2 - Imprimir Dados.\n3 - Alterar dados.\n4 - Alterar descrição da disciplina\n5 - Exit.");

            switch(opcao = sc.nextInt()){
                case 1:
                    System.out.println("\nBEM-VINDO AO CADASTRO!!\n------------------------\nQual o nome do professor?");
                    XPTO.setNome(sc.next());

                    System.out.println("------------------------\nQual a titulação dele?");
                    XPTO.setTitulacao(sc.next());

                    System.out.println("------------------------\nQual a formação dele?");
                    XPTO.setFormacao(sc.nextLine());

                    System.out.println("------------------------\nQual disciplina este professor irá ensinar?");
                    XPTO.setDisciplina(sc.next());

                    System.out.println("------------------------\nQual a carga horaria do professor?");
                    XPTO.setCarga(sc.nextInt());

                    System.out.println("------------------------\nQual o salário do professor?");
                    XPTO.setSalario(sc.nextInt());
                    System.out.println("------------------------\nCADASTRO REALIZADO COM SUCESSO!!\n\n");


                    break;

                case 2:
                    System.out.println("\n------------------------\nO nome do : "+ XPTO.getNome() + "\nA titulação é: "+ XPTO.getTitulacao() +"\nA formação dele: "+ XPTO.getFormacao() +"\nA disciplina ensinada é: "+ XPTO.getDisciplina() +"\nA carga horaria dele: "+ XPTO.getCarga()+ "\nO salario do professor: "+ XPTO.getSalario());
                    
                    break;

                case 3:
                    int x;
                    System.out.println("Qual dado você gostaria de alterar?\n------------------------\n1 - O Nome do professor.\n2 - A Titulação dele.\n3 - A formação do professor.\n4 - A carga horaria do professor.\n5 - O Salario do professor\n6 - Voltar.\n------------------------");
                    x = sc.nextInt();
                    if(x == 1){
                        System.out.println("Digite o novo Nome: ");
                        XPTO.setNome(sc.next());

                    } else if(x == 2){
                        System.out.println("Digite a nova Titulação: ");
                        XPTO.setTitulacao(sc.next());

                    } else if(x == 3){
                        System.out.println("Digite a nova Formação: ");
                        XPTO.setFormacao(sc.next());
                        
                    } else if(x == 4){
                        System.out.println("Digite a nova Carga horaria: ");
                        XPTO.setCarga(sc.nextInt());
                        
                    } else if(x == 5){
                        System.out.println("Digite o novo salario: ");
                        XPTO.setSalario(sc.nextInt());
                        
                    } else {

                        break;
                    }
                    
                    break;

                case 4:
                    System.out.println("Dê a nova descrição da disciplina: ");
                    XPTO.setDisciplina(sc.nextLine());
                    break;
                default:
                    break;
            }
        }









        sc.close();
    }
}
