<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/4/8
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
当前登录：管理员<s:property value="#session.adminusername"/>
<h2 align="center">修改学生信息</h2>
<s:debug/>
<s:property value=" #parameters.sid[0]"/>
 <form method="post" action="update">
    <s:iterator value="#session.studentList.{?#this.sid == #parameters.sid[0]}" status="st">
        学号:<input type="text" name="stu.sid" value="<s:property value="sid"/>"> <br>
        姓名:<input type="text" name="stu.name" value="<s:property value="name"/> "> <br>
        密码:<input type="text" name="stu.pwd" value="<s:property value="pwd"/> "><br>
        性别:
        <input type="radio" name="stu.sex" value="男" checked="checked"/> 男
        <input type="radio" name="stu.sex" value="女" /> 女<br>
        生日:<input  type="text" name="stu.birthday" value="<s:property value="birthday"/> "><br>
        年级:<input type="text" name="stu.grade" value="<s:property value="grade"/> "><br>
        系别:<input type="text" name="stu.department" value="<s:property value="department"/> "><br>
        专业:<input type="text" name="stu.major" value="<s:property value="major"/> "><br>
        <input type="submit" value="Update">
     </s:iterator>
 </form>
</body>
</html>
