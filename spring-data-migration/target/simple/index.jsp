<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/10/30
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.name}</td>
        </tr>
    </c:forEach>
</table>

<c:forEach items="${pageInfo.navigatepageNums}" var="num">
    <li><a href="/index?pageNum=${num}&pageSize=${pageInfo.pageSize}">${num}</a></li>
</c:forEach>
</body>
</html>
