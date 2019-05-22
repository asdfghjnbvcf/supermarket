<%--
  Created by IntelliJ IDEA.
  User: 施明
  Date: 2019/5/21
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layuiadmin/layui/css/layui.css" media="all">
    <!--  <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">-->
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>
<div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">员工ID</label>
        <div class="layui-input-block">
            <input type="text" name="empId" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">员工名</label>
        <div class="layui-input-block">
            <input type="text" name="empName" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-inline">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">
            <select name="empSex">
                <option value="0">不限</option>
                <option value="1">男</option>
                <option value="2">女</option>
            </select>
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
        <!--<button class="layui-btn layui-btn-sm" lay-event="getCheckData">添加员工</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>-->
        <button class="layui-btn layui-btn-sm" lay-event="add">添加员工</button>
    </div>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script src="layuiadmin/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function() {
        var table = layui.table;

        table.render({
            elem: '#test'
            //  ,url:'/test/table/demo1.json'
            ,
            url: 'layuiadmin/json/useradmin/webemployee.js' //模拟接口
            ,
            toolbar: '#toolbarDemo',
            title: '用户数据表',
            cols: [
                [
                    { type: 'checkbox', fixed: 'left' }, { field: 'empId', width: 100, title: '员工ID', sort: true }, { field: 'empName', title: '姓名', minWidth: 100 }, { field: 'empPwd', title: '密码' }, { field: 'empSex', width: 80, title: '性别' }, { field: 'empTel', title: '手机' }, { field: 'empLevel', title: '员工身份' }, { field: 'empAddress', title: '联系地址' }, { fixed: 'right', title: '操作', toolbar: '#barDemo', width: 150 }
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
