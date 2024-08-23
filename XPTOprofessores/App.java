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

        Professores p = new Professores();

        while(opcao != 5){
            System.out.println("CADASTRO DE PROFESSORES XPTO\n1 - Cadastrar Professor\n2 - Excluir Professor\n3 - Pesquisar Professor\n4 - Adicionar Dependente\n5 - Sair");

            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do professor");
                    nome = sc.nextLine();
        
                    System.out.println("Digite o sexo do professor");
                    sexo = sc.next();

                    System.out.println("Digite o cpf do professor");
                    cpf = sc.next();

                    System.out.println("Digite o rg do professor");
                    rg = sc.next();

                    sc.nextLine();
                    System.out.println("Digite o endereço do professor");
                    endereco = sc.nextLine();

                    System.out.println("Digite a idade do professor");
                    idade = sc.nextInt();

                    p.setCpf(cpf);
                    p.setEndereco(endereco);
                    p.setIdade(idade);
                    p.setNome(nome);
                    p.setRG(rg);
                    p.setSexo(sexo);

                    try
                    {
                        p.incluirProfessor(p);
                        

                    } catch(ProfessorLimiteException e)
                    {
                        System.out.println(e.getMessage());

                    } catch(ProfessorExistenteException e2)
                    {
                        System.out.println(e2.getMessage());

                    } catch(Exception e3)
                    {
                        System.out.println("ERRO: ALGUM ERRO OCORREU");
                    }

                    break;
                    
                case 2:
                    System.out.println("Digite o cpf do Professor");
                    cpf = sc.next();

                    try
                    {
                        p.excluirProfessor(cpf);

                    } catch(ProfessorInexistenteException e)
                    {
                        System.out.println(e.getMessage());

                    } catch(Exception e3)
                    {
                        System.out.println("ERRO: ALGUM ERRO OCORREU");
                    }

                    break;

                case 3:
                    System.out.println("Digite o cpf do Professor");
                    cpf = sc.next();

                    try
                    {
                        p.pesquisarProfessor(cpf);

                    } catch(ProfessorNaoEncontradoException e)
                    {
                        System.out.println(e.getMessage());

                    } catch(Exception e3)
                    {
                        System.out.println("ERRO: ALGUM ERRO OCORREU");
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do Dependente");
                    nome = sc.nextLine();

                    System.out.println("Digite a idade do Dependente");
                    idade = sc.nextInt();

                    System.out.println("Digite o sexo do Dependente");
                    sexo = sc.next();

                    p.incluirDependente(p, nome, idade, sexo);
                    break;
                    

                case 5:
                    System.out.println("\nVolte sempre!");
                    break;

                default:
                    System.out.println("\nNúmero incompátivel");
                    break;

            }

        }
        

        sc.close();
    }
}
