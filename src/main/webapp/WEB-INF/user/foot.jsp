<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/21
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>我的足迹</title>

    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${path}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${path}/css/footstyle.css" rel="stylesheet" type="text/css">

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

            <div class="user-foot">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">我的足迹</strong> / <small>Browser&nbsp;History</small></div>
                </div>
                <hr/>

                <!--足迹列表 -->

                <div class="goods">
                    <div class="goods-date" data-date="2015-12-21">
                        <span><i class="month-lite">12</i>.<i class="day-lite">21</i><i class="date-desc">今天</i></span>
                        <del class="am-icon-trash"></del>
                        <s class="line"></s>
                    </div>

                    <div class="goods-box first-box">
                        <div class="goods-pic">
                            <div class="goods-pic-box">
                                <a class="goods-pic-link" target="_blank" href="#" title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品">
                                    <img src="images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
                            </div>
                            <a class="goods-delete" href="javascript:void(0);"><i class="am-icon-trash"></i></a>
                            <div class="goods-status goods-status-show"><span class="desc">宝贝已下架</span></div>
                        </div>

                        <div class="goods-attr">
                            <div class="good-title">
                                <a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒  进口巧克力食品</a>
                            </div>
                            <div class="goods-price">
										<span class="g_price">
                                        <span>¥</span><strong>71</strong>
										</span>
                                <span class="g_price g_price-original">
                                        <span>¥</span><strong>142</strong>
										</span>
                            </div>
                            <div class="clear"></div>
                            <div class="goods-num">
                                <div class="match-recom">
                                    <a href="#" class="match-recom-item">找相似</a>
                                    <a href="#" class="match-recom-item">找搭配</a>
                                    <i><em></em><span></span></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="goods">
                    <div class="goods-date" data-date="2015-12-21">
                        <s class="line"></s>
                    </div>

                    <div class="goods-box">
                        <div class="goods-pic">
                            <div class="goods-pic-box">
                                <a class="goods-pic-link" target="_blank" href="#" title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品">
                                    <img src="images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
                            </div>
                            <a class="goods-delete" href="javascript:void(0);"><i class="am-icon-trash"></i></a>
                            <div class="goods-status goods-status-show"><span class="desc">宝贝已下架</span></div>
                        </div>

                        <div class="goods-attr">
                            <div class="good-title">
                                <a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒  进口巧克力食品</a>
                            </div>
                            <div class="goods-price">
										<span class="g_price">
                                        <span>¥</span><strong>71</strong>
										</span>
                                <span class="g_price g_price-original">
                                        <span>¥</span><strong>142</strong>
										</span>
                            </div>
                            <div class="clear"></div>
                            <div class="goods-num">
                                <div class="match-recom">
                                    <a href="#" class="match-recom-item">找相似</a>
                                    <a href="#" class="match-recom-item">找搭配</a>
                                    <i><em></em><span></span></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="goods">
                    <div class="goods-date" data-date="2015-12-21">
                        <s class="line"></s>
                    </div>

                    <div class="goods-box">
                        <div class="goods-pic">
                            <div class="goods-pic-box">
                                <a class="goods-pic-link" target="_blank" href="#" title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品">
                                    <img src="images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
                            </div>
                            <a class="goods-delete" href="javascript:void(0);"><i class="am-icon-trash"></i></a>
                            <div class="goods-status goods-status-show"><span class="desc">宝贝已下架</span></div>
                        </div>

                        <div class="goods-attr">
                            <div class="good-title">
                                <a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒  进口巧克力食品</a>
                            </div>
                            <div class="goods-price">
										<span class="g_price">
                                        <span>¥</span><strong>71</strong>
										</span>
                                <span class="g_price g_price-original">
                                        <span>¥</span><strong>142</strong>
										</span>
                            </div>
                            <div class="clear"></div>
                            <div class="goods-num">
                                <div class="match-recom">
                                    <a href="#" class="match-recom-item">找相似</a>
                                    <a href="#" class="match-recom-item">找搭配</a>
                                    <i><em></em><span></span></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="goods">
                    <div class="goods-date" data-date="2015-12-21">
                        <s class="line"></s>
                    </div>

                    <div class="goods-box">
                        <div class="goods-pic">
                            <div class="goods-pic-box">
                                <a class="goods-pic-link" target="_blank" href="#" title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品">
                                    <img src="images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
                            </div>
                            <a class="goods-delete" href="javascript:void(0);"><i class="am-icon-trash"></i></a>
                            <div class="goods-status goods-status-show"><span class="desc">宝贝已下架</span></div>
                        </div>

                        <div class="goods-attr">
                            <div class="good-title">
                                <a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒  进口巧克力食品</a>
                            </div>
                            <div class="goods-price">
										<span class="g_price">
                                        <span>¥</span><strong>71</strong>
										</span>
                                <span class="g_price g_price-original">
                                        <span>¥</span><strong>142</strong>
										</span>
                            </div>
                            <div class="clear"></div>
                            <div class="goods-num">
                                <div class="match-recom">
                                    <a href="#" class="match-recom-item">找相似</a>
                                    <a href="#" class="match-recom-item">找搭配</a>
                                    <i><em></em><span></span></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="goods">
                    <div class="goods-date" data-date="2015-12-21">
                        <s class="line"></s>
                    </div>

                    <div class="goods-box">
                        <div class="goods-pic">
                            <div class="goods-pic-box">
                                <a class="goods-pic-link" target="_blank" href="#" title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品">
                                    <img src="images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
                            </div>
                            <a class="goods-delete" href="javascript:void(0);"><i class="am-icon-trash"></i></a>
                            <div class="goods-status goods-status-show"><span class="desc">宝贝已下架</span></div>
                        </div>

                        <div class="goods-attr">
                            <div class="good-title">
                                <a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒  进口巧克力食品</a>
                            </div>
                            <div class="goods-price">
										<span class="g_price">
                                        <span>¥</span><strong>71</strong>
										</span>
                                <span class="g_price g_price-original">
                                        <span>¥</span><strong>142</strong>
										</span>
                            </div>
                            <div class="clear"></div>
                            <div class="goods-num">
                                <div class="match-recom">
                                    <a href="#" class="match-recom-item">找相似</a>
                                    <a href="#" class="match-recom-item">找搭配</a>
                                    <i><em></em><span></span></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
                <div class="goods">
                    <div class="goods-date" data-date="2015-12-17">
                        <span><i class="month-lite"></i><i class="day-lite"></i>	<i class="date-desc">一周内</i></span>
                        <del class="am-icon-trash"></del>
                        <s class="line"></s>
                    </div>
                    <div class="goods-box">
                        <div class="goods-pic">
                            <div class="goods-pic-box">
                                <a class="goods-pic-link" target="_blank" href="#" title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品">
                                    <img src="images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
                            </div>
                            <a class="goods-delete" href="javascript:void(0);"><i class="am-icon-trash"></i></a>
                            <div class="goods-status goods-status-show"><span class="desc">宝贝已下架</span></div>
                        </div>

                        <div class="goods-attr">
                            <div class="good-title">
                                <a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒  进口巧克力食品</a>
                            </div>
                            <div class="goods-price">
										<span class="g_price">
                                        <span>¥</span><strong>71</strong>
										</span>
                                <span class="g_price g_price-original">
                                        <span>¥</span><strong>142</strong>
										</span>
                            </div>
                            <div class="clear"></div>
                            <div class="goods-num">
                                <div class="match-recom">
                                    <a href="#" class="match-recom-item">找相似</a>
                                    <a href="#" class="match-recom-item">找搭配</a>
                                    <i><em></em><span></span></i>
                                </div>
                            </div>
                        </div>
                    </div>
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
