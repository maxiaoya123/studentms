<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/4/11
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生登陆</title>
</head>
<h2>学生信息管理系统</h2>
<s:form action="login" method="post" >
    <s:textfield name="sid" label="学号" size="16"/>
    <s:password name="pwd" label="密码" size="16"/>
    <s:submit value="submit"/>
</s:form>
<body>
</body>
</html>
