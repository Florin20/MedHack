<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: marci
  Date: 3/24/2018
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>userList</title>
</head>
<body>
<table>
    <c:forEach items = "${myList}" var = "p">
        <tr>
            <td>${p.firstname}</td>
            <td>${p.lastname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
