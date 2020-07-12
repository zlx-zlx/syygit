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
	<form action="admin/addPo" method="post" class="form form-horizontal" id="form-article-add">
		
    <div class="row cl">
      <label class="form-label col-4"><span class="c-red">*</span>职务名称：</label>
      <div class="formControls col-4">
        <input type="text" class="input-text"  placeholder="输入要添加的职务名称" id="poNameid" name="poName"  nullmsg="职务名称不能为空" datatype="*">
      <span id="poNamewrongid"></span> 
      </div>
      <div class="col-2" > </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-4">职务编号：</label>
      <div class="formControls col-4">
        <input type="text" class="input-text" value="" placeholder="输入要添加的职务编号"  id="poCodeid" name="poCode"  nullmsg="职务编号不能为空" datatype="n4-10">
       <span id="poCodewrongid"></span> 
      </div>
      <div class="col-2"> </div>
    </div>
    
   
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
	 





 $(document).ready(
		 function(){

$("#poNameid").blur(function() {
	
	$.ajax({

		url : "admin/poName",

		cache : false,

		type : "GET",

		dataType : "json",

		async : true,

		data : {
			poName: $("#poNameid").val()
			
		},
		
		success : function(msg) {

			//业务代码，改变页面的数据		     
			// alert(msg);

			if (msg == true) {
				$("#poNamewrongid").text("此职务名称存在,请重新输入！");
				
					$("#poNamewrongid").css("color","red");
					
				$("#poNameid").focus();
				
				$("#buttonid").attr("class","btn disabled radius");
			}
			
			
			else {
				$("#poNamewrongid").text("通过");
				
				$("#poNamewrongid").css("color","white");

				$("#buttonid").attr("class","btn btn-primary radius");
			}

			
			
		},


	});
});})


 
$(document).ready(
		 function(){ 

$("#poCodeid").blur(function() {
	
	$.ajax({

		url : "admin/poCode",

		cache : false,

		type : "GET",

		dataType : "json",

		async : true,

		data : {
			poCode: $("#poCodeid").val()
			
		},

		success : function(msg) {

			//业务代码，改变页面的数据		     
			// alert(msg);

			if (msg == true) {
				$("#poCodewrongid").text("此职务编号存在,请重新输入！");
				$("#poCodewrongid").css("color","red");
				$("#poCodeid").focus();
				$("#buttonid").attr("class","btn disabled radius");
			}
			else {
				$("#poCodewrongid").text("通过");
				$("#poCodewrongid").css("color","white");
				$("#buttonid").attr("class","btn btn-primary radius");
			}

		},


	});
});});});


</script>
</body>
</html>