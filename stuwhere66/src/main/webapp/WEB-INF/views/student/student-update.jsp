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
<link href="static/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<title>修改学生信息</title>
</head>
<body>
<div class="pd-20">
  <form action="teacher/updateStudent" method="post" class="form form-horizontal" id="form-member-add">
  <input id="sidid" type="hidden" name="sId" value="${student.sId }">
<input id="sdeleteid" type="hidden" name="sDelete" value="${student.sDelete }">
<input type="hidden" name="sCreateTime" value=<fmt:formatDate value="${student.sCreateTime}"/> />
<input type="hidden" name="sCreateBy" value="${student.sCreateBy}" />
<input type="hidden" name="sModifyBy" value="${student.sModifyBy}" />
<input type="hidden" name="sVersion" value="${student.sVersion}" />

    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>用户名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" id="nameid" name="sUsername" datatype="*" value="${student.sUsername}">         
      </div>
      <span id="namewrongid"></span>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>密码：</label>
      <div class="formControls col-5">
        <input type="password" class="input-text" id="passwordid" name="sPassword" datatype="*6-18" value="${student.sPassword }">
      </div>       
      <div class="col-4"> </div>
    </div>
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>确认密码：</label>
      <div class="formControls col-5">
        <input type="password" class="input-text" id="passwordid1" name="sPassword1" datatype="*6-18" value="${student.sPassword }">
      </div>
      <span id="pwdwrongid"></span>       
      <div class="col-4"> </div>
    </div>
      <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>机构ID：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="sInsid" datatype="*" value="${student.sInsid }">
      </div>
      <div class="col-4"> </div>
    </div>
      <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>权限编号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="1" name="sPermissionNo" datatype="*" value="${student.sPermissionNo}">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
  </form>
</div>
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="static/lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function(){
	
	 $("#form-member-add").Validform({
		tiptype:2,
		callback:function(form){
			//form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			//parent.layer.close(index);
		}
	}); 
	
	

$("#passwordid1").blur(function() {

var pwd=$("#passwordid").val();
var pwd1=$("#passwordid1").val();

 if(pwd==pwd1){
	$("#pwdwrongid").html("密码一致");
	$("#pwdwrongid").css("color","green");
}
 else{
	$("#pwdwrongid").html("密码不一致，请重新输入");
	$("#pwdwrongid").css("color","red");
}   
 
});
});
</script>
</body>
</html>