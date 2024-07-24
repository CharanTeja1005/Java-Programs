import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class App {
    private static void createStudents() {
        final String QUERY = "CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(100), age INT);";

        Connection connection = null;
        Statement statement = null;

        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();

            statement.execute(QUERY);
            System.out.println("students TABLE created!");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void createProcedure() {
        String QUERY = """
                CREATE PROCEDURE insertStudents(
                    IN sid INT,
                    IN sname VARCHAR(100),
                    IN sage INT
                )
                BEGIN
                    INSERT INTO students (id, name, age) VALUES (sid, sname, sage);
                END
            """;
        
            try {
                Connection connection = JDBCUtils.getConnection();
                Statement statement = connection.createStatement();
                statement.execute(QUERY);
                statement.close();
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
    }

    private static void addStudentsFromTextFile() {
        String QUERY = "call insertStudents(?, ?, ?);";

        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement statement = connection.prepareStatement(QUERY);
            BufferedReader br = new BufferedReader(new FileReader("src/textfile/input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split("\\s*,\\s*");
                int studentId = Integer.parseInt(arr[0]);
                String studentName = arr[1];
                int age = Integer.parseInt(arr[2]);

                statement.setInt(1, studentId);
                statement.setString(2, studentName);
                statement.setInt(3, age);

                statement.addBatch();
            }

            int res[] = statement.executeBatch();

            System.out.println("Successfully inserted: " + Arrays.toString(res));

            br.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void getAllStudentsFromDB() {
        String selectQuery = "select * from students;";
        
        try {
            Connection connection = JDBCUtils.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuery);

            System.out.printf("%-10s | %-15s | %s\n", "id", "name", "age");
            while (result.next()) {
                System.out.printf("%-10d | %-15s | %d\n", result.getInt(1), result.getString(2), result.getInt(3));
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        // createStudents();
        createProcedure();
        addStudentsFromTextFile();
        getAllStudentsFromDB();
    }
}
