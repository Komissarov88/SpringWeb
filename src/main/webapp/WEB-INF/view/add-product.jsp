<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
<h1>Add products</h1>
<a href="${pageContext.request.contextPath}/">Home</a>
<a href="${pageContext.request.contextPath}/viewProducts">View products</a>

<form:form action="processForm" method="POST" modelAttribtue="product">
    <form:label path="id">Id</form:label>
    <form:input path="id" />
    <form:label path="title">Title</form:label>
    <form:input path="title" />
    <form:label path="cost">Cost</form:label>
    <form:input path="cost" />
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
