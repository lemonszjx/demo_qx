<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2022/3/16
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主界面</title>
    <script type="text/javascript">
        function ad(){
            window.location.href="preAdd";
        }
    </script>
</head>
<body>
<input type="button" value="添加"onclick="ad()">
<table border="1">
    <thead>
    <tr>
        <th>账号</th>
        <th>姓名</th>
        <th>电话</th>
        <th>性别</th>
        <th>年纪</th>
        <th>标志</th>
        <th>修改</th>
    </tr>
    </thead>
<tbody>
<c:forEach items="${list }" var="it">

    <tr>
        <td>${it.loginname }</td>
        <td>${it.username }</td>
        <td>${it.tel}</td>
        <td>${it.sex}</td>
        <td>${it.age}</td>

        <td>

            <c:if test="${it.stat=='0'}"><strong style="color: brown">以关闭</strong> </c:if>
            <c:if test="${it.stat=='1'}"><strong style="color: deepskyblue">以开启</strong> </c:if>
        </td>
        <td>
            <input type="hidden" name="id" id="id" value="${it.id}">
            <c:if test="${it.stat=='0'}"><a href="/updateopen?id=${it.id}">开启</a> </c:if>
            <c:if test="${it.stat=='1'}"><a href="/updateclose?id=${it.id}">关闭</a> </c:if>
            <a href="delete?id=${it.id}">删除</a>
            <a href="preupdate?id=${it.id}">修改</a>
            <a href="/table_role_check_view?userid=${it.id}">角色分配</a>
        </td>
    </tr>
</c:forEach>

</tbody>
</table>
</body>
</html>
