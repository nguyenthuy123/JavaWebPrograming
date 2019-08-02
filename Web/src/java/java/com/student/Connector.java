/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thuynguyen
 */
public class Connector {
    public Connection getConnection()throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306//QLysinhvien";
        String user = "thuynguyen";
        String pass = "thuynguyen123";
        
        return DriverManager.getConnection(connStr, user, pass);
    }
}
