<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body style = "background-color: #ff9900">
<img src="<c:url value="/WEB-INF/views/logo.png" />" alt="image" />
<center>
    <form  action = "/test/loginPage" method = "POST">
        <select name = "type">
            <option value = "Physician">Physician</option>
            <option value = "Patient">Patient</option>
        </select>
        <br>
        <input type = "text" name = "code"> <br>
        <input type = "submit" value ="Log In">
        <br>
    </form>
</center>
</body>
</html>
