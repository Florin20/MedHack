<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: marci
  Date: 3/24/2018
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>My patients</title>
</head>
<body>
<p>Patients for physician with id "${physicianId}"</p>
<table>
    <c:forEach items = "${patientList}" var = "p">
        <tr>
            <td>${p.firstname}</td>
            <td>${p.lastname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
