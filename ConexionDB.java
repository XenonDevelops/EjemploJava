package utilerias;
 
 
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
 
public class ConexionBD {
 
    private Connection con = null;
    private String driverBd = "";
    private String urlBd = "";
    private String usuarioBd = "";
    private String passwordBd = "";
 
    public ConexionBD() {
    }
 
    public Connection getConexion() throws SQLException {
        return conectarBD();
    }
 
    public Connection conectarBD() throws SQLException {
        Connection con = null;
 
        try {
            // String driver = "com.mysql.jdbc.Driver"; // driver para Mysql
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // driver para Mysql
 
            // Declaración de valores
            //     String url = "jdbc:mysql://localhost/utez-test"; // Cadena de conexión para mysql
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=NOMBREBD;integratedSecurity=false;";  // Cadena de conexión para mysql
 
            String login = "USERDB";
            String password = "PASSDB";
 
            // Cargar Driver
            Class.forName(driver);
 
            // Realiza la conexión a la B.D.
            con = (Connection) DriverManager.getConnection(url, login, password);
 
            System.out.println("Conexión exitosa");
 
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException atrapada " + e.getMessage());
            e.printStackTrace();
        }
 
        return con;
 
    }
 
    public void cerrar(PreparedStatement ps){
        try {
            ps.close();
        } catch (SQLException ex) {
             
        }
    }
     
    public void cerrar(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
         
        }
    }
     
    public void cerrar(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
          
        }
    }
     
     
    public static void main(String[] args) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.conectarBD();
 
    }
}