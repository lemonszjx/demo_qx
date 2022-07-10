<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2022/3/18
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="add" method="post">
<table align="center">
    <tr>
        <td>账号</td><td><input type="text" id="loginname" name="loginname"></td></tr>
    <tr> <td>密码</td><td><input type="text" id="password" name="password"></td></tr>
      <tr>  <td>姓名</td><td><input type="text" id="username" name="username"></td>
    <tr>  <td>性别</td><td><input type="text" id="sex" name="sex"></td></tr>
    <tr> <td>年纪</td><td><input type="text" id="age" name="age"></td></tr>
    <tr> <td>电话</td><td><input type="text" id="tel" name="tel"></td>

    </tr>
</table>
    <input type="submit" value="提交">
</form>
</body>
</html>
