import java.util.Scanner;

/*
 * public String nome;
    public int idade;
    public String sexo;
    public String cpf;
    public String rg;
    public String endereco;
    public Dependente dependente;
 */
public class App {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, cpf, rg, endereco;
        int idade, opcao=0;

        Professores pr = new Professores();

        while(opcao != 5){
            System.out.println("\n\nCADASTRO DE PROFESSORES XPTO\n1 - Cadastrar Professor\n2 - Excluir Professor\n3 - Pesquisar Professor\n4 - Adicionar Dependente\n5 - Sair");

            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    sc.nextLine();
                    System.out.println("\nDigite o nome do professor");
                    nome = sc.nextLine();
        
                    System.out.println("\nDigite o sexo do professor");
                    sexo = sc.next();

                    System.out.println("\nDigite o cpf do professor");
                    cpf = sc.next();

                    System.out.println("\nDigite o rg do professor");
                    rg = sc.next();

                    sc.nextLine();
                    System.out.println("\nDigite o endereço do professor");
                    endereco = sc.nextLine();

                    System.out.println("\nDigite a idade do professor");
                    idade = sc.nextInt();

                    try
                    {
                        pr.ProfessorExistente(cpf);

                    } catch(ProfessorExistenteException e)
                    {
                        pr.armazenaErro(e.getMessage());
                        System.out.println(e.getMessage());
                    } catch(Exception e2)
                    {
                        pr.armazenaErro("HOUVE UM ERRO");
                        System.out.println("HOUVE UM ERRO");
                    }
                    

                    try
                    {
                        pr.incluirProfessor( nome, sexo, cpf, rg, endereco, idade);    

                    } catch(ProfessorLimiteException e)
                    {
                        pr.armazenaErro(e.getMessage());
                        System.out.println(e.getMessage());

                    } catch(Exception e3)
                    {
                        pr.armazenaErro(e3.getMessage());
                        System.out.println("\nERRO: ALGUM ERRO OCORREU");
                    }

                    break;
                    
                case 2:
                    System.out.println("\nDigite o cpf do Professor");
                    cpf = sc.next();

                    try
                    {
                        pr.excluirProfessor(cpf);

                    } catch(ProfessorInexistenteException e)
                    {
                        pr.armazenaErro(e.getMessage());
                        System.out.println(e.getMessage());

                    } catch(Exception e3)
                    {
                        pr.armazenaErro(e3.getMessage());
                        System.out.println("\nERRO: ALGUM ERRO OCORREU");
                    }

                    break;

                case 3:
                    System.out.println("\nDigite o cpf do Professor");
                    cpf = sc.next();

                    try
                    {
                        pr.pesquisarProfessor(cpf);

                    } catch(ProfessorNaoEncontradoException e)
                    {
                        pr.armazenaErro(e.getMessage());
                        System.out.println(e.getMessage());

                    } catch(Exception e3)
                    {
                        pr.armazenaErro(e3.getMessage());
                        System.out.println("\nERRO: ALGUM ERRO OCORREU");
                    }
                    break;

                case 4:

                    sc.nextLine();
                    System.out.println("\nDigite o cpf do Professor");
                    cpf = sc.nextLine();

                    sc.nextLine();
                    System.out.println("\nDigite o nome do Dependente");
                    nome = sc.nextLine();

                    System.out.println("\nDigite a idade do Dependente");
                    idade = sc.nextInt();

                    System.out.println("\nDigite o sexo do Dependente");
                    sexo = sc.next();

                    pr.incluirDependente(cpf, nome, idade, sexo);
                    break;
                    

                case 5:
                    System.out.println("\nVolte sempre!");
                    pr.ImprimirErros();
                    break;

                default:
                    System.out.println("\nNúmero incompátivel");
                    break;

            }

        }
        

        sc.close();
    }
}
