<%--
  Created by IntelliJ IDEA.
  User: 施明
  Date: 2019/5/21
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <title>layuiAdmin 主页示例模板二</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${path}/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${path}/layuiadmin/style/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">

        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">
                    访问量
                    <span class="layui-badge layui-bg-blue layuiadmin-badge">周</span>
                </div>
                <div class="layui-card-body layuiadmin-card-list">
                    <p class="layuiadmin-big-font">9,999,666</p>
                    <p>
                        总计访问量
                        <span class="layuiadmin-span-color">88万 <i class="layui-inline layui-icon layui-icon-flag"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">
                    下单
                    <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span>
                </div>
                <div class="layui-card-body layuiadmin-card-list">
                    <p class="layuiadmin-big-font">33,555</p>
                    <p>
                        新下单
                        <span class="layuiadmin-span-color">10% <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">
                    收入
                    <span class="layui-badge layui-bg-green layuiadmin-badge">年</span>
                </div>
                <div class="layui-card-body layuiadmin-card-list">

                    <p class="layuiadmin-big-font">999,666</p>
                    <p>
                        总收入
                        <span class="layuiadmin-span-color">*** <i class="layui-inline layui-icon layui-icon-dollar"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">
                    月收入
                    <span class="layui-badge layui-bg-orange layuiadmin-badge">月</span>
                </div>
                <div class="layui-card-body layuiadmin-card-list">

                    <p class="layuiadmin-big-font">66,666</p>
                    <p>
                        最近一个月
                        <span class="layuiadmin-span-color">15% <i class="layui-inline layui-icon layui-icon-user"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm12">
            <div class="layui-card">
                <div class="layui-card-header">
                    访问量
                    <div class="layui-btn-group layuiadmin-btn-group">
                        <a href="javascript:;" class="layui-btn layui-btn-primary layui-btn-xs">去年</a>
                        <a href="javascript:;" class="layui-btn layui-btn-primary layui-btn-xs">今年</a>
                    </div>
                </div>
                <div class="layui-card-body">
                    <div class="layui-row">
                        <div class="layui-col-sm8">
                            <div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-pagetwo">
                                <div carousel-item id="LAY-index-pagetwo">
                                    <div><i class="layui-icon layui-icon-loading1 layadmin-loading"></i></div>
                                </div>
                            </div>
                        </div>
                        <div class="layui-col-sm4">
                            <div class="layuiadmin-card-list">
                                <p class="layuiadmin-normal-font">月访问数</p>
                                <span>同上期增长</span>
                                <div class="layui-progress layui-progress-big" lay-showPercent="yes">
                                    <div class="layui-progress-bar" lay-percent="30%"></div>
                                </div>
                            </div>
                            <div class="layuiadmin-card-list">
                                <p class="layuiadmin-normal-font">月下载数</p>
                                <span>同上期增长</span>
                                <div class="layui-progress layui-progress-big" lay-showPercent="yes">
                                    <div class="layui-progress-bar" lay-percent="20%"></div>
                                </div>
                            </div>
                            <div class="layuiadmin-card-list">
                                <p class="layuiadmin-normal-font">月收入</p>
                                <span>同上期增长</span>
                                <div class="layui-progress layui-progress-big" lay-showPercent="yes">
                                    <div class="layui-progress-bar" lay-percent="25%"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="layui-col-sm8">
            <div class="layui-row layui-col-space15">


                <div class="layui-col-sm12">
                    <div class="layui-card">
                        <div class="layui-card-header">用户全国分布</div>
                        <div class="layui-card-body">
                            <div class="layui-row layui-col-space15">
                                <div class="layui-col-sm4">
                                    <table class="layui-table layuiadmin-page-table" lay-skin="line">
                                        <thead>
                                        <tr>
                                            <th>排名</th>
                                            <th>地区</th>
                                            <th>人数</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>浙江</td>
                                            <td>62310</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>上海</td>
                                            <td>59190</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>广东</td>
                                            <td>55891</td>
                                        </tr>
                                        <tr>
                                            <td>4</td>
                                            <td>北京</td>
                                            <td>51919</td>
                                        </tr>
                                        <tr>
                                            <td>5</td>
                                            <td>山东</td>
                                            <td>39231</td>
                                        </tr>
                                        <tr>
                                            <td>6</td>
                                            <td>湖北</td>
                                            <td>37109</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="layui-col-sm8">

                                    <div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-pagethree">
                                        <div carousel-item id="LAY-index-pagethree">
                                            <div><i class="layui-icon layui-icon-loading1 layadmin-loading"></i></div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
</div>

<script src="${path}/layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'sample']);
</script>
</body>
</html>