<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/23
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:set var="userid" value="12"/>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="UTF-8">


    <link href="//w.kl.126.net/public/activity-web/css/index_dailyLimit_dailyLimit.d4917df3.css" rel="stylesheet">
    <title></title>
    <link href="${path}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${path}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="${path}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${path}/css/addstyle.css" rel="stylesheet" type="text/css">
    <style type="text/css">
        .m-captchamodal {}

        .m-captchamodal .desc {
            font-size: 16px;
            font-weight: bold;
            text-align: center;
            margin-bottom: 10px;
        }

        .m-captchamodal .captcha {}
    </style>
    <style type="text/css">
        .m-modalcontent {
            position: absolute;
            top: 50%;
            left: 50%;
            width: 500px;
            height: 320px;
            margin-top: -160px;
            margin-left: -250px;
            background: #fff;
            text-align: center;
            border-radius: 5px;
        }

        .m-modalcontent .toparea {
            position: relative;
            background: linear-gradient(90deg, #ff274b, #e31436);
            height: 120px;
            margin-bottom: 28px;
            border-top-left-radius: 5px;
            border-top-right-radius: 5px;
        }

        .m-modalcontent .toparea img {
            margin-top: 18px;
        }

        .m-modalcontent .toparea .close {
            position: absolute;
            top: 10px;
            right: 15px;
            display: inline-block;
            width: 12px;
            height: 13px;
            background: url('/images/search/redirect_close_icon.png');
            cursor: pointer;
        }

        .m-modalcontent .btn {
            display: inline-block;
            margin: 28px 0 40px;
            background: #ee1b3e;
            height: 50px;
            line-height: 50px;
            width: 340px;
            text-align: center;
            color: #fff;
            font-size: 20px;
            cursor: pointer;
            border-radius: 4px;
        }

        .m-modalcontent p {
            color: #333;
            font-size: 18px;
            line-height: 26px;
        }

        .m-modalcontent p .key {
            color: #ee1b3e;
        }
    </style>
    <style type="text/css">
        #YSF-BTN-HOLDER {
            position: fixed;
            max-width: 30px;
            max-height: 120px;
            right: 30px;
            bottom: 24px;
            cursor: pointer;
            overflow: visible;
            filter: alpha(opacity=100);
            opacity: 1;
            z-index: 9990
        }

        #YSF-BTN-HOLDER:hover {
            filter: alpha(opacity=95);
            opacity: .95
        }

        #YSF-BTN-HOLDER img {
            display: block;
            overflow: hidden;
        }

        #YSF-BTN-CIRCLE {
            display: none;
            position: absolute;
            right: -5px;
            top: -6px;
            width: auto;
            min-width: 12px;
            height: 20px;
            padding: 0 4px;
            background-color: #f00;
            font-size: 12px;
            line-height: 20px;
            color: #fff;
            text-align: center;
            white-space: nowrap;
            font-family: sans-serif;
            border-radius: 10px;
            z-index: 1;
        }

        #YSF-BTN-BUBBLE {
            display: none;
            position: absolute;
            left: -274px;
            bottom: -15px;
            width: 278px;
            height: 80px;
            box-sizing: border-box;
            padding: 14px 22px;
            filter: alpha(opacity=100);
            opacity: 1;
            background: url(https://cs.kaola.com/sdk//res/img/sdk/bg_floatMsg2x.png) no-repeat;
            background: url(https://cs.kaola.com/sdk//res/img/sdk/bg_floatMsg.png);
            background-size: 278px 80px;
            z-index: 1;
        }

        #YSF-BTN-HOLDER.layer-6 {
            bottom: 0;
        }

        #YSF-BTN-HOLDER.layer-1 #YSF-BTN-BUBBLE {
            top: 0
        }

        #YSF-BTN-HOLDER.layer-6 #YSF-BTN-BUBBLE {
            bottom: -6px;
        }

        #YSF-BTN-BUBBLE:hover {
            filter: alpha(opacity=95);
            opacity: .95
        }

        #YSF-BTN-CONTENT {
            height: 45px;
            padding: 0;
            white-space: normal;
            word-break: break-all;
            text-align: left;
            font-size: 14px;
            line-height: 1.6;
            color: #222;
            overflow: hidden;
            z-index: 0;
        }

        #YSF-BTN-ARROW {
            display: none;
        }

        #YSF-BTN-CLOSE {
            position: absolute;
            width: 15px;
            height: 15px;
            right: 4px;
            top: -3px;
            filter: alpha(opacity=90);
            opacity: .9;
            cursor: pointer;
            background: url(https://cs.kaola.com/sdk//res/img/sdk/btn-close.png) no-repeat;
            z-index: 1
        }

        #YSF-BTN-CLOSE:hover {
            filter: alpha(opacity=100);
            opacity: 1;
        }

        #YSF-PANEL-CORPINFO.ysf-chat-layeropen {
            width: 511px;
            height: 470px;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, .15);
        }

        #YSF-PANEL-CORPINFO {
            position: fixed;
            bottom: 0px;
            right: 20px;
            width: 0;
            height: 0;
            z-index: 99999;
        }

        #YSF-PANEL-INFO.ysf-chat-layeropen {
            width: 311px;
            height: 470px;
            filter: alpha(opacity=100);
            opacity: 1;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, .15);
        }

        #YSF-PANEL-INFO {
            position: fixed;
            bottom: 0px;
            right: 20px;
            width: 0px;
            height: 0px;
            filter: alpha(opacity=0);
            opacity: 0;
            z-index: 99999;
        }

        #YSF-PANEL-INFO .u-btn {
            background-color: #F96868
        }

        #YSF-CUSTOM-ENTRY {
            background-color: #F96868;
        }

        #YSF-CUSTOM-ENTRY-0 {
            position: relative;
            width: auto;
            background-color: #F96868;
            box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
        }

        #YSF-CUSTOM-ENTRY-1 {
            position: relative;
            width: auto;
            background-color: #F96868;
            border-radius: 14px;
            box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
        }

        #YSF-CUSTOM-ENTRY-2 {
            position: relative;
            width: auto;
            background-color: #F96868;
            border-radius: 0;
            box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
        }

        #YSF-CUSTOM-ENTRY-3 {
            position: relative;
            width: auto;
            background-color: #F96868;
            border-radius: 50%;
            box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
        }

        #YSF-CUSTOM-ENTRY-4 {
            position: relative;
            width: auto;
            background-color: #F96868;
            border-radius: 50%;
            box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
        }

        #YSF-CUSTOM-ENTRY-5 {
            position: relative;
            width: auto;
            background-color: #F96868;
            border-radius: 5px;
            box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
        }

        #YSF-CUSTOM-ENTRY-6 {
            position: relative;
            width: auto;
            background-color: #F96868;
            border-radius: 5px;
            border-bottom-left-radius: 0;
            border-bottom-right-radius: 0;
        }

        #YSF-CUSTOM-ENTRY-0 img {
            max-width: 300px;
            height: auto;
        }

        #YSF-CUSTOM-ENTRY-1 img {
            width: 28px;
            height: auto;
        }

        #YSF-CUSTOM-ENTRY-2 img {
            width: 58px;
            height: auto;
        }

        #YSF-CUSTOM-ENTRY-3 img {
            width: 60px;
            height: auto;
        }

        #YSF-CUSTOM-ENTRY-4 img {
            width: 60px;
            height: auto;
        }

        #YSF-CUSTOM-ENTRY-5 img {
            width: 60px;
            height: auto;
        }

        #YSF-CUSTOM-ENTRY-6 img {
            width: 115px;
            height: auto;
        }

        #YSF-IFRAME-LAYER {
            border: 0;
            outline: none;
        }

        .ysf-online-invite-wrap {
            z-index: 10001;
            position: fixed;
            _position: absolute;
            top: 50%;
            left: 50%;
        }

        .ysf-online-invite {
            position: relative;
            top: -50%;
            left: -50%;
            cursor: pointer;
        }

        .ysf-online-invite img {
            display: block;
            width: 250px;
        }

        .ysf-online-invite .ysf-online-invite-img {
            width: 100%;
            height: 100%
        }

        .ysf-online-invite .text {
            position: absolute;
            top: -11px;
            left: 0;
            right: 0;
            overflow: hidden;
            margin: 36px 20px 0 67px;
            line-height: 140%;
            color: #526069;
            font-size: 14px;
            font-family: "Microsoft YaHei", "微软雅黑", tahoma, arial, simsun, "宋体";
            text-align: left;
            white-space: normal;
            word-wrap: break-word;
        }

        .ysf-online-invite .close {
            position: absolute;
            top: -6px;
            right: -6px;
            width: 32px;
            height: 32px;
            background: url(https://cs.kaola.com/sdk/res/img/invite-close.png) no-repeat;
            cursor: pointer;
        }

        .ysf-online-invite .close.custom {
            top: -16px;
            right: -16px;
        }

        #YSF-PANEL-MOBILE {
            background: rgba(46, 47, 49, 0.7);
            position: fixed;
            bottom: 0px;
            right: 0px;
            width: 100%;
            height: 0px;
            transition-property: height, bottom;
            transition-duration: 0.3s;
            transition-timing-function: ease;
            transition-delay: 0s;
            z-index: 9999;
        }

        #YSF-PANEL-MOBILE.ysf-chat-layeropen {
            width: 100%;
            height: 100%;
            transition-property: height, bottom;
            transition-duration: 0.3s;
            transition-timing-function: ease;
            transition-delay: 0s;
        }

        #YSF-IFRAME-LAYER.ysf-chat-mobile-layeropen {
            height: 90% !important;
            transition-property: height, bottom;
            transition-duration: 0.3s;
            transition-timing-function: ease;
            transition-delay: 0s;
        }

        #YSF-IFRAME-LAYER {
            position: absolute;
            bottom: 0px;
            left: 0;
            right: 0px;
            width: 0px;
            height: 0px;
            transition-property: height, bottom;
            transition-duration: 0.3s;
            transition-timing-function: ease;
            transition-delay: 0s;
            z-index: 9999;
        }

        .YSF-PANEL-BODY-FIXED {
            position: fixed;
            left: 0;
            right: 0;
        }
    </style>
    <script src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945185758/?random=1558514139349&amp;cv=9&amp;fst=1558514139349&amp;num=1&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=2&amp;u_tz=480&amp;u_java=false&amp;u_nplug=3&amp;u_nmime=4&amp;gtm=2wg5f2&amp;sendb=1&amp;frm=0&amp;url=https%3A%2F%2Factivity.kaola.com%2Factivity%2FflashSaleIndex%2Fshow.html%3Fnavindex%3D2%26zn%3Dtop&amp;tiba=%E4%BB%8A%E6%97%A5%E9%99%90%E6%97%B6%E8%B4%AD-%E7%BD%91%E6%98%93%E8%80%83%E6%8B%89&amp;async=1&amp;rfmt=3&amp;fmt=4"></script>

