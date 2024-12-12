<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Books List</title>
</head>
<body>
    <h1>Books List</h1>
    <ul>
        <c:forEach var="book" items="${books}">
            <li><a href="<c:url value='/book/${book.id}' />">${book.name}</a> by ${book.author.firstName} ${book.author.lastName}</li>
        </c:forEach>
    </ul>

    <a href="<c:url value='/addBook' />">Add a new book</a>
</body>
</html>
