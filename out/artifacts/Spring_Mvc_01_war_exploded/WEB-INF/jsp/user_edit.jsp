<%--
  Created by IntelliJ IDEA.
  User: DESTROYER
  Date: 2021/4/18
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editUsers" method="post" id='formid'>
    <table width="30%" border="1">
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><input name="users[0].id" value="1" type="checkbox"></td>
            <td><input name="users[0].username" value="廖进湖1" type="text"></td>
        </tr>


        <tr>
            <td><input name="users[1].id" value="2" type="checkbox"></td>
            <td><input name="users[1].username" value="廖进湖2" type="text"></td>
        </tr>
    </table>
    <input type="submit" value="修改">
</form>

</body>
</html>
