<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/7
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>HelloWorld!</h1>

<c:forEach items="${requestScope}" var="attr">
    <li>${attr.key}=${attr.value}</li>
</c:forEach>
</body>
</html>
