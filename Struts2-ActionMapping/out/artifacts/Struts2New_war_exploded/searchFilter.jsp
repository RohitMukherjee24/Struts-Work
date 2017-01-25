<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 1/25/2017
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>SearchFilter</title>
</head>
<body>

<s:form action="getTutorial" >
    <s:textfield label="language" name="language"/>
    <s:submit/>
</s:form>
</body>
</html>
