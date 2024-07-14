/*Sabendo que um Professor para o sistema de cadastro da Faculdade XPTO
possui as seguintes características: nome, titulação, formação, carga horária,
salário e uma descrição das disciplinas que professor pode ensinar. O
Professor possui os seguintes comportamentos: 
(i) cadastrar e alterar que recebem como parâmetro as características do Professor; 
(ii) alterar a descrição de disciplina ensinada; 
(iii) Imprimir dados do Professor; */

public class Professor {
    
    private String nome;
    private String titulacao;
    private String formacao;
    private String disciplina;
    private int carga;
    private int salario;

    public Professor(String nome, String titulacao, String formacao, String disciplina, int carga, int salario){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.disciplina = disciplina;
        this.carga = carga;
        this.salario = salario;

    }

    //SETTERS
    public void setNome(String novoNome){
        this.nome = novoNome;

    }

    public void setTitulacao(String novaTitulacao){
        this.titulacao = novaTitulacao;
        
    }

    public void setFormacao(String novaFormacao){
        this.formacao = novaFormacao;
        
    }

    public void setDisciplina(String novaDisciplina){
        this.disciplina = novaDisciplina;
        
    }

    public void setCarga(int novaCarga){
        this.carga = novaCarga;

    }

    public void setSalario(int novoSalario){
        this.salario = novoSalario;

    }

    //GETTERS
    public String getNome(){
        return nome;

    }
    
    public String getTitulacao(){
        return titulacao;
        
    }

    public String getFormacao(){
        return formacao;
        
    }

    public String getDisciplina(){
        return disciplina;
        
    }

    public int getCarga(){
        return carga;

    }

    public int getSalario(){
        return salario;
    }


}
