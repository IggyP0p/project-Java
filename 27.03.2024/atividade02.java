//sabe-se que o carro faz em média 12 km/litro. 

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos km de distância serao percorridos?");

        //GASOLINA NECESSARIA PARA VIAGEM DO CARRO
        float gas_carro = teclado.nextFloat() / 12;

        System.out.println("Qual o custo do litro da gasolina?");

        //PRECO DA GASOLINA NECESSARIA
        float preco = teclado.nextFloat() * gas_carro;

        System.out.println("O quantia de gasolina necessária será "+ gas_carro +" litros, o que custará "+ preco +" reais");
        
        teclado.close();
    }
}
