/*que solicite ao usuário sua idade e informe se o mesmo já pode tirar carteira de motorista.
 O usuário somente poderá tirar a carteira de motorista se a idade for maior que 18 anos. */

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");

        int idade = teclado.nextInt();

        if(idade >= 18){
            System.out.println("Você esta apto para tirar carteira de motorista");

        } else{
            int restante = 18 - idade;
            System.out.println("Você deve esperar "+ restante +" anos para poder tirar carteira de motorista.");
        }

        teclado.close();
    }
}
