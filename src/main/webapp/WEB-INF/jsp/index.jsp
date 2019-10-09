<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>用户</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
    <style>
        table {
            margin: 0 auto;
        }
    </style>
</head>
<body style="text-align: center">
<c:if test="${message==null}">
<table border="1" class="table">
    <tr>
        <th>用户ID</th>
        <th>用户名称</th>
        <th>签名</th>
    </tr>
<c:forEach var="users" items="${users}" >
<tr>
    <td><c:out value="${users.id}"/></td>
    <td><c:out value="${users.name}"/></td>
    <td><c:out value="${users.sign}"/></td>
</tr>
</c:forEach>
</table>
</c:if>
<span style="color:red; font-size: 20px;"><c:out value="${message}"></c:out> </span>
</body>
</html>