<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/10
  Time: 14:04
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
        <table align="center">
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <input name="name"/>
                </td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <input name="password" type="password"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button onclick="login()">登录</button>
                </td>
            </tr>
        </table>
    </div>

</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">

    function login() {
        var name=$("[name=name]").val();
        var password=$("[name=password]").val();

        if(name==null||name==""){
            alert("请输入用户名");
            return;
        }
        if(password==null||password==""){
            alert("请输入密码");
            return;
        }

        $.ajax({
            url:"${pageContext.request.contextPath}/login",
            type:"POST",
            data:{"name":name,"password":password},
            success:function (data) {
                if(data==null||data==""){
                    alert("用户名或密码错误")
                }else if(data!=null||data!=""){
                    location.href="${pageContext.request.contextPath}/welcome";
                }
            }
        })
    }
</script>

</html>
