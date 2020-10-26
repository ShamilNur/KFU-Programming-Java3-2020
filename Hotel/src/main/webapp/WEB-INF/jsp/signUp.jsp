<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>

    <style>
        <%@include file="/WEB-INF/css/bootstrap.min.css" %>
    </style>
    <style type="text/css">
        <%@include file="/WEB-INF/css/signUp.css" %>
    </style>
    <style type="text/css">
        <%@include file="/WEB-INF/css/style.css" %>
    </style>

    <script type="text/javascript">
        <%@include file="/WEB-INF/js/signUp.js"%>
    </script>
</head>

<body>
<div class="d-flex justify-content-center align-items-center flex-column" style="height: 100vh">
    <form action="" method="post">
        <div class="form-group">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-group col">
                            <%--<label for="firstName">Имя</label>--%>
                            <input type="text" class="form-control" id="firstName" name="firstName"
                                   placeholder="Имя" required>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-group col">
                            <%--<label for="lastName">Фамилия</label>--%>
                            <input type="text" class="form-control" id="lastName" name="lastName"
                                   placeholder="Фамилия" required>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-group col">
                            <%--<label for="email">E-mail</label>--%>
                            <input type="email" class="form-control" id="email" name="email"
                                   placeholder="E-mail" required>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-group col">
                            <%--<label for="password">Пароль</label>--%>
                            <input type="password" class="form-control" id="password" name="password"
                                   placeholder="Пароль" required>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-group col">
                            <%--<label for="confirm_password">Подтверждение пароля</label>--%>
                            <input type="text" class="form-control" id="confirm_password" name="confirm_password"
                                   placeholder="Подтверждение пароля" required>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="consent" required>
                            <label class="form-check-label" for="consent">
                                Согласие на обработку персональных данных</label><br>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <div class="form-group col">
                            
                            <%--@elvariable id="message" type=""--%>
                            <c:if test="${not empty message}">
                                ${message}
                            </c:if>
                        </div>
                    </div>
                </div>
                <br>
                <div class="row justify-content-center">
                    <div class="col-sm">
                        <button type="submit" class="btn btn-outline-primary">Зарегистрироваться</button>
                    </div>
                </div>
            </div>
            <p></p>

        </div>
    </form>
</div>
</body>
</html>
