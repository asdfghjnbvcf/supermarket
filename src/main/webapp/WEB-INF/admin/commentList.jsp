<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<head>
<meta charset="utf-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${path}/layuiadmin/layui/css/layui.css" media="all">
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
  <%--<div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
	<button class="layui-btn layui-btn-sm" lay-event="addUser">添加用户</button>
  </div>--%>
</script>

	<script type="text/html" id="barDemo">
  <%--<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="reset" id="reset">密码重置</a>--%>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" id="del">删除</a>
</script>


	<script src="${path}/layuiadmin/layui/layui.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

	<script>
		layui.use('table', function() {
			var table = layui.table;

			table.render({
				elem : '#test',
				url : 'listComment',
				toolbar : '#toolbarDemo',
				title : '用户数据表',
				cols : [ [ {
					type : 'checkbox',
					fixed : 'left'
				}, {
					field : 'commentid',
					title : 'ID',
					width : 80,
					fixed : 'left',
					unresize : true,
					sort : true
				}, {
					field : 'ordernum',
					title : '订单编号',
					width : 150,
					edit : 'text',
                    sort : true
				}, {
					field : 'commentcontent',
					title : '评论内容',
					width : 200,
					edit : 'text',
					//sort : true
				}, {
					field : 'commentpicture',
					title : '图片',
					width : 200
				}, {
					field : 'commenttime',
					title : '评论时间',
					width : 200,
                    sort : true
				},  {
					field : 'commentlevel',
					title : '评论等级',
					width : 120,
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
				},/* {
					field : 'userstate',
					title : '状态',
					width : 100,
					sort : true,
					templet : function(res) {
						return res.userState == 0 ? "禁用" : "启用"
					}
				}, */{
					fixed : 'right',
					title : '操作',
					toolbar : '#barDemo',
					width : 200
				} ] ],
				page : true,
				id : 'testReload'
			});

			//头工具栏事件
			table.on('toolbar(test)', function(obj) {
				var checkStatus = table.checkStatus(obj.config.id);
				switch (obj.event) {
				case 'getCheckData':
					var data = checkStatus.data;
					layer.alert(JSON.stringify(data));
					break;
				case 'getCheckLength':
					var data = checkStatus.data;
					layer.msg('选中了：' + data.length + ' 个');
					break;
				case 'isAll':
					layer.msg(checkStatus.isAll ? '全选' : '未全选');
					break;
					
				case 'addUser':
					layer.open({
						type : 1,
						title : "添加用户",//弹出层标题
						area : [ '800px', '550px' ],//弹出层大小设置
						shade : 0.6,//设置父窗口阴影
						id : 'LAY_layuipro',//设定一个id防止重复弹出
						content : $("#addForm").html()
					//弹出一个div层
					});

					//弹出窗的表单按钮无法实现，需要对表单进行渲染render
					layui.form.render();
					
					//监听提交
					layui.form.on('submit(demo2)', function(data) {
						/* layer.alert(JSON.stringify(data.field), {
							title : '最终的提交信息'
						}) */
						//表单中的数据
						console.log(JSON.stringify(data.field));
						//ajax请求实现访问控制器
						$.ajax({
							type:"post",//提交方式
							url:"usersapi/addUser",//控制器路径
							data:JSON.stringify(data.field),//提交给控制器的数据
							contentType:"application/json",//提交给控制器的数据格式
							
							success:function(data){
								layer.msg(data.msg,{
									time:2000
								},function(){
									if(data.msg=="添加成功"){
										//obj.update(); ?? 理想
										//layer.close(index);;
										//parent.layer.closeAll();//关闭所有,简单粗暴
										window.parent.location.reload();//刷新父页面
									}
								});
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
				if (obj.event === 'del') {
					layer.confirm('真的删除行么', function(index) {

						// console.log(data.userId)
						/* $.post("usersapi/deleteUser", "userId=" + data.userId,
								function(data) {
									layer.msg(data.msg);
									obj.del();
									layer.close(index);
						}); */
						
						$.ajax({
							type:"DELETE",//提交方式
							url:"deleteComment/"+data.commentid,//控制器路径
							//data:"userId=" + data.userId,//提交给控制器的数据
							//contentType:"application/json",//提交给控制器的数据格式
							
							success:function(data){
								layer.msg(data.msg,{
									time:2000
								},function(){
									if(data.msg=="删除成功"){
										//obj.update(); ?? 理想
										//layer.close(index);;
										//parent.layer.closeAll();//关闭所有,简单粗暴
										window.location.reload();//刷新父页面
										//window.location.href=""
									}
								});
							}
							
						});
						
					});
				} else if (obj.event === 'edit') {

					//对表单的元素进行赋值
					$("#userId").attr("value",data.userId);
					$("#userName").attr("value", data.userName);
					//console.log($("#userName").val());
					$("#userPwd").attr("value", data.userPwd);

					if (data.userSex == "女") {
						$("input[name='userSex'][value='女']").attr("checked",
								true);
					} else {
						$("input[name='userSex'][value='女']").attr("checked",
								false);
					}

					$("#userTel").attr("value", data.userTel);
					$("#userAddress").html(data.userAddress);

					if (data.userLevel == 1) {
						$("#gl").attr("selected", true)
					} else {
						$("#gl").attr("selected", false)
					}

					if (data.userState == 0) {
						$("#off").attr("selected", true);
						$("#on").attr("selected", false)
					} else {
						$("#on").attr("selected", true);
						$("#off").attr("selected", false)
					}

					//弹出层
					layer.open({
						type : 1,
						title : "用户信息修改",//弹出层标题
						area : [ '800px', '550px' ],//弹出层大小设置
						shade : 0.6,//设置父窗口阴影
						id : 'LAY_layuipro',//设定一个id防止重复弹出
						content : $("#editForm").html()
					//弹出一个div层
					});

					//弹出窗的表单按钮无法实现，需要对表单进行渲染render
					layui.form.render();

					/* layer.prompt({
						formType : 2,
						value : data.userId
					}, function(value, index) {
						obj.update({
							email : value
						});
						layer.close(index);
					}); */
				}
			});

			/*表单的提交 按钮的单击事件*/
			/* $(document).on("click", ".btn-update", function() {
				//可以实现 比较麻烦....
				console.log(layui.form.data);
			}); */

			//监听提交
			layui.form.on('submit(demo1)', function(data) {
				/* layer.alert(JSON.stringify(data.field), {
					title : '最终的提交信息'
				}) */
				//表单中的数据
				console.log(JSON.stringify(data.field));
				//ajax请求实现访问控制器
				$.ajax({
					type:"put",//提交方式
					url:"usersapi/updateUser",//控制器路径
					data:JSON.stringify(data.field),//提交给控制器的数据
					contentType:"application/json",//提交给控制器的数据格式
					
					success:function(data){
						layer.msg(data.msg,{
							time:2000
						},function(){
							if(data.msg=="修改成功"){
								//obj.update(); ?? 理想
								//layer.close(index);;
								//parent.layer.closeAll();//关闭所有,简单粗暴
								window.parent.location.reload();//刷新父页面
							}
						});
					}
					
				});
				return false;
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