<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/25
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<script>
    $(function () {
        $.ajax({
            url:"/list",
            type:"GET",
            success:function (data) {
                alert(data[0].hiredate);
            }
        })
    })
</script>
</body>

</html>
