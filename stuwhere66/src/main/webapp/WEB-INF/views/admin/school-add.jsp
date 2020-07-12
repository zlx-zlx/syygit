<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="static/css/layui.css"  rel="stylesheet"   type="text/css" />
 <script type="text/javascript"  src="static/ts/Validform_v5.3.2_min.js"></script>

<title>完善信息</title>
</head>
<body>

<div class="pd-20">
	<form action="admin/addSchool" method="post" class="form form-horizontal" id="form-article-add">
		
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>学校名称：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text"  placeholder="输入要添加的学校名称" id="schNameid" name="schName"  nullmsg="学校名称不能为空" datatype="*">
      <span id="schNamewrongid"></span> 
      </div>
      <div class="col-4" > </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-3">学校代号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="输入要添加的学校代号"  id="schCodeid" name="schCode"  nullmsg="学校代号不能为空" datatype="n4-10">
       <span id="schCodewrongid"></span> 
      </div>
      <div class="col-4"> </div>
    </div>
    
    
    
    
   
   <!--  <div class="row cl">
      <div class="col-10 col-offset-5">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
     -->
    
  <div class="row cl">
			<div class="col-8 col-offset-4">
				 <button onClick="article_save_submit();" id="buttonid" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 提交</button>
				
			</div>
		</div>
  </form>

</div>

<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="static/lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script> 
<script type="text/javascript" src="static/laydate/laydate.js"></script>

<script type="text/javascript" src="static/js/layui.js" ></script>




<script type="text/javascript">

$(function(){
	
	 $("#form-article-add").Validform({
		tiptype:2,
		callback:function(form){
			//form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			//parent.layer.close(index);
		}
	}); 
	 



/* $(function(){
	var flag=false;
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	 $("#form-member-add").Validform({
		tiptype:2,
		callback:function(form){
			
			//var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			//var index = parent.layer.getFrameIndex(window.name);
			//form[0].submit();
		}
	});
	 
	
	 
	$("#form-member-add").submit(function(){
		
		return flag;
	});
});});

 */

 $(document).ready(
		 function(){

$("#schNameid").blur(function() {
	
	$.ajax({

		url : "admin/schName2",

		cache : false,

		type : "GET",

		dataType : "json",

		async : true,

		data : {
			schName: $("#schNameid").val()
			
		},
		
		success : function(msg) {

			//业务代码，改变页面的数据		     
			// alert(msg);

			if (msg == true) {
				$("#schNamewrongid").text("此学校名称存在,请重新输入！");
				
					$("#schNamewrongid").css("color","red");
					
				$("#schNameid").focus();
				
				$("#buttonid").attr("class","btn disabled radius");
			}
			
			
			else {
				$("#schNamewrongid").text("通过");
				
				$("#schNamewrongid").css("color","white");

				$("#buttonid").attr("class","btn btn-primary radius");
			}

			
			
		},


	});
});})


 
$(document).ready(
		 function(){ 

$("#schCodeid").blur(function() {
	
	$.ajax({

		url : "admin/schName22",

		cache : false,

		type : "GET",

		dataType : "json",

		async : true,

		data : {
			schCode: $("#schCodeid").val()
			
		},

		success : function(msg) {

			//业务代码，改变页面的数据		     
			// alert(msg);

			if (msg == true) {
				$("#schCodewrongid").text("此学校代号存在,请重新输入！");
				$("#schCodewrongid").css("color","red");
				$("#schCodeid").focus();
				$("#buttonid").attr("class","btn disabled radius");
			}
			else {
				$("#schCodewrongid").text("通过");
				$("#schCodewrongid").css("color","white");
				$("#buttonid").attr("class","btn btn-primary radius");
			}

		},


	});
});});});


</script>
</body>
</html>