<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>管理员登录</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <link rel="stylesheet" type="text/css" href="${path}/face/css/style.css" />
    <script type="text/javascript" src="${path}/face/js/jquery-1.4.4.min.js"></script>
    <style>
        body {
            height: 100%;
            background: #213838;
            overflow: hidden;
        }

        canvas {
            z-index: -1;
            position: absolute;
        }
    </style>
    <script src="${path}/face/js2/jquery.js"></script>
    <script src="${path}/face/js2/verificationNumbers.js"></script>
    <script src="${path}/face/js2/Particleground.js"></script>
    <script>
        $(document).ready(function() {
            //粒子背景特效
            $('body').particleground({
                dotColor : '#5cbdaa',
                lineColor : '#5cbdaa'
            });

        });
    </script>


    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        body {
            height: 100vh;
            background-position: center;
            overflow: hidden;
        }

        h1 {
            color: #fff;
            text-align: center;
            font-weight: 100;
            margin-top: 40px;
        }

        #media {
            width: 300px;
            height: 280px;
            margin: 10px auto 0;
            border-radius: 30px;
            opacity: 0.7px;
        }

        #video {

        }

        #canvas {
            display: none;
        }

        #btn {
            width: 160px;
            height: 50px;
            background: #03a9f4;
            margin: 70px auto 0;
            text-align: center;
            line-height: 50px;
            color: #fff;
            border-radius: 40px;
        }
    </style>
</head>

<body>
<form action="#" method="get">
    <dl class="admin_login">
        <dt>
            <br>
            <br>
            <strong>小馋猫商城</strong>
            <br>
            <strong>后台管理系统</strong>
            <br>
        </dt>

        <dt>
        <div id="media">
          <div>
              <label>用户名:</label>
              <input type="text" size="15%" >
              <br>
              <br>
          </div>
            <div>
                <label>密&nbsp;&nbsp;&nbsp;码:</label>
                <input type="password" size="15%">
                <br>
                <br>
                <br>
            </div>
            <div>
                <input type="button" value="立即登录" id="login" style="width: 145px ;height: 42px;border:
                      none;font-size: 16px;background: #048f74;color: #F8F8F8;border-radius: 40px" >
                <input type="button" value="刷脸登录" id="login1" style="width: 145px ;height: 42px;border:
                      none;font-size: 16px;background: #048f74;color: #F8F8F8;border-radius: 40px" >
            </div>
        </div>
       </dt>
      <%-- <dd>
            <input type="button" value="立即登录" class="submit_btn" size="10%"/>
        </dd>--%>

    </dl>
    <script type="text/javascript" src="${path}/face/js2/jquery-3.1.1.min.js"></script>
    <style type="text/css">
        #webcam {
            border: 1px solid #666666;
            width: 320px;
            height: 240px;
        }

        #photos {
            border: 1px solid #666666;
            width: 320px;
            height: 240px;
        }

        .btn {
            width: 320px;
            height: auto;
            margin: 5px 0px;
        }

        .btn input[type=button] {
            width: 150px;
            height: 50px;
            line-height: 50px;
            margin: 3px;
        }
    </style>

</form>
</body>
</html>