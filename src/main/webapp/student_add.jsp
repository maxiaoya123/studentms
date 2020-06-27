<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/4/8
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
当前登录：管理员<s: property value="#session.adminusername"/>
<h2>增加学生信息</h2>
<form method="post" action="add">
    sid:<input type="text" name="stu.sid" ><br>
    name:<input type="text" name="stu.name" ><br>
    pwd:<input type="text" name="stu.pwd" ><br>
    sex:
    <input type="radio" name="stu.sex" value="男" checked="checked">男
    <input type="radio" name="stu.sex" value="女" > 女<br>
    birthday:<input  type="date" name="stu.birthday"><br>
    grade:<input type="text" name="stu.grade" ><br>
    department:<input type="text" name="stu.department" ><br>
    major:<input type="text" name="stu.major" ><br>
    <input type="submit" value="add">
</form>
</body>
</html>
