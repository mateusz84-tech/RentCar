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
    <div class="hero-buttons">
        <div class="buttons">
            <button class="button" style="background-color: goldenrod">
                <p>Samochody: ${carRentId.car}</p>
            </button>
        </div>
        <div class="buttons">
            <button class="button" style="background-color: coral">
                <p>Rezerwacje: ${carRentId.reservations}</p>
            </button>
        </div>
        <div class="buttons">
            <button class="button" style="background-color: #5498b4">
                <p>Zwroty: ${carRentId.returns}</p>
            </button>
        </div>
        <div class="buttons">
            <button class="button" style="background-color: #a773b4">
                <p>Pracownicy: ${carRentId.employee}</p>
            </button>
        </div>
        <div class="buttons">
            <button class="button" style="background-color: #3fb447">
                <p>Klienci: ${carRentId.customers}</p>
            </button>
        </div>
    </div>
</div>
</body>
</html>
