<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="home.html" target="_top" class="h">商城首页</a></div>
        </div>
        <c:if test="${ empty user && user eq null}">
            <div class="topMessage">
                <div class="menu-hd">
                    <a href="login.html" target="_top" class="h">亲，请登录</a>
                    <a href="register.html" target="_top">免费注册</a>
                </div>
            </div>
        </c:if>
        <c:if test="${not empty user && !(user eq null)}">
            <div class="topMessage my-shangcheng">
                <div class="menu-hd MyShangcheng"><i class="am-icon-user am-icon-fw"></i>欢迎您：${user.username} &nbsp;用户
                </div>
            </div>
            <div class="topMessage my-shangcheng">
                <div class="menu-hd MyShangcheng"><a href="index.html" target="_top"><i
                        class="am-icon-user am-icon-fw"></i>个人中心</a></div>
            </div>
            <div class="topMessage mini-cart">
                <div class="menu-hd"><a id="mc-menu-hd" href="shopcart.html" target="_top"><i
                        class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum"
                                                                                              class="h">0</strong></a>
                </div>
            </div>
            <div class="topMessage favorite">
                <div class="menu-hd"><a href="collection.html" target="_top"><i
                        class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
            </div>
        </c:if>
    </ul>
</div>

<!--悬浮搜索框-->

<div class="nav white">
    <%--<div class="logo"><img src="${path}/images/logo.png"/></div>--%>
    <div class="logoBig">
        <li><img src="${path}/images/logo.png"/></li>
    </div>

    <div class="search-bar pr">
        <a name="index_none_header_sysc" href="#"></a>
        <form>
            <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
            <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
        </form>
    </div>
</div>

<div class="clear"></div>

</html>
