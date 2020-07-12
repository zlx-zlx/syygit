
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


<title>完善信息</title>
</head>
<body>

<div class="pd-20">
	<form action="admin/UpdateTeacher" method="post" class="form form-horizontal" id="form-article-add">
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>老师名称：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="teaNameid" name="teaName" datatype="*"  value="${teacher.teaName}" >
			 <span id="teaNamewrongid"></span>
			 </div>
			 
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>老师编号：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="teaCodeid" name="teaCode" datatype="*"   value="${teacher.teaCode}"   >
			 <span id="teaCodewrongid"></span>
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>密码：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="teaPass" datatype="*4-10"   value="${teacher.teaPass}"   >
			 
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		

		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学校代号：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="schCode" datatype="*"   value="${teacher.schCode}" readonly="true"  >
			 
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="teaSex" class="select" datatype="*"  >
					<option >${teacher.teaSex}</option>
					
					<option value="男">男</option>
                     <option value="女">女</option>
                     <option value="其他">其他</option>
				</select>
				</span> </div>
				<div class="col-4"> </div>
		</div>
				
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>年龄：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="teaAge" datatype="/^(?:[1-9][0-9]?|1[01][0-9]|120)$/"   value="${teacher.teaAge}" errormsg="年龄在1~120之间有效">
			 <!-- required pattern="^\S{4,}$" -->
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		
		
			<div >
			<input type="hidden"   name="teaId"   value="${teacher.teaId}" >
			 </div>
			 
			
		
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
			<div class="col-10 col-offset-2">
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

	$("#teaCodeid").blur(function() {
		
		$.ajax({

			url : "admin/schName222",

			cache : false,

			type : "GET",

			dataType : "json",

			async : true,

			data : {
				teaCode: $("#teaCodeid").val()
				
			},
			
			success : function(msg) {

				//业务代码，改变页面的数据		     
				// alert(msg);

				if (msg == true) {
					$("#teaCodewrongid").text("此教师编号存在,请重新输入！");
					
						$("#teaCodewrongid").css("color","red");
						
					$("#teaCodeid").focus();
					
					$("#buttonid").attr("class","btn disabled radius");
				}
				
				
				else {
					$("#teaCodewrongid").text("通过");
					
					$("#teaCodewrongid").css("color","white");

					$("#buttonid").attr("class","btn btn-primary radius");
				}

				
				
			},


		});
	});});})





	
</script>
</body>
</html>
 
 
 
 
 

<%-- <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>00：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="schCode" class="select" datatype="*"  nullmsg="请选择性别！"  type="text">
					
					<option value="" selected>请选择</option>
					<c:forEach items="${schools}" var="schools">	
					<option value="${schools.schCode }">${schools.schCode }</option>
					
					</c:forEach>
					
				</select>
				
				<c:forEach items="${types}" var="type">	
					<option value="${type.typeName }">${type.typeName }</option>
					
					</c:forEach>
					
				</span> </div>
				<div class="col-4"> </div>
		</div>		
				 --%>



<!-- <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>注册时间：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" id="test1" name="stuCreaTime" placeholder="yyyy-MM-dd" datatype="*"  >
				
			</div>
			<div class="col-1"> </div>	
		</div>
 -->


<%-- <select name="schName" class="select" datatype="*" nullmsg="请选择学校！">
					<option value="0003" selected>请选择</option>
					<c:forEach items="${schools}" var="school">	
					<option value="${school.schoolName }">${school.schoolName }</option>
					
					</c:forEach>
				</select> --%>
				
				
				
<%-- <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>分类栏目：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="typeName" class="select" datatype="*" nullmsg="请选择类别！">
					<option value="0003" selected>请选择</option>
					<c:forEach items="${types}" var="type">	
					<option value="${type.typeName }">${type.typeName }</option>
					
					</c:forEach>
				</select>
				</span> </div>
				<div class="col-4"> </div>
		</div>				 --%>
				
				
				
				
				
				
		<!-- 		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>数量：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" name="quantity" datatype="*" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>使用年限：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" name="durableYears" datatype="*" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>购买者：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" name="buyer" datatype="*" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>购买日期：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" id="test1" name="purchaseTime" placeholder="yyyy-MM-dd" datatype="*"  >
				
			</div>
			<div class="col-1"> </div>	
		</div>
			
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>存放地点：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" name="location" datatype="*" >
			</div>
			<div class="col-4"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2">备注：</label>
			<div class="formControls col-10">
				<input type="text" class="input-text" value="" placeholder="" id="" name="note">
			</div>
		</div> -->
				
				