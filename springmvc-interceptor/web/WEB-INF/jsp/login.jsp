<%--
  Created by IntelliJ IDEA.
  User: 90617
  Date: 2020/7/13
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登陆页面</h1>
<form method="post" action="${pageContext.request.contextPath}/getLogin">
    用户名:<input type="text" name="name"/>
    密码：<input type="password" name="password"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
