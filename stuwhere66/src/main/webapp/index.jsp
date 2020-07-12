 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("webpath", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>高校学生毕业去向管理系统用户登录</title>
<link rel="stylesheet" type="text/css"  href="static/ts/login.css" media="all">
    <script type="text/javascript"  src="static/ts/jQuery1.7.js"></script>
    <script type="text/javascript"  src="static/ts/jquery-1.8.2.min.js"></script>
    <script type="text/javascript"  src="static/ts/jquery1.42.min.js"></script>
    <script type="text/javascript"  src="static/ts/jquery.SuperSlide.js"></script>
    <script type="text/javascript"  src="static/ts/Validform_v5.3.2_min.js"></script>
    <!-- 验证码格式 -->
    <link rel="stylesheet" href="static/layui/css/layui.css" media="all" />
<script type="text/javascript">
$(document).ready(function(){
	var $tab_li = $('#tab ul li');
	$tab_li.hover(function(){
		$(this).addClass('selected').siblings().removeClass('selected');
		var index = $tab_li.index(this);
		$('div.tab_box > div').eq(index).show().siblings().hide();
	});	
});






</script>



<script type="text/javascript">
    $(function () {
        
        
        $(".reader_login_error").Validform({
            tiptype: function (msg, o, cssctl) {
                var objtip = $(".reader_error_box");
                cssctl(objtip, o.type);
                objtip.text(msg);
            }
        })
        
       $(".admin_login_error").Validform({
            tiptype: function (msg, o, cssctl) {
                var objtip = $(".admin_error_box");
                cssctl(objtip, o.type);
                objtip.text(msg);
            }
        })
        // 管理员登录验证结束
    }) 
</script>
<script type="text/javascript">
    $(function(){
        $(".screenbg ul li").each(function(){
            $(this).css("opacity","0");
        });
        $(".screenbg ul li:first").css("opacity","1");
        var index = 0;
        var t;
        var li = $(".screenbg ul li");
        var number = li.size();
        function change(index){
            li.css("visibility","visible");
            li.eq(index).siblings().animate({opacity:0},3000);
            li.eq(index).animate({opacity:1},3000);
        }
        function show(){
            index = index + 1;
            if(index<=number-1){
                change(index);
            }else{
                index = 0;
                change(index);
            }
        }
        t = setInterval(show,8000);
        //根据窗口宽度生成图片宽度
        var width = $(window).width();
        $(".screenbg ul img").css("width",width+"px");
    });
</script>
  
<script type="text/javascript">

$(function() {
	//点击图片切换验证码
	$("#vcodeImg").click(function() {
		this.src="adminlogin/get_cpacha?vl=4&w=120&h=40&t=" + new Date().getTime();
	});
});

$(function() {
	//点击图片切换验证码
	$("#vcodeImg1").click(function() {
		this.src="adminlogin/get_cpacha?vl=4&w=120&h=40&t=" + new Date().getTime();
	});
});

	
$(function() {
	//点击图片切换验证码
	$("#vcodeImg2").click(function() {
		this.src="adminlogin/get_cpacha?vl=4&w=120&h=40&t=" + new Date().getTime();
	});
});

</script>
</head>

<body>
<div id="tab">
  <ul class="tab_menu">
    <li class="selected">学生登录</li>
    <li>老师登录</li>
    <li>管理员登录</li>
  </ul>
  <div class="tab_box"> 
    <!-- 学生登录开始 -->
    <div>
      <div class="reader_error_box"></div>
      <form  action="studentlogin/indx" class="reader_login_error"  method="post">
         <div id="">
        <label>学  号：</label>
        <input type="text" id=""  autocomplete="off"   name="stuNo" placeholder="请输入学号" nullmsg="学号不能为空"
         datatype="n4-10" errormsg="学号在4~10个数字之间" readermsg="学号验证通过"  />
        </div>
        
        <div id="">
        <label>密   码：</label>
        <input type="password" id=""  autocomplete="off"   name="stuPass" placeholder="请输入密码" nullmsg="密码不能为空"
         datatype="*4-10" errormsg="密码在4~10个字符之间" readermsg="密码验证通过"/>
        </div>
        
        
      <div id="">
 <label>验证码：</label>
  
           <input  name="vcode" type="text"   style="width:180px;height:50px;" id="vcode"  autocomplete="off"   placeholder="请输入验证码"
            nullmsg="验证码不能为空"     datatype="*4-4"  errormsg="验证码有四位"  readermsg="验证通过"/> 
    <img title="点击图片刷新验证码  " id="vcodeImg" src="adminlogin/get_cpacha?vl=4&w=120&h=40"></img></div>
     
       <div id="" ></div>
      <style type="text/css">
    a:link,a:visited{
   text-decoration:none;  /*超链接无下划线*/
}
    a:hover{
   text-decoration:underline;  /*鼠标放上去有下划线*/
}
</style> 
       
       
       
没有账号?<a href="register.jsp">马上注册</a><div ></a> 
        </div>
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
    </div>
    
    
   
   <!-- 导师登录开始-->
    <div class="hide">
     <div class="reader_error_box"></div>
      <form  action="teacherlogin/teaindx"  class="reader_login_error"   method="post">
      
        <div id="">
          <label>老 师 编 号：</label>
           <input  name="teaCode" type="text"   id=""  autocomplete="off"   placeholder="请输入老师编号"
             nullmsg="老师编号不能为空"   datatype="n4-10" errormsg="老师编号在4~10个数字之间"  readermsg="验证通过"/>    
        </div>
        
        <div id="">
          <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
           <input  name="teaPass" type="password"   id=""  autocomplete="off"   placeholder="请输入密码"
             nullmsg="密码不能为空"   datatype="*4-10" errormsg="密码在4~10个字符之间" readermsg="密码验证通过"/>    
        </div>
        
        
         <div id="">
    <label>验&nbsp;&nbsp;证&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
  
           <input  name="vcode" type="text"   style="width:180px;height:50px;" id="vcode"  autocomplete="off"   placeholder="请输入验证码"
            nullmsg="验证码不能为空"     datatype="*4-4"  errormsg="验证码有四位"  readermsg="验证通过"/> 
    <img title="点击图片刷新验证码  " id="vcodeImg1" src="adminlogin/get_cpacha?vl=4&w=120&h=40"></div>
        
        
         
   <div id=""><span id="remember">
      <input type="checkbox" name="remember">
      <label>记住密码</label>
      </span><!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         
没有账号?<a href="register.jsp" >马上注册</a> -->
        </div>
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
    </div>
    
     
     
     
     <!-- 教务登录开始-->
    <div class="hide">
    <div class="reader_error_box"></div>
      <form  action="adminlogin/adindx" class="reader_login_error"   method="post">
       <div id="">
        <label>用户名：</label>
           <input  name="adName" type="text"   autocomplete="off" id=""   placeholder="请输入用户名"
             nullmsg="用户名不能为空"   datatype="*2-10"   errormsg="用户名在2~10个字符之间" readermsg="验证通过"/>    
        </div>
      
      
      <div id="">
        <label>密&nbsp;&nbsp;&nbsp;码：</label>
           <input  name="adPass" type="password"   autocomplete="off" id=""   placeholder="请输入密码"
             nullmsg="密码不能为空"   datatype="*4-10" errormsg="密码在4~10个字符之间"  readermsg="验证通过"/>    
        </div>
        
          <div id="">
 <label>验证码：</label>
  
           <input  name="vcode" type="text"   style="width:180px;height:50px;" id="vcode"  autocomplete="off"   placeholder="请输入验证码"
            nullmsg="验证码不能为空"     datatype="*4-4"  errormsg="验证码有四位"  readermsg="验证通过"/> 
    <img title="点击图片刷新验证码  " id="vcodeImg2" src="adminlogin/get_cpacha?vl=4&w=120&h=40"></div>
        
		
      
        <div id="remember">
         <input type="checkbox" name="remember">
          <label>记住密码</label>
         </div>
        
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
      
      
    </div>
     <!-- 教务登录结束-->
  </div>
</div>
<!-- <div class="bottom">©2020 Leting <a href="javascript:;" target="_blank">关于</a> <span>京ICP证030173号</span>  More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a><img width="13" height="16" src="images/copy_rignt_24.png" /></div>
 -->
<div class="screenbg">
  <ul>
    <!-- <li><a href="javascript:;"><img src="images/0.jpg"></a></li>
 -->
    <li><a href="javascript:;"><img src="images/2.jpg"></a></li> 
    <li><a href="javascript:;"><img src="images/01.jpg"></a></li>
    <li><a href="javascript:;"><img src="images/00.jpg"></a></li>
    
  </ul>
</div>
</body>
</html>
 
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 
               
        
        
    <!--    
     function refresh(){
    $('#verifyCodeImg').attr("src", "validatecode.jsp?time=" + new Date())
   $('#verifyCode').val("")
}
 -->
                
    
<!-- <div id="">
		<label>验证码：</label>
          <div id="verify" >
           <input id="verifyCode" name="verifyCode" class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" style="width:150px;">
           
            <img id="verifyCodeImg" src=""> <a onclick="refresh()" id="kanbuq" href="javascript:;">看不清，换一张</a> </div>
            </div>
     -->
    
  <!--  //原始版本,备用 -->
    
  <%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("webpath", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>高校学生毕业去向管理系统用户登录</title>
<link href="css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="static/js/jQuery1.7.js"></script>
<script type="text/javascript" src="static/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="static/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="static/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="static/js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var $tab_li = $('#tab ul li');
	$tab_li.hover(function(){
		$(this).addClass('selected').siblings().removeClass('selected');
		var index = $tab_li.index(this);
		$('div.tab_box > div').eq(index).show().siblings().hide();
	});	
});
</script>

