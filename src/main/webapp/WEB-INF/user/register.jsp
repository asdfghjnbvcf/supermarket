<%--
  用户注册界面
  User: 黄志鹏
  Date: 2019/5/21
  Time: 20:27
  用于用户的注册
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head lang="en">
    <meta charset="UTF-8">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="stylesheet" href="${path}/AmazeUI-2.4.2/assets/css/amazeui.min.css"/>
    <link href="${path}/css/dlstyle.css" rel="stylesheet" type="text/css">
    <!-- layui使用的样式-->
    <link rel="stylesheet" href="${path}/layuiadmin/layui/css/layui.css" media="all">

    <script src="${path}/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="${path}/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

</head>

<body>

<div class="login-boxtitle">
    <a href="${path}/user.action/home"><img alt="" src="${path}/images/logo.png"/></a>
</div>

<div class="res-banner">
    <div class="res-main">
        <div class="login-banner-bg"><span></span><img src="../images/big.jpg"/></div>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class=""><a>用户注册</a></li>
                </ul>
                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
                        <form action="#" method="post" id="registerForm">
                            <div class="user-email">
                                <label for="userName"><i class="am-icon-user"></i></label>
                                <input type="text" name="userName" id="userName" required="required"
                                       placeholder="请输入用户名">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="userPwd" id="password" required="required"
                                       placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="memberPwd" id="passwordRepeat" required="required"
                                       placeholder="确认密码">
                                <span id="msg"></span>
                            </div>
                            <div class="user-phone">
                                <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                <input type="tel" name="userPhone" id="phone" placeholder="请输入手机号">
                            </div>
                            <div class="verification">
                                <label for="code"><i class="am-icon-code-fork"></i></label>
                                <input type="tel" name="code" required="required" id="code" placeholder="请输入验证码">
                                <button id="huoqu" type="button" class="am-btn-xs am-btn-secondary am-round"
                                        style="font-size:18px;height:40px;width:55px"  disabled>获取
                                </button>
                            </div>
                            <div class="am-cf">
                                <input type="button" name="" value="注册" id="register" class="am-btn am-btn-primary am-btn-sm am-fl">
                                <span><a href="${path}/user.action/toLogin">已有账号？前去登录</a></span>
                            </div>
                        </form>

                    </div>
                </div>

            </div>
        </div>

        <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
        <!-- layui的js-->
        <script src="${path}/layuiadmin/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript">
            var n = 0;
            $("#phone").blur(function () {
                var phone = $("#phone").val();
                var phonerge = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;
                if (phone != null && phone != "" && phonerge.test(phone)) {
                    if (n == 0) {
                        $.ajax({
                            url: "${path}/user.action/getUserByUserPohone",
                            data: {
                                "userPhone": phone
                            },
                            success: function (data) {

                                if (data.msg === "手机号已被注册") {
                                    //tips层
                                    layui.use(['laypage','layer' ],function() {
                                        var laypage = layui.laypage, layer = layui.layer;
                                        layer.tips('该手机号已经被注册，请换个号码或者前去登录','#phone');
                                    });

                                } else {
                                    layui.use(['laypage','layer' ],function() {
                                        var laypage = layui.laypage, layer = layui.layer;
                                        layer.tips('可以注册','#phone');
                                    });

                                    $("#huoqu").removeAttr('disabled');
                                    $("#huoqu").click(function () {
                                        n = 1;
                                        if ($("#phone").val() != "" && phonerge.test(phone)) {

                                            $("#huoqu").attr("disabled", "disabled");
                                            $("#huoqu").css("background", "#CCCCCC");
                                            var alltime = 60;

                                            $.ajax({
                                                type: "post", //提交方式
                                                url: "${path}/user.action/sendSms",//路径
                                                data: {
                                                    "phone": phone
                                                },//数据，这里使用的是Json格式进行传输
                                                success: function (result) {//返回数据根据结果进行相应的处理

                                                        if (result.msg=="手机号已被注册，验证码发送失败") {
                                                            layui.use(['laypage','layer' ],function() {
                                                                var laypage = layui.laypage, layer = layui.layer;
                                                                layer.msg(result.msg,{icon : 2,time : 2000	})
                                                            });
                                                        }else {
                                                            layui.use(['laypage','layer' ],function() {
                                                                var laypage = layui.laypage, layer = layui.layer;
                                                                layer.msg(result.msg,{icon : 1,time : 2000	})
                                                            });
                                                        }

                                                }

                                            })
                                            clearInterval(time);
                                            var time = setInterval(function () {
                                                var t = alltime;
                                                if (t == 0) {
                                                    $("#huoqu").text("获取");
                                                    $("#huoqu").css("background", "");
                                                    n = 0;
                                                    clearInterval(time);
                                                } else {
                                                    $("#huoqu").text(t);
                                                    alltime--;
                                                }
                                            }, 1000)
                                        } else {
                                            $("#huoqu").attr('disabled');
                                        }
                                    })
                                }
                            }
                        });

                    }

                } else {
                    layui.use(['laypage','layer' ],function() {
                        var laypage = layui.laypage, layer = layui.layer;
                        layer.tips("手机号有误","#phone")
                    });
                    $("#huoqu").attr('disabled');
                }
            });

        </script>
        <script type="text/javascript">
            $("#passwordRepeat").blur(function () {
                if ($("#passwordRepeat").val() != $("#password").val()) {
                    layui.use(['laypage','layer' ],function() {
                        var laypage = layui.laypage, layer = layui.layer;
                        layer.tips("两次密码不一致","#passwordRepeat")
                    });
                }
            });
        </script>
        <script type="text/javascript">

            layui.use(['laypage','layer' ],function() {
                var laypage = layui.laypage, layer = layui.layer;

                var phonerge = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;

            $("#register").click(function () {

                if ($("#userName").val()==null || $("#userName").val()== "") {

                    layer.tips("用户名不能为空","#userName")

                }else if($("#password").val()==null || $("#password").val()==""){

                        layer.tips("密码不能为空","#password")

                }else if ($("#passwordRepeat").val() != $("#password").val()) {

                        layer.tips("两次密码不一致","#passwordRepeat")

                }else if ($("#phone").val() == null && $("#phone").val() == ""){

                    layer.tips("手机号不能为空","#phone")

                }else if ( !phonerge.test($("#phone").val())){

                    layer.tips("手机号有误","#phone")

                }
                else if ($("#code").val()==null || $("#code").val() == "") {

                    layer.tips("验证码不能为空","#code")

                }else if ($("#phone").val() != null && $("#phone").val() != "" && phonerge.test(phone)){

                }
                else if ($("#password").val()!=null && $("#password").val()!="" && $("#passwordRepeat").val() == $("#password").val() && $("#userName").val()!=null ||
                    $("#userName").val()!= "" && $("#code").val()!=null || $("#code").val() != "" && $("#phone").val() != null && $("#phone").val() != "" &&
                    phonerge.test($("#phone").val())){
                   $.ajax({
                       url : "${path}/user.action/userRegister",
                        type:"post",
                        dataType: "json",
                        data :{
                           "username":$("#userName").val(),
                            "userpassword":$("#password").val(),
                           "userphone":$("#phone").val(),
                           "code" : $("#code").val()
                        },success :function (data) {
                            if (data.msg=="注册成功"){
                                layer.msg(data.msg,{icon : 1,time : 2000	},function () {
                                    //注册成功跳转到登录界面
                                    location.href="${path}/user.action/toLogin";
                                });

                            }else {
                                //注册失败，刷新页面
                                layer.msg(data.msg,{icon : 2,time : 2000	},function () {
                                    location.reload();
                                });
                            }
                        }
                    });
                }


            });
            });
        </script>

</body>


</html>
