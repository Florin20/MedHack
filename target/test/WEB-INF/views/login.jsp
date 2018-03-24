<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<<<<<<< HEAD
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
=======
<body>

<form style = "margin :0 auto; width: 250px;align:center" action = "/test/loginPage" method = "POST">
    <select name = "type">
        <option style ="color:red" value = "Physician">Physician</option>
        <option value = "Patient">Patient</option>
    </select>
    <br>
    <input  type = "text" name = "code"> <br>
    <input  type = "submit" value ="Log In">
    <br>
</form>
>>>>>>> 4d870f3c88bfe520db5af44188bb598be1c12ccc
</body>
</html>
