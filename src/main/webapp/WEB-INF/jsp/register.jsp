<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form:form method="POST" modelAttribute="user" action="<c:url value='/register' />">
        <label for="username">Username:</label>
        <form:input path="username" required="true"/><br/>

        <label for="email">Email:</label>
        <form:input path="email" required="true"/><br/>

        <label for="password">Password:</label>
        <form:password path="password" required="true"/><br/>

        <button type="submit">Register</button>
    </form:form>

    <a href="<c:url value='/login' />">Already have an account? Login here</a>
</body>
</html>
