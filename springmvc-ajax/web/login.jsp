<%--
  Created by IntelliJ IDEA.
  User: 90617
  Date: 2020/7/12
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/resource/js/jquery-3.5.0.js"></script>
    <script>
        function checkName() {
            $.post({
                url:"${pageContext.request.contextPath}/checkName",
                data:{
                    name:$("#name").val()
                },
                success:function (data) {
                    $("#nameInfo").html(data)
                }
            })
        }

        function checkPassword() {
            $.post({
                url:"${pageContext.request.contextPath}/checkPassword",
                data:{
                    name:$("#name").val(),
                    password:$("#password").val()
                },
                success:function (data) {
                    $("#passwordInfo").html(data)
                }
            })
        }
    </script>
</head>
<body>
<p>
    用户名:<input type="text" id="name" onblur="checkName()"/>
    <span id="nameInfo"></span>
</p>
<p>
    密码:<input type="text" id="password" onblur="checkPassword()"/>
    <span id="passwordInfo"></span>
</p>
</body>
</html>
