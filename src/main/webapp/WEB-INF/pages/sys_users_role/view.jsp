<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/18 0018
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function dosava(){
            window.location.href="table_role_pre_sava";
        }
    </script>
    <script type="text/javascript">
        function dodelete(id){

            if (confirm("确认要删除吗？")) {
                window.location.href = "table_role_del?id="+id;
            }
        }
    </script>
</head>
<body>
<table width="100%">
    <form action="/table_role_view" method="post">
        <tr>
            <td>
                角色名称：
                <input type="text" name="rolename" id="rolename" value="${rolename }"/>

                <input type="submit"  value=" 查 询 "/>

                <input type="button"  value=" 添 加 " onclick="dosava()"/>
            </td>
        </tr>
    </form>
</table>
<table border="1" cellpadding="0" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>#</th>
        <th>选择</th>
        <th>角色名称</th>
        <th>角色描述</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="it" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <c:if test="${userid == it.usersid}">
                <td><input type="checkbox" name="ids" id="ids" value="${it.id}" checked="checked"/></td>
            </c:if>
            <c:if test="${userid != it.usersid}">
                <td><input type="checkbox" name="ids" id="ids" value="${it.id}"/></td>
            </c:if>
            <td>${it.rolename }</td>
            <td>${it.contents }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
