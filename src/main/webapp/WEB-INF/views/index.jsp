<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" ng-app="crudApp">
<head>
    <title>${title}</title>
    <link href="<c:url value='/static/css/bootstrap.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/static/css/app.css'/>" rel="stylesheet"/>
</head>
<body>

<div ui-view></div>
<script src="<c:url value='/static/js/lib/angular.min.js'/>"></script>
<script src="<c:url value='/static/js/lib/angular-ui-router.min.js'/>"></script>
<script src="<c:url value='/static/js/lib/localforage.min.js'/>"></script>
<script src="<c:url value='/static/js/lib/ngStorage.min.js'/>"></script>
<script src="<c:url value='/static/js/app/app.js'/>"></script>
<script src="<c:url value='/static/js/app/UserService.js'/>"></script>
<script src="<c:url value='/static/js/app/UserController.js'/>"></script>
</body>
</html>