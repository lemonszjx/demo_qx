<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="rupdate?id=${role.id}" method="post">
    <table align="center">
        <tr>
            <td>职位</td><td><input type="text" id="rolename" name="rolename" value="${role.rolename}"></td></tr>
        <tr> <td>描述</td><td><input type="text" id="contents" name="contents" value="${role.contents}"></td></tr>




        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>