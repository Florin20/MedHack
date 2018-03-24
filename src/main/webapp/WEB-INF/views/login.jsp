<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<style>
    .form input {
        margin: 0 .25rem;
        min-width: 125px;
        border: 1px solid #eee;
        border-left: 3px solid;
        border-radius: 5px;
        transition: border-color .5s ease-out;
    }
    .select {
        font-size: 16px;
        position: relative;
        display: inline-block;
    }
    .select select {
        outline: none;
        -webkit-appearance: none;
        display: block;
        padding: 1.2em 3em 1.3em 1.5em;
        margin: 0;

        transition: border-color 0.2s;
        border: 5px solid #EB5168;
        border-radius: 5px;

        background: #fff;
        color: #555;
        line-height: normal;
        font-family: inherit;
        font-size: inherit;
        line-height: inherit;
    }

    .select .arr {
        background: #fff;
        bottom: 5px;
        position: absolute;
        right: 5px;
        top: 5px;
        width: 50px;
        pointer-events: none;
    }
    .select .arr:before {
        content: '';
        position: absolute;
        top: 50%;
        right: 24px;
        margin-top: -5px;
        pointer-events: none;
        border-top: 10px solid #EB5168;
        border-left: 10px solid transparent;
        border-right: 10px solid transparent;
    }

    .select .arr:after {
        content: '';
        position: absolute;
        top: 50%;
        right: 28px;
        margin-top: -5px;
        pointer-events: none;
        border-top: 6px solid #fff;
        border-left: 6px solid transparent;
        border-right: 6px solid transparent;
    }
</style>

<body style = "background-color: #525D76">
<br><br>
<center>
    <img src="http://www.pngmart.com/files/5/Cancer-Logo-PNG-Picture.png"  alt="image" width="40%" height = "40%" />
    <form  action = "/test/loginPage" method = "POST">
        <div class="select">
            <span class="arr"></span>
        <select name = "type">
            <option value = "Physician">Physician</option>
            <option value = "Patient">Patient</option>
        </select>
        </span>
        </div>
        <br><br>
        <input type = "text" name = "code" height = "200px"> <br> <br>
        <input style = "background-color: #555555; font-size: 24px; border-radius: 8px;"  type = "submit" value ="Log In">
        <br>
    </form>
</center>
</body>
</html>
