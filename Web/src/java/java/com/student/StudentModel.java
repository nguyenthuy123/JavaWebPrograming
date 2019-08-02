/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuynguyen
 */
public class StudentModel {
    public int add(Student s) throws Exception {
        Connection conn = new Connector().getConnection();
        String sql = "insert into sinhvien(hoten,khoa,lop) values(?,?,?) )";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, s.getHoten());
        pstmt.setString(2, s.getKhoa());
        pstmt.setString(3, s.getLop());
        return pstmt.executeUpdate();
    }
    public List<Student> getAll() throws Exception {
        List<Student> list = new ArrayList<>();
        Connection conn = new Connector().getConnection();
        String sql = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setHoten(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
}
