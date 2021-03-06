<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>物流</title>

    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${path}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${path}/css/lostyle.css" rel="stylesheet" type="text/css">

</head>

<body>
<article>
    <div class="mt-logo">
        <!--头 -->
        <header>
            <jsp:include page="header.jsp"></jsp:include>
        </header>
    </div>
</article>
<div class="nav-table">
    <div class="long-title"><span class="all-goods">全部分类</span></div>
    <jsp:include page="navigation.jsp"></jsp:include>
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div class="user-logistics">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">物流跟踪</strong> / <small>Logistics&nbsp;History</small></div>
                </div>
                <hr/>
                <div class="package-title">
                    <div class="m-item">
                        <div class="item-pic">
                            <img src="${path}/images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                        </div>
                        <div class="item-info">
                            <p class="log-status">物流状态:<span>已签收</span> </p>
                            <p>承运公司：天天物流</p>
                            <p>快递单号：373269427868</p>
                            <p>官方电话：4001-888-888</p>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="package-status">
                    <ul class="status-list">
                        <li class="latest">
                            <p class="text">【武汉市】已签收,签收人是青年城签收，感谢使用天天快递，期待再次为您服务</p>
                            <div class="time-list">
                                <span class="date">2015-12-19</span><span class="week">周六</span><span class="time">15:35:42</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【武汉市】光谷关山分部派件员正在为您派件</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-19</span><span class="week hidden">周六</span><span class="time">14:27:28</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【武汉市】快件已到达 光谷关山分部</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-19</span><span class="week hidden">周六</span><span class="time">09:25:51</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【武汉市】武汉 已发出</p>
                            <div class="time-list">
                                <span class="date  hidden">2015-12-19</span><span class="week  hidden">周六</span><span class="time">06:56:03</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【杭州市】杭州集散陆运 已发出</P>
                            <div class="time-list">
                                <span class="date">2015-12-17</span><span class="week">周四</span><span class="time">22:15:23</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【绍兴市】诸暨 已发出</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span class="time">18:55:25</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">【绍兴市】天天快递 诸暨收件员 已揽件</span>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span class="time">18:54:25</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">商家正通知快递公司揽件</span>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span class="time">15:49:40</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">您的包裹已出库</span>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span class="time">15:49:40</span>
                            </div>
                        </li>
                        <li>
                            <p class="text">您的订单待配货</p>
                            <div class="time-list">
                                <span class="date hidden">2015-12-17</span><span class="week hidden">周四</span><span class="time">15:18:15</span>
                            </div>
                        </li>
                        <li class="first">
                            <p class="text">您的订单开始处理</p>
                            <div class="time-list">
                                <span class="date  hidden">2015-12-17</span><span class="week  hidden">周四</span><span class="time">14:27:50</span>
                            </div>
                        </li>

                    </ul>
                </div>
            </div>
        </div>
        <!--底部-->
        <div class="footer">

            <div class="footer-bd">
                <<p>
                <em>Copyright © 2006-2019 YONGHUI SUPERSTORES, All Rights Reserved小馋猫超市·版权所有  中国福建省厦门市软园24号  客服中心：86-591-83758880 4000601933</em>
            </p>
            </div>
        </div>
    </div>
    <jsp:include page="aside.jsp"></jsp:include>
</div>

</body>

</html>