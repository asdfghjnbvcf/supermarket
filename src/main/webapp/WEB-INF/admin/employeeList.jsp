<%--
  Created by IntelliJ IDEA.
  User: 施明
  Date: 2019/5/21
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
    <meta charset="utf-8">
    <title>员工列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${path}/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${path}/layuiadmin/style/admin.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>
<div class="layui-form-item">

    <div class="layui-inline">
        <label class="layui-form-label">员工名</label>
        <div class="layui-input-block">
            <input type="text" name="empName" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-inline">
        <button class="layui-btn layuiadmin-btn-useradmin" lay-submit lay-filter="LAY-user-front-search">
            <i class="layui-icon layui-icon-search layuiadmin-button-btn"></i>
        </button>
    </div>
</div>
</div>

<!-- 添加员工信息的表单 -->
<div id="addemployee" style="display: none">
    <!-- 这里给一个弹出表单 -->
    <form class="layui-form" lay-filter="example">
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
                <input type="text" name="empname" id="empname" lay-verify="title"
                       autocomplete="off" placeholder="请输入姓名"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
                <input type="password" name="emppassword" id="emppassword" placeholder="请输入密码"
                       autocomplete="off" class="layui-input" >
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-block">
                <input type="text" name="empphone" id="empphone" lay-verify="title"
                       autocomplete="off" placeholder="请输入手机号"
                       class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="empsex" id="empsex-1" value="男" title="男" checked="">
                <input type="radio" name="empsex" id="empsex-2" value="女" title="女">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">入职时间</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" name="empentryday" id="empentryday">

            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">生日时间</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" name="empbirthday" id="empbirthday">

            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">头像</label>
            <div class="layui-input-block">
               <input type="text" value="请在个人中心页面添加" name="emppicture" id="emppicture" readonly/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">状态</label>
            <div class="layui-input-block">
                <input type="text" name="empstatus" id="empstatus" lay-verify="title"
                       autocomplete="off" placeholder="默认状态"
                       class="layui-input" value="0" readonly>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn btn-update" type="button" lay-submit=""
                        lay-filter="demo1">保存</button>
            </div>
        </div>
    </form>

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

<script src="${path}/layuiadmin/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script src="${path}/layuiadmin/laydate/laydate.js"></script>
<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //嵌入日期
        laydate.render({
            elem: 'empentryday'

        });

        laydate.render({
            elem: '#empbirthday'

        });
    });

    layui.use('table', function() {
        var table = layui.table;

        table.render({
            elem: '#test'
            //  ,url:'/test/table/demo1.json'
            ,
            url: 'listEmployee' //数据接口
            ,
            toolbar: '#toolbarDemo',
            title: '员工数据表',
            cols: [
                [
                    { type: 'checkbox', fixed: 'left' }
                    , { field: 'empid', width: 100, title: '员工ID', sort: true }
                    , { field: 'empname', title: '姓名', minWidth: 100 }
                    , { field: 'empphone', title: '电话' }
                    , { field: 'empsex', width: 80, title: '性别' }
                    , { field: 'emptryday', title: '入职时间' }
                    , { field: 'empbirthday', title: '员工生日' }
                    , { field: 'emppicture', title: '头像' }
                    , { field: 'emppstatus', title: '状态' }
                    , { fixed: 'right', title: '操作', toolbar: '#barDemo', width: 150 }
                ]
            ],
            page: true,
            id : 'testReload'
        });

        //表格数据重载，模糊查询
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
                        //这里传值给servlet
                        content : demoReload.val()
                    }
                });
            }
        };
        $('.demoTable .layui-btn').on('click', function() {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
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

        //ajax添加提交事件,  此处搭配添加操作弹出层
        layui.form.on('submit(demo1)', function(data) {

            $.ajax({
                type : "post",
                url : "addEmployee",
                data : JSON.stringify(data.field),
                contentType : "application/json",
                success : function(cm) {
                    layer.msg(cm.msg, {
                        time : 1000,
                    },function() {
                        if (cm.msg == "添加成功") {
                            layer.closeAll();
                            location.reload('testReload');
                        }
                    });

                }

            });

            //return false;
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
