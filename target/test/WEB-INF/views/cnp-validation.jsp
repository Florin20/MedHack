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
    <p>Please enter the last 4 digits of your id number</p>
    <br>
    <form action = "/test/checkIdNumber/${code}" method = "POST">
        <input type = "text" name = "cnp">
        <input type = "submit" value = "Validate!" name = "validate">

    </form>
</head>
<body>

</body>
</html>