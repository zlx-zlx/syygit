<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
           + request.getServerName() + ":" + request.getServerPort()
           + path + "/";
%>
<style>
	.body{
		background: #afe4cd;
		height: 100%;
	}
</style>
<link rel="stylesheet" href="static/css/layui.css" media="all">

<title>首页</title>
</head>
<body>
	
	
	<div class="layui-carousel" id="test1">
		<div carousel-item>
			<div><img src="static/images/bg/bg1.jpg" /></div>
			<div><img src="static/images/bg/bg2.jpg" /></div>
			<div><img src="static/images/bg/bg3.jpg" /></div>
			<div><img src="static/images/bg/bg5.jpg" /></div>
			<div><img src="static/images/bg/bg6.jpg" /></div>
			<div><img src="static/images/bg/bg7.jpg" /></div>
			<div><img src="static/images/bg/888.jpg" /></div>
		</div>
		
	</div>
	<div >
		<h2 align="center" style="margin-top: 20px;"><font color="blue">高校学生毕业去向管理系统 v1.0</font></h2>
	</div>
<script src="static/js/layui.js"></script>
<script>
layui.use('carousel', function(){
	  var carousel = layui.carousel;
	  //建造实例
	  carousel.render({
	    elem: '#test1'
	    ,height:'800px'
	    ,width: '100%' //设置容器宽度
	    ,arrow: 'display' //始终显示箭头
	    //,anim: 'updown' //切换动画方式
	  });
	});

</script>	
</body>
</html>