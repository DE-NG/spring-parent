<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/6
  Time: 19:11
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
        <td>username</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.username}</td>
        </tr>
    </c:forEach>
</table>
<ul>
    <c:forEach items="${pageInfo.navigatepageNums}" var="num">
        <li><a href="/index?pageNum=${num}&pageSize=${pageInfo.pageSize}">${num}</a></li>
    </c:forEach>
</ul>
</body>
</html>
