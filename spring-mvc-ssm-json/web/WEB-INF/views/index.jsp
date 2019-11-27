<%--
  Created by IntelliJ IDEA.
  User: DENG-
  Date: 2019/11/18
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1></h1>
<table id="dataTable">
    <thead>
        <tr>
            <th>id</th>
            <th>deptname</th>
        </tr>
    </thead>
    <tbody>

    </tbody>
</table>
    <p>部门名称：<input type="text" name="deptname" id="deptname" /></p>
    <p><input type="button" value="添加" id="btnInsert" /></p>
<script>
    function getAll() {
        $.ajax({
            url:"/list",
            type:"GET",
            dataType:"json",
            success:function (data) {
                $.each(data,function (index,element) {
                    $("#dataTable tbody").append("<tr><td>"+element.id+"</td><td>"+element.deptname+"</td></tr>")
                })
            }
        });
    }

    getAll();

    $(function () {
        $(document).ajaxError(function () {
          alert("一个错误发生");
        })

        $("#btnInsert").click(function () {
            var t = $("#deptname").val();
            var data = {"deptname":t};
            $.ajax({
                url:"/insert",
                data:JSON.stringify(data),
                type:"POST",
                contentType:"application/json",
                dataType:"json",
                success:function (data) {
                    // $("h1").html(data);
                    alert(data);
                    $("#dataTable tbody").empty();
                    getAll();
                }
            })

        });
    })
</script>
</body>
</html>
