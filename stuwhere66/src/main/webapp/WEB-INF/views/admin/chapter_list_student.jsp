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
<!-- <link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
 -->
<link href="<%=basePath%>static/zxb/css/H-ui.min.css" rel="stylesheet" type="text/css" />

<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>学校列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 学校管理 <span class="c-gray en">&gt;</span>学校信息<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace('<%=basePath%>admin/adminShowSchool');" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>

			<div class="pd-20">
			 <form action="admin/selectSchoolBysta" method="post">
	        <div class="text-c"> 
	       
		<input type="text" name="schName"  id="select" placeholder="学校名称" style="width:100px" class="input-text">
		
		
		
			<button type="submit" class="btn btn-success radius"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
				</form>
		</div>	
				
		
				
	<div class="cl pd-5 bg-1 bk-gray mt-20">
	 <span class="l"> <a class="btn btn-primary radius" onclick="member_add('添加学校','admin/toAddSchool' ,'500','300','300')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加学校</a></span>
	
	
	
		
	 </div>
	
                  
 
	
	
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<!-- <th width="25"><input type="checkbox" name="" value=""></th> -->
					<th width="250">序号</th>
					<th width="250">学校名称</th>
					
					<th width="250">学校代号</th>
					
					<th width="250">注册时间</th>
					<th width="250">注册者</th>
					<th with="50">学校详情</th>
					<th with="150">操作</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listSchools }" var="school"  varStatus="sta">
					<tr class="text-c">
						<td>${sta.count }</td>
						<td>${school.schName }</td>
						
						<td>${school.schCode }</td>
						<td><fmt:formatDate value="${school.schCreateTime}"
						            pattern="yyyy-MM-dd" /></td>
					
						<td>${school.schCreateBy }</td>
						
						
						
			            <td>
							<%-- <a href="javascript:;" onclick="chapterPractice1(this,'${school.schCode}')" class="btn btn-danger radius"> 教师详情</a> 
						 --%>
						
						<a href="<%=path%>/admin/chapterShowTable33?schCode=${school.schCode}"   class="btn btn-danger radius">教师详情</a>
					
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<span>
					<a href="<%=path%>/admin/chapterShowTable34?schCode=${school.schCode}"   class="btn btn-danger radius">学生详情</a>
					
					<%-- <a href="<%=path%>/admin/chapterManager?schCode=${school.schCode}"   class="btn btn-danger radius">学生f情</a>
					 --%>
					
					
					</span>
					
					
					
						 <%-- <span>
							<a href="javascript:;" onclick="chapterPractice(this,'${school.schCode}')" class="btn btn-danger radius"> 学生详情</a> 
						</span>  --%>
						 <td class="f-14 td-manage">
					
					<%--  <a style="text-decoration:none" class="ml-5" onClick="article_edit('修改信息','admin/toUpdateNewsUi?schId=${school.schId}','500','300','300')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
				 --%>
				 
				  <%-- <a style="text-decoration:none" class="ml-5" onClick="member_add11('修改信息','admin/toUpdateNewsUi?schId=${school.schId}','500','300','300')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
				
				 --%>
				
				
				<a title="修改" href="javascript:;" onclick="member_edit('修改','admin/toUpdateNewsUi?schId=${school.schId}','6','500','310')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> &nbsp;&nbsp;&nbsp;
						
					
					
					<%-- <a title="修改" href="javascript:;" onclick="member_edit('修改','admin/selectByIdAction1111?schId=${school.schId}','6','','710')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> &nbsp;&nbsp;&nbsp;
						 --%>
					<a title="删除" href="javascript:;" onclick="member_del(this,'${school.schId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					
				
						</td>
				  
						
					
					 </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		 
	</div>
	
	
	
	
	
	
	<%-- <td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit1('题目详情','question/selectQuestionByNameToPage?qbContent=${qBank.qbContent }','520')" title="查看">${qBank.qbContent }</u></td>
					 --%>
	
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
	"aaSorting": [[ 1, "dec" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[4,6,5]}// 制定列不参与排序
	]
});


 /*章节-添加*/
 function member_add(title,url,w,h){
 	//alert(url);
 	layer_show(title,url,w,h);
 	
 }
 
 
 

 /*章节-添加*/
 function member_add11(title,url,w,h){
 	//alert(url);
 	layer_show(title,url,w,h);
 	
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
 
 /*用户-编辑*/
 function member_edit(title,url,id,w,h){
 	
 	layer_show(title,url,w,h);
 }

 

/*用户-删除*/
function member_del(obj, schId) {
	layer.confirm('确认要删除吗？', function(index) {
		$(obj).parents("tr").remove();
		$.ajax({
			type: 'POST',
			
			url: 'admin/deleteSchool?schId='+schId,
			dataType: 'json',
			success: function(data){
				if(data==1){
					
					layer.msg('已删除!',{icon:1,time:1000});
				   // location.href="admin/adminShowSchool";
			}
				else{
					layer.msg('删除失败！',{icon:1,time:1000});
					location.href="admin/adminShowSchool";
				}
			},
			error:function(data) {
				console.log(data.msg);
			},

		});
		
	});
}


/*资讯-编辑*/
/* function article_edit(title,url,id,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	}); 
	layer.full(index); 
	//layer_show(title, url, w, h);
} */


function chapterPractice(obj,schCode){
	//alert(chapterId);
	window.location.href="${pageContext.request.contextPath}/admin/chapterShowTable?schCode="+schCode;
}
function chapterPractice1(obj,schCode){
	//alert(chapterId);
	window.location.href="${pageContext.request.contextPath}/admin/chapterShowTable2?schCode="+schCode;
}

</script> 
</body>
</html>




<%-- <td class="f-14 td-manage">
					
					 <a style="text-decoration:none" class="ml-5" onClick="article_edit('修改信息','teacher/toUpdateNewsUi?stuId=${student.stuId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
				
					<a title="删除" href="javascript:;" onclick="member_del(this,'${student.stuId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					
					
					 </td>
				
				
				<td> <a class="button border-yellow button-little" href="teacher/deleteStudent?stuId=${student.stuId }" onclick="{if(confirm('确认删除?')){return true;}return false;}">删除</a></td></tr>
					
					 <td><a title="删除" href="javascript:;" onclick="member_del(this,'${student.stuId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
							</td>
				 
				</tr>
				</c:forEach>
				
 --%>

































<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
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
<link href="<%=basePath%>css/iconfont.css" rel="stylesheet" type="text/css" />

<!-- <style type="text/css">
	.pi{
			width: 150px;
			height:40px;
			margin-bottom: 10px;
	}
	#space{
		width: 100%;
		height: 60px;
	}
