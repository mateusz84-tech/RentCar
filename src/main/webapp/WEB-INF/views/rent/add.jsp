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
<h2 class="has-text-centered">Witaj na stonie wypożyczalni</h2><br/>
<h2 class="has-text-centered">Utwórz nową wypożyczalnie</h2><br/>
<section class="has-text-centered" >
<div class="container">
        <form:form method="post" modelAttribute="rent">
            <div class="field">
                <div class="control">
                    <form:input path="name" placeholder="Nazwa wypożyczalni"/>
                </div>
            </div>
            <div class="field">
                <div class="control">
                    <form:input path="city" placeholder="Miasto"/>
                </div>
            </div>
            <div class="field">
                <div class="control">
                    <form:input path="address" placeholder="Adres wypożyczalni"/>
                </div>
            </div>
            <div class="field">
                <div class="control">
                    <form:button class="button is-small">Dodaj</form:button>
                </div>
            </div>
        </form:form>
    <br/>
</div>
</section>
</body>
</html>
