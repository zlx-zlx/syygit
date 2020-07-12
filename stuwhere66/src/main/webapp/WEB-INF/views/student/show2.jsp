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
<title>毕业去向列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 毕业去向管理 <span class="c-gray en">&gt;</span> 毕业去向查看<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace('<%=basePath%>student/waySee');" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	
	<!-- <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a class="btn btn-primary radius" onclick="article_add('添加题库','returnPage/toaddQuestion')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加题目</a></span>  </div>
	 -->
	
	
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<!-- <th width="80">ID</th> -->
					<th width="80">序号</th>
					
					<th width="80">学号</th>
					<th width="80">就业公司</th>
					<th width="80">薪水</th>
					<th width="100">实习日期</th>
					<th width="100">工作地点</th>
					<th width="100">公司电话</th>
					<th width="100">满意度</th>
					<th width="100">单位联系人</th>
					<th width="75">从事职务</th>
					
					<th width="100">创建时间</th>
					<th width="100">创建者</th>
					<th width="100">状态</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ways }" var="wayss"   varStatus="sta">
				<tr class="text-c">
					<td>${sta.count }</td>
				
					<td>${wayss.stuNo }</td>
					
					<td>${wayss.wayCompany}</td>
					
					
					<td>${wayss.waySalary }</td>
					
					<td>${wayss.wayTime}</td>
					<%-- <td><fmt:formatDate value="${wayss.wayTime}"
						            pattern="yyyy-MM-dd" /></td> --%>
					<td>${wayss.wayAddrss}</td>
					<td>${wayss.wayPhone }</td>
					<td>${wayss.wayEvaluate }</td>
					<td>${wayss.wayCompanor }</td>
					<%-- <td><c:forEach items="${positions}" var="position"> 
                    ${position.poName}
                     </c:forEach></td>  --%>
                     <td>${wayss.position.poName }</td>
                     
					<td><fmt:formatDate value="${wayss.wayCreateTime}"
						            pattern="yyyy-MM-dd" /></td>
					<td>${student.stuName }</td>
					
					
                      
					
					<td class="td-status"><span class="label label-success radius">已登记</span></td>
				     <%-- <td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="登记"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('毕业去向修改','student/toUpdateWayUi?wayId=${way.wayId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a></td>
				 --%>
				
				<%-- 
				<td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="登记"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('毕业去向修改','student/toUpdateWaysUi?wayId=${way.wayId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a></td>
				 --%>
				
				<%-- <td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="登记"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('完善信息','student/toUpdateNewsUi123?wayId=${way.wayId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a></td>
				 --%>
				<td class="f-14 td-manage"> <a style="text-decoration:none" class="ml-5" onClick="article_edit('修改信息','student/toUpdateNewsUi123?wayId=${wayss.wayId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a></td>
				
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
/*资讯-审核*/
function article_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已登记</span>');
		$(obj).remove();
		layer.msg('已登记', {icon:6,time:1000});
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
	layer.confirm('确认没有登记吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_start(this,id)" href="javascript:;" title="登记"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">未登记</span>');
		$(obj).remove();
		layer.msg('未登记!',{icon: 5,time:1000});
	});
}

/*资讯-发布*/
function article_start(obj,id){
	layer.confirm('确认要登记吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_stop(this,id)" href="javascript:;" title="未登记"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已登记</span>');
		$(obj).remove();
		layer.msg('已登记!',{icon: 6,time:1000});
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 