<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1>View products</h1>
<a href="${pageContext.request.contextPath}/">Home</a>
<a href="${pageContext.request.contextPath}/addProduct">Add product</a>
<ul>
    <c:forEach var="item" items="${products}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>
