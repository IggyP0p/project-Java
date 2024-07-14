/*ler a temperatura do corpo medida com um termômetro. Caso a temperatura seja maior que 
37 graus o paciente está com febre, caso contrário, sua temperatura está normal. Após 
ler a temperatura mostre a mensagem apropriada.  */

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual foi a temperatura medida em graus?");

        int temperatura = teclado.nextInt();

        if(temperatura > 37){
            System.out.println("O paciente esta com febre.");

        } else {
            System.out.println("O paciente esta com a temperatura corporal normal.");

        }

        teclado.close();
    }
}
