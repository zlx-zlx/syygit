<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<link href="<%=basePath%>static/zxb/css/H-ui.min.css" rel="stylesheet" type="text/css" />

<link href="<%=basePath%>static/zxb/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
 
<link href="<%=basePath%>static/zxb/js/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
 
<link href="static/css/style.css" rel="stylesheet" type="text/css" />

<title>章节管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
	 	学校管理<span class="c-gray en">&gt;</span>	<a href="<%=path%>/admin/adminShowSchool">学校信息</a> <span class="c-gray en">&gt;</span><a href="javascript:location.replace(location.href);">学生信息</a> 
	 	<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
	 	
	 	</nav>



<div class="pd-20">
	<div class="text-c">
		
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
			<a href="javascript:;" onclick="member_add('添加学生','<%=path%>/admin/chapter-addstudent?schCode=${school.schCode }&schName=${school.schName }')" 
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加学生</a>
		</span>
		
	</div>
	
	
	
	
	
	<div class="mt-20">
	<!-- <table class="table   table-bordered  table-hover table-bg table-sort">
	 -->
	<table class="table table-border table-bordered table-bg table-hover table-sort">
			
		<thead>
			
			<tr class="text-c">
				
				<th width="80">序号</th>
				<th width="80">学号</th>
					<th width="80">姓名</th>
					<th width="80">密码</th>
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
					
					<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${listChapters }" var="student"  varStatus="sta">
				<tr class="text-c">
					
					<td>${sta.count }</td>
					
					<td>${student.stuNo }</td>
					<td>${student.stuName }</td>
					<td>${student.stuPass }</td>
				    <td>${school.schName }</td> 
					
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
					
					
					
					
					<td class="td-manage">
						<a title="修改" href="javascript:;" onclick="member_edit('修改','selectStudentByIdAction?stuId=${student.stuId}&schCode=${student.schCode}','6','','710')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> &nbsp;&nbsp;&nbsp;
						
					
							
	<%-- <a title="删除" href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}" onclick="return confirm('是否移除？')">移除</a>
						
				 --%>		
						<a title="删除" href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}" onclick="return confirm('是否删除？')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a> 
						
				
					
					
					<%-- 
					<a href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}" onclick="layer.confirm "
						>移除</a>
						
						 --%>
						
						
						
					
						
					<%-- <a onclick="layer.confirm('确定删除？')"   href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}"  
						  
				 
				>移除22</a>	
						 --%>
						
						
				
							
						</td>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	</div>
</div>
<script type="text/javascript" src="<%=basePath%>static/zxb/js/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/layer/1.9.3/layer.js"></script>

<script type="text/javascript" src="<%=basePath%>static/zxb/js/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.admin.js"></script> 
<script type="text/javascript">


$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "dec" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} ,//控制列的隐藏显示
		  {"orderable":false,"aTargets":[4,5,14]}// 制定列不参与排序
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


/*资讯-添加*/
function member_add(title,url,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
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

 

function chapterPractice(obj,chapterId){
	//alert(chapterId);
	window.location.href="${pageContext.request.contextPath}/chapterPractice/selectChapPractice?chapterId="+chapterId;
}









/*用户-删除*/
function member_dell(obj, stuId) {
	layer.confirm('确认要删除jj吗？', function(index) {
		$(obj).parents("tr").remove();
		$.ajax({
			type: 'POST',
			
			url: 'admin/deletesss?stuId='+stuId,
			dataType: 'json',
			success: function(data){
				if(data==1){
					
					layer.msg('已删除!',{icon:1});
				    location.reload();
			}
				else{
					layer.msg('删除失败！',{icon:1,time:1000});
					location.href="admin/adminShowTable34";
				}
			},
			error:function(data) {
				console.log(data.msg);
			},

		});
		
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
<link href="<%=basePath%>static/zxb/css/H-ui.min.css" rel="stylesheet" type="text/css" />

<link href="<%=basePath%>static/zxb/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
 
<link href="<%=basePath%>static/zxb/js/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
 
<link href="static/css/style.css" rel="stylesheet" type="text/css" />

<title>章节管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
	 	学校管理<span class="c-gray en">&gt;</span>	<a href="<%=path%>/admin/adminShowSchool">学校信息</a> <span class="c-gray en">&gt;</span><a href="javascript:location.replace(location.href);">学生信息</a> 
	 	<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
	 	
	 	</nav>



<div class="pd-20">
	<div class="text-c">
		
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
			<a href="javascript:;" onclick="member_add('添加学生','<%=path%>/admin/chapter-addstudent?schCode=${school.schCode }&schName=${school.schName }')" 
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加学生</a>
		</span>
		
	</div>
	
	
	
	
	
	<div class="mt-20">
	<!-- <table class="table   table-bordered  table-hover table-bg table-sort">
	 -->
	<table class="table table-border table-bordered table-bg table-hover table-sort">
			
		<thead>
			
			<tr class="text-c">
				
				<th width="80">序号</th>
				<th width="80">学号</th>
					<th width="80">姓名</th>
					<th width="80">密码</th>
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
					
					<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${listChapters }" var="student"  varStatus="sta">
				<tr class="text-c">
					
					<td>${sta.count }</td>
					
					<td>${student.stuNo }</td>
					<td>${student.stuName }</td>
					<td>${student.stuPass }</td>
				    <td>${school.schName }</td> 
					
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
					
					
					
					
					<td class="td-manage">
						<a title="修改" href="javascript:;" onclick="member_edit('修改','selectStudentByIdAction?stuId=${student.stuId}&schCode=${student.schCode}','6','','710')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> &nbsp;&nbsp;&nbsp;
						
					
							
	<a title="删除" href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}" onclick="return confirm('是否移除？')">移除</a>
						
						
						<a title="删除" href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}" onclick="return confirm('是否删除？')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a> 
						
				
					
					
					
					<a href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}" onclick="layer.confirm "
						>移除</a>
						
						
						
						
						
					
						
					<a onclick="layer.confirm('确定删除？')"   href="<%=basePath%>admin/removequestion?stuId=${student.stuId}&schCode=${student.schCode}"  
						  
				 
				>移除22</a>	
						
						
						
				
							
						</td>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	</div>
</div>
<script type="text/javascript" src="<%=basePath%>static/zxb/js/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/layer/1.9.3/layer.js"></script>

<script type="text/javascript" src="<%=basePath%>static/zxb/js/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.admin.js"></script> 
<script type="text/javascript">


$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "dec" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} ,//控制列的隐藏显示
		  {"orderable":false,"aTargets":[4,5,14]}// 制定列不参与排序
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


/*资讯-添加*/
function member_add(title,url,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
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

 

function chapterPractice(obj,chapterId){
	//alert(chapterId);
	window.location.href="${pageContext.request.contextPath}/chapterPractice/selectChapPractice?chapterId="+chapterId;
}









/*用户-删除*/
function member_dell(obj, stuId) {
	layer.confirm('确认要删除jj吗？', function(index) {
		$(obj).parents("tr").remove();
		$.ajax({
			type: 'POST',
			
			url: 'admin/deletesss?stuId='+stuId,
			dataType: 'json',
			success: function(data){
				if(data==1){
					
					layer.msg('已删除!',{icon:1});
				    location.reload();
			}
				else{
					layer.msg('删除失败！',{icon:1,time:1000});
					location.href="admin/adminShowTable34";
				}
			},
			error:function(data) {
				console.log(data.msg);
			},

		});
		
	});
}

</script> 
</body>
</html> --%>




















