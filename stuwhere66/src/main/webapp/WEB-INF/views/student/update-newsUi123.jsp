
				 
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


<title>修改信息</title>
</head>
<body>

<div class="pd-20">
	<form action="student/updateWays123" method="post" class="form form-horizontal" id="form-article-add">
		<div >
			
	<input type="hidden"  id="" name="wayId" value="${way.wayId}">
			
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学号：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="stuNo" datatype="*"  value="${student.stuNo}" readonly="true">
			 </div>
			 
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>就业公司：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="wayCompany" datatype="*"   value="${way.wayCompany}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		 <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>薪水：</label>
			<div class="formControls col-2">
			<input     required pattern="^[1-9]\d*\.[0-9]$" type="text" class="input-text"  title="请精确到小数点后一位"  id="" name="waySalary"  value="${way.waySalary}"   >
			<!-- ^\S{1,9}$
			/^(\d{1,2})$/ -->
			<!-- /^(\d+\.\d{1,1}|\d+)$/ -->
			<!-- ^\S{4,}$ -->
			</div>
			 
			<div class="col-2"> </div>
		</div> 
		
		
		
		<%-- <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>薪水：</label>
			<div class="formControls col-2">
			<input    type="text" class="input-text"  datatype="*6-16"  errormsg="请输入22dao"  id="" name="waySalary"  value="${way.waySalary}"   >
			<!-- ^\S{1,9}$
			/^(\d{1,2})$/ -->
			<!-- /^(\d+\.\d{1,1}|\d+)$/ -->
			<!-- ^\S{4,}$ -->
			
			<!-- /^\+?(\d*\.\d{2})$/
			
			^\d*\.{0,1}\d{0,1}$ -->
			</div>
			 
			<div class="col-2"> </div>
		</div> --%>
		
		<%-- <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>实习时间：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="wayTime" datatype="*"   value="${way.wayTime}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div> --%>
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>实习日期：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" id="test1" name="wayTime" placeholder="yyyy-MM-dd" datatype="*"    value="${way.wayTime}" >
				
			</div>
			<div class="col-1"> </div>	
		</div>
			
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>工作地点：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="wayAddrss" datatype="*"   value="${way.wayAddrss}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>公司电话：</label>
			<div class="formControls col-2">
			<input type="text"  class="input-text"  datatype="n7-8" errormsg="电话号码格式错误"  id="" name="wayPhone"    value="${way.wayPhone}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>满意度：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="wayEvaluate" class="select" datatype="*" nullmsg="请选择满意度！">
					<option value="" selected>${way.wayEvaluate }</option>
					
					<option value="很满意">很满意</option>
                     <option value="一般">一般</option>
                     <option value="不满意">不满意</option>
				</select>
				</span> </div>
				<div class="col-4"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>单位联系人：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="wayCompanor" datatype="*"   value="${way.wayCompanor}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<%--  <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>职务：</label>
			<div class="formControls col-2"><span class="select-box">
			<select name="PoName" class="select">
				<c:forEach items="${position }" var="position">
					<option>${position.poName}</option>
				</c:forEach>
				</select>
			</span> 
			</div>
			 
			<div class="col-2"> </div>
		</div>  --%>
		
		
		
		 <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>从事职务：</label>
			<div class="formControls col-2"> <span class="select-box">
				 <select name="poName" class="select" datatype="*" nullmsg="请选择职务名称！">
					<option value="" selected><c:forEach items="${ways }" var="wayss">
				${wayss.position.poName }
			   </c:forEach></option>
			   <c:forEach items="${position }" var="position">
					<option>${position.poName}</option>
				</c:forEach>
			   
					 
					 <%-- <c:forEach items="${position}" var="position">	
					<option value="${position.poName }">${position.poName }</option>
					
					</c:forEach>
					 --%>
					
					
				</select> 
				</span> </div>
				<div class="col-4"> </div>
		</div> 
		
		
		
		
	
		<%-- 	
		<label class="form-label col-2"><span class="c-red">*</span>从事职务：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="poName" class="select">
				<c:forEach items="${position }" var="position">
					<option>${position.poName }</option>
				</c:forEach>
				</select>
				</span> 
			</div> --%>
		
		
		
		
		
		<div class="row cl">
			<div class="col-10 col-offset-2">
				 <button onClick="article_save_submit();" id="buttonid" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 提交</button>
				
				
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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

laydate.render({
	elem: '#test1' 
});

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
	 
	 
    
});	 

	
</script>
</body>
</html>
