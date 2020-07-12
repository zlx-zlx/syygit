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
			<c:forEach items="${students }" var="student">
				<tr class="text-c">
				
					
					<td>${student.stuNo }</td>
					<td>${student.stuName }</td>
				   <td> ${student.school.schName }</td> 
					<c:forEach items="${schools}" var="school"> 
                    ${student.school.schName}
                     </c:forEach>
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

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
<link href="static/ll/bootstrap.min.css" rel="stylesheet"  type="text/css" />
<link href="static/ll/font-awesome.min.css" rel="stylesheet"   type="text/css" />
<link href="static/ll/footable.core.css" rel="stylesheet"   type="text/css" />
<link href="static/ll/animate.min.css" rel="stylesheet"  type="text/css" />
<link href="static/ll/style.min.css" rel="stylesheet"  type="text/css" />
<!-- Data Tables æ ¼å¼ -->
<link href="static/ll/dataTables/dataTables.bootstrap.css" rel="stylesheet"  type="text/css" />
<style>
th{
	text-align:center
}
.dataTable{
	text-align:center
}
</style>
	<link href="static/ll/datapicker/datepicker3.css" rel="stylesheet">
</head>
<body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row">
         <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>查看个人信息</h5>
                    </div>
                    <div class="ibox-content">
                        <div class="row form-body form-horizontal m-t">
                        
                        <!-- ********* Form start  *********  -->
	                    <form class="form-horizontal m-t" id="modifyform">
	                    	<input type="hidden" id="graduateInformationid" value="3"/>
	                    	
	                    	
							<div class="col-md-12">
								<div class="form-group">
									<label class="col-sm-3 control-label">毕业届数：</label>
									<div class="col-sm-7">
										<input type="text" id="graduationSession" name="stuYear" class="form-control required digits"
											placeholder="请输入毕业届数" value="${student.stuYear }" disabled="disabled">
									</div>
								</div>
							</div>
	                    	
	                    	<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">学号：</label>
									<div class="col-sm-7">
										<input type="text" id="stuNo" name="stuNo" class="form-control required digits"
											placeholder="请输入学号" value="${student.stuNo }" disabled="disabled">
									</div>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">姓名：</label>
									<div class="col-sm-7">
										<input type="text" id="name" name="stuName" class="form-control required"
											placeholder="请输入姓名" value="${student.stuName }" disabled="disabled">
									</div>
								</div>
							</div>
							</div>
							
						
						
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">学校：</label>
									<div class="col-sm-7">
										<select class="form-control required" id="sex" name="sex" disabled="disabled">
											<option value="" selected><c:forEach items="${students }" var="studentss">
				${studentss.school.schName }
			   </c:forEach></option>
				 
										</select>
									</div>
									<input type="hidden" > 
					
								</div>
							</div>
						
					<!--  <div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">性别：</label>
									<div class="col-sm-7">
										<select class="form-control required" id="sex" name="sex" disabled="disabled">
											<option value ="男">男</option>
											<option value ="女">女</option>
										</select>
									</div>
									<input type="hidden" id="sex2" value="男">
								</div>
							</div> 
							 -->
							<div class="col-md-6">
								<div class="form-group" id="data_1">
									<label class="col-sm-3 control-label">出生日期：</label>
									<div class="col-sm-7">
										<div class="input-group date">
										<span class="input-group-addon"><i
												class="fa fa-calendar"></i></span> 
												<input type="text" name="birthday" id="birthday"
												class="form-control required dateISO" value="${student.stuBirth }" readonly="readonly" disabled="disabled">
										</div>
									</div>
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-4">
								<div class="form-group">
									<label class="col-sm-3 control-label">学校代号</label>
									<div class="col-sm-7">
										
										<input type="text" id="name" name="schCode" class="form-control required"
											placeholder="请输入姓名" value="${student.schCode }" disabled="disabled">
									
									</div>
									<input type="hidden" id="collegeId2" value="${student.schCode }">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							<div class="col-md-4">
								<div class="form-group">
									<label class="col-sm-3 control-label">性别：</label>
									<div class="col-sm-7">
										<input type="text" id="name" name="schCode" class="form-control required"
											placeholder="请输入姓名" value="${student.stuSex }" disabled="disabled">
									
									</div>
									<input type="hidden" id="professionId2" value="1">
								</div>
							</div>
							
							<div class="col-md-4">
								<div class="form-group">
									<label class="col-sm-3 control-label">毕业动态：</label>
									<div class="col-sm-7">
										<input type="text" id="name" name="schCode" class="form-control required"
											placeholder="请输入姓名" value="${student.stuStatus }" disabled="disabled">
									
									</div>
									<input type="hidden" id="administrativeClassId2" value="1">
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">班级：</label>
									<div class="col-sm-7">
											<select class="form-control required" id="politicalStatus" name="stuClass" disabled="disabled">
												<option value="" selected>
				${student.stuClass }
			  </option>
											</select>
									</div>
									
								
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">籍贯：</label>
									<div class="col-sm-7">
										<input type="text" id="nativePlace" name="nativePlace" class="form-control required"
											placeholder="籍贯 省 市"  value="四川成都新都" disabled="disabled">
									</div>
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">专业：</label>
									<div class="col-sm-7">
											<select class="form-control required" id="nation" name="stuMajor" disabled="disabled">
											<option value="" selected>
				${student.stuMajor}
			</option>
											</select>
									</div>
									<input type="hidden"  value="${student.stuMajor }">
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">家庭住址：</label>
									<div class="col-sm-7">
										<input type="text"  id="identificationNumber" name="identificationNumber" class="form-control required isIdCardNo"
											placeholder="请输入身份证号码"  value="${student.stuAddress }" disabled="disabled">
									</div>
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">注册：</label>
									<div class="col-sm-7">
										<input type="text"    
						           id="identificationNumber" name="identificationNumber" class="form-control required isIdCardNo"
											placeholder="请输入身份证号码"  value="${student.stuCreateTime}"   disabled="disabled">
									</div>
									
								</div>
							</div>
							
							
							
							<div class="col-md-6">
								<div class="form-group" id="data_1">
									<label class="col-sm-3 control-label">注册时间：</label>
									<div class="col-sm-7">
										<div class="input-group date">
										<span class="input-group-addon"><i
												class="fa fa-calendar"></i></span> 
												<input type="text" name="stuCreateTime" id="birthday"
												class="form-control required dateISO" value="${student.stuCreateTime}"
						       readonly="readonly" disabled="disabled"   >
						         <fmt:formatDate value="${student.stuCreateTime}" pattern="yyyy-MM-dd" />
										
										
										
										
										 </div>
									</div>
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">注册时间：</label>
									
									<div class="col-sm-7">
										<div class="input-group date">
			
				<input type="text" class="text"  class="form-control required dateISO" id="test1" name="wayTime" placeholder="yyyy-MM-dd" datatype="*"  >
				
			</div>
			<div > </div>	
		</div>
			
							
							
							
							
							
							
							
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">生源地：</label>
									<div class="col-sm-7">
										<select class="form-control required" id="originPlace" name="originPlace" value="四川" disabled="disabled">
												<option>上海</option>
												<option>北京</option>
												<option>天津</option>
												<option>重庆</option>
												<option>河北</option>
												<option>山西</option>
												<option>吉林</option>
												<option>辽宁</option>
												<option>黑龙江</option>
												<option>陕西</option>
												<option>甘肃</option>
												<option>青海</option>
												<option>山东</option>
												<option>福建</option>
												<option>浙江</option>
												<option>河南</option>
												<option>湖北</option>
												<option>湖南</option>
												<option>江西</option>
												<option>江苏</option>
												<option>安徽</option>
												<option>广东</option>
												<option>海南</option>
												<option>四川</option>
												<option>贵州</option>
												<option>云南</option>
												<option>内蒙古</option>
												<option>新疆</option>
												<option>宁夏</option>
												<option>广西</option>
												<option>西藏</option>
											</select>
									</div>
									<input type="hidden" id="originPlace2" value="四川">
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">学历：</label>
									<div class="col-sm-7">
										<select class="form-control required" id="educationBackground" name="educationBackground" disabled="disabled">
												<option>专科</option>
												<option>本科</option>
												<option>硕士</option>
												<option>博士</option>
												<option>博士后</option>
											</select>
									</div>
									<input type="hidden" id="educationBackground2" value="本科">
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">手机号码：</label>
									<div class="col-sm-7">
										<input type="text" id="phone" name="phone" class="form-control required isPhone"
											placeholder="请输入手机号码"  value="12345" >
									</div>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">电子邮箱：</label>
									<div class="col-sm-7">
										<input type="text" id="email" name="email" class="form-control required email"
											placeholder="请输入电子邮箱"  value="12345@12.com" >
									</div>
								</div>
							</div>
							</div>
							
							<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">家庭地址：</label>
									<div class="col-sm-7">
										<input type="text" id="homeAddress" name="homeAddress" class="form-control required"
											placeholder="请输入家庭地址"  value="12345" >
									</div>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">家庭联系电话：</label>
									<div class="col-sm-7">
										<input type="text" id="homePhone" name="homePhone" class="form-control required isPhone"
											placeholder="请输入家庭联系方式"  value="12345" >
									</div>
								</div>
							</div>
							</div>
							
							<div class="col-md-7 col-sm-offset-5">
								<button  class="btn btn-primary"  type="submit"   >
								<i class="fa fa-check"> </i>更新</button>
							</div>
						</form>
						<!-- ********* Form end  *********  -->
						
                        </div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 全局js -->
	<!-- å¨å±js -->
