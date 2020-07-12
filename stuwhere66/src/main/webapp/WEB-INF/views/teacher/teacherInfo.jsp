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
<title>个人信息</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 个人信息管理<span class="c-gray en">&gt;</span>个人信息
			<a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
</nav>
<div class="pd-10" style="padding-top:20px;">
  
  <table class="table table-border table-bordered table-bg mt-20">
    <thead>
      <tr>
        <th colspan="2" scope="col">个人信息</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th width="200">姓名</th>
        <td><span id="lbServerName">${teacher.teaName}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" class="btn btn-success radius" onClick="change_password('修改名称','teacher/toUpdateName','10001','300','300')" href="javascript:;" title="修改名称">修改名称</button>
        </td>
       
      </tr>
      <tr>
        <td>性别</td>
        <td>${teacher.teaSex }</td>
        </tr>
        <tr>
        <td>年龄</td>
        <td>${teacher.teaAge }</td>
      </tr>
      <tr>
        <td>教师编号</td>
        <td>${teacher.teaCode }</td> 
      </tr>
      <tr>
        <td>密码</td>
        <td>${teacher.teaPass }</td>
      </tr>
      <tr>
        <td>所属学校</td>
        <td>${teacher.schCode }</td>
      </tr>
      
      
     <tr>
        <td >注册时间：</td>
        <td><fmt:formatDate value="${teacher.teaCreateTime}"
					            	pattern="yyyy-MM-dd" /></td>
      </tr>
     
  
     
      
    </tbody>
  </table>
</div>
 &nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-success radius" onClick="change_password('修改密码','teacher/toUpdatePassword','10001','600','500')" href="javascript:;" title="修改密码">修改密码</button>


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
</html> 