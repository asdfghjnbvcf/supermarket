<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>管理员登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="${path}/face/css/style.css" />
<script type="text/javascript" src="${path}/face/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${path}/face/js/jquery.webcam.min.js"></script>
<style>
body {
	height: 100%;
	background: #213838;
	overflow: hidden;
}

canvas {
	z-index: -1;
	position: absolute;
}
</style>
<script src="${path}/face/js2/jquery.js"></script>
<script src="${path}/face/js2/verificationNumbers.js"></script>
<script src="${path}/face/js2/Particleground.js"></script>
<script>
	$(document).ready(function() {
		//粒子背景特效
		$('body').particleground({
			dotColor : '#5cbdaa',
			lineColor : '#5cbdaa'
		});

	});
</script>


<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	height: 100vh;
	background-position: center;
	overflow: hidden;
}

h1 {
	color: #fff;
	text-align: center;
	font-weight: 100;
	margin-top: 40px;
}

#media {
	width: 300px;
	height: 280px;
	margin: 10px auto 0;
	border-radius: 30px;
	overflow: hidden;
	opacity: 0.7px;
}

#video {
	
}

#canvas {
	display: none;
}

#btn {
	width: 160px;
	height: 50px;
	background: #03a9f4;
	margin: 70px auto 0;
	text-align: center;
	line-height: 50px;
	color: #fff;
	border-radius: 40px;
}
</style>
</head>

<body>

	<script type="text/javascript">
		$(function() {
			var w = 320, h = 240;
			var pos = 0, ctx = null, saveCB, image = [];

			var canvas = document.createElement("canvas");
			canvas.setAttribute('width', w);
			canvas.setAttribute('height', h);

			/*  console.log(canvas.toDataURL); */
			if (canvas.toDataURL) {

				ctx = canvas.getContext("2d");

				image = ctx.getImageData(0, 0, w, h);

				saveCB = function(data) {

					var col = data.split(";");
					var img = image;

					for (var i = 0; i < w; i++) {
						var tmp = parseInt(col[i]);
						img.data[pos + 0] = (tmp >> 16) & 0xff;
						img.data[pos + 1] = (tmp >> 8) & 0xff;
						img.data[pos + 2] = tmp & 0xff;
						img.data[pos + 3] = 0xff;
						pos += 4;
					}

					if (pos >= 4 * w * h) {
						ctx.putImageData(img, 0, 0);
						
						$.ajax({
							type : "post",
							url : "FaceServlet2?t=" + new Date().getTime(),
							dataType : "json",
							data : {
								type : "pixel",
								image : canvas.toDataURL("image/png"),
								id : $("#userId").val()
							},
							success : function(data) {
								/* alert(data.msg); */
								if (data.msg == "新增成功") {
									alert("11111111111111")
								}
							
							}
						});
					}
				};

			} else {

				saveCB = function(data) {
					image.push(data);

					pos += 4 * w;

					if (pos >= 4 * w * h) {
						$.ajax({
							type : "post",
							url : "FaceServlet2",
							dataType : "json",
							data : {
								type : "pixel",
								image : image.join('|'),
								id : $("#userId").val()
							},
							success : function(data) {
								
								if (data.msg == "新增成功") {
									alert("11111111111111")
								}
								
							}
						});
					}
				};
			}

			$("#webcam").webcam({
				width : w,
				height : h,
				mode : "callback",
				swffile : "${path}/face/js/jscam_canvas_only.swf",

				onSave : saveCB,

				onCapture : function() {
					webcam.save();
				},

			/*  debug: function (type, string) {
			     console.log(type + ": " + string);
			 } */
			});
		});

		//拍照
		function savePhoto() {
			webcam.capture();
		}
	</script>

	<form action="${pageContext.request.contextPath}/facelogin.action"
		method="get">
		<dl class="admin_login">
			<dt>
                <strong>小馋猫商城</strong>
                <br>
				<strong>后台管理系统</strong>
			</dt>
			<div id="media">
				<div id="webcam"></div>
			</div>
			<dd>
                <div>
					<input type="button" value="立即登录" onclick="savePhoto()" style="width: 145px ;height: 42px;border:
                      none;font-size: 16px;background: #048f74;color: #F8F8F8;border-radius: 40px" />
                    <input type="button" value="密码登录"  style="width: 145px ;height: 42px;border:
                      none;font-size: 16px;background: #048f74;color: #F8F8F8;border-radius: 40px" />
                </div>
			</dd>  

		</dl>
		<script type="text/javascript" src="${path}/face/js2/jquery-3.1.1.min.js"></script>

		<script type="text/javascript" src="${path}/face/js2/jquery.webcam.min.js"></script>

		<style type="text/css">
#webcam {
	border: 1px solid #666666;
	width: 320px;
	height: 240px;
}

#photos {
	border: 1px solid #666666;
	width: 320px;
	height: 240px;
}

.btn {
	width: 320px;
	height: auto;
	margin: 5px 0px;
}

.btn input[type=button] {
	width: 150px;
	height: 50px;
	line-height: 50px;
	margin: 3px;
}
</style>

	</form>
</body>
</html>
