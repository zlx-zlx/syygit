<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="questionPaperToInfo" method="post">
请选择您的xx名称：
<select  name="schName">
<c:forEach items="${schools}" var="school">
<option>${school.schName}</option>
</c:forEach>
</select>

 <tr>
        <th class="text-r" width="80">性别：</th>
        <td>${student.stuSex }</td>
      </tr>
<input type="submit" value="确定"> 
</form>












<form action="questionPaperToInfo" method="post">
 <th class="text-r" width="80">学校名称：</th>

 <c:forEach items="${schools}" var="school"> 
<td>${school.schName}<td>
</c:forEach>


 <tr>
        <th class="text-r" width="80">性别：</th>
        <td>${student.stuSex }</td>
      </tr>
<tr>
        <th class="text-r" width="80">性别：</th>
        <td>${student.stuName }</td>
      </tr>
tr>
        <th class="text-r" width="80">性别：</th>
        <td>${student.stuNo }</td>
      </tr>
</form> 








</body>
</html> --%>





















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


<div class="pd-20" style="padding-top:20px;">
  
  <table class="table table-border table-bordered table-bg mt-20">
  
  
 <%-- <td>学校名称：</td>

 <c:forEach items="${schools}" var="school"> 
<td>${school.schName}<td>
</c:forEach>
 --%>

  <tbody>
   
      <tr>
        <th colspan="2" scope="col">个人信息</th>
      </tr>
   
  
    
    
    
      <tr>
        <th width="200">姓名</th>
        <td><span id="lbServerName">${student.stuName}</span></td>
      </tr>
      <tr>
        <td>学号</td>
        <td>${student.stuNo }</td>
      </tr>
      <tr>
        <td>密码</td>
        <td>${student.stuPass }</td>
      </tr>
      <tr>
        <td>所属学校</td>
        <td>${student.schCode }</td>
      </tr>
     <tr>
        <td >注册时间：</td>
        <td><fmt:formatDate value="${student.stuCreateTime}"
					            	pattern="yyyy-MM-dd" /></td>
      </tr>
     
  <tr>
     <td>学校名称：</td>

 <c:forEach items="${schools}" var="school"> 
<td>${school.schName}<td>
</c:forEach>
    </tr>
      
    </tbody>
    
  </table>
  
 
</div>

<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="static/js/H-ui.js"></script>
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>

</body>
</html>