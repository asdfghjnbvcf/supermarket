<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>付款成功页面</title>
    <link rel="stylesheet"  type="text/css" href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css"/>
    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="${path}/css/sustyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${path}/basic/js/jquery-1.7.min.js"></script>

</head>

<body>


<!--顶部导航条 -->
<jsp:include page="header.jsp"></jsp:include>



<div class="take-delivery">
    <div class="status">
        <h2>您已成功付款</h2>
        <div class="successInfo">
            <ul>
                <li>付款金额<em>¥9.90</em></li>
                <div class="user-info">
                    <p>收货人：艾迪</p>
                    <p>联系电话：15871145629</p>
                    <p>收货地址：湖北省 武汉市 武昌区 东湖路75号众环大厦</p>
                </div>
                请认真核对您的收货信息，如有错误请联系客服

            </ul>
            <div class="option">
                <span class="info">您可以</span>
                <a href="person/order.html" class="J_MakePoint">查看<span>已买到的宝贝</span></a>
                <a href="person/orderinfo.html" class="J_MakePoint">查看<span>交易详情</span></a>
            </div>
        </div>
    </div>
</div>


<div class="footer" >

    <div class="footer-bd">
        <p>
            <em>Copyright © 2006-2019 YONGHUI SUPERSTORES, All Rights Reserved小馋猫超市·版权所有  中国福建省厦门市软园24号  客服中心：86-591-83758880 4000601933</em>
        </p>
    </div>
</div>


</body>
</html>