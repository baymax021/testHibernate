<%--
  Created by IntelliJ IDEA.
  User: shmil
  Date: 2017/10/24
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加</title>
</head>
<body>
<form action="add.do" method="post">
    用户编号：<input type="text" name="id">
    <br>
    用户名 :<input type="text" name="userName" >
    <br>
    密码：<input type="text" name="userPassword" >
    <br>
    用户类型：
    <select name="userType" id="userType">
        <option value="admin">管理员</option>
        <option value="customer">普通用户</option>
    </select>
    <br>
    <input type="submit" value="增加">
</form>
</body>
</html>
