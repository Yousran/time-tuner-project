package timetuner.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {
    private static final String DB_URL = "jdbc:sqlite:src/main/resources/db/sqlite.db";
    protected static Connection connection = null;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;

    public static void getConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
