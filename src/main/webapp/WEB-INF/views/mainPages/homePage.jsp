
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.11.2020
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Strona główna</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bulma/0.9.1/css/bulma.min.css">
    <script defer src="${pageContext.request.contextPath}/webjars/font-awesome/5.15.1/js/all.min.js"></script>
</head>
<body style="background: linear-gradient(lightcyan,lightcyan)">
<div align="center" class="container">
    <div class="field">
        <h2>Witaj w wypożyczalni samochodów</h2>
    </div>
</div>
<br/>
<div class="container">
    <div class="has-text-centered">
        <h2><a href="${pageContext.request.contextPath}/branch/add">Dodaj nowy oddział</a> </h2>
    </div>
</div>
<br/>
<div class="has-text-centered">
    <p class="has-background-grey-light">Lista wypożyczalni</p>
</div>
<div>
    <div class="table-container">
        <table class="table" align="center" style="background: lightcyan">
            <tr>
                <th>Lp.</th>
                <th>Nazwa Wypożyczalni</th>
                <th>Miasto</th>
                <th>Ulica</th>
                <th>Kod pocztowy</th>
                <th>Pracownicy</th>
                <th>Auta</th>
                <th>Wybierz</th>
            </tr>
            <c:forEach items="${allBranch}" var="listRent" varStatus="step">
                <tr>
                    <td>${step.count}</td>
                    <td>${listRent.name}</td>
                    <td>${listRent.city}</td>
                    <td>${listRent.street}</td>
                    <td>${listRent.zipCode}</td>
                    <td>${listRent.employees}</td>
                    <td>${listRent.cars}</td>
                    <td><a href="${pageContext.request.contextPath}/rent/getCarRent?id=${listRent.id}">Wybierz</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
