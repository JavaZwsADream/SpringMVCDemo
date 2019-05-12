<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/9
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <table border="1">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>note</td>
        </tr>
         <tr>
             <td><c:out value="${role.id}"></c:out></td>
             <td><c:out value="${role.realName}"></c:out></td>
             <td><c:out value="${role.note}"></c:out></td>
         </tr>

    </table>
</head>
<body>

</body>
</html>