</style>
 -->
<title>章节管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 课程管理 <span class="c-gray en">&gt;</span> 章节管理 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		
		
	</div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<th width="150">序号</th>
					<th width="">学校名</th>
					<th width="250">课程名</th>
					<th width="150">学校代号</th>
					<th width="150">创建人</th>
					<th width="250">创建时间</th>
					
					<th with="200">章节练习管理</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listSchools }" var="school"  varStatus="sta">
					<tr class="text-c">
						<td>${sta.count }</td>
						<td>${school.schName }</td>
						
						<td>${school.schCode }</td>
						<td>${school.schCreateBy }</td>
						<td><fmt:formatDate value="${school.schCreateTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td>
							<a href="javascript:;" onclick="chapterPractice(this,'${school.schCode}')" class="btn btn-danger radius"> 学校详情</a> 
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<div id="space"></div>
<script type="text/javascript" src="<%=basePath%>js/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="<%=basePath%>js/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 0, "" ]],//默认第几个排序,参数desc降序，默认升序。
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[1]}// 制定列不参与排序
		]
	});
	$('.table-sort tbody').on( 'click', 'tr', function () {
		if ( $(this).hasClass('selected') ) {
			$(this).removeClass('selected');
		}
		else {
			table.$('tr.selected').removeClass('selected');
			$(this).addClass('selected');
		}
	});
});
/*章节-添加*/
function member_add(title,url,w,h){
	//alert(url);
	layer_show(title,url,w,h);
	
}

/*用户-停用*/
function member_stop(obj,id,cuorseId){
	//window.location.href="b.html";
	
	layer.confirm('确认要停用吗？',function(index){
		 
		layer.msg('已停用!',{icon: 5,time:1000}); 
		
		setTimeout(function(){
			window.location.href="${pageContext.request.contextPath}/chapter/updateChapterAction?status=true&chapterId="+id+"&cuorseId="+cuorseId;
		}, 2000);
		
	});
	
	//window.location.href="updateChapterAction?status=true&chapterId="+id+"&cuorseId="+cuorseId;
}

/*用户-启用*/
function member_start(obj,id,cuorseId){
	layer.confirm('确认要启用吗？',function(index){
		//$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
		//$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		//$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
		setTimeout(function(){
			window.location.href="updateChapterAction?status=false&chapterId="+id+"&cuorseId="+cuorseId;
		}, 2000);
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	
	layer_show(title,url,w,h);
}

 /*用户-删除*/
/* function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
} */ 


function chapterPractice(obj,schCode){
	//alert(chapterId);
	window.location.href="${pageContext.request.contextPath}/admin/chapterShowTable2?schCode="+schCode;
}
</script> 
</body>
</html> --%>