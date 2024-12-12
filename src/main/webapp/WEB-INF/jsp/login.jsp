<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form:form method="POST" action="<c:url value='/login' />">
        <label for="email">Email:</label>
        <input type="email" name="email" required/><br/>

        <label for="password">Password:</label>
        <input type="password" name="password" required/><br/>

        <button type="submit">Login</button>
    </form:form>

    <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>

    <a href="<c:url value='/register' />">Don't have an account? Register here</a>
</body>
</html>
