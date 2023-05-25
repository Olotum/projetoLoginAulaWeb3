package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyDatabase {
    public static Connection getDatabase() throws ClassNotFoundException, SQLException{
        String driver = "com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3307/cd_baby";
        String user = "root";
        String pass = "";
        
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
    
}
