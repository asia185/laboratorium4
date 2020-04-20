<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Zadanie 3</title>
   </head>
   <body>
       <h1>Lista osób</h1>
       <table border = "1">
           <thead>
                <tr>
                    <th>Imie</th>
                    <th>Nazwisko</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
       <c:forEach items="${person}" var="osoba">
           <tr>
               <td>${osoba.firstName}</td> <td>${osoba.lastName}</td> <td>${osoba.mail}</td>
           </tr>
           </tbody>
       </c:forEach>
       </table>
   </body>
</html>