<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: shmil
  Date: 2017/10/24
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
    <style>
        table,th,td{
            text-align: center;
            margin: auto;
        }
    </style>
</head>
<body>
登录成功
<table border="1px solid black" cellspacing="0">
    <tr>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>用户密码</th>
        <th>用户类型</th>
        <th colspan="2">操作</th>
    </tr>
<c:forEach var="newsUser" items="${list}">
    <tr>
        <td>${newsUser.id}</td>
        <td>${newsUser.userName}</td>
        <td>${newsUser.userPassword}</td>
        <td>${newsUser.userType}</td>
        <td><a href="update?id=${newsUser.id}">修改</a></td>
        <td><a href="delete?id=${newsUser.id}">删除</a></td>
    </tr>
</c:forEach>
    <tfoot>
    <tr>
        <td colspan="6"><a href="add.jsp">增加</a></td>
    </tr>
    </tfoot>
</table>
</body>
</html>
