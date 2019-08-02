<%-- 
    Document   : loginjsp
    Created on : Jul 27, 2019, 4:31:04 PM
    Author     : thuynguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTER FORM</h1>
        <form method = "POST" action="">
            <table>
                <tr>
                    <td>User name: </td>
                    <td><input  type= "text"  name="username" value="${user.userName}"/></td>
                </tr>
                    
                <tr>
                    <td>Password: </td>
                    <td><input type ="text" name="password" value"${user.password}/></td>
                </tr>
        </form>
    </body>
</html>
