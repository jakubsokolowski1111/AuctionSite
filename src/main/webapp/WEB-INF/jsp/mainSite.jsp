<%--
  Created by IntelliJ IDEA.
  User: mariusz
  Date: 14.07.19
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <title>Pricing example · Bootstrap</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/pricing/">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
    <!-- Custom styles for this template -->
    <link href="pricing.css" rel="stylesheet">
</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <h5 class="my-0 mr-md-auto font-weight-normal">Auction Site</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="basket">Basket ${requestScope.basket}</a>
        <a class="p-2 text-dark" href="#">Control Panel</a>
    </nav>
    <a class="btn btn-outline-primary" action href="loginSite">
        ${sessionScope.name == null ? 'sign in' : sessionScope.name}
    </a>
    <a class="btn btn-outline-primary" href="register">Register</a>
</div>

<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
    <h1 class="display-4">Auctions:</h1>
    <p class="lead">Store mission, some healthy lifestyle promotion</p>
</div>
<div class="container">

    <div class="card-deck mb-3 text-center">
        <c:forEach var="product" items="${requestScope.productList}">
            <div class="row">
                <div class="col-3">
                    <div class="card mb-4 shadow-sm" style="width: 250px; height: 350px">
                        <div style="height: 150px;">
                            <h4 class="my-0 font-weight-normal">${product.name}</h4>
                        </div>
                        <div class="card-body">
                            <h1 class="card-title pricing-card-title">${product.price}
                                <small class="text-muted">$</small>
                            </h1>
                            <ul class="list-unstyled mt-3 mb-4">
                                <li>${product.size}</li>
                                <li>${product.colour}</li>
                                <li>${product.sex}</li>
                                <li>${product.quantity-product.reserved}</li>
                            </ul>
                            <a href="addToBasket?id=${product.id}" type="button" class="btn btn-lg btn-block btn-outline-primary">Add to basket
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>

