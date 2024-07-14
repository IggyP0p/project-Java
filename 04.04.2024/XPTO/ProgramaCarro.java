import java.util.Scanner;

public class ProgramaCarro {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int codigo, ano, quantidade, portas, preco;
        String modelo, marca, cor, gas, combas;

        System.out.println("Digite primeiro o Código do seu carro");
        codigo = sc.nextInt();

        System.out.println("Qual o ano de fabricação do carro?");
        ano = sc.nextInt();
            
        System.out.println("Qual a quantidade de portas dele?");
        portas = sc.nextInt();
            
        System.out.println("Qual a quantidade dele no estoque?");
        quantidade = sc.nextInt();
            
        System.out.println("Qual o preço desse carro?");
        preco = sc.nextInt();
            
        System.out.println("Qual o modelo do carro?");
        modelo = sc.next();
            
        System.out.println("Qual a cor do carro?");
        cor = sc.next();
            
        System.out.println("Ele é completo ou básico?");
        combas = sc.next();
            
        System.out.println("Funciona a Diesel ou gasolina?");
        gas = sc.next();
            
        System.out.println("Qual a Marca do carro?");
        marca = sc.next();

        Carro XPTO = new Carro(codigo, ano, portas, quantidade, preco, modelo, cor, combas, gas, marca);


        int opcao = 1;

        while(opcao != 3){
            System.out.println("\n\n1 - Listar.\n2 - Alterar.");

            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("O codigo do carro: "+ XPTO.getCodigo());
                    System.out.println("O ano de fabricação do carro: "+ XPTO.getAno());
                    System.out.println("A quantia de portas do carro: "+ XPTO.getPortas());
                    System.out.println("A quantidade do carro no estoque: "+ XPTO.getQuantidade());
                    System.out.println("O preço do carro: "+ XPTO.getPreco());
                    System.out.println("O modelo do carro: "+ XPTO.getModelo());
                    System.out.println("A cor do carro: "+ XPTO.getCor());
                    System.out.println("O Carro usa: "+ XPTO.getGas());
                    System.out.println("A marca do carro: "+ XPTO.getMarca());
                    System.out.println("básico ou completo: "+ XPTO.getCombas());
                    break;

                case 2:
                    System.out.println("O que desejaria alterar?\n1 - mudar o codigo\n2 - mudar o ano de fabricação\n3 - mudar quantidade de portas\n4 - mudar quantidade no estoque\n5 - Mudar o preço\n6 - Mudar o modelo\n7 - mudar a cor\n8 - mudar completo ou basico\n9 - mudar combustivel\n10 - mudar marca");
                    int x = sc.nextInt();

                    switch(x){
                        case 1:
                            XPTO.setCodigo(sc.nextInt());
                            break;

                        case 2:
                            XPTO.setAno(sc.nextInt());
                            break;

                        case 3:
                            XPTO.setPortas(sc.nextInt());
                            break;

                        case 4:
                            XPTO.setQuantidade(sc.nextInt());
                            break;

                        case 5:
                            XPTO.setPreco(sc.nextInt());
                            break;

                        case 6:
                            XPTO.setModelo(sc.next());
                            break;
                            
                        case 7:
                            XPTO.setCor(sc.next());
                            break;

                        case 8:
                            XPTO.setComBas(sc.next());
                            break;

                        case 9:
                            XPTO.setGas(sc.next());
                            break;

                        case 10:
                            XPTO.setMarca(sc.next());
                            break;

                    }
                    
                
                default:

                    break;
                  

               
            }

        }
        
        sc.close();

    }
    
}
