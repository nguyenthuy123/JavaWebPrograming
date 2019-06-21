/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thuynguyen
 */
public class Check {
    Connection conn;
    public Check() throws ClassNotFoundException, SQLException{
        DBconnector db = new DBconnector();
        this.conn = db.getConnect();
      
    }
    public void AnswerQ(String answer1, String answer2, String answer3, String answer4) throws SQLException{
        String insertQuery = "SELECT * from question";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
           
           
        ResultSet rs = pstmt.executeQuery();
       
    }
    
}
