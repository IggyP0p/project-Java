public class Aluno
{
    String Nome;
    String Endereco;
    int Matricula;
    public static int count = 0;
    public static int[] array={0,0,0,0,0,0,0};

    public Aluno(String nome, String endereco)
    {
        this.Nome = nome;
        this.Endereco = endereco;
    }

    public void setMatricula(int matricula) throws ExceptionMatricula
    {
        for(int i=0; i<count; i++)
        {
            if(array[i] == matricula)
            {
                ExceptionMatricula e = new ExceptionMatricula("Número de matricula ja utilizado");
                throw e;
            }

        }

        array[count] = matricula;
        count++;
        this.Matricula = matricula;
    }


}