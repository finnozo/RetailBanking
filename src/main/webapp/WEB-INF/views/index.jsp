<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Branch</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    <style>
        input:focus {
            background-color: blue;
            color: white;

        }
        input:blur {
            background-color: white;
            color: black;
        }
        .error{
            color: #FF0000;
            font-weight: bold;
        }
    </style>
</head>
<body class="ng-cloak">
<div class="generic-container">
    <div class="panel panel-default">
        <div class="panel-heading"><span class="lead">Branch Creation Form</span></div>
        <div class="formcontainer">
            <form:form action="" modelAttribute="branch" method="POST" class="form-horizontal">
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-2 control-lable">Branch Code</label>
                        <div class="col-md-7">
                            <form:input path="branchNo" cssStyle="color: red !important;"
                                        class="username form-control input-sm"
                                        placeholder="Here Branch Code is Auto Generated" disabled="true"/>
                            <div class="error"><c:if test="${branch.branchNo.length() > 0}">Branch created and branch Id : ${branch.branchNo}</c:if></div>
                        </div>
                    </div>
                </div>


                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-2 control-lable">Branch Name</label>
                        <div class="col-md-7">
                            <form:input path="name" class="form-control input-sm"
                                        placeholder="Enter Branch Name"/>
                            <form:errors path="name" cssClass="error"/>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="form-actions floatRight">
                        <input type="submit" value="Create Branch" class="btn btn-primary btn-sm"/>
                        <input type="reset" class="btn btn-warning btn-sm" value="Reset Form"/>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
