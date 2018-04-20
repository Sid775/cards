<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Cards</title>
</head>
<body>
<H2 align="center">Check that you credit card don't stolen!</H2>
<div align="center">
<form action="/saveCard" method="POST">
  <div align="center"> <h3>Card number</h3><input name="cardNumber"></div>
  <div align="center"><h3>Date</h3><input name="date"></div>
  <div align="center"><h3>Cvc</h3><input name="cvc"></div>
  <div align="center"><input type="submit"></div>
</form>
</div>
</body>
</html>
