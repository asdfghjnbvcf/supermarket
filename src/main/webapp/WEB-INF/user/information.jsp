<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>个人资料</title>

    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${path}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${path}/css/infstyle.css" rel="stylesheet" type="text/css">
    <script src="${path}/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="${path}/AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>

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

            <div class="user-info">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
                </div>
                <hr/>

                <!--头像 -->
                <div class="user-infoPic">

                    <div class="filePic">
                        <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
                        <img class="am-circle am-img-thumbnail" src="${path}/images/getAvatar.do.jpg" alt="" />
                    </div>

                    <p class="am-form-help">头像</p>

                    <div class="info-m">
                        <div><b>用户名：<i>小叮当</i></b></div>
                        <div class="u-level">
									<span class="rank r2">
							             <s class="vip1"></s><a class="classes" href="#">铜牌会员</a>
						            </span>
                        </div>
                        <div class="u-safety">
                            <a href="safety.html">
                                账户安全
                                <span class="u-profile"><i class="bc_ee0000" style="width: 60px;" width="0">60分</i></span>
                            </a>
                        </div>
                    </div>
                </div>

                <!--个人信息 -->
                <div class="info-main">
                    <form class="am-form am-form-horizontal">

                        <div class="am-form-group">
                            <label for="user-name2" class="am-form-label">昵称</label>
                            <div class="am-form-content">
                                <input type="text" id="user-name2" placeholder="nickname">

                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="user-name" class="am-form-label">姓名</label>
                            <div class="am-form-content">
                                <input type="text" id="user-name2" placeholder="name">

                            </div>
                        </div>

                        <div class="am-form-group">
                            <label class="am-form-label">性别</label>
                            <div class="am-form-content sex">
                                <label class="am-radio-inline">
                                    <input type="radio" name="radio10" value="male" data-am-ucheck> 男
                                </label>
                                <label class="am-radio-inline">
                                    <input type="radio" name="radio10" value="female" data-am-ucheck> 女
                                </label>
                                <label class="am-radio-inline">
                                    <input type="radio" name="radio10" value="secret" data-am-ucheck> 保密
                                </label>
                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="user-birth" class="am-form-label">生日</label>
                            <div class="am-form-content birth">
                                <div class="birth-select">
                                    <select data-am-selected>
                                        <option value="a">2015</option>
                                        <option value="b">1987</option>
                                    </select>
                                    <em>年</em>
                                </div>
                                <div class="birth-select2">
                                    <select data-am-selected>
                                        <option value="a">12</option>
                                        <option value="b">8</option>
                                    </select>
                                    <em>月</em></div>
                                <div class="birth-select2">
                                    <select data-am-selected>
                                        <option value="a">21</option>
                                        <option value="b">23</option>
                                    </select>
                                    <em>日</em></div>
                            </div>

                        </div>
                        <div class="am-form-group">
                            <label for="user-phone" class="am-form-label">电话</label>
                            <div class="am-form-content">
                                <input id="user-phone" placeholder="telephonenumber" type="tel">

                            </div>
                        </div>
                        <div class="am-form-group">
                            <label for="user-email" class="am-form-label">电子邮件</label>
                            <div class="am-form-content">
                                <input id="user-email" placeholder="Email" type="email">

                            </div>
                        </div>
                        <div class="am-form-group address">
                            <label for="user-address" class="am-form-label">收货地址</label>
                            <div class="am-form-content address">
                                <a href="address.html">
                                    <p class="new-mu_l2cw">
                                        <span class="province">湖北</span>省
                                        <span class="city">武汉</span>市
                                        <span class="dist">洪山</span>区
                                        <span class="street">雄楚大道666号(中南财经政法大学)</span>
                                        <span class="am-icon-angle-right"></span>
                                    </p>
                                </a>

                            </div>
                        </div>
                        <div class="am-form-group safety">
                            <label for="user-safety" class="am-form-label">账号安全</label>
                            <div class="am-form-content safety">
                                <a href="safety.html">

                                    <span class="am-icon-angle-right"></span>

                                </a>

                            </div>
                        </div>
                        <div class="info-btn">
                            <div class="am-btn am-btn-danger">保存修改</div>
                        </div>

                    </form>
                </div>

            </div>

        </div>
        <!--底部-->
        <div class="footer">
            <p>
                <em>Copyright © 2006-2019 YONGHUI SUPERSTORES, All Rights Reserved小馋猫超市·版权所有  中国福建省厦门市软园24号  客服中心：86-591-83758880 4000601933</em>
            </p>
        </div>
    </div>

    <jsp:include page="aside.jsp"></jsp:include>
</div>

</body>

</html>
