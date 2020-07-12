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
	 	学校管理<span class="c-gray en">&gt;</span>	<a href="<%=path%>/admin/adminShowSchool">学校信息</a> <span class="c-gray en">&gt;</span><a href="javascript:location.replace(location.href);">老师信息</a> 
	 	<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
	 	
	 	</nav>
<div class="pd-20">
	<div class="text-c">
		
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
			<a href="javascript:;" onclick="member_add('添加老师','<%=path%>/admin/chapter-add?schCode=${school.schCode }&schName=${school.schName } ','600','510','400')" 
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加老师</a>
		</span>
		
		
	</div>
	<div class="mt-20">
	<!-- <table class="table   table-bordered  table-hover table-bg table-sort">
	 -->
	<table class="table table-border table-bordered table-bg table-hover table-sort">
			
		<thead>
			
			<tr class="text-c">
				
				
				<th width="80">序号</th>
					<th width="80">老师名称</th>
					<th width="80">老师编号</th>
					
				  <th width="80">所属学校</th> 
				    <th width="80">学校代号</th>
				       <th width="80">密码</th> 
				       
					<th width="100">性别</th>
					<th width="100">年龄</th>
					
					<th width="100">注册时间</th>
					
					<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${listChapters }" var="teacher"  varStatus="sta">
				<tr class="text-c">
					
					<td>${sta.count }</td>
					<td>${teacher.teaName }</td>
					<td>${teacher.teaCode }</td>
					 <td>${school.schName }</td> 
				   <td>${teacher.schCode }</td>
					<td>${teacher.teaPass }</td>
					<td>${teacher.teaSex }</td>
					
					<td>${teacher.teaAge }</td>
					
					<td><fmt:formatDate value="${teacher.teaCreateTime}"
						            pattern="yyyy-MM-dd" /></td>
					
					
					
					<td class="td-manage">
						<a title="修改章节" href="javascript:;" onclick="member_edit('修改','selectChapterByIdAction?teaId=${teacher.teaId}&schCode=${teacher.schCode}','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> &nbsp;&nbsp;&nbsp;
						<%-- <a title="删除" href="javascript:;" onclick="member_del(this,'${teacher.teaId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					 --%>
						<%-- <a title="删除" href="<%=basePath%>admin/teacherDelete?teaId=${teacher.teaId}"  onclick="return confirm('确认要删除吗？')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a>
						<a title="删除" href="javascript:;" onclick="member_del(this,'${teacher.teaId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					 --%>
				
				
				<a title="删除" href="<%=basePath%>admin/removequestion11?teaId=${teacher.teaId}&schCode=${teacher.schCode}" onclick="return confirm('是否删除？')" class="ml-5" style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a> 
						
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	</div>
</div>
<%-- <script type="text/javascript" src="<%=basePath%>static/zxb/js/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/layer/1.9.3/layer.js"></script>

<script type="text/javascript" src="<%=basePath%>static/zxb/js/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/zxb/js/H-ui.admin.js"></script> 
<script type="text/javascript">
 --%>
<script type="text/javascript" src="<%=basePath%>static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=basePath%>static/js/H-ui.admin.js"></script>
<script type="text/javascript" src="<%=basePath%>static/layui_exts/excel.js"></script>
<script type="text/javascript" src="<%=basePath%>static/layui_exts/excel.min.js"></script>
<script type="text/javascript">


$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "dec" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} ,//控制列的隐藏显示
		  {"orderable":false,"aTargets":[3,4,8]}// 制定列不参与排序
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



/*用户-编辑*/
function member_edit(title,url,id,w,h){
	
	layer_show(title,url,w,h);
}

/*用户-删除*/
function member_del(obj, teaId) {
	layer.confirm('确认要删除吗？', function(index) {
		$(obj).parents("tr").remove();
		$.ajax({
			type: 'POST',
			
			url: 'admin/deleteSchool2222?teaId='+teaId,
			dataType: 'json',
			success: function(data){
				if(data==1){
					
					layer.msg('已删除!',{icon:1,time:2000});
				  // location.href="admin/chapterShowTable33";
			}
				else{
					layer.msg('删除失败！',{icon:1,time:2000});
					//location.href="admin/adminShowSchool";
					location.href="admin/chapterShowTable33";
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