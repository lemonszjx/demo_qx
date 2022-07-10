<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主界面</title>
    <script type="text/javascript">
        function ad(){
            window.location.href="rpreadd";
        }
    </script>
</head>
<body>
<input type="button" value="添加"onclick="ad()">
<table>
    <thead>
    <tr>

        <th>职位</th>
        <th>描述</th>
        <th>创建人</th>
        <th>创建时间</th>
        <th>标志</th>
        <th>修改</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list }" var="it">

        <tr>
            <td>${it.rolename }</td>
            <td>${it.contents }</td>
            <td>${it.createname}</td>
            <td>${it.createtime}</td>
            <td>${it.stat}</td>

            <td>
                <input type="hidden" name="id" id="id" value="${it.id}">
                <a href="rdelete?id=${it.id}">删除</a>
                <a href="rpreupdate?id=${it.id}">修改</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
