package bandomysql;
import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String args[])
    {
        RoupasDAO dao = new RoupasDAO();
        //Roupas j = new Roupas();

        //j.setNome("jaqueta");
        //j.setNumero(2);

        //dao.adicionarRoupa(j);

        Roupas s = new Roupas();

        s.setNome("sueter");
        s.setNumero(3);

        //dao.adicionarRoupa(s);

        List<Roupas> bd = new ArrayList<Roupas>();

        bd = dao.consulta();
        
        for(int i=0; i<bd.size(); i++)
        {
            System.out.println(bd.get(i).getNome() + bd.get(i).getNumero());
        }
    }
}