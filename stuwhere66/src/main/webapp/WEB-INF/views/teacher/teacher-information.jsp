<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>学生列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 学生管理 <span class="c-gray en">&gt;</span>学生信息<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace('<%=basePath%>teacher/toQuestionInfo2');" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>

			<div class="pd-20">
			 <form action="teacher/selectStudentBysta" method="post">
	        <div class="text-c"> 
	       
		
		 <input type="text" name="stuNo"  id="select" placeholder="学号" style="width:100px" class="input-text">
		
		<input type="text" name="stuMajor"  id="select" placeholder="专业名称" style="width:100px" class="input-text">
		<select name="stuStatus" style="width:150px" class="input-text" >
				<option value="" selected>毕业动态</option>
				<option value="已就业">已就业</option>
                     <option value="未就业">未就业</option>
                     <option value="考研">考研</option>
                      <option value="考公务员">考公务员</option>
                     <option value="出国">出国</option>
                     <option value="参军">参军</option>	
			</select>		
		
		
			<button type="submit" class="btn btn-success radius"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
				</form>
		</div>	
				
		
				
	<div class="cl pd-5 bg-1 bk-gray mt-20">
	 <span class="l"> <a class="btn btn-primary radius" onclick="article_add('添加学生','teacher/toAddStudent')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加学生</a></span>
	<span class="r"><a class="btn btn-primary radius" title="导出" data-href="<%=basePath%>teacher/exportExcel" href="<%=basePath%>teacher/exportExcel"><i class="Hui-iconfont">&#xe644;</i> 导出 </a></span> 
		
	 </div>
	
	
		
		<%-- <div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l"> <a class="btn btn-primary radius" data-title="导出Excel" data-href="<%=basePath%>teacher/exportExcel" href="<%=basePath%>teacher/exportExcel"><i class="Hui-iconfont">&#xe600;</i> 导出Excel</a></span> 
		 </div>
	 --%>
		
                  
<%-- <div class="pd-20">
	<form action="teacher/selectStudentByNo" method="post">
	<div class="text-c"> <!-- <span class="select-box inline">
		 <select name="" class="select">
			<option value="0">机构分类</option>
			<option value="1">分类一</option>
			<option value="2">分类二</option>
		</select>
		</span>  -->
	
		<input type="text" name="stuNo"  id="select" placeholder="题目内容" style="width:250px" class="input-text">
		
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜题目</button>
	</div>
	</form>	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a class="btn btn-primary radius" onclick="article_add('添加题库','returnPage/toaddQuestion')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加题目</a></span> <span class="r">共有数据：<strong>${pageInfo.total }</strong> 条</span> </div>
	 --%>
	
	
	
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<!-- <th width="25"><input type="checkbox" name="" value=""></th> -->
					<th width="80">序号</th>
					<th width="80">学号</th>
					<th width="80">姓名</th>
				<th width="100">所属学校</th> 
					<th width="100">性别</th>
					<th width="100">出生年月</th>
					<th width="100">联系电话</th>
					<th width="100">毕业动态</th>
					<th width="75">入学年份</th>
					<th width="75">学历</th>
					<th width="60">班级</th>
					<th width="60">专业</th>
					<th width="100">家庭地址</th>
					<th width="100">注册时间</th>
					<th width="100">状态</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${student  }" var="student"   varStatus="sta">
			
				<tr class="text-c">
				
				
				<td>${sta.count }</td>
					
					<%-- <td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit1('题目详情','question/selectQuestionByNameToPage?qbContent=${qBank.qbContent }','520')" title="查看">${qBank.qbContent }</u></td>
					 --%>
					<td>${student.stuNo }</td>
					<td>${student.stuName }</td>
					
				  <%--  <td> 
				${student.school.schName }  </td> 
			   --%>
                     
					<%-- <td>
					<c:forEach items="${schools}" var="school"> 
                    ${student.school.schName}
                     </c:forEach></td>  --%>
					<td>${student.schCode }</td>
					<td>${student.stuSex }</td>
					<td>${student.stuBirth }</td>
					<td>${student.stuPhone }</td>
					<td>${student.stuStatus }</td>
					<td>${student.stuYear }</td>
					<td>${student.stuEducation }</td>
					<td>${student.stuClass }</td>
					<td>${student.stuMajor }</td>
					<td>${student.stuAddress }</td>
					<td><fmt:formatDate value="${student.stuCreateTime}"
						            pattern="yyyy-MM-dd" /></td>
					
					
					<td class="td-status"><span class="label label-success radius">已登记</span></td>
					
					<td class="f-14 td-manage">
					
					 <a style="text-decoration:none" class="ml-5" onClick="article_edit('修改信息','teacher/toUpdateNewsUi?stuId=${student.stuId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
				
					<a title="删除" href="javascript:;" onclick="member_del(this,'${student.stuId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					
					
					 </td>
				
				<%-- 
				<td> <a class="button border-yellow button-little" href="teacher/deleteStudent?stuId=${student.stuId }" onclick="{if(confirm('确认删除?')){return true;}return false;}">删除</a></td></tr>
					 --%>
					 <%-- <td><a title="删除" href="javascript:;" onclick="member_del(this,'${student.stuId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
							</td>
				  --%>
				</tr>
				</c:forEach>
				
			</tbody>
		</table>
		 
	</div>
	
	
	
	
	
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
<script type="text/javascript" src="static/layui_exts/excel.js"></script>
<script type="text/javascript" src="static/layui_exts/excel.min.js"></script>
<script type="text/javascript">