<script type="text/javascript">
$(function(){
	$(".screenbg ul li").each(function(){
		$(this).css("opacity","0");
	});
	$(".screenbg ul li:first").css("opacity","1");
	var index = 0;
	var t;
	var li = $(".screenbg ul li");	
	var number = li.size();
	function change(index){
		li.css("visibility","visible");
		li.eq(index).siblings().animate({opacity:0},3000);
		li.eq(index).animate({opacity:1},3000);
	}
	function show(){
		index = index + 1;
		if(index<=number-1){
			change(index);
		}else{
			index = 0;
			change(index);
		}
	}
	t = setInterval(show,8000);
	//根据窗口宽度生成图片宽度
	var width = $(window).width();
	$(".screenbg ul img").css("width",width+"px");
});
</script>
</head>

<body>
<div id="tab">
  <ul class="tab_menu">
    <li class="selected">学生登录</li>
    <li>老师登录</li>
    <li>学校登录</li>
  </ul>
  <div class="tab_box"> 
    <!-- 学生登录开始 -->
    <div>
      <div class="stu_error_box"></div>
      <form  action="studentlogin/studentLogin" method="post">
      
        <div id="">
          <label>学&nbsp;&nbsp;&nbsp;号：</label>
           <input  required  pattern="^\S{4,}$" name="stuNo" type="text"  class="input-text"  autocomplete="off"  title="请输入4位及以上的字符"  placeholder="请输入学号"   >    
        </div>
        
        <div id="">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
           <input required pattern="^\S{6,}$" name="stuPass"  type="password" title="请输入6位及以上的字符" placeholder="请输入密码">
        </div>
        
        <div id="">
         <style type="text/css">
    a:link,a:visited{
   text-decoration:none;  /*超链接无下划线*/
}
    a:hover{
   text-decoration:underline;  /*鼠标放上去有下划线*/
}
</style>
<a href="register.jsp" >注册账号</a>
        </div>
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
    </div>
   <!-- 学生登录结束-->
   <!-- 导师登录开始-->
    <div class="hide">
     <div class="tea_error_box"></div>
      <form  action="teacherlogin/teacherLogin" method="post">
      
        <div id="">
          <label>编&nbsp;&nbsp;&nbsp;号：</label>
           <input required pattern="^\S{4,}$" name="teaCode" type="text" autofocus="autofocus" autocomplete="off" title="请输入4位及以上的字符" placeholder="请输入老师编号">    
        </div>
         
        <div id="">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
           <input required pattern="^\S{6,}$" name="teaPass"  type="password" autocomplete="off" title="请输入6位及以上的字符" placeholder="请输入密码">
        </div>
        
        
        <div id="">
          <label>xx&nbsp;&nbsp;&nbsp;码：</label>
           <input name="schCode"  type="schCode" autocomplete="off" title="请输入6位及以上的字符" placeholder="请输入xx">
        </div>
        
        <div id="">
         <style type="text/css">
    a:link,a:visited{
   text-decoration:none;  /*超链接无下划线*/
}
    a:hover{
   text-decoration:underline;  /*鼠标放上去有下划线*/
}
</style>
<a href="register.jsp">注册账号</a>
        </div>
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
    </div>
     <!-- 导师登录结束-->
     
     
     
     
     
     
     <!-- 教务登录开始-->
    <div class="hide">
    
    
    
      <form  action="schoollogin/schoolLogin" method="post">
      
        <div id="">
          <label>代&nbsp;&nbsp;&nbsp;号：</label>
           <input required pattern="^\S{4,}$" name="schCode" type="text" autofocus="autofocus" autocomplete="off" title="请输入4位及以上的字符" placeholder="请输入学校代号">    
        </div>
        
      <div id="">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
           <input required pattern="^\S{6,}$" name="schPass"  type="password" autocomplete="off" title="请输入6位及以上的字符" placeholder="请输入密码">
        </div> 
        
       
        


没有账号?<a href="register.jsp">马上注册</a><div ></a> 
        </div>
        <div id="login">
          <button type="submit">登录</button>
        </div>
      </form>
      
      
    </div>
     <!-- 教务登录结束-->
  </div>
</div>
<!-- <div class="bottom">©2020 Leting <a href="javascript:;" target="_blank">关于</a> <span>京ICP证030173号</span>  More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a><img width="13" height="16" src="images/copy_rignt_24.png" /></div>
 -->
<div class="screenbg">
  <ul>
    <li><a href="javascript:;"><img src="images/0.jpg"></a></li>
    <!-- <li><a href="javascript:;"><img src="images/1.jpg"></a></li>
    <li><a href="javascript:;"><img src="images/2.jpg"></a></li> -->
    <li><a href="javascript:;"><img src="images/01.jpg"></a></li>
    <li><a href="javascript:;"><img src="images/00.jpg"></a></li>
    
  </ul>
</div>
</body>
</html> 
  --%>
   
    
    
    
    
    
    
 
   
    
    
    
    
    
    
    
    
    
  
    
   