<@ page language="java" contentType="text/html; charset=ISO-8859-1"
    <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
    <!DOCTYPE html>
    <html>
        <head>
            <meta charset="ISO-8859-1">
            <title>Insert title here</title>
        </head>
        <body>
           <%List<Employee> e=(List<Employee>)request.getAttribute("list");%>
            <table border="1">
                <tr>
                    <th>EmpID</th>
                    <th>EmpName</th>
                    <th>EmpEmail</th>
                    <th>EmpAge</th>
                </tr>
                <%for(Employee ee:e) { %>
                    <tr>
                        <td><%ee.getEmpno() %></td>
                        <td><%ee.getEmpname() %></td>
                        <td><%ee.getEmpemail() %></td>
                        <td><%ee.getEmpage() %></td>
                    </tr>
            </table>
        </body>
    </html>