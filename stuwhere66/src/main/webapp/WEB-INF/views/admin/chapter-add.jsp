<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
           + request.getServerName() + ":" + request.getServerPort()
           + path + "/";
%>
<link href="<%=basePath%>css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>js/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>js/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />

<title>添加章节</title>
</head>
<body>
<div class="pd-20">
	
  <form action="<%=basePath%>admin/addChapterAction"  method="post" class="form form-horizontal" id="form-member-add">
  	<input type="hidden" name="schCode" id="schCode" value=" ${map.schCode }" >
  	
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>老师名称：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text"  placeholder="输入要添加的老师名称" id="teaNameid" name="teaName"  nullmsg="老师名称不能为空" datatype="*">
      <span id="teaNamewrongid"></span> 
      </div>
      <div class="col-2" > </div>
    </div>
    
    <div class="row cl">
      <label class="form-label col-3">老师编号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="输入要添加的老师编号"  id="teaCodeid" name="teaCode"  nullmsg="老师编号不能为空" datatype="n4-10">
       <span id="teaCodewrongid"></span> 
      </div>
      <div class="col-2"> </div>
    </div>
    
    
   
     
   
           <div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>密码：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="" name="teaPass" datatype="*4-10"     >
			 
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
       <div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-5"> <span class="select-box">
				<select name="teaSex" class="select" datatype="*"  >
					
					
					<option value="男">男</option>
                     <option value="女">女</option>
                     <option value="其他">其他</option>
				</select>
				</span> </div>
				<div class="col-2"> </div>
		</div>
				
		
		
		
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>年龄：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="" name="teaAge" datatype="/^(?:[1-9][0-9]?|1[01][0-9]|120)$/"    errormsg="年龄在1~120之间有效">
			 <!-- required pattern="^\S{4,}$" -->
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
   
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
    
  </form>

</div>

<script type="text/javascript" src="<%=basePath%>js/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function(){
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
	 
	$("#chapterName").blur(function(){
		
		var massage1=$("#chapterName").val();
		var massage2=$("#cuorseId").val()
		$.post("${pageContext.request.contextPath}/chapter/checkChapterName",{chapterName:massage1,cuorseId:massage2},function(msg){
			
			if(!msg){
				
				flag=false;
				$("#col-4").html("<span class='Validform_checktip Validform_wrong'>章节名存在</span>");
			}else{
				flag=true;
			}
			return !msg;
		},"json"); 
		
		
	});
	 
	$("#form-member-add").submit(function(){
		
		return flag;
	});

	 
});
</script>
</body>
</html>