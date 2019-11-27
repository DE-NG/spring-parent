<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/13
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/insert">
    <p>姓名：<input type="text" name="username" /><span style="color: red">${username}</span></p>
    <p>年龄：<input type="text" name="age"><span style="color: red">${age}</span></p>
    <p>工资：<input type="text" name="salary" /><span style="color: red"> ${salary}</span></p>
    <p>电话：<input type="text" name="phone" /><span style="color: red">${phone}</span></p>
    <p>邮箱：<input type="text" name="email"><span style="color: red">${email}</span></p>
    <p><input type="submit" value="添加" /></p>
</form>
</body>
</html>
