/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author QI
 */
public class MyDatabase {
    public static Connection getDatabase() throws ClassNotFoundException, SQLException{
        String driver = "com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3307/cd_baby";
        String user= "root";
        String pass = "";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
    
}
