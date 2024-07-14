/*solicite ao usuário dois valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos 
dois valores e caso o resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário 
o valor do resultado deverá ser subtraído de 7. Após a obtenção do resultado apresente essa 
informação para o usuário.  */

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num = teclado.nextInt();

        System.out.println("Digite outro número: ");

        int num2 = teclado.nextInt();

        int soma = num + num2;

        if(soma >= 10){
            soma = soma + 5;

        } else{
            soma = soma - 7;

        }

        System.out.println("Tome então teu número: "+ soma);

        teclado.close();
    }
}
