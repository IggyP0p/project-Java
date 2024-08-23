public class Professores
{
    public String nome;
    public int idade;
    public String sexo;
    public String cpf;
    public String rg;
    public String endereco;
    public Dependente dependente;

    static int count;
    public static Professores [] p = new Professores[5];
    public static Professores [] erro = new Professores[5];

    public void incluirProfessor(Professores prof) throws ProfessorLimiteException, ProfessorExistenteException
    {
        if(count < 4)
        {
            if(ProfessorExistente(prof))
            {
                if(p[count] == null)
                {
                    p[count] = prof;
                    p[count].nome = prof.nome;
                    p[count].cpf = prof.cpf;
                    p[count].rg = prof.rg;
                    p[count].endereco = prof.endereco;
                    p[count].idade = prof.idade;
                    p[count].sexo = prof.sexo;


                    count++;
                } else
                {
                    count++;
                    p[count] = prof;
                    p[count].nome = prof.nome;
                    p[count].cpf = prof.cpf;
                    p[count].rg = prof.rg;
                    p[count].endereco = prof.endereco;
                    p[count].idade = prof.idade;
                    p[count].sexo = prof.sexo;
                }
            }else
            {
                ProfessorExistenteException e2 = new ProfessorExistenteException("ERRO: PROFESSOR JA EXISTENTE");
                throw e2;
            }

        } else 
        {
            for(int i=0; i<count; i++)
                {
                    if(p[i] == null)
                    {
                        count = i;
                        p[count] = prof;
                        p[count].nome = prof.nome;
                        p[count].cpf = prof.cpf;
                        p[count].rg = prof.rg;
                        p[count].endereco = prof.endereco;
                        p[count].idade = prof.idade;
                        p[count].sexo = prof.sexo;
                        return;
                    }
                }
            ProfessorLimiteException e = new ProfessorLimiteException("ERRO: LIMITE DE PROFESSORES ATINGIDO");
            throw e;
        }
    }

    public boolean ProfessorExistente(Professores prof)
    {
        for(int i=0; i<count; i++)
        {
            if(p[i] == prof)
            {
                return false;
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
        for(int i=0; i<count; i++)
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

            } else 
            {
                ProfessorNaoEncontradoException e4 = new ProfessorNaoEncontradoException("ERRO: Professor não encontrado");
                throw e4;
            }
        }
    }

    public void incluirDependente(Professores prof, String nome, int idade, String sexo)
    {
        prof.dependente = new Dependente();
        prof.dependente.nome = nome;
        prof.dependente.idade = idade;
        prof.dependente.sexo = sexo;
    }
    
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setRG(String rg)
    {
        this.rg = rg;
    }

}





