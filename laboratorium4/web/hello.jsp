
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1>Wersja pierwsza, ${osoba.firstName} ${osoba.lastName}!</h1>
        <h1>Wersja druga, <c:out value="${osoba.firstName} ${osoba.lastName}"/>!</h1>
        <h1><a href="mailto:${osoba.mail}">${osoba.mail}</a></h1>
    </body>
</html>