</head>
<body>
<!--头 -->
<header>
    <article>
        <div class="mt-logo">
            <!--头 -->
            <header>
                <jsp:include page="header.jsp"></jsp:include>
            </header>
        </div>
    </article>
</header>
<!-- 今日限时购主体 -->
<div class="body">
    <!-- ！整理数据！ -->
    <!-- tab数，用于计算宽度 -->
    <!-- 选中的标签的id -->
    <!-- 选中的标签的index -->
    <!-- 选中的标签的status -->
    <div style="display: none"> 20190521114605072FlashSale719869403ing13120871 </div>
    <!-- ！页面结构！ -->
    <!-- 头部 -->
    <header class="m-header">
        <a class="link" href="#" target="_blank" title="今日秒杀"><i class="icon"></i> <span class="bigText">今日秒杀</span> </a> <b class="smallText" id="smallTextID"></b> <span id="js_cd" class="bigText"></span> </header>
    <!-- 各个时间段导航tab -->
    <nav id="tabNav" class="m-nav f-cb" style="position: absolute; top: 80px;">
        <div id="tabWrap" class="tabWrap f-cb">

        </div>
    </nav>
    <!-- 轮播区域 -->
    <article class="topBgWrap clearfix">
        <div class="imgBox">
            <!--图片轮换-->
        </div>
    </article>
    <!-- 特卖专区 regular实现-->

    <article id="goodsList" class="m-goodslist lineOfFour" style="height: 500px;">
        <section class="goodsWrap f-cb" id="showGoodsList">
            <!-- 商品列表 regular实现-->
        </section>
        <!--Regular if3-->
        <!--Regular if4-->
    </article>
    <!--
    <article class="m-dlBottomBtn">
        <a class="prev btn " href="javascript:;"><b class="iconfont icon-arrow-left"></b>上一场</a>
        <a class="next btn " href="javascript:;">下一场<b class="iconfont icon-arrow-right"></b></a>

        <a class="tomorrow btn f-dn" href="javascript:;">明日预告<b class="iconfont icon-arrow-right"></b></a>

    </article>
    -->
    <!-- 页面底部按钮 regular实现-->
