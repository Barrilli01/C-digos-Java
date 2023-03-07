package professional.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
//   Connection conexao = 
//    DriverManager.getConnection("jdbc:postgresql://localhost:5432/condominio","postgres", "0000");
      
    public static Connection getConexao() {
        Connection con = null;
        try {
            String serverName = "localhost";
            String mydatabase = "condominio";
            String username = "postgres";
            String password = "0000";
            String driverName = "com.postgresql.jdbc.Driver";
            Class.forName(driverName);
            String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
            con = DriverManager.getConnection(url, username, password);
           
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado " + e.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
        }
        return con;
    }
}
