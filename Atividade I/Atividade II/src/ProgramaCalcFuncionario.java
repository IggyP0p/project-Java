import java.util.Scanner;

public class ProgramaCalcFuncionario {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        String nome;
        int salarioBase, horasTrabalhadas, dataContratacao;

        System.out.println("\nDigite o nome do Funcionario");
        nome = sc.nextLine();

        System.out.println("\nDigite o salario base do funcionario");
        salarioBase = sc.nextInt();

        System.out.println("\nDigite as horas trabalhadas do funcionario");
        horasTrabalhadas = sc.nextInt();

        System.out.println("\nDigite a data de contratação do Funcinoario");
        dataContratacao = sc.nextInt();

        Funcionario funcionario = new Funcionario(nome, salarioBase, horasTrabalhadas, dataContratacao);
        
        funcionario.calculaSalario();
        funcionario.ImprimeDados();

        System.out.println("\nFuncionario 2: ");

        sc.nextLine();
        System.out.println("\nDigite o nome do Funcionario");
        nome = sc.nextLine();

        System.out.println("\nDigite o salario base do funcionario");
        salarioBase = sc.nextInt();

        System.out.println("\nDigite as horas trabalhadas do funcionario");
        horasTrabalhadas = sc.nextInt();

        System.out.println("\nDigite a data de contratação do Funcinoario");
        dataContratacao = sc.nextInt();

        Funcionario funcionario2 = new Funcionario(nome, salarioBase, horasTrabalhadas, dataContratacao);
        
        funcionario2.calculaSalario();
        funcionario2.ImprimeDados();


        sc.close();

    }
    
}
