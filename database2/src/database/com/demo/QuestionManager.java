/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.com.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuynguyen
 */
public class QuestionManager {
    Connection conn = null;
    public QuestionManager()throws ClassNotFoundException, SQLException{
        this.conn = new DBconnector().getConnect();
    }
    public List<Questions> getQuestions() throws SQLException{
        //1.kết nối db
        //2.tạo câu truy vấn query
        String query  = "SELECT * FROM questions";
        //3.Thực thi câu truy vấn
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        //4.duyệt kết quả và add vào list
        List<Questions> list = new ArrayList<>();
        while(rs.next()){
            Questions q = new Questions();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswer1(rs.getString("answer1"));
            q.setAnswer2(rs.getString("answer2"));
            q.setAnswer3(rs.getString("answer3"));
            q.setAnswer4(rs.getString("answer4"));
            q.setCorrect(rs.getString("correct"));
            
            list.add(q);
        }
        
        return list;
    }
}
