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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理
			<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="pd-20">
			<div class="text-c"> 			
				<form action="teacher/studentsPageIf" method="post">
	         		<input type="text" class="input-text" style="width:100px" placeholder="输入学生ID" name="sId" /> 
					<input type="text" class="input-text" style="width:100px" placeholder="输入用户名" name="sUsername" />
					<input type="text" class="input-text" style="width:100px" placeholder="输入机构ID" name="sInsid" />
	       		    <input type="text" class="input-text" style="width:100px" placeholder="输入创建时间" name="sCreateTime" /><br/><br/>
				
					<button type="submit" class="btn btn-success radius"><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
				</form>
				
			</div>
			<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a href="javascript:;" onclick="member_add('添加用户','teacher/studentAddInput','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加学生</a></span> 
			<span class="r">共有数据：<strong>${infos.total}</strong> 条</span>
			</div>
			<div class="mt-20">
				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">							
							<th width="80">学生ID</th>
							<th width="80">机构ID</th>
							<th width="100">用户名</th>
							<th width="80">密码</th>
							<th width="90">创建者</th>
							<th width="100">创建时间</th>							
							<th width="90">修改者</th>
							<th width="100">修改时间</th>							
							<th width="100">操作</th>
						</tr>
					</thead>
					
					<tbody>
					<c:forEach items="${students }" var="student">					
						<tr class="text-c">
							<td>${student.sId }</td>
							<td>${student.sInsid }</td>
							<td>${student.sUsername }</td>
							<td>${student.sPassword }</td>
							<td>${student.sCreateBy}</td>
							<td><fmt:formatDate value="${student.sCreateTime}"
					            	pattern="yyyy-MM-dd" /></td>
							<td>${student.sModifyBy}</td>
							<td><fmt:formatDate value="${student.sModifyTime}"
						            pattern="yyyy-MM-dd" /></td>
							<td class="td-manage">
								
								<a title="修改" href="javascript:;" onclick="member_edit('修改','teacher/studentUpdate?sId=${student.sId }','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
								
								<a title="删除" href="javascript:;" onclick="member_del(this,'${student.sId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
							</td>
						</tr>
						</c:forEach>
					</tbody>					
				</table>
				<div>

		当前第 ${infos.pageNum} 页,总 ${infos.pages} 页
		<a href="teacher/studentsPageIf?pagenum=1&sId=${student.sId }&sUsername=${student.sUsername }&sInsid=${student.sInsid }&sCreateTime=<fmt:formatDate value="${student.sCreateTime}"/>">首页</a>


		<c:if test="${infos.hasPreviousPage }">
			<a href="${webpath}/teacher/studentsPageIf?pagenum=${infos.pageNum-1}&sId=${student.sId }&sUsername=${student.sUsername }&sInsid=${student.sInsid }">上一页</a>
		</c:if>


		<c:forEach items="${infos.navigatepageNums}" var="pagenumber">
			<a href="${webpath}/teacher/studentsPageIf?pagenum=${pagenumber}&sId=${student.sId }&sUsername=${student.sUsername }&sInsid=${student.sInsid }">${pagenumber}</a>
		</c:forEach>


		<c:if test="${infos.hasNextPage }">
			<a href="${webpath}/teacher/studentsPageIf?pagenum=${infos.pageNum+1}&sId=${student.sId }&sUsername=${student.sUsername }&sInsid=${student.sInsid }">下一页</a>
		</c:if>



		<a href="${webpath}/teacher/studentsPageIf?pagenum=${infos.pages}&sId=${student.sId }&sUsername=${student.sUsername }&sInsid=${student.sInsid }">末页</a>


	</div>
			</div>
		</div>
		<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
		<!-- <script type="text/javascript" src="static/lib/laypage/1.2/laypage.js"></script> -->
		<!-- <script type="text/javascript" src="static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> -->
		<script type="text/javascript" src="static/js/H-ui.js"></script>
		<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
		<script type="text/javascript">
		
			/*用户-添加*/
			function member_add(title, url, w, h) {
				layer_show(title, url, w, h);
			}
			
			/*用户-编辑*/
			function member_edit(title, url, id, w, h) {
				layer_show(title, url, w, h);
			}
			
			/*用户-删除*/
			function member_del(obj, sId) {
				layer.confirm('确认要删除吗？', function(index) {
					$(obj).parents("tr").remove();
					$.ajax({
						type: 'POST',
						url: 'teacher/studentDelete?sId='+sId,
						dataType: 'json',
						success: function(data){
							if(data==1){
								
								layer.msg('已删除!',{icon:1,time:2000});
							    location.href="teacher/studentsPageIf";
						}
							else{
								layer.msg('删除失败！',{icon:1,time:2000});
								location.href="teacher/studentsPageIf";
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