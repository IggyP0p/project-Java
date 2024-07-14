import java.util.Scanner;

public class Televisao {
    
    //LISTA DE CARACTERISTICAS
    public int tamanho_tela;
    public int volume;
    public String marca;
    public int voltagem;
    public int canal;

    //CONSTRUTOR
    public Televisao(int tamanho_tela, String marca, int voltagem){
        this.marca = marca;
        this.volume = 5;
        this.canal = 1;
        this.tamanho_tela = tamanho_tela;
        this.voltagem = voltagem;

    }

    //METODO PARA LIGAR A TELEVISAO
    public static void ligar(int voltagem, int tamanho_tela){
        int consumo;
        consumo = voltagem * tamanho_tela;
        System.out.println("\nTV ligada!\nO consumo atual da sua TV é de: " + consumo + " watts por hora");
        
    }

    //METODO PARA DESLIGAR A TELEVISAO
    public static void desligar(){
        System.out.println("\nTV desligada!");

    }

    //METODO PARA SUBIR O VOLUME
    public static int subirVolume(int x){
        if(x < 10){
            x = x + 1;
            return x;

        } else {
            System.out.println("O Volume ja esta no maximo!");
            return x;
            
        }
    }

    //METODO PARA DESCER O VOLUME
    public static int descerVolume(int x){
        if(x > 1){
            x = x - 1;
            return x;

        } else {
            System.out.println("O Volume ja esta no minimo!");
            return x;

        }
    }

    //METODO PARA SUBIR O CANAL
    public static int subirCanal(int x){
        if(x < 20){
            x = x + 1;
            return x;

        } else {
            //System.out.println("Chegou no ultimo canal!");
            return x;

        }
    }

    //METODO PARA DESCER O CANAL
    public static int descerCanal(int x){
        if(x > 1){
            x = x - 1;
            return x;

        } else {
            //System.out.println("Chegou no primeiro canal!");
            return x;

        }
    }

    //CANAIS
    public static String Canais(int x){
        if(x == 1){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 2){
            return("\n\nVocê abre na tv cultura\nEstá passando Vila Sesamo e Garibaldo parece meio estranho.");

        } else if( x == 3){
            return("\n\nVocê abre num jornal extremamente sensacionalista\nO ancora não para de gritar.");

        } else if( x == 4){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 5){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 6){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 7){
            return("\n\nVocê abre na BandTV\nHá somente Panicats na tela...");

        } else if( x == 8){
            return("\n\nVocê abre na SBT\nTem algum velho na tela falando besteira...");

        } else if( x == 9){
            return("\n\nAparece um canal de desenhos e esta passando superonze!\nSatoru Endo acaba de usar sua tecnica mão demociaca.");

        } else if( x == 10){
            return("\n\nVocê abre na Globo\nEste era o horário da tv globinho, mas esta passando Fatima Bernardes.");

        } else if( x == 11){
            return("\n\nÉ um canal de noticias!\nVocê ouve que alguma atrocidade acaba de acontecer...");

        } else if( x == 12){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 13){
            return("\n\nVocê chega a MTV\nTá passando o ultimo programa do mundo e o Daniel Furlan ta mais engraçado do que nunca.");

        } else if( x == 14){
            return("\n\nVocê chega a um canal religioso\nAparece o Padre Marcelo Rossi cantando Faz um milagre em mim.");

        } else if( x == 15){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 16){
            return("\n\nParece ser um canal só de midia audiovisual brasileira!\nEsta passando Bacurau.");

        } else if( x == 17){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 18){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else if( x == 19){
            return("\n\nA antena não parece pegar canal algum\nHá apenas interferências na tela.");

        } else{
            return("\n\nVocê encontra um canal esquecido\nHá várias pessoas cantando 'Chu Chu Lovely Muni Muni Mura Mura Purin Purin Boron Nururu Rero Rero'\nQue Bizarro...");

        }

    }


    public static void main(String args[]){
        int tamanhotv=1, voltagem=1, opcao=1, cont1=0;
        String marca;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("PRAGRAMA TESTE DE TELEVISOES!!\n-----------------------------------\nQual a marca da sua televisão?");
        marca = scan.nextLine();

        while(voltagem != 220 && voltagem != 110){
            System.out.println("\nQual a voltagem dela?");
            voltagem = scan.nextInt();

            if(voltagem != 220 && voltagem != 110){
                System.out.println("\nescolha uma voltagem compátivel.\n220 ou 110.");
            }
        }
    
        while(tamanhotv != 32 && tamanhotv != 43 && tamanhotv != 50 && tamanhotv != 75){
            System.out.println("\nQual o tamanho da sua televisao?\n(EM POLEGADAS)");
            tamanhotv = scan.nextInt();

            if(tamanhotv != 32 && tamanhotv != 43 && tamanhotv != 50 && tamanhotv != 75){
                System.out.println("\nescolha um tamanho compátivel.\n32, 43, 50 ou 75 polegadas.");
            }
        }

        Televisao tv = new Televisao(tamanhotv, marca, voltagem);

        System.out.println("\nTudo pronto senhor, pode usar sua televisão!");

        while(opcao != 4){
            System.out.println("\n\n--------------------------------\nO que gostaria de fazer?\n-----------------------\n1 - Ligar/Desligar\n2 - Mudar o canal\n3 - Mudar o volume\n4 - Fechar Programa\n--------------------------\n");

            opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    if(cont1 == 0){
                        ligar(voltagem, tamanhotv);
                        cont1 = cont1 + 1;
                        break;

                    } else {
                        cont1 = 0;
                        desligar();
                        break;

                    }
                    
                case 2:
                    if(cont1 == 0){
                        System.out.println("\n----------------------\nTV desligada, ligue-a para poder mudar o canal");
                        break;

                    } else if(cont1 != 0){
                        System.out.println("\n------------------\nCanal atual: " + tv.canal + "\n-----------------\n1 - Subir canal\n2 = Descer canal\n---------------");
                        int x = scan.nextInt();

                        if(x == 1){
                            tv.canal = subirCanal(tv.canal);
                            System.out.println(Canais(tv.canal) + "\n\nAperte enter para continuar");
                            scan.nextLine();
                            scan.nextLine();

                            break;

                        } else {
                            tv.canal = descerCanal(tv.canal);
                            System.out.println(Canais(tv.canal) + "\n\nAperte enter para continuar");
                            scan.nextLine();
                            scan.nextLine();

                            break;
                            
                        }
                    }

                case 3:
                    if(cont1 == 0){
                        System.out.println("\n--------------------------\nTV desligada, ligue-a para poder mudar o volume");
                        break;

                    } else if(cont1 != 0){
                        System.out.println("\n-----------------------\nVolume atual: "+ tv.volume +"\n-----------------\n1 - Aumentar volume\n2 = Diminuir volume\n---------------");
                        int x = scan.nextInt();

                        if(x == 1){
                            tv.volume = subirVolume(tv.volume);
                            break;

                        } else {
                            tv.volume = descerVolume(tv.volume);
                            break;
                            
                        }

                    }

                case 4:
                    System.out.println("\nVolte sempre!");
                    break;

                default:
                    System.out.println("\nNúmero incompátivel");
                    break;

            }

        }

        scan.close();
    }
    
}

