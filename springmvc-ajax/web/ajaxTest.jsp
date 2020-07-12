<%--
  Created by IntelliJ IDEA.
  User: 90617
  Date: 2020/7/10
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/resource/js/jquery-3.5.0.js"></script>

    <script>
        function f() {
            $.get({
                url:"${pageContext.request.contextPath}/getUser",
                success:function (data) {
                    //可以看到其实返回的对象已经是JSON对象了，而不是字符串
                    console.log(data);
                    var html = "";
                    for (let i = 0; i <data.length ; i++) {
                        html+="<tr>";
                        html += "<td>"+
                            data[i].name+
                            "</td>";
                        html += "<td>"+
                            data[i].age+
                            "</td>";
                        html += "<td>"+
                            data[i].sex+
                            "</td>";
                        html+="</tr>";
                    }
                    $("#tbody").html(html);
                },
            })
        }
    </script>
</head>
<body>
<input type="button" onclick="f()" value="获取数据">
<div>
    <table>
        <thead>
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
        </tr>
        </thead>
        <tbody id="tbody">
        </tbody>
    </table>
</div>
</body>
</html>
