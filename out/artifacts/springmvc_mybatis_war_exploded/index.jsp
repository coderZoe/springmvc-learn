<%--
  Created by IntelliJ IDEA.
  User: 90617
  Date: 2020/7/8
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/springmvc_mybatis/addBook" method="post">
    名字：<input type="text" name="name">
    数量：<input type="text" name="counts">
    详细信息：<input type="text" name="details">
    <input type="submit" value="提交">
  </form>

  </body>
</html>
