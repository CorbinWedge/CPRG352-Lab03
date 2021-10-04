<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="text" name="firstInput" value=${firstNumberSaver}>
            <br>
            <label>Second:</label>
            <input type="text" name="secondInput" value=${secondNumberSaver}>
            <br>
            <input type="submit" value="+" name="buttons">
            <input type="submit" value="-" name="buttons">
            <input type="submit" value="*" name="buttons"> 
            <input type="submit" value="%" name="buttons">
        </form>
        <br>
        <label>Result: ${output}</label>
        <br>
        <br>
        <a href="/Lab03/age"> Age Calculator </a>
    </body>
</html>