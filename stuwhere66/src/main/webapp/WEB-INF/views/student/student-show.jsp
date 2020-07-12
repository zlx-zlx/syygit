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
<div class="cl pd-20" style=" background-color:#5bacb6">
  <img class="avatar size-XL l" src="static/images/user.png">
  <dl style="margin-left:80px; color:#fff">
    <dt><span class="f-18">${student.stuName}</span> </dt>
    <dd class="pt-10 f-12" style="margin-left:0">这家伙很懒，什么也没有留下</dd>
  </dl>
</div>

 <div class="pd-20">
  <table class="table">
    <tbody>
      <tr>
        <th class="text-r" width="80">性别：</th>
        <td>${student.stuSex }</td>
      </tr>
       <tr>
        <th class="text-r">学校代号：</th>
        <td>${student.schCode }</td>
      </tr>
       
       <tr>
        <th class="text-r" width="80">学校名称：</th><c:forEach items="${students }" var="student">
        <td>${student.school.schName }</td> </c:forEach>
      </tr>
       
      
      <tr>
        <th class="text-r">专业名称：</th>
        <td>${student.stuMajor }</td>
      </tr>
      
      
      <tr>
        <th class="text-r">注册时间：</th>
        <td><fmt:formatDate value="${student.stuCreateTime}"
					            	pattern="yyyy-MM-dd" /></td>
      </tr>
      
     
     
    </tbody>
  </table>
</div> 
<script type="text/javascript" src="static/js/jquery.min.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script>
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
</body>
</html>