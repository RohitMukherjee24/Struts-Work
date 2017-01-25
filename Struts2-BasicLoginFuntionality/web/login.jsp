<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 1/25/2017
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login Here</title>
</head>
<body>
<s:form action="login">
    <s:textfield label="Login ID" name="userId"/>
    <s:password label="Password" name="password"/>
    <s:submit/>
</s:form>
</body>
</html>
