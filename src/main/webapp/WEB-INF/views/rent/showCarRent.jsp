<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 15.11.2020
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Nazwa</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bulma/0.9.1/css/bulma.min.css">
    <script defer src="${pageContext.request.contextPath}/webjars/font-awesome/5.15.1/js/all.min.js"></script>
</head>
<body>
<section class="section">
    <div class="has-text-centered">
        <p>Nazwa :${carRentId.name}</p>
        <p>Miasto : ${carRentId.city}</p>
        <p>Ulica: ${carRentId.address}</p>
    </div>
</section>
    <div class="has-text-centered">
        <div class="has-text-centered">
            <h2 class="has-text-centered">Wybierz pracownika</h2>
            <form:select path="carRentId">
                <form:option value="-" label="--Wybierz--"/>
                <form:options items="${carRentId.employee}"/>
            </form:select>
        </div>
    </div>
    <br/>
    <div class="has-text-centered">
        <button class="button">
            <a href="/addReservation">Dodaj rezerwację</a>
        </button>
    </div>
</body>
</html>
