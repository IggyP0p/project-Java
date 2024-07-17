public class Calculo{

    private int totalSalario;


    public void calculaSalario(int Salario, int horasTrabalhadas){
        this.totalSalario = Salario * horasTrabalhadas;

    }

    public int getTotalSalario(){
        return totalSalario;

    }

}