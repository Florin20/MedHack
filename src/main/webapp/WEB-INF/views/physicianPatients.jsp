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
<style>
    body{background-color : #525D76;}
    ul{
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #525D76;
    }
    li {
        float:right;
    }

    li form input {
        float:right;
        align:center;
        display: block;
        background-color:#333;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }

    /* Change the link color to #111 (black) on hover */
    li form input:hover {
        background-color: #111;
    }
    table {
        width: 300px;
        margin-left: auto;
        margin-right: auto;
    }
    th{
        padding: 15px;
        text-align:left;
        font-weight:bold;
        background-color:#333;
        color:white;
    }
    td{
        padding: 15px;
        text-align:left;
        background-color:#646E84;
        color:white;
    }

    p{
        text-align:center;
    }
    input.f1{
        background-color:red;
    }
    input.f2{
        background-color:yellow;
    }

</style>
<body>
<ul>
    <li><form action = "/test/login" method = "GET"><input type = "submit" value ="Logout"></form></li>
</ul>

<table>
    <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Age</th>
        <th>Diagnostic</th>
        <th>Discharge date</th>
        <th>Severity</th>
        <th>Details</th>
    </tr>
    <c:forEach items = "${patientList}" var = "p">
        <tr>
            <td>${p.firstname}</td>
            <td>${p.lastname}</td>
            <td>${p.age}</td>
            <td>${p.medicalFile.diagnostic}</td>
            <td>${p.medicalFile.discharge}</td>
            <td>
                <c:choose>
                    <c:when test="${p.firstname==\"Florin\"}">
                        <svg height="100" width="100">
                            <circle cx="50" cy="50" r="20" stroke="black" stroke-width="3" fill="red" />
                        </svg>
                    </c:when>
                    <c:otherwise>
                        <svg height="100" width="100">
                            <circle cx="50" cy="50" r="20" stroke="black" stroke-width="3" fill="yellow" />
                        </svg>
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <form><input type = "submit" value ="View"></form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
