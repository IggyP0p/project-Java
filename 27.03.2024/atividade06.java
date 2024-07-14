/* solicite ao usuário as notas de 2 provas e um trabalho e que seja capaz de calcular a média 
aritmética. Caso a média final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario
, imprimir a mensagem reprovado” */

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro semestre: ");

        int nota1 = teclado.nextInt();

        System.out.println("Agora do segundo semestre: ");

        int nota2 = teclado.nextInt();

        int media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno foi de "+ media+ " pontos.");

        if(media >= 7){
            System.out.println("Portanto o aluno esta aprovado!");

        } else{
            System.out.println("Infelizmente, o aluno está reprovado!");

        }

        teclado.close();
    }    
}
