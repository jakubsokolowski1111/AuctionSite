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
        .note {
            text-align: center;
            height: 80px;
            background: -webkit-linear-gradient(left, #0072ff, #8811c5);
            color: #fff;
            font-weight: bold;
            line-height: 80px;
        }

        .form-content {
            padding: 5%;
            border: 1px solid #ced4da;
            margin-bottom: 2%;
        }

        .form-control {
            border-radius: 1.5rem;
        }

        .btnSubmit {
            border: none;
            border-radius: 1.5rem;
            padding: 1%;
            width: 20%;
            cursor: pointer;
            background: #0062cc;
            color: #fff;
        }

    </style>
    <!-- Custom styles for this template -->
    <link href="pricing.css" rel="stylesheet">
</head>
<body>
<div class="container register-form">
    <div class="form">
        <div class="note">
            <p>Login</p>
        </div>

        <div class="form-content">
            <p><span style="font-size: small; color: red; ">Wrong login or password!</span></p>
            <div class="row">
                <div class="col-md-6">
                    <form method="post" action="loginSubmit">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Login" name="login" required/>
                        </div>


                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password" name="password"
                                   required/>
                        </div>

                        <button type="submit" class="btnSubmit">Login</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

