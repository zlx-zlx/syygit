
 
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
	<form action="student/updateNews" method="post" class="form form-horizontal" id="form-article-add">
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学号：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="stuNo" datatype="*"  value="${student.stuNo}" readonly="true">
			 </div>
			 
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>姓名：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="stuName" datatype="*"   value="${student.stuName}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="stuSex" class="select" datatype="*"  nullmsg="请选择性别！">
					<option value="${student.stuSex}" selected>${student.stuSex}</option>
					<%-- <c:forEach items="${types}" var="type">	
					<option value="${type.typeName }">${type.typeName }</option>
					
					</c:forEach> --%>
					
					
					<option value="男">男</option>
                     <option value="女">女</option>
                     <option value="未知">未知</option>
				</select>
				</span> </div>
				<div class="col-4"> </div>
		</div>
				
			<%-- 
			<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>出生年月：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="stuBirth" datatype="*"   value="${student.stuBirth}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>	
		 --%>
		 
		 
		 
		 
		 <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>出生年月：</label>
			<div class="formControls col-5">
				<input type="text"  autocomplete="off"  class="input-text" id="test1" name="stuBirth" placeholder="yyyy-MM-dd" datatype="*"  value="${student.stuBirth}" >
				
			</div>
			<div class="col-1"> </div>	
		</div>
		
		
		<div class="row cl">
		<label class="form-label col-2"><span class="c-red">*</span>所属学校：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="schName" class="select" datatype="*"  nullmsg="请选择学校！">
					<option value="" selected><c:forEach items="${students }" var="studentss">
				${studentss.school.schName }
			   </c:forEach></option>
				 
			   <c:forEach items="${school }" var="school">
					<option>${school.schName}</option>
				</c:forEach>
				
				 
				</select>
				</span> 
			</div> 
			<!-- 提示学校名称 -->
			<div class="col-4"> 
			</div>
			
		</div>
		
		
		
		
				
				
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>联系电话：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="stuPhone" datatype="m"   errormsg="手机号格式不正确"  value="${student.stuPhone}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>毕业动态：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="stuStatus" class="select" datatype="*" nullmsg="请选择毕业动态！">
					<option value=" " selected>${student.stuStatus}</option>
					<option value="已就业">已就业</option>
                     <option value="未就业">未就业</option>
                     <option value="考研">考研</option>
                      <option value="考公务员">考公务员</option>
                     <option value="出国">出国</option>
                     <option value="参军">参军</option>
				</select>
				</span> </div>
				<div class="col-4"> </div>
		</div>	
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>入学年份：</label>
			<div class="formControls col-2">
			<input type="text" class="input-text"  id="" name="stuYear" datatype="*"   value="${student.stuYear}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学历：</label>
			<div class="formControls col-2"><span class="select-box">
			<select name="stuEducation" class="select" datatype="*" nullmsg="请选择学历！"   >
			<option value=" " selected>${student.stuEducation} </option>
					<option value="专科">专科</option>
                     <option value="本科">本科</option>
                     <option value="硕士研究生">硕士研究生</option>
                     <option value="博士研究生">博士研究生</option>
                     
				</select>
				</span> </div>
				<div class="col-4"> </div>
		</div>	
		
		
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>班级：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" name="stuClass" datatype="*"   value="${student.stuClass} ">
			</div>
			<div class="col-4"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2">专业：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text"  datatype="*" name="stuMajor"   value="${student.stuMajor}">
			</div> 
			<div class="col-2"></div>
		</div>
		
		
		
		
		
		
		 <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>家庭地址：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" name="stuAddress" datatype="*"   value="${student.stuAddress}">
			</div>
			<div class="col-4"> </div>
		</div> 
		
		
		<%--  <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>出生年月：</label>
			<div class="formControls col-5">
				<input type="text"  autocomplete="off"  class="input-text"  name="stuBirth" placeholder="yyyy-MM-dd" datatype="*"  value="${student.stuCreateTime}" >
				
			</div>
			<div class="col-1"> </div>	
		</div>
		 --%>
		
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
	 
	 
     $("#assetNoid").blur(function() {
	
		$.ajax({

			url : "asset/AssetNoServlet",

			cache : false,

			type : "GET",

			dataType : "json",

			async : true,

			data : {
				assetNo: $("#assetNoid").val()
			},

			success : function(msg) {

				//业务代码，改变页面的数据		     
				// alert(msg);

				if (msg == true) {
					$("#assetnowrongid").text("此编号存在,请重新输入！");
					$("#assetnowrongid").css("color","red");
					$("#assetNoid").focus();
					$("#buttonid").attr("class","btn disabled radius");
				}
				else {
					$("#assetnowrongid").text("通过");
					$("#assetnowrongid").css("color","green");
					$("#buttonid").attr("class","btn btn-primary radius");
				}

			},

			/* error : function(errordata) {
				alert("wrong!!" + errordata);
			} */

		});
});	 
	
})






	
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
				
				