<%-- 
    Document   : student
    Created on : Jul 28, 2019, 4:28:42 PM
    Author     : thuynguyen
--%>

<%@page import="java.util.List"%>
<%@page import="java.com.student.Student"%>
<%@page import="java.com.student.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
      <div class="container">
          <h1>Danh sách sinh viên</h1>
        <table class="table table-dark table-striped">
            <tr>
                <th>ID</th>
                <th>Hoten</th>
                <th>Khoa</th>
                <th>Chua nang</th>
            </tr>
        <%
            StudentModel model = new StudentModel();
            List<Student> students = model.getAll();
            
            for (Student stud : students) { %>
            <tr>
                <td> <%= stud.getId() %> </td>
                <td> <%= stud.getHoten()%> </td>
                <td> <%= stud.getKhoa()%> </td>
                <td> <%= stud.getLop()%> </td>
            </tr>        
        <% } %>
        </table>    
        </div>
    </body>
</html>
