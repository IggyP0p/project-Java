/* calcule a área de uma circunferência e apresente a medida da área calculada. Sabe-se que 
para realizar o cálculo da área de uma circunferência é necessário utilizar a seguinte a seguinte 
fórmula: A = Pi*r² . O valor do Raio será informado pelo usuário. */

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("Programa para calcular a area de uma circunferência!!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Digite o raio da circunferência: ");

        double raio = teclado.nextDouble();

        double area = 3.14 * (raio * raio);

        System.out.println("A área da circunferência é de "+ area +" unidades ao quadrado");

        teclado.close();
    }
}
