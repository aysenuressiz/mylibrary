<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
</head>
<body>
    <h1>Add a New Book</h1>
    <form:form method="POST" modelAttribute="book" action="<c:url value='/addBook' />">
        <label for="name">Book Name:</label>
        <form:input path="name" required="true"/><br/>

        <label for="pages">Pages:</label>
        <form:input path="pages" type="number" required="true"/><br/>

        <label for="authorId">Author:</label>
        <form:select path="authorId">
            <c:forEach var="author" items="${authors}">
                <option value="${author.id}">${author.firstName} ${author.lastName}</option>
            </c:forEach>
        </form:select><br/>

        <label for="categoryId">Category:</label>
        <form:select path="categoryId">
            <c:forEach var="category" items="${categories}">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </form:select><br/>

        <button type="submit">Add Book</button>
    </form:form>

    <a href="<c:url value='/home' />">Back to Home</a>
</body>
</html>
