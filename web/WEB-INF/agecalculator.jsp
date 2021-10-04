<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter Your Age:</label>
            <input type="text" name="ageInput" value="">
            <br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <p>${ageErrorMessage}</p>
        <p>${ageSuccessMessage}</p>
        <a href="/Lab03/arithmetic"> Arithmetic Calculator </a>
    </body>
</html>