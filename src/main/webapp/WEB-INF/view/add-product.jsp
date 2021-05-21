<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1>Add products</h1>
<a href="${pageContext.request.contextPath}/">Home</a>
<a href="${pageContext.request.contextPath}/viewProducts">View products</a>

<form:form action="processProductAdd" modelAttribtue="product">
    Id: <form:input path="id" />
    <br>
    Title: <form:input path="title" />
    <br>
    Cost: <form:input path="cost" />
    <br>
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
