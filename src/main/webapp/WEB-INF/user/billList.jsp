<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>账单明细</title>

    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${path}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${path}/css/bilstyle.css" rel="stylesheet" type="text/css">

    <script src="${path}/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="${path}/AmazeUI-2.4.2/assets/js/amazeui.js"></script>

</head>

<body>
<!--头 -->
<!--头 -->
<header>
    <jsp:include page="header.jsp"></jsp:include>
</header>
<div class="nav-table">
    <div class="long-title"><span class="all-goods">全部分类</span></div>
    <jsp:include page="navigation.jsp"></jsp:include>
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">账单明细</strong> / <small>Electronic&nbsp;bill</small></div>
            </div>
            <hr>

            <!--交易时间	-->

            <div class="order-time">
                <label class="form-label">交易时间：</label>
                <div class="show-input">
                    <select class="am-selected" data-am-selected>
                        <option value="today">今天</option>
                        <option value="sevenDays" selected="">最近一周</option>
                        <option value="oneMonth">最近一个月</option>
                        <option value="threeMonths">最近三个月</option>
                        <option class="date-trigger">自定义时间</option>
                    </select>
                </div>
                <div class="clear"></div>
            </div>

            <table width="100%">

                <thead>
                <tr>
                    <th class="memo"></th>
                    <th class="time">创建时间</th>
                    <th class="name">名称</th>
                    <th class="amount">金额</th>
                    <th class="action">操作</th>
                </tr>
                </thead>

                <tbody>
                <tr>
                    <td class="img">
                        <i><img src="${path}/images/songzi.jpg"></i>
                    </td>
                    <td class="time">
                        <p> 2016-01-28
                        </p>
                        <p class="text-muted"> 10:58
                        </p>
                    </td>
                    <td class="title name">
                        <p class="content">
                            良品铺子精选松子，即开即食全国包邮
                        </p>
                    </td>

                    <td class="amount">
                        <span class="amount-pay">- 11.90</span>
                    </td>
                    <td class="operation">
                        删除
                    </td>
                </tr>

                <tr>

                    <td class="img">
                        <i><img src="${path}/images/songzi.jpg"></i>
                    </td>
                    <td class="time">
                        <p> 2016-01-28
                        </p>
                        <p class="text-muted"> 10:58
                        </p>
                    </td>
                    <td class="title name">
                        <p class="content">
                            良品铺子精选松子，即开即食全国包邮
                        </p>
                    </td>

                    <td class="amount">
                        <span class="amount-pay">- 11.90</span>
                    </td>
                    <td class="operation">
                        删除
                    </td>
                </tr>
                </tbody>
            </table>

            <script type="text/javascript">
                $(document).ready(function() {
                    $(".date-trigger").click(function() {
                        $(".show-input").css("display", "none");
                    });

                })
            </script>

        </div>
        <!--底部-->
        <div class="footer">
            <div class="footer-bd">
                <p>
                    <em>Copyright © 2006-2019 YONGHUI SUPERSTORES, All Rights Reserved小馋猫超市·版权所有  中国福建省厦门市软园24号  客服中心：86-591-83758880 4000601933</em>
                </p>
            </div>
        </div>
    </div>

    <jsp:include page="aside.jsp"></jsp:include>
</div>

</body>

</html>
