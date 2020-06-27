<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/4/11
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看个人信息</title>
</head>
<h2 align="center">查看个人信息</h2>
<body>
<table align="center" border="2px">
    <tr>
        <td width="100px">学号</td>
        <td width="50px">姓名</td>
        <td width="100px">密码</td>
        <td width="50px">性别</td>
        <td width="100px">生日</td>
        <td width="50xp">年级</td>
        <td width="100px">系别</td>
        <td width="100px">专业</td>
        <td width="100px">修改密码</td>
    </tr>
    <s:iterator value="studentList" >
        <tr>
            <td><s:property value="sid"/> </td>
            <td><s:property value="name"/> </td>
            <td><s:property value="pwd"/> </td>
            <td><s:property value="sex"/> </td>
            <td><s:property value="birthday"/> </td>
            <td><s:property value="grade"/> </td>
            <td><s:property value="department"/> </td>
            <td><s:property value="major"/> </td>
            <td><a href="update_me.jsp?sid=<s:property value="sid"/>"/>修改</td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
