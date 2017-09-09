<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


    <link rel="stylesheet" href="/static/css/login_style.css">


</head>

<body>
<c:url var="loginUrl" value="/login"/>

<form action="${loginUrl}" method="post" class="form-horizontal">
    <c:if test="${param.error != null}">
        <div class="alert alert-danger">
            <p>Invalid username and password.</p>
        </div>
    </c:if>
    <c:if test="${param.logout != null}">
        <div class="alert alert-success">
            <p>You have been logged out successfully.</p>
        </div>
    </c:if>
    <div class="login">
        <h2>Log In</h2>
        <fieldset>
            <input type="text" id="username" name="ssoId" placeholder="Enter Username" required/>
            <input type="password" id="password" name="password" placeholder="Enter Password" required/>
        </fieldset>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Log In"/>
    </div>
</form>

</body>
</html>
