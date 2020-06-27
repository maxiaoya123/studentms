<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/4/7
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
当前登录：管理员<s:property value="#session.adminusername"/>
<h2 align="center">查看全部学生信息</h2>
<s:form action="dept" method="post">
    <s:select list="deptList" name="stu.department" label="根据学院查询" value="departm" headerKey="0" headerValue="---请选择---"/>
    <s:submit value="search"/>
</s:form>
<form action="unclearFind" method="post">
    根据姓名查询：<input type="text" name="stu.name">
    <input type="submit" value="search">
    <a href="student_add.jsp"><input type="button" value="Add student's message"></a>
</form>
<table align="center" border="2px">
 <tr>
    <td width="50px">序号</td>
    <td width="100px">学号</td>
    <td width="50px">姓名</td>
    <td width="100px">密码</td>
    <td width="50px">性别</td>
    <td width="100px">生日</td>
    <td width="50xp">年级</td>
    <td width="100px">系别</td>
    <td width="100px">专业</td>
    <td width="50px">修改</td>
    <td width="50px">删除</td>
 </tr>
<s:iterator value="studentList" status="st">
    <tr>
        <td><s:property value="#st.count"/> </td>
        <td><s:property value="sid"/> </td>
        <td><s:property value="name"/> </td>
        <td><s:property value="pwd"/> </td>
        <td><s:property value="sex"/> </td>
        <td><s:property value="birthday"/> </td>
        <td><s:property value="grade"/> </td>
        <td><s:property value="department"/> </td>
        <td><s:property value="major"/> </td>
        <td><a href="student_update.jsp?sid=<s:property value="sid"/>"/>修改</td>
        <td><a href="delete?stu.sid=<s:property value="sid"/> "> 删除</a></td>
    </tr>
</s:iterator>
</table>
</body>
</html>
