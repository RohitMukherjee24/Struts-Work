<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 1/29/2017
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="sx"  uri="/struts-dojo-tags"%>
<%@taglib  prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<sx:head/>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Auto complete example</title>
</head>
<body bgcolor="lightblue">
<h2>Enter your Place</h2>
<s:form>
    <sx:autocompleter size="1" name="state" list="listOfStates"
                      showDownArrow="false" label="Choose state"></sx:autocompleter>
    <s:submit ></s:submit>
</s:form>
</body>
</html>