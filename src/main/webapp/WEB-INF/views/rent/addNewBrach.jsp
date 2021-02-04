<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.01.2021
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie nowego oddziału</title>
    <script defer src="https://use.fontawesome.com/releases/v5.14.0/js/all.js"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
    <link href="../../css/companyNew.css" rel="stylesheet" type="text/css">
</head>
</head>
<body>
<div>
    <header>
        <h1>Wypożyczalnia samochodów</h1>
    </header><br/><br>
    <p>Stwórz nowy oddział</p>
    <section class="has-text-centered">
        <form:form method="post" modelAttribute="newBranch">
            <div>
                <form:label path="name">Nazwa</form:label>
            </div>
            <div>
                <form:input path="name"/><br>
                <form:errors path="name" cssClass="error"/>
            </div>
            <div>
                <form:label path="street">Ulica</form:label>
            </div>
            <div>
                <form:input path="street"/><br>
                <form:errors path="street" cssClass="error"/>
            </div>
            <div>
                <form:label path="city">Miasto</form:label>
            </div>
            <div>
                <form:input path="city"/><br>
                <form:errors path="city" cssClass="error"/>
            </div>
            <div>
                <form:label path="zipCode">Kod Pocztowy</form:label>
            </div>
            <div>
                <form:input path="zipCode"/><br>
                <form:errors path="zipCode" cssClass="error"/>
            </div>
            <br/>
            <div>
                <input  class="button is-primary" type="submit" value="Dodaj"/>
            </div>
        </form:form>
</section>
</div>

</body>
</html>
