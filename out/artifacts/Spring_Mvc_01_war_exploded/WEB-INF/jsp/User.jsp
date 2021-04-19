<%--
  Created by IntelliJ IDEA.
  User: DESTROYER
  Date: 2021/4/18
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>绑定数组</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/deleteUsers">
    <table width="20%" border="1">
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><input name="ids" value="1" type="checkbox"></td>
            <td>廖进湖</td>
        </tr>
        <tr>
            <td><input name="ids" value="2" type="checkbox"></td>
            <td>廖进湖2</td>
        </tr>
        <tr>
            <td><input name="ids" value="3" type="checkbox"></td>
            <td>廖进湖3</td>
        </tr>
    </table>
    <input type="submit" value="删除">
</form>

</body>
</html>
