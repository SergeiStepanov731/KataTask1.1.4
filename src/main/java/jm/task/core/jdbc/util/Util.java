package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL="jdbc:mysql://localhost:3306/KataTask01";
    private static final String USERNAME="bestuser";
    private static final String PASSWORD="bestuser";




    public static Connection getConnection() throws SQLException {

        Connection conn;

        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        conn.setAutoCommit(false);
        if (conn.isClosed()) {
            System.out.println("Ошибка соединения");
        }
        return conn;

    }

}
