<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16.11.2020
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie pracownika do wypożyczalni</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bulma/0.9.1/css/bulma.min.css">
    <script defer src="${pageContext.request.contextPath}/webjars/font-awesome/5.15.1/js/all.min.js"></script>
</head>
<body>
<br/>
<h2 class="has-text-centered">Wypełni formularz aby dodać nowego pracownika</h2>
<br/>
<section class="has-text-centered">
<form:form method="post" modelAttribute="employee">
    <div class="field">
        <div class="control">
            <form:input path="firstName" placeholder="Imię"/>
        </div>
    </div>
    <div class="field">
        <div class="control">
            <form:input path="lastName" placeholder="Nazwisko"/>
        </div>
    </div>
    <div class="field">
        <div class="control">
            <form:input path="workStation" placeholder="Stanowisko"/>
        </div>
    </div>
    <div class="field">
        <div class="control">
            <form:button class="button is-small">Dodaj</form:button>
        </div>
    </div>
</form:form>
</section>
</body>
</html>
