<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/4/7
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>鲁东大学学生信息管理系统</title>
</head>
<body>
<h1>Struts+Hibernate//学生信息管理系统</h1>
<s:form action="admin" method="post">
    <s:textfield name="username" label="username" size="16"/>
    <s:password name="usrpwd" label="usrpwd" size="16"/>
    <s:textfield name="role" label="role" size="16"/>
    <s:submit value="submit"/>
</s:form>
</body>
</html>
