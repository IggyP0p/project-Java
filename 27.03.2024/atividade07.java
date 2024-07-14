/*leia o peso e a altura do usuário e informa se o mesmo está obeso. Lembre que para saber 
se uma pessoa está obesa deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado 
do imc seja maior que 30 o usuário está obeso. */

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu peso");

        float peso = teclado.nextFloat();

        System.out.println("Digite a sua altura");
        
        float altura = teclado.nextFloat();

        float imc = peso / (altura * altura);

        if(imc > 30){
            System.out.println("O senhor(a) se encontra em situação de obesidade, procure assistência médica.");

        } else {
            System.out.println("O senhor(a) não esta em situação de obesidade."); 

        }

        teclado.close();
    }
}
