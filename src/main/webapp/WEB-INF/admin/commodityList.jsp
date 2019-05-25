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
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>

<body>
<!-- 增加商品，隐藏表单-->
<div id="addForm" style="display: none">

    <form class="layui-form" action="" lay-filter="example">
        <div class="layui-form-item">
            <label class="layui-form-label" >一级分类</label>
            <div class="layui-input-inline">
                <select name="quiz1" id="oneLevelSelect" lay-filter="select1">
                    <option value="0" selected="">请选择</option>
                    <option value="1" >点心/饼干</option>
                    <option value="2">坚果</option>
                    <option value="3">熟食/肉类</option>
                    <option value="4">素食/卤味</option>
                    <option value="5">坚果/炒货</option>
                    <option value="6">糖果/蜜饯</option>
                    <option value="7">巧克力</option>
                    <option value="8">海味/河鲜</option>
                    <option value="9">花茶/果茶</option>
                    <option value="10">品牌/礼包</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="quiz2" id="twoLevelSelect">
                    <option value="">二级分类</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-block">
                <input type="text" name="username" id="username1" lay-verify="title"
                       autocomplete="off" placeholder="请输入用户名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
                <input type="password" name="userpwd" id="userPwd" lay-verify="title"
                       autocomplete="off" placeholder="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">电话</label>
            <div class="layui-input-block">
                <input type="text" name="usertel" id="usertel1" lay-verify="title"
                       autocomplete="off" placeholder="请输入电话" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="usersex" value="男" title="男" checked="">
                <input type="radio" name="usersex" value="女" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态</label>
            <div class="layui-input-block">
                <input type="radio" name="userstate" value=0 title="禁用" checked="">
                <input type="radio" name="userstate" value=1 title="启用">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">等级</label>
            <div class="layui-input-block">
                <input type="radio" name="userlevel" value=0 title="管理员" checked="">
                <input type="radio" name="userlevel" value=1 title="用户">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">地址</label>
            <div class="layui-input-block">
                <input type="text" name="useraddress" id="useraddress1"
                       lay-verify="title" autocomplete="off" placeholder="请输入电话"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="add">立即提交</button>
            </div>
        </div>
    </form>
</div>
<div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">订单ID</label>
        <div class="layui-input-block">
            <input type="text" name="orderId" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">订单状态</label>
        <div class="layui-input-block">
            <input type="text" name="orderStatus" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-inline">
        <label class="layui-form-label">房间ID</label>
        <div class="layui-input-block">
            <input type="text" name="roomId" placeholder="请输入" autocomplete="off" class="layui-input">
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
        <button class="layui-btn layui-btn-sm" lay-event="addGoods">添加商品</button>
    </div>
</script>


<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script src="${path}/layuiadmin/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script type="text/javascript">
</script>
<script>


    layui.use('table', function() {

        var table = layui.table;

        table.render({
            elem: '#test'
            ,
            url: 'toGoodsList'
            ,
            toolbar: '#toolbarDemo',
            title: '用户数据表',
            cols: [
                [
                    { type: 'checkbox', fixed: 'left' },
                    { field: 'goodsid', width: 100, title: '商品ID', sort: true },
                    { field: 'twolevelid', width: 100, title: '二级分ID', sort: true},
                    { field: 'twolevelname', width: 100, title: '二级分类明', sort: true },
                    { field: 'goodsname', width: 100, title: '商品名称', sort: true },
                    { field: 'goodsprice', width: 100, title: '商品单价', sort: true },
                    { field: 'goodstitle', title: '商品标题', minWidth: 100 },
                    { field: 'goodsinformation', title: '商品详情' },
                    { fixed: 'right', title: '操作', toolbar: '#barDemo', width: 150 }
                ]
            ],
            page: true
            , id: 'testReload'
        });

//头工具栏事件
        table.on('toolbar(test)', function(obj) {
            var checkStatus = table.checkStatus(obj.config.id);
            switch (obj.event) {
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：' + data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选' : '未全选');
                    break;
                case 'addGoods':
                    var cx=layer.open({
                        title: "添加商品",
                        area:['600px','600px'],
                        skin: 'layui-layer-rim',
                        type : 1,
                        content : $("#addForm").html(),

                    });

                    //只有加了这一句，表单的复选框，单选框才可以编辑
                    layui.form.render();
                        /*$("#oneLevelSelect").change(function () {
                            alert(this.val()+"hiuji");
                    });*/
                    layui.form.render('select')
                    layui.form.on('select(select1)',function (data3) {
                        //获取选中后的value值
                        var onelevelid=data3.value
                        //获取第二个列表框，向列表中添加内容




                    })
                    //监听提交
                    layui.form.on('submit(add)', function(data2) {
                        var d = data2.field;
                        console.log(d)
                        $.ajax({
                            type : "get",
                            url : "addGoods",
                            data : d,
                            success : function(data) {
                                if (data.msg == "增加成功") {
                                    layer.msg(data.msg, {
                                        time : 1000
                                    }, function() {
                                        layer.close(cx);
                                        my();
                                    });

                                } else {
                                    layer.msg(data.msg)
                                }
                            }
                        });

                        return false;
                    });
                    break;

            }
            ;
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
            reload: function () {
                var demoReload = $('#demoReload');
                //执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1
                        //重新从第 1 页开始
                    },
                    where: {
                        content: demoReload.val(),
                    }
                });
            }
        };
        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>

</body>

</html>