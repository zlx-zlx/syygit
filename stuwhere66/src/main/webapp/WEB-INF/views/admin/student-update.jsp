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


<title>修改学生</title>
</head>
<body>
<div class="pd-20">
	<% 
    	String schName=request.getParameter("schName");
		String schCode=request.getParameter("schCode");
		
    %>
  <form action="updateStudent" method="post" class="form form-horizontal" id="form-member-add">
  	<input type="hidden" name="schCode" id="schCode" value="${student.schCode }" >
  	<input type="hidden" name="stuId" value="${student.stuId }">
  	
  	<div>
		  <input type="hidden" name="stuCreateTime" value="<fmt:formatDate value="${student.stuCreateTime}" pattern="yyyy-MM-dd HH:mm:ss"/> ">
                
		</div>
		
		<div>
		  <input type="hidden" name="stuFlag"  value="0" >
                
		</div>
		
		<div>
			<input type="hidden"   name="stuCreateBy"   value="${student.stuCreateBy}" >
			 </div>
		    
    <div >
		
			<input type="hidden"  name="stuYear"   value="${student.stuYear}"     >
			</div>
			 
			
			
			 
			<div>
				<input type="hidden"  name="stuBirth" placeholder="yyyy-MM-dd"  value="${student.stuBirth}"  >
				
			</div>
			
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学号：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="stuNoid" name="stuNo" datatype="n4-10" value="${student.stuNo}"  readonly="stuNo"   >
			<span id="stuNowrongid"></span>
			 </div>
			 
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>姓名：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="" name="stuName" datatype="*"   value="${student.stuName}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>密码：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="" name="stuPass" datatype="*4-10"  errormsg="密码为4-10位字符"  value="${student.stuPass}"   >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
      <label class="form-label col-2">学校名称：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="${school.schName }" readonly= id="schName" name="schName" >
      </div>
      <div class="col-2"> </div>
    </div>
		
		
		
		 
    
   
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-5"> <span class="select-box">
				<select name="stuSex" class="select" datatype="*" >
					<option>${student.stuSex}</option>
					
					<option value="男">男</option>
                     <option value="女">女</option>
                     <option value="未知">未知</option>
				</select>
				</span> </div>
				<div class="col-2"> </div>
		</div>
				
			
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>联系电话：</label>
			<div class="formControls col-5">
			<input type="text" class="input-text"  id="" name="stuPhone" datatype="m"   errormsg="手机号格式不正确"  value="${student.stuPhone}" >
			</div>
			 
			<div class="col-2"> </div>
		</div>
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>毕业动态：</label>
			<div class="formControls col-5"> <span class="select-box">
				<select name="stuStatus" class="select" datatype="*" >
					<option >${student.stuStatus}</option>
					<option value="已就业">已就业</option>
                     <option value="未就业">未就业</option>
                     <option value="考研">考研</option>
                      <option value="考公务员">考公务员</option>
                     <option value="出国">出国</option>
                     <option value="参军">参军</option>
				</select>
				</span> </div>
				<div class="col-2"> </div>
		</div>	
		
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>学历：</label>
			<div class="formControls col-5"><span class="select-box">
			<select name="stuEducation" class="select" datatype="*" >
			<option >${student.stuEducation}</option>
					<option value="专科">专科</option>
                     <option value="本科">本科</option>
                     <option value="硕士研究生">硕士研究生</option>
                     <option value="博士研究生">博士研究生</option>
                     
				</select>
				</span> </div>
				<div class="col-2"> </div>
		</div>	
		
		
		
		
		
		
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>班级：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" name="stuClass" datatype="*"   value="${student.stuClass}">
			</div>
			<div class="col-2"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2">专业：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text"  datatype="*" name="stuMajor"   value="${student.stuMajor}">
			</div> 
			<div class="col-2"></div>
		</div>
		
		
		
		
		
		
		 <div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>家庭地址：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" name="stuAddress" datatype="*"  value="${student.stuAddress}" >
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



    


/* $("#stuNo").blur(function(){
	
	var massage1=$("#stuNo").val();
	var massage2=$("#schCode").val();
	$.post("${pageContext.request.contextPath}/admin/checkChapterName",{stuNo:massage1,schCode:massage2},function(msg){
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
	
	
}); */

</script>
</body>
</html>