<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.11.2020
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Strona wypożyczalni</title>
    <script defer src="https://use.fontawesome.com/releases/v5.14.0/js/all.js"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
</head>
<body>
<h2>Witaj na stonie wypożyczalni</h2>
<form:form method="post" modelAttribute="rent">
    <div calss="field">
    <form:label path="name">Nazwa Wypożyczalni</form:label>
        <div class="control">
            <form:input path="name"/>
        </div>
    </div>
    <div class="field">
        <form:label path="city">Miasto</form:label>
        <div class="control">
            <form:input path="city"/>
        </div>
    </div>
    <div class="field">
        <form:label path="address">Ulica</form:label>
            <div class="control">
                <form:input path="address"/><br/>
            </div>
    </div>
    <form:button>Dodaj</form:button>
</form:form>
</body>
</html>
