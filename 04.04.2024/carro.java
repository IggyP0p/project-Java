/*Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo.

Um carro possui as seguintes características:
 modelo;
 velocidade;
 aceleração;
 marcha.

O carro pode realizar as seguintes ações:
 ligar e desligar;
 acelerar e desacelerar;
 virar a direita e esquerda;
 marcha para cima e para baixo. */

import java.util.Scanner;

public class carro {

    //LISTA DE CARACTERISTICAS
    public String modelo;
    public static int velocidade=1;
    public static int aceleracao=5;
    public static int marcha=0;

    public carro(String modelo){
        this.modelo = modelo;

    }

    //METODO RESPONSAVEL POR LIGAR O CARRO
    public static int ligar() {
        int ligado=0;

        if(ligado == 1){
            return 0;

        }

        ligado = 1;
        return 1;
    }

    //METODO RESPONSAVEL POR ACELERAR
    public static void acelerar() {

        if(ligar() == 1){

            if(carro.marcha == 0){
                System.out.println("Você acelerou, mas o carro esta no neutro...");

            } else if(carro.marcha == 1){
                carro.aceleracao = carro.aceleracao + 5;
                System.out.println("O Carro esta se movimentando!");

            } else if(carro.marcha == 2){
                carro.aceleracao = carro.aceleracao + 10;
                System.out.println("O Carro esta se movimentando mais rápido!");

            } else if(carro.marcha == 3){
                carro.aceleracao = carro.aceleracao + 15;
                System.out.println("O Carro esta se movimentando muito mais rápido!");

            } else if(carro.marcha == 4){
                carro.aceleracao = carro.aceleracao + 30;
                System.out.println("O Carro esta se movimentando rápido demais!");

                if(carro.aceleracao > 100){
                    System.out.println("O carro estava rápido demais, você acabou batendo ele e com sorte indo parar no hospital");

                }
            }
            
        } else{
            System.out.println("O carro não pode acelerar pois esta desligado!");

        }
    }

    //METODO RESPONSAVEL POR DESACELERAR
    public static void desacelerar() {
        
        if((ligar() == 1) && (carro.aceleracao > 5)){
            carro.aceleracao = carro.aceleracao - 10;
            System.out.println("Carro desacelerando!");

        } else if(ligar() == 0){
            System.out.println("O carro não pode desacelerar pois esta desligado!");
            
        } else if(carro.aceleracao <= 5){
            System.out.println("O carro não pode desacelerar pois esta parado!");

        }
    }

    //METODO RESPONSAVEL POR VIRAR DIREITA
    public static void virar_direita() {
        
        if((ligar() == 1) && (carro.aceleracao > 5)){
            System.out.println("Você virou a direita na esquina!");

        } else if(ligar() == 0){
            System.out.println("Você virou o carro a direita, mas esta desligado...");

        } else if(carro.aceleracao <= 5){
            System.out.println("Você virou a direita, mas esta parado!");

        }
    }

    //METODO RESPONSAVEL POR VIRAR ESQUERDA
    public static void virar_esquerda() {

        if((ligar() == 1) && (carro.aceleracao > 5)){
            System.out.println("Você virou a esquerda na esquina!");

        } else if(ligar() == 0){
            System.out.println("Você virou o carro a esquerda, mas esta desligado...");

        } else if(carro.aceleracao <= 5){
            System.out.println("Você virou a esquerda, mas esta parado!");
            
        }
    }

    //METODO MARCHA PARA CIMA
    public static void subir_marcha() {

        if(carro.marcha < 4){
            carro.marcha = carro.marcha + 1;

        } else{
            System.out.println("O carro esta na marcha maxima.");
        }
    }

    //METODO MARCHA PARA BAIXO
    public static void descer_marcha() {

        if(carro.marcha > 0){
            carro.marcha = carro.marcha - 1;

        } else{
            System.out.println("O carro ja esta no neutro.");

        }
    }

    public static void menu() {
        int carro=1;
        while(carro != 8){
            System.out.println("Você esta dentro do carro, o que fazer?");

            /*if(ligar() == true){
                System.out.println("1 - Desligar o carro");
            } else{
                System.out.println("1 - Ligar o carro");
            } */
            System.out.println("1 - Ligar o carro\n2 - acelerar o carro\n3 - Desacelerar o carro\n4 - virar a direita\n5 - virar a esquerda\n6 - subir a marcha\n7 - descer a marcha\n8 - sair do carro");
            Scanner teclado = new Scanner(System.in);
            carro = teclado.nextInt();
            
            switch(carro){

                case 1:
                    ligar();
                    break;

                case 2:
                    acelerar();
                    break;

                case 3:
                    desacelerar();
                    break;

                case 4:
                    virar_direita();
                    break;

                case 5:
                    virar_esquerda();
                    break;

                case 6:
                    subir_marcha();
                    break;

                case 7:
                    descer_marcha();
                    break;

                case 8:
                    teclado.close();
                    return;

                default:
                    menu();
                    break;
                    

            }
            teclado.close();
        }
        
    }

    public static void main(String args[]){
        menu();
        
    }
}

