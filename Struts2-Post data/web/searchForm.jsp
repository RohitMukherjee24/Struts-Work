<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 1/24/2017
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="s" uri="/struts-tags" %>--%>
<html>
<head>
    <title>SearchForm</title>
</head>
<body>
 <%--This name in text field is field name in pojo class--%>
<s:form action="getTutorial" >
    <s:textfield label="language" name="language"/> 
    <s:submit/>
</s:form>

<%--<form method="post" action="Tutorial/getTutorial" >--%>
    <%--<input id="language" name="language">--%>
    <%--<input type="submit"/>--%>
<%--</form>--%>
</body>
</html>
+