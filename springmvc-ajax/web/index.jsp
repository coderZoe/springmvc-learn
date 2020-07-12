<%--
  Created by IntelliJ IDEA.
  User: 90617
  Date: 2020/7/10
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/resource/js/jquery-3.5.0.js"></script>

    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/test2",
          data:{
            name:$("#name").val()
          },
          success:function (data,status) {
            alert(data);
          },
          error:function (data,status) {
            alert("status:"+status+"data"+data)
          }

        })
      }
    </script>
  </head>
  <body>
  <div>
    <p>请输入用户名</p>
    <input type="text" id="name" onblur="a()">
  </div>
  </body>
</html>
