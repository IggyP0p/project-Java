package bandomysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoupasDAO
{

    public void adicionarRoupa(Roupas roupa)
    {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try
        {
            stmt = con.prepareStatement("INSERT INTO ROUPAS (NOME, NUMERO)  VALUES (?, ?)");

            stmt.setString(1, roupa.getNome());

            stmt.setInt(2, roupa.getNumero());

            stmt.executeUpdate();

            System.out.println("A roupa " + roupa.getNome() + " de numero "+ roupa.getNumero() + " foi adicionada");
        }
        catch(SQLException e)
        {
            System.out.println("Houve um problema na adição do item");
        }
        finally
        {
            Conexao.closeConnection(con, stmt);
        }

    }

    public List<Roupas> consulta()
    {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        List<Roupas> roupas = new ArrayList<Roupas>();

        try
        {
            stmt = con.prepareStatement("select id, nome, numero from ROUPAS");
            rs = stmt.executeQuery();

            while(rs.next())
            {
                Roupas roupa = new Roupas();
                
                roupa.setId(rs.getInt("id"));
                roupa.setNome(rs.getString("nome"));
                roupa.setNumero(rs.getInt("numero"));

                roupas.add(roupa);
            }
        }
        catch(SQLException e)
        {
            System.out.println("Houve um problema na consulta de roupas");
        }
        finally
        {
            Conexao.closeConnection(con, stmt);
        }
        
        return roupas;
    }
}