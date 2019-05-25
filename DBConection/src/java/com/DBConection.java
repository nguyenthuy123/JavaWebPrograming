/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author thuynguyen
 */
public class DBConection {
    
    public Connection getConnect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/QLYTHUVIEN";
        Connection conn = DriverManager.getConnection(conStr, "thuynguyen", "Matkhau@123");
        return conn;
    }  
  
}
