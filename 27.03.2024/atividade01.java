import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas o funcionario trabalhou neste mes?");
        
        int horas = teclado.nextInt();

        int salario = 20 * horas;

        System.out.println("O funcionario recebera " + salario + " reais este mes.");

        teclado.close();
    }
}
