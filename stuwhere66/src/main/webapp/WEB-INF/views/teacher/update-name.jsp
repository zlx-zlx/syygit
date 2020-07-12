<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("webpath", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<title>修改名称</title>
</head>
<body>
<div class="pd-20">
	<form action="teacher/updateName" method="post" class="form form-horizontal" id="form-change-name">
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>姓名：</label>
			<div class="formControls col-8"> 
			<input type="" class="input-text" autocomplete="off" value="${teacher.teaName }" name="teaName"  id="11"     >
			
			</div>
			<div class="col-6"> </div>
		</div>
		
	
		
		<div class="row cl">
			<div class="col-8 col-offset-4">
				
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;保存&nbsp;&nbsp;" onclick="return passwordcheck11()">
      
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>


<!-- <script> -->

<script type="text/javascript" >
function passwordcheck11(){
	//var oldpassword=document.getElementById("oldPassword");
	var aa=document.getElementById("11").value;
	
	
	
	if(aa==""||aa==null){
		
		layer.msg("姓名不能为空", {icon:5} );
		
		return false;
		}
	if(aa!==""||aa!==null){
		
		
	}	
} 




$(function(){
	
	$("#btn").click(function(){
		var pwd = $("#new-pass2").val();
		if(pwd == null || pwd == ""){
			var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);
				
		}
	});
	
	
	$("#form-change-name").Validform({
		tiptype:2,
		
	 });
	
	
	
}); 
</script>
</body>
</html> 
