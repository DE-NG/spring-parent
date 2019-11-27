<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/20
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="myFile" />
    <input type="submit" value="上传" />
</form>
<a href="/download?filename=地球.jpg">下载</a>
</body>
</html>
