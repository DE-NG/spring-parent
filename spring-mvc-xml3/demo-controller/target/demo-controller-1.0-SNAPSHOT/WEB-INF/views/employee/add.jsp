<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/21
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee list</title>
</head>
<body>
<form action="/emp/insert" method="post">
    <input type="text" name="username" />
    <input type="text" name="salary" />
    <input type="text" name="hiredate" />
    <input type="submit" value="添加" />

</form>
</body>
</html>
