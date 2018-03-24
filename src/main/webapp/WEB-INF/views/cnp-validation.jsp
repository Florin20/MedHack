<%--
  Created by IntelliJ IDEA.
  User: Florin
  Date: 3/24/2018
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored ="false" %>

<html>
<head>
    <title>Validation</title>


</head>
<body style = "background-color: #525D76">
<center>
    <p>You need to confirm that you are our patient. Please enter the last 4 digits of you id number:</p>
    <br>
    <form action = "/test/checkIdNumber/${code}" method = "POST">
        <input type = "text" name = "cnp">
        <input style = "background-color: #555555; font-size: 24px; border-radius: 8px;" type = "submit" value = "Confirm" name = "validate">

    </form>
</center>

</body>
</html>