</div>
<!-- 今日限时购主体 END -->
<a class="m-totop" id="j-go2Top" href="#" style="display:none;"><i class="iconfont"></i>返回顶部</a>

<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script >
    <!--页面加载时调用-->
    $(function () {
        todayFalshSale()
    })
    //  获取今日秒杀活动时间
    function todayFalshSale() {
        $.ajax({
            url:"/flashSale.action/todayFlashSale",
            type:"GET",
            success:function (data) {
                if(data.code==0){//有活动数据
                    showtodayFlashSale(data.data);
                }else{//没有活动数据，返回错误信息
                    alert(data.msg);
                }
            },
            error:function () {
                alert("客户端请求有误");
            }
        });
    }
//**********活动时间数据展示********
//starSignId 标记上次展示的活动ID
    var starSignId =-1;

    function showtodayFlashSale(data) {
        var downTime = 0;//倒计时
        var sign = 0;//1:本场还剩多少时间；2：倒计时；0：不显示
        //清空原始数据
        $('#tabWrap').empty();
        $.each(data,function (i) {
            var starda = parseInt(data[i].flashstarttime);
            var endda = parseInt(data[i].flashendtime);
            starda = new Date(starda);
            var starhh = starda.getHours();
            var starmm = starda.getMinutes();
            endda = new Date(endda);
            var endhh = endda.getHours();
            var endmm = endda.getMinutes();
            var tim = starhh+":"+starmm;
            var systemda = new Date().getTime();//系统当前时间
            if(systemda >= starda &&  systemda< endda  ){//秒杀进行中
                sign = 1;
                downTime = endda - systemda;
                //在秒杀中本次的ID与上次秒杀进行中的ID不一致时调用
                if( starSignId !=data[i].flashsaleid){
                    starSignId = data[i].flashsaleid;
                    showGoods(starSignId,1,0);
                }
                 $('#tabWrap').append('<a class="tab f-ing f-select" style="width: 180.5px" href="javascript:showGoods('+data[i].flashsaleid+',1,0);"    id="flashsale_"'+data[i].flashsaleid+'>'+
                    '<b class="time">'+starhh+":"+ starmm+"&nbsp;-&nbsp;"+endhh+":"+endmm+'<i>秒杀中</i></b> </a>');
            }else if(systemda<starda){//秒杀还未开始
                if(sign == 0){
                    sign = 2;
                    downTime =  starda-systemda;
                    if( starSignId !=data[i].flashsaleid){
                        starSignId = data[i].flashsaleid;
                        showGoods(starSignId,2,tim);
                    }
                }

                $('#tabWrap').append('<a class="tab f-soon" style="width: 180.5px" href="javascript:showGoods('+data[i].flashsaleid+',0,\''+tim+'\');"     id="flashsale_"'+data[i].flashsaleid+'>'+
                '<b class="time">'+starhh+":"+ starmm+"&nbsp;-&nbsp;"+endhh+":"+endmm+'</b><b class="status">即将开始</b> </a>');
            }else{//秒杀已结束
                $('#tabWrap').append('<a class="tab f-started" style="width: 180.5px" href="javascript:showGoods('+data[i].flashsaleid+',2,0);"   id="flashsale_"'+data[i].flashsaleid+'>'+
                    '<b class="time">'+starhh+":"+ starmm+"&nbsp;-&nbsp;"+endhh+":"+endmm+'</b><b class="status">已结束</b> </a>');
                if(i==(data.length-1)){
                    if( starSignId !=data[i].flashsaleid){
                        starSignId = data[i].flashsaleid;
                        showGoods(starSignId,0,0);
                    }
                }
            }
        })
        //倒计时函数模块
        countDownTime(sign,downTime,data);
    }

    //*************倒计时模块**************
    function countDownTime(sign,downTime,data) {
        $("#smallTextID").empty()
        $("#js_cd").empty()
        var hh = 0 ;
        var mm = 0 ;
        var ss = 0 ;
        var time ="";
        if(downTime >=0){
            hh = parseInt(downTime /1000/3600);
            mm = parseInt((downTime-hh*1000*3600)/1000/60);
            ss = parseInt((downTime-hh*1000*3600-mm*1000*60)/1000);
            var h = ""+hh;
            var m = ""+mm;
            var s = ""+ss;
            if(h.length<=1){
                h = "0"+h;
            }
            if(m.length<=1){
                m = "0"+m;
            }
            if(s.length<=1){
                s = "0"+s;
            }
            time=h+":"+m+":"+s;
        }
        if(sign == 1){//正在抢购中

            $("#smallTextID").append("本场还剩");
            $("#js_cd").append(time);
            //alert(time);
        }else if(sign == 2){
            $("#smallTextID").append("倒计时");
            $("#js_cd").append(time);
        }

        setTimeout(function () {
            showtodayFlashSale(data);
        },1000);
    }
    //************Ajax请求秒杀商品*******************
    //flashsaleid:活动ID号
    // state：活动状态（2未开始，1进行中，0已结束）
    function showGoods(flashSaleId,state,starda) {
     // alert(flashsaleid+"::"+state+"::"+starda)
        $.ajax({
            url:"/flashgoods.action/showFlashGoodsByFlashSaleId",
            type:"GET",
            data:{
                flashSaleId :flashSaleId
            },
            success:function (data) {
              //  alert(data)
                if(data.code==0){//有活动数据
                    $("#showGoodsList").empty();
                    showGoodsMessage(data.data,state,starda)
                    //alert(data.data);
                   // showtodayFlashSale(data.data);
                }else{//没有活动数据，返回错误信息
                    alert(data.msg);
                }
            },
            error:function () {
                alert("客户端请求有误");
            }
        });
    }
    //**************商品展示******************
    function showGoodsMessage(data,sign,starda) {
        $("#showGoodsList").empty();

            if(sign == 0){//即将开始
                $.each(data,function (i) {
                    $("#showGoodsList").append('<div class="detailWrap f-cb">'+
                    '<a class="pic clickButton" href="javascript:;" content="0"  name="'+data[i].flashgoodsid+'" title="'+data[i].goodstitle+'" data-param="zn=list&amp;zp=5&amp;zt=product&amp;st=2">'+
                    '<img class="proImg img-lazyload img-lazyloaded" src="'+data[i].pictureurl+'?imageView&amp;thumbnail=360x360&amp;quality=85"  alt="'+data[i].goodstitle+'" title="'+data[i].goodstitle+'" >'+
                    '<span class="start-hint">将于今日 '+starda+'正式开抢</span>'+
                    '</a>'+
                    '<div class="proinfo">'+
                    '<h3 class="tit">'+
                    '<a class="titLink clickButton"  content="0" name="'+data[i].flashgoodsid+'"  href="javascript:;" title="'+data[i].goodsname+'" data-param="zn=list&amp;zp=5&amp;zt=product&amp;st=2">'+data[i].goodsname+'</a>'+
                    '</h3>'+
                    '<div class="act f-cb act-blue">'+
                    '<span class="yen">¥</span>'+
                    '<b class="money">'+data[i].flashgoodsprice+'</b>'+
                    '<span class="box-marketprice"><del class="marketprice">¥'+data[i].goodsprice+'</del></span>'+
                    '<a class="btn clickButton" content="0" href="javascript:;"  name="'+data[i].flashgoodsid+'"  data-param="zn=list&amp;zp=5&amp;zt=product&amp;st=2">即将开始</a>'+
                    '</div>'+
                    '<p class="status-desc blue">限量'+data[i].stocknum+'件</p>'+
                    '</div>'+
                    '</div>');
                })
            }else if(sign == 1){//秒杀进行中
                $.each(data,function (i) {
                  //  alert(data);
                    $("#showGoodsList").append('<div class="detailWrap f-cb">'+
                    '<a class="pic clickButton" content="1"  name="'+data[i].flashgoodsid+'"  href="javascript:;"  title="'+data[i].goodstitle+'" data-param="zn=list&amp;zp=2&amp;zt=product&amp;st=1">'+
                    '<img class="proImg img-lazyload img-lazyloaded" src="'+data[i].pictureurl+'?imageView&amp;thumbnail=360x360&amp;quality=85"  alt="'+data[i].goodstitle+'" title="'+data[i].goodstitle+'" >'+
                     '</a>'+
                    '<div class="proinfo">'+
                    '<h3 class="tit">'+
                    '<a class="titLink clickButton"  content="1" name="'+data[i].flashgoodsid+'"   href="javascript:;" title="'+data[i].goodsname+'" data-param="zn=list&amp;zp=2&amp;zt=product&amp;st=1">'+data[i].goodsname+'</a>'+
                    '</h3>'+
                    '<div class="act f-cb">'+
                    '<span class="yen">¥</span>'+
                    '<b class="money">'+data[i].flashgoodsprice+'</b>'+
                    '<span class="box-marketprice"><del class="marketprice">¥'+data[i].goodsprice+'</del></span>'+
                    '<a class="btn clickButton" content="1" href="javascript:;" name="'+data[i].flashgoodsid+'"  data-param="zn=list&amp;zp=2&amp;zt=product&amp;st=1">去抢购</a>'+
                    '</div>'+
                    '<div class="dlprogress f-cb">'+
                    '<div class="barWrap">'+
                    '<div class="bar" style="width:'+parseInt((data[i].sellnum/data[i].stocknum)*100)+' %;"></div>'+
                    '</div>'+
                    '<div class="remain"><span class="txt-remain">已售'+parseInt((data[i].sellnum/data[i].stocknum)*100)+'%</span></div>'+
                    '</div>'+
                    '</div>'+
                    '</div>');
                })
            }else{//秒杀结束
                $.each(data,function (i) {
                    $("#showGoodsList").append('<div class="detailWrap f-cb">'+
                        '<a class="pic clickButton" content="2"  name="'+data[i].flashgoodsid+'"  href="javascript:;"  title="'+data[i].goodstitle+'" data-param="zn=list&amp;zp=2&amp;zt=product&amp;st=1">'+
                        '<img class="proImg img-lazyload img-lazyloaded" src="'+data[i].pictureurl+'?imageView&amp;thumbnail=360x360&amp;quality=85"  alt="'+data[i].goodstitle+'" title="'+data[i].goodstitle+'" >'+
                        '</a>'+
                        '<div class="proinfo">'+
                        '<h3 class="tit">'+
                        '<a class="titLink" content="2"  name="'+data[i].flashgoodsid+'"   href="javascript:;" title="'+data[i].goodsname+'" data-param="zn=list&amp;zp=5&amp;zt=product&amp;st=2">'+data[i].goodsname+'</a>'+
                        '</h3>'+
                        '<div class="act f-cb act-blue">'+
                        '<span class="yen">¥</span>'+
                        '<b class="money">'+data[i].flashgoodsprice+'</b>'+
                        '<span class="box-marketprice"><del class="marketprice">¥'+data[i].goodsprice+'</del></span>'+
                        '<p class="status-desc blue">销量'+data[i].sellnum+'件</p>'+
                        '</div>'+
                        '</div>'+
                        '</div>');
                })
            }

    }
    //***********判断用户是否登录******************
    $(document).on("click",".clickButton",function () {
        var userId = "${userid}";
        if(userId=="") {
            alert("为了不影响你的抢购，请先登录")
            window.location.href="login";
        }else{
           var goodsid = $(this).attr("name");
           var content = $(this).attr("content");
           if(content==0){//即将开始
               alert("该商品的秒杀活动即将开始，请耐心等待");
           }else if(content==1){//秒杀中
                //跳转到秒杀详情页
               window.location.href="flashIntroduction?flashGoodsId="+goodsid;
           }else {//已结束
                alert("该商品的秒杀活动已结束");
           }

        }
    })

</script>

</body>
</html>
