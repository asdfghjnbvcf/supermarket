<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>发表评论</title>

    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${path}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${path}/css/appstyle.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="${path}/js/jquery-1.7.2.min.js"></script>
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

            <div class="user-comment">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">发表评论</strong> / <small>Make&nbsp;Comments</small></div>
                </div>
                <hr/>

                <div class="comment-main">
                    <div class="comment-list">
                        <div class="item-pic">
                            <a href="#" class="J_MakePoint">
                                <img src="images/comment.jpg_400x400.jpg" class="itempic">
                            </a>
                        </div>

                        <div class="item-title">

                            <div class="item-name">
                                <a href="#">
                                    <p class="item-basic-info">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                </a>
                            </div>
                            <div class="item-info">
                                <div class="info-little">
                                    <span>颜色：洛阳牡丹</span>
                                    <span>包装：裸装</span>
                                </div>
                                <div class="item-price">
                                    价格：<strong>19.88元</strong>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="item-comment">
                            <textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
                        </div>
                        <div class="filePic">
                            <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*" >
                            <span>晒照片(0/5)</span>
                            <img src="images/image.jpg" alt="">
                        </div>
                        <div class="item-opinion">
                            <li><i class="op1"></i>好评</li>
                            <li><i class="op2"></i>中评</li>
                            <li><i class="op3"></i>差评</li>
                        </div>
                    </div>

                    <!--多个商品评论-->
                    <div class="comment-list">
                        <div class="item-pic">
                            <a href="#" class="J_MakePoint">
                                <img src="images/comment.jpg_400x400.jpg" class="itempic">
                            </a>
                        </div>

                        <div class="item-title">

                            <div class="item-name">
                                <a href="#">
                                    <p class="item-basic-info">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                </a>
                            </div>
                            <div class="item-info">
                                <div class="info-little">
                                    <span>颜色：洛阳牡丹</span>
                                    <span>包装：裸装</span>
                                </div>
                                <div class="item-price">
                                    价格：<strong>19.88元</strong>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="item-comment">
                            <textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
                        </div>
                        <div class="filePic">
                            <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*" >
                            <span>晒照片(0/5)</span>
                            <img src="images/image.jpg" alt="">
                        </div>
                        <div class="item-opinion">
                            <li><i class="op1"></i>好评</li>
                            <li><i class="op2"></i>中评</li>
                            <li><i class="op3"></i>差评</li>
                        </div>
                    </div>

                    <div class="comment-list">
                        <div class="item-pic">
                            <a href="#" class="J_MakePoint">
                                <img src="images/comment.jpg_400x400.jpg" class="itempic">
                            </a>
                        </div>

                        <div class="item-title">

                            <div class="item-name">
                                <a href="#">
                                    <p class="item-basic-info">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</p>
                                </a>
                            </div>
                            <div class="item-info">
                                <div class="info-little">
                                    <span>颜色：洛阳牡丹</span>
                                    <span>包装：裸装</span>
                                </div>
                                <div class="item-price">
                                    价格：<strong>19.88元</strong>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="item-comment">
                            <textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！"></textarea>
                        </div>
                        <div class="filePic">
                            <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*" >
                            <span>晒照片(0/5)</span>
                            <img src="images/image.jpg" alt="">
                        </div>
                        <div class="item-opinion">
                            <li><i class="op1"></i>好评</li>
                            <li><i class="op2"></i>中评</li>
                            <li><i class="op3"></i>差评</li>
                        </div>
                    </div>
                    <div class="info-btn">
                        <div class="am-btn am-btn-danger">发表评论</div>
                    </div>
                    <script type="text/javascript">
                        $(document).ready(function() {
                            $(".comment-list .item-opinion li").click(function() {
                                $(this).prevAll().children('i').removeClass("active");
                                $(this).nextAll().children('i').removeClass("active");
                                $(this).children('i').addClass("active");

                            });
                        })
                    </script>



                </div>

            </div>

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
