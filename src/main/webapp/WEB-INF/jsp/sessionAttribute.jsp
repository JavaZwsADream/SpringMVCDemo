<%@ page import="com.aiit.Pojo.Role" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/11
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Role role= (Role) session.getAttribute("role");
    out.print("id="+role.getId()+"</p>");
    out.print("note="+role.getNote()+"</p>");
    out.print("RealName="+role.getRealName()+"</p>");
    Integer id= (Integer) session.getAttribute("id");
    out.print("session id"+id);
%>

</body>
</html>
