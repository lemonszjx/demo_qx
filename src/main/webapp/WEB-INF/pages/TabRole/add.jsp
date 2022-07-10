<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="radd" method="post">
    <table align="center">
        <tr>
            <td>职位</td><td><input type="text" id="rolename" name="rolename"></td></tr>
        <tr> <td>描述</td><td><textarea   name="contents" id="contents"></textarea></td></tr>


        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>