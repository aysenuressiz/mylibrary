<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Library</title>
</head>
<body>
    <h1>Welcome to My Library</h1>

    <h2>Books in Library</h2>
    <ul>
        <c:forEach var="book" items="${books}">
            <li>
                <a href="<c:url value='/book/${book.id}' />">${book.name}</a>
                (${book.isBorrowed ? "Borrowed" : "Available"})
            </li>
        </c:forEach>
    </ul>

    <a href="<c:url value='/addBook' />">Add New Book</a>
</body>
</html>
