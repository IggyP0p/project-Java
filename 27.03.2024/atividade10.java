/*solicite ao usuário dois valores numéricos. Em seguida o algoritmo deverá efetuar a soma 
dos dois valores e apresentar o resultado caso seja maior que 10.  */

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("Programa que identifica uma soma maior que 10!!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Digite o primeiro número: ");

        int num = teclado.nextInt();

        System.out.println("Digite o segundo número: ");

        int num2 = teclado.nextInt();

        int soma = num + num2;

        if(soma > 10){
            System.out.println(soma +" com certeza é maior que 10!!!");

        } else {
            System.out.println("Esta soma não é maior que 10");

        }

        teclado.close();
    }    
}
