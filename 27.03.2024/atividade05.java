/*Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles.  */

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int num = teclado.nextInt();

        System.out.println("Digite um outro numero: ");

        int num2 = teclado.nextInt();

        if(num > num2){
            System.out.println("O numero "+ num +" é maior que o numero "+ num2 + ".");

        } else if(num2 > num){
            System.out.println("O numero "+ num2 +" é maior que o numero "+ num + ".");

        } else if(num == num2){
            System.out.println("O numero "+ num +" é igual ao numero "+ num2 + ".");

        }

        teclado.close();
    }    
}
