package PDFReportGenerator;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection connect() {
        Connection conn = null;
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Definir la URL de conexión
            String url = "jdbc:mysql://localhost/empresa";
            String usuario = "root"; // Reemplazar con el nombre de usuario de la base de datos
            String contrasena = "passwd"; // Reemplazar con la contraseña de la base de datos

            // Obtener la conexión con los parámetros de usuario y contraseña
            conn = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Driver no encontrado: " + e.getMessage());
        }
        return conn;
    }

    // Método para obtener los clientes desde la base de datos
    public static ResultSet getClientes() {
        String sql = "SELECT * FROM Cliente";
        ResultSet rs = null;
        try {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error al obtener clientes: " + e.getMessage());
        }
        return rs;
    }

    // Método para obtener información de un cliente específico
    public static ResultSet getClienteById(int idCliente) {
        String sql = "SELECT * FROM Cliente WHERE IDCliente = ?";
        ResultSet rs = null;
        try {
            Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idCliente);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error al obtener cliente: " + e.getMessage());
        }
        return rs;
    }
}
