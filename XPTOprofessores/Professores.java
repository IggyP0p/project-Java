public class Professores
{
    public String nome;
    public int idade;
    public String sexo;
    public String cpf;
    public String rg;
    public String endereco;
    public Dependente dependente;

    public static int count;
    public static int countErro;
    public static String erro[] = new String[5];
    private static Professores [] p = new Professores[5];
    

    public void incluirProfessor( String nome, String cpf, String rg, String endereco, String sexo, int idade) throws ProfessorLimiteException
    {
        if(count < 4)
        {
            p[count] = new Professores();
            p[count].nome = nome;
            p[count].sexo = sexo;
            p[count].idade = idade;
            p[count].cpf = cpf;
            p[count].rg = rg;
            p[count].endereco = endereco;
            count++;

        } else 
        {
            ProfessorLimiteException e = new ProfessorLimiteException("ERRO: LIMITE DE PROFESSORES ATINGIDO");
            throw e;

        }
    }

    public boolean ProfessorExistente(String cpf) throws ProfessorExistenteException
    {
        for(int i=0; i<count; i++)
        {
            
            if(p[i].cpf.equals(cpf))
            {
                ProfessorExistenteException e2 = new ProfessorExistenteException("ERRO: PROFESSOR JA EXISTENTE");
                throw e2;

            }
            
        }

        return true;
    }

    public void excluirProfessor(String cpf) throws ProfessorInexistenteException
    {
        for(int i=0; i<count; i++)
        {
            if(p[i].cpf.equals(cpf))
            {
                p[i] = null;
                p[i].cpf = null;
                p[i].dependente = null;
                p[i].endereco = null;
                p[i].idade = 0;
                p[i].nome = null;
                p[i].rg = null;
                p[i].sexo = null;

                System.out.println("PROFESSOR EXCLUIDO COM SUCESSO!");
            } else
            {
                ProfessorInexistenteException e3 = new ProfessorInexistenteException("ERRO: PROFESSOR INEXISTENTE!");
                throw e3;
            }
        }
    }

    public void pesquisarProfessor(String cpf) throws ProfessorNaoEncontradoException
    {
        int i=0;

        while(i != count)
        {
            if(p[i].cpf.equals(cpf))
            {
                System.out.println("Professor " + p[i].nome + "\nIdade: "+ p[i].idade + "\nSexo: " + p[i].sexo + "\nCPF: " + p[i].cpf + "\nRG: " + p[i].rg + "\nEndereço: "+ p[i].endereco);
                if(p[i].dependente != null)
                {
                    System.out.println("--------------------\nDependente do Professor\nNome: "+ p[i].dependente.nome + "\nIdade: " + p[i].dependente.idade + "\nSexo: " + p[i].dependente.sexo);
                } else 
                {
                    System.out.println("--------------------\nNão possui dependente");
                }

                return;
            } 
            
            i++;
        }

        ProfessorNaoEncontradoException e4 = new ProfessorNaoEncontradoException("ERRO: Professor não encontrado");
        throw e4;
    }

    public void incluirDependente(String cpf, String nome, int idade, String sexo)
    {
        for(int i=0; i<count; i++)
        {
            if(p[i].cpf.equals(cpf))
            {
                p[i].dependente = new Dependente();
                p[i].dependente.nome = nome;
                p[i].dependente.idade = idade;
                p[i].dependente.sexo = sexo;
            }
        }
        
    }
    
    public void armazenaErro(String message)
    {
        erro[countErro] = message;
        countErro++;
    }

    public void ImprimirErros()
    {
        for(int i=0; i<countErro; i++)
        {
            System.out.println(erro[i]);
        }
    }
    
    public void setNome(String nome)
    {
        p[count].nome = nome;
    }

    public void setEndereco(String endereco)
    {
        p[count].endereco = endereco;
    }

    public void setIdade(int idade)
    {
        p[count].idade = idade;
    }

    public void setSexo(String sexo)
    {
        p[count].sexo = sexo;
    }

    public void setCpf(String cpf)
    {
        p[count].cpf = cpf;
    }

    public void setRG(String rg)
    {
        p[count].rg = rg;
    }

}





