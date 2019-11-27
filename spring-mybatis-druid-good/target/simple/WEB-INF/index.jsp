<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/10/23
  Time: 19:47
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
    <th>
    <td>id</td>
    <td>username</td>
    <td>gender</td>
    <td>salary</td>
    <td>hiredate</td>
    <td>deptid</td>
    </th>
    <c:forEach items="${pageInfo.list}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.username}</td>
            <td>${emp.gender}</td>
            <td>${emp.salary}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.deptid}</td>
        </tr>
    </c:forEach>
</table>
<c:forEach items="${pageInfo.navigatepageNums}" var="num">
    <li><a href="/index?page=${num}&pageSize=${pageInfo.pageSize}">${num}</a></li>
</c:forEach>
</body>
</html>
