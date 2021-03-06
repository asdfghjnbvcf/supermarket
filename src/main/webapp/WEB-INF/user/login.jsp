<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head lang="en">
    <meta charset="UTF-8">
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <!-- layui使用的样式-->
    <link rel="stylesheet" href="${path}/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css"/>
    <link href="${path}/css/dlstyle.css" rel="stylesheet" type="text/css">
</head>

<body>

<div class="login-boxtitle">
    <a href="home.html"><img alt="logo" src="${path}/images/logo.png"/></a>
</div>

<div class="login-banner">
    <div class="login-main">
        <div class="login-banner-bg"><span></span><img src="${path}/images/big.jpg"/></div>
        <div class="login-box">

            <h3 class="title">登录商城</h3>

            <div class="clear"></div>

            <div class="login-form">
                <form>
                    <div class="user-name">
                        <label for="userphone"><i class="am-icon-user"></i></label>
                        <input type="text" name="userphone" id="userphone" placeholder="请输入手机号">
                        <br>
                        <br>
                    </div>
                    <div class="user-pass">
                        <label for="userpassword"><i class="am-icon-lock"></i></label>
                        <input type="password" name="userpassword" id="userpassword" placeholder="请输入密码">
                    </div>
                </form>
            </div>

            <div class="login-links">
                <a href="#" class="am-fr">忘记密码</a>
                <a href="${path}/user.action/toRegister" class="zcnext am-fr am-btn-default">注册</a>
                <br/>
            </div>
            <div class="am-cf">
                <input type="button" id="login" value="登 录" class="am-btn am-btn-primary am-btn-sm">
            </div>

        </div>
    </div>
</div>


<div class="footer ">

    <div class="footer-bd ">
        <p>
            <em>Copyright © 2006-2019 YONGHUI SUPERSTORES, All Rights Reserved小馋猫超市·版权所有 中国福建省厦门市软园24号
                客服中心：86-591-83758880 4000601933</em>
        </p>
    </div>
</div>
</body>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<!-- layui的js-->
<script src="${path}/layuiadmin/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript">
    $(function () {
        layui.use(['laypage', 'layer'], function () {
            var laypage = layui.laypage, layer = layui.layer;
            $("#login").click(function () {
                $.ajax({
                    url: "${path}/user.action/doLogin",
                    type: "post",
                    dataType: "json",
                    data: {
                        userphone: $("#userphone").val(),
                        userpassword: $("#userpassword").val()
                    }, success: function (data) {
                        if (data.msg=="登录成功") {
                            layer.msg(data.msg,{icon : 1,time : 2000	},function () {
                                //登录成功跳转到前台首页
                                location.href="${path}/user.action/home";
                            });
                        }else {
                            //登录失败、输出失败原因刷新页面
                            layer.msg(data.msg,{icon : 2,time : 2000	},function () {
                                location.reload();
                            });
                        }

                    }
                });
            });
        });
    });
</script>

</html>
