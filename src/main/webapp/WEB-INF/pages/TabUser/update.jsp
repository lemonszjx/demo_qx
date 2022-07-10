<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2022/3/22
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update?id=${user.id}" method="post">
    <table align="center">
        <tr>
            <td>账号</td><td><input type="text" id="loginname" name="loginname" value="${user.loginname}"></td></tr>
        <tr> <td>密码</td><td><input type="text" id="password" name="password" value="${user.password}"></td></tr>
        <tr>  <td>姓名</td><td><input type="text" id="username" name="username" value="${user.username}"></td>

        <tr> <td>电话</td><td><input type="text" id="tel" name="tel" value="${user.tel}"></td>

        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
