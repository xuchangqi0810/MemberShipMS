<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/17
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1 align="center">商务会员管理系统</h1>
    用户名：${users.name}    用户类型：${users.user_type.name}  <a href="${pageContext.request.contextPath}/loginOut">退出</a><br>
    <a href="">修改用户</a><br>
    <a href="">查看所有会员</a><br>

</div>


</body>
</html>
