<%--
  Created by IntelliJ IDEA.
  User: sundstei
  Date: 7/8/11
  Time: 8:59 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>This is the index page</title></head>

<body>
<g:form action="login" controller="login">

  Please enter username and password:<br/>
  Username : <g:textField name="userName"/><br>

  Password :<g:passwordField name="password"/><br>
  <g:submitButton name="Login" value=""/>
</g:form>

</body>
</html>