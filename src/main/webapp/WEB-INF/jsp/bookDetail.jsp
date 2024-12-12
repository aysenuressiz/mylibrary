<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Details</title>
</head>
<body>
    <h1>${book.name}</h1>
    <p>Pages: ${book.pages}</p>
    <p>Status: ${book.isBorrowed ? "Borrowed" : "Available"}</p>

    <h3>Notes:</h3>
    <ul>
        <c:forEach var="note" items="${notes}">
            <li>${note}</li>
        </c:forEach>
    </ul>

    <form method="POST" action="<c:url value='/book/addNote' />">
        <input type="hidden" name="bookId" value="${book.id}"/>
        <textarea name="note" placeholder="Add a note"></textarea><br/>
        <button type="submit">Add Note</button>
    </form>

    <h3>Borrow this Book:</h3>
    <form method="POST" action="<c:url value='/book/borrow' />">
        <input type="hidden" name="bookId" value="${book.id}"/>
        <select name="userId">
            <c:forEach var="user" items="${users}">
                <option value="${user.id}">${user.username}</option>
            </c:forEach>
        </select>
        <button type="submit">Borrow</button>
    </form>

    <a href="<c:url value='/home' />">Back to Home</a>
</body>
</html>
