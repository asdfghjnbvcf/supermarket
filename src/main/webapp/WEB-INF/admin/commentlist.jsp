
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
    <!--  <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">-->
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>
<div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">评论ID</label>
        <div class="layui-input-block">
            <input type="text" name="commentId" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">房间编号</label>
        <div class="layui-input-block">
            <input type="text" name="roomNo" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <button class="layui-btn layuiadmin-btn-useradmin" lay-submit lay-filter="LAY-user-front-search">
            <i class="layui-icon layui-icon-search layuiadmin-button-btn"></i>
        </button>
    </div>
</div>
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
            //  ,url:'/test/table/demo1.json'
            ,
            url: 'layuiadmin/json/useradmin/webcomment.js' //模拟接口
            ,
            toolbar: '#toolbarDemo',
            title: '用户数据表',
            cols: [
                [
                    { type: 'checkbox', fixed: 'left' },
                    { field: 'commentId', title: '评论Id', sort: true },
                    { field: 'userId', title: '用户Id'},
                    { field: 'commentContent', title: '评论内容' },
                    { field: 'commentStatus', title: '评论状态' },
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
    });
</script>

</body>

</html>
