﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<title>信息列表</title>
</head>
<body>
<%-- <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace('<%=basePath%>student/questionPaperPage');" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
 --%>

<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>个人信息管理 <span class="c-gray en">&gt;</span>查看个人信息 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px"  href="javascript:location.replace('<%=basePath%>student/questionPaperPage');" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	
	<!-- <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a class="btn btn-primary radius" onclick="article_add('添加题库','returnPage/toaddQuestion')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加题目</a></span>  </div>
	 -->
	<!-- <div class="cl pd-5 bg-1 bk-red mt-20" font color="red"><h4>个人详细信息</h4></div>
	 -->
	<div class="laber btn-danger radius"><h4>个人详细信息</h4></div>
	
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover ">
			<thead>
				<tr class="text-c">
					<!-- <th width="80">ID</th> -->
					<th width="80">学号</th>
					<th width="80">姓名</th>
				<th width="80">所属学校</th>
				<th width="100">学校代号</th> 
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
			<c:forEach items="${lists }" var="student">
				<tr class="text-c">
				
					
					<td>${student.stuNo }</td>
					<td>${student.stuName }</td>
				   <%-- <td> ${student.school.schName }</td> 
					<c:forEach items="${schools}" var="school"> 
                    ${student.school.schName}
                     </c:forEach> --%>
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
				     <td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="登记"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('完善信息','student/toUpdateNewsUi?stuId=${student.stuId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a></td>
				
				
				</tr>
				  </c:forEach>
			</tbody>
		</table>
	</div>
	
	
	

<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
<script type="text/javascript">
$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[11]}// 制定列不参与排序
	]
});

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


/*资讯-删除*/
function article_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'question/deleteQuestionBnak?qbId='+id,
			dataType: 'json',
			success: function(data){
				if(data==1){
				layer.msg('已删除!',{icon:1,time:2000});
				location.href="returnPage/toQuestionInfo";
			}
				else{
					layer.msg('删除失败！',{icon:1,time:2000});
					location.href="returnPage/toadmin-role";
				}
			},
			error:function(data) {
				console.log(data.msg);
			},
		});

		 /* $(obj).parents("tr").remove();
		layer.msg('已删除!',1);  */
	});
}


</script> 
</body>
</html>

 



































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
<link href="<%=basePath%>js/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />

<title>章节管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
	 	<a href="<%=path%>/chapter/showCourse">课程选择</a> <span class="c-gray en">&gt;</span><a href="javascript:location.replace(location.href);">章节管理 </a> 
	 	<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	<div class="text-c">
		
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
			<a href="javascript:;" onclick="member_add('添加章节','<%=path%>/chapter/chapter-add?courseId=${course.id }&courseName=${course.courseName }&corpId=${course.corpId }','','510')" 
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加章节</a>
		</span>
		<span class="r">共有数据：<strong>${fn:length(listChapters)}</strong> 条</span> 
	</div>
	<div class="mt-20">
	<table class="table   table-bordered  table-hover table-bg table-sort">
		<thead>
			
			<tr class="text-c">
				<!-- <th width="25"><input type="checkbox" name="" value=""></th> -->
				<th width="80">ID</th>
				<th width="">名</th>
				<th width="250">课程名</a></th>
				<th width="80">课程id</th>
				<th width="100">创建人</th>
				<th width="150">创建时间</th>
				<th width="100">修改人</th>
				<th width="150">修改时间</th>
				<th width="100">版本号</th>
				<th width="80">章节状态</th>
				<th width="150">操作</th>
				<th with="130">章节练习管理</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${lists }" var="student">
				<tr class="text-c">
					<!-- <td><input type="checkbox" value="1" name=""></td> -->
					
					
					<td>${student.stuName }</td>
					
					<td>${student.stuNo }</td>
					
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
					
					
					
					
					
					
					
					<td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'${chapter.chapterId }','${chapter.cuorseId }')" href="javascript:;" title="停用此章节"><i class="Hui-iconfont">&#xe631;</i></a> &nbsp;&nbsp;&nbsp;
						<a title="修改章节" href="javascript:;" onclick="member_edit('修改章节','selectChapterByIdAction?chapterId=${chapter.chapterId}&cuorseId=${chapter.cuorseId}','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> &nbsp;&nbsp;&nbsp;
						<a style="text-decoration:none" onClick="member_start(this,'${chapter.chapterId }','${chapter.cuorseId }')" href="javascript:;" title="启用此章节"><i class="Hui-iconfont">&#xe6e1;</i></a>&nbsp;&nbsp;&nbsp;
						<a title="删除(暂时不实现)" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					</td>
					<td>
						<a href="javascript:;" onclick="chapterPractice(this,'${chapter.chapterId }')" class="btn btn-danger radius"><!-- <i class="Hui-iconfont">&#xe6e2;</i> --> 章节练习</a> 
					</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	</div>
</div>
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
		"aaSorting": [[ 0, "" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} ,//控制列的隐藏显示
		  {"orderable":false,"aTargets":[1,2,3,4,5,6,7,8,9,10,11]}// 制定列不参与排序
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

function chapterPractice(obj,chapterId){
	//alert(chapterId);
	window.location.href="${pageContext.request.contextPath}/chapterPractice/selectChapPractice?chapterId="+chapterId;
}
</script> 
</body>
</html> --%>