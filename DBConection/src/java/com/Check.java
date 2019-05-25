/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author thuynguyen
 */
public class Check {
    DBConection dBconection = new DBConection();
  //1. chen du lieu
    public ResultSet ex3() throws Exception{
    Connection conn = dBconection.getConnect();
   Statement stmt = conn.createStatement();
   Book b = new Book();
   String insertQuery = "INSERT INTO SACH(masach, ten, tacgia, nxb, soluong)"
           + "VALUES(?,?,?,?)";
   PreparedStatement pstmt = conn.prepareStatement(insertQuery);
   pstmt.setString(1, b.getCode());
   pstmt.setString(2, b.getName());
   pstmt.setString(3, b.getAuthor());
   pstmt.setString(4, b.getPublisher());
   pstmt.setInt(5, b.getQuantity());
   
   int rowsUpdated = pstmt.executeUpdate();
        System.out.println("Row: "+rowsUpdated);
        System.out.println("------------------");
        ResultSet rs = stmt.executeQuery("SELECT * FROM SACH");
        
    while (rs.next()){
            
        System.out.println(rs.getString("ten")
            + "," + rs.getString(3)
            + "," + rs.getInt("so luong"));
        }
    return rs;
    }
    //2. Xoa bang
    public void deleteName(String name) throws Exception{
         Connection conn = dBconection.getConnect();
        String sqlCommand = "delete from " + "SACH" + "where name = ?";
        PreparedStatement pstm = null;
        try{
            pstm = conn.prepareStatement(sqlCommand);
            pstm.executeUpdate();
            System.out.println("delete success");
        }catch(Exception ex){
            System.out.println("delete error\n");
        }
    }
    //3.hiển thị ten,khoa,sawpxep theo khoa
    public ResultSet getData() throws Exception{
         Connection conn = dBconection.getConnect();
        ResultSet rs = null;
        String sqlCommand = "select ten, khoa from" + "DOCGIA" +"order by khoa ASC";
        Statement st;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sqlCommand);
        }catch(Exception e){
            System.out.println("select error");
        }
        return rs;
    }
    public ResultSet ex6(String bookName, String date) throws Exception{
        Connection conn = dBconection.getConnect();
        ResultSet rs = null;
        String sqlCommand = "select d.ten from PHIEUMUON p" +
                "join SACH s on s.masach = p.masach" +
                "join DOCGIA d on d.sothe = p.sothe" +
                "where s.ten = ? and p.ngaymuon = ?";
        
        PreparedStatement psmt = conn.prepareStatement(sqlCommand);
        psmt.setString(1, bookName);
        psmt.setString(2, date);
        rs = psmt.executeQuery(sqlCommand);
        return rs;
    }
    public void showData(ResultSet rs){
        try{
            while(rs.next()){
                System.out.printf("%10s %20s %5.2f\n", rs.getString(1), rs.getString(2), rs.getDouble(3));
            }
        }catch(Exception e){
            
        }
    }
}
