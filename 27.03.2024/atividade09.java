/*calcule o salário líquido de um professor. Para elaborar o programa, é necessário solicitar 
do usuário alguns dados, tais como valor da hora aula, número de horas trabalhadas no mês, 
percentual de desconto do INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer 
o desconto e ter o valor do salário líquido.  */

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("Programa para saber o quão bem pago é um professor!!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Primeiro, digite o valor da hora aula: ");

        double HoraAula = teclado.nextDouble();

        System.out.println("Agora, quantas horas o senhor(a) trabalhou este mês: ");

        double HoraTrabalhada = teclado.nextDouble();

        double salarioBruto = HoraAula * HoraTrabalhada;

        System.out.println("Por fim, o percentual descontado pelo INSS: ");

        double INSS = teclado.nextDouble();

        double salarioLiquido = salarioBruto - (salarioBruto * INSS);

        System.out.println("Pois então, temos que o dinheiro ganho pelo professor é igual a: "+ salarioLiquido);

        teclado.close();
    }
}
