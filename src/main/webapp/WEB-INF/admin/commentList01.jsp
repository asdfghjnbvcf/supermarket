
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
    < <link rel="stylesheet" href="${path}/layuiadmin/style/admin.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>
<div class="demoTable">
    评论内容：
    <div class="layui-inline">
        <input class="layui-input" name="id" id="demoReload"
               autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>

    </div>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script src="${path}/layuiadmin/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function() {
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'listComment',
            toolbar: '#toolbarDemo',
            title: '评论列表',
            cols: [
                [
                    { type: 'checkbox', fixed: 'left' },
                    { field: 'commentid', title: '评论ID', sort: true },
                    { field: 'ordernum', title: '订单编号', sort: true },
                    { field: 'commentcontent', title: '评论内容' },
                    { field: 'commentpicture', title: '图片' },
                    { field: 'commenttime', title: '评论时间' },
                    { field: 'commentlevel',
                        title: '评论等级',
                        width:120,
                        templet:function(res){
                            //return res.userLevel == 1 ? "好评" : "差评"
                            if (res.commentlevel==0){
                                return "好评";
                            }
                            if (res.commentlevel==1){
                                return "中评";
                            }
                            if (res.commentlevel==2){
                                return "差评";
                            }
                        }
                    },
                    { fixed: 'right', title: '操作', toolbar: '#barDemo', width: 150 }
                ]

            ],
            page: true
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
            //console.log(obj)
            if(obj.event === 'del') {
                layer.confirm('真的删除行么', function(index) {
                    obj.del();
                    layer.close(index);
                });
            } else if(obj.event === 'edit') {
                layer.prompt({
                    formType: 2,
                    value: data.email
                }, function(value, index) {
                    obj.update({
                        email: value
                    });
                    layer.close(index);
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
                        /* key: {
                         id: demoReload.val()
                         } */

                        content : demoReload.val()
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
