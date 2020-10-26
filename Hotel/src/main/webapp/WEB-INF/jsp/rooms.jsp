<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Бронирование</title>

    <style>
        <%@include file="/WEB-INF/css/bootstrap.min.css" %>
    </style>
    <style type="text/css">
        <%@include file="/WEB-INF/css/signUp.css" %>
    </style>
    <style type="text/css">
        <%@include file="/WEB-INF/css/style.css" %>
    </style>
</head>

<body>

<header>
    <div class="header-section">
        <div class="menu">
            <div class="container">
                <div class="row">
                    <div class="col-md-2">
                        <div class="logo">
                            <a href="./index.html" class="hotel-logo">HOTEL</a>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <nav>
                            <ul>
                                <li><a href="./index.html">Главная</a></li>
                                <li><a href="./rooms.html">Бронирование</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-md-2">
                        <div class="top-phone-num">
                            <img src="../../static/img/phone.png" alt="">
                            <span>+7 (999) 000-54-54</span>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <nav>
                            <ul>
                                <li><a href="./signUp.html">Регистрация</a></li>
                                <li><a href="./signIn.html">Вход</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>

<div class="main-header-rooms">
    <div class="main-flex-rooms">
        <div class="second-flex">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="main-title">
                            <h1 style="color: #fff">Бронирование</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<section class="room-availability spad">
    <div class="container">
        <div class="room-check">
            <div class="row">
                <div class="col-mg-6">
                    <div class="check-form">
                        <h2>Проверить наличие свободных мест</h2>
                        <form action="#">
                            <div class="datepicker">
                                <div class="date-select">
                                    <p>Дата заезда</p>
                                    <input type="date">
                                </div>
                                <div class="date-select to">
                                    <p>Дата выезда</p>
                                    <input type="date">
                                </div>
                            </div>
                            <div class="room-quantity">
                                <div class="row">
                                    <div class="col-lg-4">
                                        <div class="single-quantity">
                                            <p>Комнаты</p>
                                            <select name="rooms-num" id="rooms-num">
                                                <option value="">1</option>
                                                <option value="">2</option>
                                                <option value="">3</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="single-quantity">
                                        <div class="col-lg-4">
                                            <p>Взрослые</p>
                                            <select name="adults-num" id="adults-num">
                                                <option value="">1</option>
                                                <option value="">2</option>
                                                <option value="">3</option>
                                                <option value="">4</option>
                                                <option value="">5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="single-quantity">
                                        <div class="col-lg-4">
                                            <p>Дети</p>
                                            <select name="child-num" id="child-num">
                                                <option value="">1</option>
                                                <option value="">2</option>
                                                <option value="">3</option>
                                                <option value="">4</option>
                                                <option value="">5</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <button type="button">ПРОВЕРИТЬ <i class="lnr lnr-arrow-right"></i></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="about-room">
            <div class="row">
                <div class="col-lg-10 offset-lg-1">
                    <h2>“Клиенты могут забыть, что вы сказали, но они никогда не забудут, что вы заставили их
                        почувствовать”.</h2>
                </div>
            </div>
        </div>
    </div>
</section>

<footer class="footer-info">
    <div class="container">
        <div class="row align-items-start">
            <div class="col">
                <h3 class="contact-name">Адрес</h3>
                <h5 class="contact-desc">Казань</h5>
            </div>
            <div class="col">
                <div class="col">
                    <h3 class="contact-name">Телефон</h3>
                    <h5 class="contact-desc">+7 (999) 000-54-54</h5>
                </div>
            </div>
            <div class="col">
                <h3 class="contact-name">E-mail</h3>
                <h5 class="contact-desc">booking@gmail.com</h5>
            </div>
        </div>
    </div>
</footer>

</body>

</html>