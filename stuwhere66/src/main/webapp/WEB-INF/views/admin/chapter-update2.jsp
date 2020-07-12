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
	
  <form action="updateChapter11" method="post" class="form form-horizontal" id="form-member-add">
  	
  
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学校名称：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="schNameid" name="schName" datatype="*"  value="${school.schName}" >
			 <span id="schNamewrongid"></span>
			 </div>
			 
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学校代号：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="schCode" datatype="*"   value="${school.schCode}" readonly="true"  >
			 
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
			<div >
			<input type="hidden"   name="schId"   value="${school.schId}" >
			 </div>
			 
			
		
		<div>
		  <input type="hidden" name="schCreateTime" value="<fmt:formatDate value="${school.schCreateTime}" pattern="yyyy-MM-dd"/> ">
                
		</div>
		
		<div>
		  <input type="hidden" name="schFlag"  value="0" >
                
		</div>
		
		<div>
			<input type="hidden"   name="schCreateBy"   value="${school.schCreateBy}" >
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


	

	
	
});
</script>
</body>
</html>