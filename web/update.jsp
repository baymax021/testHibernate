<%--
  Created by IntelliJ IDEA.
  User: shmil
  Date: 2017/10/24
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
</head>
<body>
<form action="update.do" method="post">
    用户编号：<input readonly name="id" value="${newsUser.id}">
    <br>
    用户名 :<input type="text" name="userName" value="${newsUser.userName}">
    <br>
    密码：<input type="text" name="userPassword" value="${newsUser.userPassword}">
    <br>
    用户类型：
    <select name="userType" id="userType">
        <option value="admin" ${newsUser.userType == "admin" ? "selected":null}>管理员</option>
        <option value="customer" ${newsUser.userType == "customer" ? "selected":null}>普通用户</option>
    </select>
    <br>
    <input type="submit" value="更新">
</form>
</body>
</html>
