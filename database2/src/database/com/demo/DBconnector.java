/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thuynguyen
 */
public class DBconnector {

  public Connection getConnect() throws ClassNotFoundException, SQLException{
      
      Class.forName("com.mysql.cj.jdbc.Driver");
      String connStr = "jdbc:mysql://localhost:3306/sinhvien";
      Connection conn =  DriverManager.getConnection(connStr, "thuynguyen", "Matkhau123");
      
      return conn;
  } 
}
