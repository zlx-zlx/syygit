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

<link href="<%=basePath%>static/zxb/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>static/zxb/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>static/zxb/js/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>static/zxb/js/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />

<style>
	.form-horizontal .Validform_checktip {
	    margin-top: 5px;
	}
	.Validform_wrong {
	    background: url(../images/icon_error_s.png) no-repeat 0 center;
	    color: #ef392b;
	}
	.Validform_wrong, .Validform_right, .Validform_warning {
	    display: inline-block;
	    height: 20px;
	    font-size: 12px;
	    vertical-align: middle;
	    padding-left: 25px;
	}

</style>


<title>修改章节</title>
</head>
<body>
<div class="pd-20">
	<% 
    	String schName=request.getParameter("schName");
		String schCode=request.getParameter("schCode");
		
    %>
  <form action="updateChapter" method="post" class="form form-horizontal" id="form-member-add">
  	<input type="hidden" name="schCode" id="schCode" value="${teacher.schCode }" >
  	<input type="hidden" name="teaId" value="${teacher.teaId }">
  	
  	<div>
		  <input type="hidden" name="teaCreateTime" value="<fmt:formatDate value="${teacher.teaCreateTime}" pattern="yyyy-MM-dd HH:mm:ss"/> ">
                
		</div>
		
		<div>
		  <input type="hidden" name="teaFlag"  value="0" >
                
		</div>
		
		<div>
			<input type="hidden"   name="teaCreateBy"   value="${teacher.teaCreateBy}" >
			 </div>
		    
    
    
    
    
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>老师名称：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="teaNameid" name="teaName" datatype="*"  value="${teacher.teaName}" >
			 <span id="teaNamewrongid"></span>
			 </div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>老师编号：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="teaCodeid" name="teaCode" datatype="*"   value="${teacher.teaCode}"   >
			 <span id="teaCodewrongid"></span>
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
      <label class="form-label col-3">学校名称：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="${school.schName }" readonly= id="schName" name="schName" >
      </div>
      <div class="col-2"> </div>
    </div>
		
		
		
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>密码：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="" name="teaPass" datatype="*4-10"   value="${teacher.teaPass}"   >
			 
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-5"> <span class="select-box">
				<select name="teaSex" class="select" datatype="*"  >
					<option >${teacher.teaSex}</option>
					
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
			<input type="text" class="input-text"  id="" name="teaAge" datatype="/^(?:[1-9][0-9]?|1[01][0-9]|120)$/"   value="${teacher.teaAge}" errormsg="年龄在1~120之间有效">
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

<script type="text/javascript" src="<%=basePath%>static/zxb/js/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/zxb/js/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function(){
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
		var massage2=$("#cuorseId").val();
		$.post("${pageContext.request.contextPath}/chapter/checkChapterName",{chapterName:massage1,cuorseId:massage2},function(msg){
			//alert($("#chapterName").val);
			//alert(msg);
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
		//alert(flag);
		return flag;
	}); 
	
	
	
});
</script>
</body>
</html>