import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    private static Connection connection = null;
    private static String jdbcUrl = "jdbc:mysql://localhost:3306/sample_db";
    private static String username = "root";
    private static String password = "Charan@1005";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(jdbcUrl, username, password);
            } catch (SQLException exception) {
                System.out.println(exception);
            }
        }

        return connection;
    }
}
