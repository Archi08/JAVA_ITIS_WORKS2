<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="itis.models.Book" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<table>
    <c:forEach items="${booksModel}" var="books">
        <tr>
            <td><c:out value="${books.id}"/></td>
            <td><c:out value="${books.name}"/></td>
            <td><c:out value="${books.author}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