$('.table-sort').dataTable({
	"aaSorting": [[ 1, "asc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[3]}// 制定列不参与排序
	]
});


/*用户-删除*/
function member_del(obj, stuId) {
	layer.confirm('确认要删除吗？', function(index) {
		$(obj).parents("tr").remove();
		$.ajax({
			type: 'POST',
			
			url: 'teacher/deleteStudent?stuId='+stuId,
			dataType: 'json',
			success: function(data){
				if(data==1){
					
					layer.msg('已删除!',{icon:1,time:1000});
				    //location.href="teacher/toQuestionInfo2";
			}
				else{
					layer.msg('删除失败！',{icon:1,time:1000});
					location.href="teacher/toQuestionInfo2";
				}
			},
			error:function(data) {
				console.log(data.msg);
			},

		});
		
	});
}



/*资讯-添加*/
function article_add(title,url,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*资讯-编辑*/
function article_edit(title,url,id,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	}); 
	layer.full(index); 
	//layer_show(title, url, w, h);
}
/* 题目详情 */
function article_edit1(title,url,id,w,h){
	 /* 	var index = layer.open({
			type: 2,
			title: title,
			content: url
		}); 
		layer.full(index); */
		layer_show(title, url, w, h);
	}



/*资讯-审核*/
function article_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}
/*资讯-下架*/
function article_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}

/*资讯-发布*/
function article_start(obj,id){
	layer.confirm('确认要发布吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布!',{icon: 6,time:1000});
	});
}
/*资讯-申请上线*/
function article_shenqing(obj,id){
	$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
	$(obj).parents("tr").find(".td-manage").html("");
	layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
}




</script> 
</body>
</html>






































<%-- <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<title>学生个人信息</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 个人信息管理<span class="c-gray en">&gt;</span>学生个人信息
			<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
</nav>
<div class="pd-20" style="padding-top:20px;">
  
  <table class="table table-border table-bordered table-bg mt-20">
    <thead>
      <tr>
        <th colspan="2" scope="col">学生个人信息</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th width="200">学生姓名</th>
        <td><span id="lbServerName">${student.stuName}</span></td>
      </tr>
      <tr>
        <td>学生学号</td>
        <td>${student.stuNo }</td>
      </tr>
      <tr>
        <td>学生密码</td>
        <td>${student.stuPass }</td>
      </tr>
      <tr>
        <td>所属学校</td>
        <td>${student.schCode }</td>
      </tr>
      <tr>
        <td>入学年月</td>
        <td>${student.stuYear }</td>
      </tr>
      
      <tr>
        <td>专业</td>
        <td>${student.stuMajor }</td>
      </tr>
     
      <tr>
        <td>注册时间</td>
        <td><fmt:formatDate value="${student.stuCreateTime}"
					            	pattern="yyyy-MM-dd" /></td>
      </tr>
     
      
      
    </tbody>
  </table>
</div>
 &nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-success radius" onClick="change_password('修改密码','student/toUpdatePassword','10001','600','270')" href="javascript:;" title="修改密码">修改密码</button>

<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="static/js/H-ui.js"></script>
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
<script type="text/javascript">

/*密码-修改*/
function change_password(title, url, id, w, h) {
	layer_show(title, url, w, h);
}

</script>
</body>
</html> --%>