<script src="static/ll/jquery-2.1.1.min.js"></script>
<script src="static/ll/bootstrap.min.js?v=3.4.0"></script>
<!-- èªå®ä¹js -->
<script src="static/ll/content.min.js?v=1.0.0"></script>

<!-- jQuery Validation plugin javascript-->
<script src="static/ll/jquery.validate.min.js"></script>
<script src="static/ll/messages_zh.min.js"></script>
<script src="static/ll/jquery.metadata.js"></script>


	
	<!-- DataPicker -->
    <script src="static/ll/bootstrap-datepicker.js"></script>

	<!-- jQuery Validation plugin javascript-->
	<script src="static/ll/jquery.validate.min.js"></script>
	<script src="/ssh_cemap/user/js/plugins/validate/messages_zh.min.js"></script>
	<script src="/ssh_cemap/js/ajaxfileupload.js"></script>
	<script>
		$(window).load(function() {
		});
	</script>
	<script type="text/javascript">
		$("#data_1 .input-group.date").datepicker({todayBtn:"linked",keyboardNavigation:!1,forceParse:!1,calendarWeeks:!0,autoclose:!0})
		
		window.onload = afterload;
        function afterload(){
			//基础信息 学院专业班级
        	var tmp = $("#collegeId2").val();
          	$("#collegeId").val(tmp);
        	var tmp1 = $("#professionId2").val();
          	$("#professionId").val(tmp1);
          	var tmp2 = $("#administrativeClassId2").val();
          	$("#administrativeClassId").val(tmp2);
          	//政治面貌
          	var tmp3 = $("#politicalStatus2").val();
          	$("#politicalStatus").val(tmp3);
          	//民族
          	var tmp4 = $("#nation2").val();
          	$("#nation").val(tmp4);
			//学历
          	var tmp5 = $("#educationBackground2").val();
          	$("#educationBackground").val(tmp5);
          	//生源地
          	var tmp6 = $("#originPlace2").val();
          	$("#originPlace").val(tmp6);
          	//户口性质
          	var tmp7 = $("#accountproperty2").val();
          	$("#accountproperty").val(tmp7);
          	//性别
          	var tmp7 = $("#sex2").val();
          	$("#sex").val(tmp7);
        }
		
		//下面是写三级联动的代码
		$('#collegeId').change(function(){ 
			var collegename = $(this).children('option:selected').html();
			var collegeid = $(this).children('option:selected').val();
			getprofession(collegeid);
		});
		
		$('#professionId').change(function(){ 
			var professionname = $(this).children('option:selected').html();
			var professionid = $(this).children('option:selected').val();
			getadministrativeclass(professionid);
		});
		
		function getprofession(collegeId){
			$.ajax
			({ 
			    url: "/ssh_cemap/administrativeclass/getprofession?collegeId="+collegeId,
			    method: 'GET',
			    dataType: "json", 
			    data: { 
			    },
			    success: function (data) {
			    		var array = data.data; 
			    		console.log(array.length);
			    		$('#professionId option').remove();
			    		$('#administrativeClassId option').remove();
			    		if(array.length>0){
			    			getadministrativeclass(array[0].id)
			     		for(var o in array){
			     			console.log(array[o].id);
			     			console.log(array[o].name);
			     			$('#professionId').append("<option value="+array[o].id+">"+array[o].name+"</option>");
			     		}
			    		}
			    }
			})		
		}
		
		function getadministrativeclass(professionId){
			$.ajax
			({ 
			    url: "/ssh_cemap/administrativeclass/getadministrativeclass?professionId="+professionId,
			    method: 'GET',
			    dataType: "json", 
			    data: { 
			    },
			    success: function (data) {
			    		var array = data.data; 
			    		console.log(array.length);
			    		$('#administrativeClassId option').remove();
			    		if(array.length>0){
			     		for(var o in array){
			     			console.log(array[o].id);
			     			console.log(array[o].name);
			     			$('#administrativeClassId').append("<option value="+array[o].id+">"+array[o].name+"</option>");
			     		}
			    		}
			    }
			})		
		}
		
		
		//数据校验
		$().ready(function () {
			// 在键盘按下并释放及提交后验证提交表单
			$("#modifyform").validate({
				rules: {
					studentId:{
						maxlength:15,
					},
					name:{
						maxlength:15,
					}
				},
				submitHandler: function (form) {
					$.ajax({
					type : "post",
					url : "/ssh_cemap/graduateinformation/update",
					data : {
						id : $("#graduateInformationid").val(),
						studentId : $("#studentId").val(),
						name : $("#name").val(),
						sex : $("#sex").val(),
						birthday : $("#birthday").val(),
						collegeId : $("#collegeId").val(),
						professionId : $("#professionId").val(),
						administrativeClassId : $("#administrativeClassId").val(),
						politicalStatus : $("#politicalStatus").val(),
						nation : $("#nation").val(),
						nativePlace : $("#nativePlace").val(),
						identificationNumber : $("#identificationNumber").val(),
						accountLocation : $("#accountLocation").val(),
						accountproperty : $("#accountproperty").val(),
						originPlace : $("#originPlace").val(),
						educationBackground : $("#educationBackground").val(),
						phone : $("#phone").val(),
						email : $("#email").val(),
						homeAddress : $("#homeAddress").val(),
						homePhone : $("#homePhone").val(),
					},
					dataType : "json",
					async : true,
					success : function(data) {
						alert(data.message);
	               		console.log(data);
						window.location.href = "/ssh_cemap/studentperson/saveorupdateInformationPage";
					},
					error : function(data) {
						alert("error");
					}
				});
				}
			});
		});
	</script>
</body>

</html> --%>