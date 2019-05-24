<%--
  Created by IntelliJ IDEA.
  User: 施明
  Date: 2019/5/21
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${path}/layuiadmin/layui/css/layui.css" media="all">
     <link rel="stylesheet" href="${path}/layuiadmin/style/admin.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>
<!-- 隐藏表单 -->
<div id="editForm" style="display: none">
    <ins class="adsbygoogle"
         style="display: inline-block; width: 300px; height: 15px"
         data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>
    <form class="layui-form" action="" lay-filter="example">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">一级分类ID</label>
                <div class="layui-input-inline">
                    <input type="text" name="onelevelid" id="onelevelid" readonly="readonly" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">一级分类名</label>
                <div class="layui-input-inline">
                    <input type="text" name="onelevelname" id="onelevelname"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="oneLevelBtn">提交修改</button>
            </div>
        </div>
    </form>
</div>
<!-- 搜索框 -->
<div class="demoTable">
    一级分类名：
    <div class="layui-inline">
        <input class="layui-input" name="onelevelname" id="demoReload"
               autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>
</div>
<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
</script>

<script src="${path}/layuiadmin/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function() {
        var table = layui.table;

        table.render({
            elem: '#test'
            //  ,url:'/test/table/demo1.json'
            ,
            url: 'toOneLevelList' //模拟接口
            ,
            toolbar: '#toolbarDemo',
            title: '用户数据表',
            cols: [
                [
                    { type: 'checkbox', fixed: 'left' },
                    { field: 'onelevelid', width: 130, title: '一级分类ID', sort: true },
                    { field: 'onelevelname', width: 150, title: '一级分类名', sort: true },
                    { fixed: 'right', title: '操作', toolbar: '#barDemo', width: 100 }
                ]
            ],
            page: true
            ,id : 'testReload'
        });

        //头工具栏事件
        table.on('toolbar(test)', function(obj) {
            var checkStatus = table.checkStatus(obj.config.id);
//					switch(obj.event) {
//						case 'getCheckData':
//							var data = checkStatus.data;
//							layer.alert(JSON.stringify(data));
//							break;
//						case 'getCheckLength':
//							var data = checkStatus.data;
//							layer.msg('选中了：' + data.length + ' 个');
//							break;
//						case 'isAll':
//							layer.msg(checkStatus.isAll ? '全选' : '未全选');
//							break;
//					};
        });

        //监听行工具事件
        table.on('tool(test)', function(obj) {
            var data = obj.data;
           if(obj.event === 'edit') {
               $("#onelevelid").attr("value", data.onelevelid);
               $("#onelevelname").attr("value", data.onelevelname);
               var index1 = layer.open({
                   title:"修改订单",
                   skin:'layui-layer-rim',
                   type : 1,
                   content : $("#editForm"),
               });
               //只有加了这一句，表单的复选框，单选框才可以编辑
               layui.form.render();
               //监听提交
               layui.form.on('submit(oneLevelBtn)', function(data2) {
                   var d = data2.field;
                   if(d.onelevelname==""){
                       layer.alert("不能为空");
                   }else {
                   $.ajax({
                       type : "get",
                       url : "editOneLvelName",
                       data : d,
                       success : function(data) {
                           if (data.msg == "修改成功") {
                               layer.msg(data.msg, {
                                   time : 1000
                               }, function() {
                                   layer.close(index1);
                                   location.reload();
                               });
                           } else {
                               layer.msg(data.msg)
                           }
                       }
                   });
                   }
                   return false;
               });
            }
        });
//模糊查询
        var $ = layui.$, active = {
            reload : function() {
                var demoReload = $('#demoReload');
                //执行重载
                table.reload('testReload', {
                    page : {
                        curr : 1
                        //重新从第 1 页开始
                    },
                    where : {
                        content : demoReload.val(),
                    }
                });
            }
        };
        $('.demoTable .layui-btn').on('click', function() {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>

</body>

</html>