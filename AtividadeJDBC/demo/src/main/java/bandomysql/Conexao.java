package bandomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Conexao {
    
    //private static final String DRIVE_MYSQL = "com.mysql.cj.jdbc.Driver";
    private static final String ENDERECO = "jdbc:mysql://localhost:3306/db_teste";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection getConnection()
    {
        try
        {
            //Class.forName(DRIVE_MYSQL);
            Connection conexao = DriverManager.getConnection(ENDERECO, USUARIO, SENHA);
            return conexao;
        }
        //catch(ClassNotFoundException e)
       // {
            //System.out.println("DRIVER DO BANCO DE DADOS NÃO ENCONTRADO!");
        //}
        catch(SQLException e2)
        {
            System.out.println("OCORREU UM ERRO AO ACESSAR O BANCO DE DADOS!");
        }
        return null;

    }

    public static void closeConnection(Connection c)
    {
        if(c != null)
        {
            try
            {
                c.close();
            }
            catch(SQLException e)
            {
                System.out.println("OCORREU UM ERRO AO TENTAR FECHAR A CONEXÃO!");
            }
        } else
        {
            System.out.println("Não há conexão para fechar");
        }
        
    }

    public static void closeConnection(Connection c, PreparedStatement stmt)
    {
        closeConnection(c);

        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(SQLException e)
            {
                System.out.println("OCORREU UM ERRO AO TENTAR FECHAR A CONEXÃO!");
            }
        }
        else
        {
            System.out.println("Não há conexão para fechar");
        }
    }

    public static void closeConnection(Connection c, PreparedStatement stmt, ResultSet st)
    {
        closeConnection(c, stmt);

        if(st != null)
        {
            try
            {
                st.close();
            }
            catch(SQLException e)
            {
                System.out.println("OCORREU UM ERRO AO TENTAR FECHAR A CONEXÃO!");
            }
        }
        else
        {
            System.out.println("Não há conexão para fechar");
        }
    }

}
