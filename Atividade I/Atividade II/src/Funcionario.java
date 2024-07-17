
public class Funcionario {
    
    private String nome;
    private int cpf;
    private int matricula;
    private int salario;
    private int dataContratado;
    private int salarioBase;
    private int horasTrabalhadas;

    //CONSTRUTOR
    public Funcionario(String nome, int salarioBase, int horasTrabalhadas, int dataContratado){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.matricula = geraMatricula++;
        this.dataContratado = dataContratado;

    }

    private static int geraMatricula = 0;
        

    public void calculaSalario(){
        Calculo Salario = new Calculo();
        Salario.calculaSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = Salario.getTotalSalario();

    }

    public void ImprimeDados(){
        System.out.println("\n\n------------------------\nDADOS DO FUNCIONARIO\n------------------------\nNome: "+ nome +"\nCPF: "+ cpf +"\nMatricula: "+ matricula +"\nSalário: "+ salario +"\nData de contratação: "+ dataContratado+"\n------------------------");

    }

}
