import java.util.Scanner;

public class Teste {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int matricula;

        Aluno aluno = new Aluno("Jonas", "Perimbau");

        System.out.println("Digite a matricula do aluno");
        matricula = sc.nextInt();

        try
        {
            aluno.setMatricula(matricula);
        }
        catch(ExceptionMatricula e)
        {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        Aluno aluno1 = new Aluno("Carlos", "Canao");

        System.out.println("Digite a matricula do aluno");
        matricula = sc.nextInt();

        try
        {
            aluno1.setMatricula(matricula);
        }
        catch(ExceptionMatricula e)
        {
            System.out.println("ERRO: " + e.getMessage());
        }

        System.out.println(aluno.Matricula);

        System.out.println(aluno1.Matricula);

        sc.close();
    }
}