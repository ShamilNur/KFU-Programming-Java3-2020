<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="2">
    <tr>
        <th>Book</th>
        <th>Author</th>
    </tr>
    <%--@elvariable id="hashMap" type="java.util.List"--%>
    <c:forEach items="${hashMap}" var="item">
        <tr>
            <td>${item.key}</td>
            <td>${item.value}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
