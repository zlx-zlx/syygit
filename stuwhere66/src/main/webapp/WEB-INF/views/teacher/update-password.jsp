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
<title>修改密码</title>
</head>
<body>
<div class="pd-20">
	<form action="teacher/updatePassword" method="post" class="form form-horizontal" id="form-change-password">
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>用户名：</label>
			<div class="formControls col-4"> 
			<input type="" class="input-text" autocomplete="off" value="${teacher.teaName }" name="teaName"   id=""   ignore="ignore" readonly="true" >
			
			</div>
			<div class="col-4"> </div>
		</div>
		
	
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>新密码：</label>
			<div class="formControls col-4">
				<input type="password" class="input-text" autocomplete="off" placeholder="请输入6位及以上字符" name="teaPass" id="newPasswordone" datatype="*6-18" ignore="ignore" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>确认密码：</label>
			<div class="formControls col-4">
				<input type="password" class="input-text" autocomplete="off" placeholder="请再输一遍密码" name="teaPass2" id="newPasswordtwo" recheck="teaPass" datatype="*6-18" errormsg="您两次输入的密码不一致！" ignore="ignore" >
			</div>
			<div class="col-4"> </div>
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
	var password1=document.getElementById("newPasswordone").value;
	
	//var x=document.forms["myForm"]["newPasswordone"].value;
	//alert(password1);
	var password2=document.getElementById("newPasswordtwo").value;
	if(password1==""||password1==null){
		
		alert("密码不能为空");	
		
		return false;
		}
	if(password2==""||password2==null){
		alert("请再输一遍密码");	
		return false;
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
	
	
	$("#form-change-password").Validform({
		tiptype:2,
		/* callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);
		} */
	 });
	
	
	
}); 
</script>
</body>
</html> 
