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
<link type="text/css"  href="static/ts/login2.css" rel="stylesheet"   media="all">
    <script type="text/javascript"  src="static/ts/jQuery1.7.js"></script>
    <script type="text/javascript"  src="static/ts/jquery-1.8.2.min.js"></script>
    <script type="text/javascript"  src="static/ts/jquery.SuperSlide.js"></script>
    <script type="text/javascript"  src="static/ts/Validform_v5.3.2_min.js"></script>
    <script type="text/javascript" src="static/laydate/laydate.js"></script>
    <script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
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
        
        
        $(".read_login_error").Validform({
            tiptype: function (msg, o, cssctl) {
                var objtip = $(".read_error_box");
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
    
    
    
    $(document).ready(
    		 function(){

    		 $("#stuNoid").blur(
    		 
    			    function()
    			    {	
    			    	
    			    //真实场景下的ajax调用		
    				$.ajax(
    			    			{
    			    				
    			    		  url: "studentlogin/stuNo1",
    			    		  
    			    		  cache: false,
    			    		  
    			    		  type: "GET",
    			    		  
    			    		  dataType:"json",
    			    		  
    			    		  async: true,
    			    		  
    		         		  data: {stuNo:$("#stuNoid").val()},
    		         		  
    			    		  success: function(msg){ 
    			    		     
    			    		     if (msg==true)
    			    		     {
    			    		    
    			    		      $("#stuNoid").focus();
    			    		      layer.msg("此学号存在,请重新输入", {icon:5} );
    			    		     
    			    		      
    			    		     }
    			    		     
    			    		     else
    			    		     {
    			    		       $("#stuNowrongid").text("");
    			    		       $("#stuNowrongid").css("color","green");
    			    		       $("#stuPassid").focus();
    			    		      
    			    		       $("#buttonid").attr("class","btn btn-primary radius");
    			    		     }
    			    		     
    			    		    
    			    		   },
    			    		   
    			    		  error:function(errordata){
    			    			  
    			   				/* alert("wrong!!"+errordata); */
    			   				alert("学号不规范");
    			    			  
    			   			   }
    			    		   
    			    		}
    			    		
    			    		);
    			
    			
    			    }
    			    
    			    );	    
    			    
    			
    		}

    		);
    
    
    
    
    
    
    
    
    
    $(document).ready(
   		 function(){ 

   $("#schCodeid").blur(function() {
   	
   	$.ajax({

   		url : "admin/schName22",

   		cache : false,

   		type : "GET",

   		dataType : "json",

   		async : true,

   		data : {
   			schCode: $("#schCodeid").val()
   			
   		},

   		success : function(msg) {

   			//业务代码，改变页面的数据		     
   			// alert(msg);

   			if (msg == true) {
   				
   				$("#schCodewrongid").text("");
   				$("#schCodewrongid").css("color","");
   				$("#buttonid").attr("class","btn btn-primary radius");
   				
   				
   			}
   			else {
   				$("#schCodeid").focus();
   				layer.msg("该学校还未注册,请重新输入", {icon:5} );
   			}

   		},


   	});
   });});
    
    
    
    
    
  
   
   
</script>
  

</head>

<body>
<div id="tab">
  <ul class="tab_menu">
    <li class="selected">学生注册</li>
    
    
  </ul>
  <div class="tab_box"> 
    <!-- 学生登录开始 -->
    <div>
      <div class="read_error_box"></div>
      <form  action="studentlogin/studentRegister" method="post" class="read_login_error">
      
      
      <div id="">
          <label>学校&nbsp;&nbsp;&nbsp;代号：</label>
           <input id="schCodeid"  name="schCode" type="text"  autocomplete="off"  placeholder="请输入学校代号"
          nullmsg="学校代号不能为空"   datatype="n4-10" errormsg="学校代号在4~10个数字之间"  
         readermsg="验证通过"/> <span id="schCodewrongid"></span> 
        </div>
        
        <div id="">
          <label>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</label>
         <input id="stuNoid"   name="stuNo" type="text"  autocomplete="off"  placeholder="请输入学号"  
         nullmsg="学号不能为空"   datatype="n4-10" errormsg="学号在4~10个数字之间"  
         readermsg="验证通过"/>
         <span id="stuNowrongid"></span>    
      </div>
       
        <div id="">
          <label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
         <input id="stuName"   name="stuName" type="text"  autocomplete="off"  placeholder="请输入姓名"  
         nullmsg="姓名不能为空"   datatype="*2-10" errormsg="姓名在2~10个字符之间"  
         readermsg="验证通过"/>
         
      </div>
       
         <div id="username">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
           <input id="stuPassid"  name="stuPass" type="password"  autocomplete="off"  placeholder="请输入密码"
            nullmsg="密码不能为空"   datatype="*4-10" errormsg="密码在4~10个字符之间"  
         readermsg="验证通过"/><br>   
        </div>
        
         
        <div id="">
          
           <input  name="stuFlag" type="hidden"  value="0">    
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
<a href="index.jsp">返回登陆</a>
        </div> 
       
       
        <div id="login">
          <button type="submit" >立即注册</button>
         
        </div>
      </form>
    </div>
    
    
   
  
    
    
     
  </div>
</div>

<div class="screenbg">
  <ul>
    <li><a href="javascript:;"><img src="images/0.jpg"></a></li>

    <li><a href="javascript:;"><img src="images/2.jpg"></a></li> 
    <li><a href="javascript:;"><img src="images/1.jpg"></a></li>
    <li><a href="javascript:;"><img src="images/00.jpg"></a></li>
    
  </ul>
</div>
</body>
</html>














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
<link type="text/css"  href="static/ts/login2.css" rel="stylesheet"   media="all">
    <script type="text/javascript"  src="static/ts/jQuery1.7.js"></script>
    <script type="text/javascript"  src="static/ts/jquery-1.8.2.min.js"></script>
    <script type="text/javascript"  src="static/ts/jquery.SuperSlide.js"></script>
    <script type="text/javascript"  src="static/ts/Validform_v5.3.2_min.js"></script>
    <script type="text/javascript" src="static/laydate/laydate.js"></script>
    <script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
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
        
        
        $(".read_login_error").Validform({
            tiptype: function (msg, o, cssctl) {
                var objtip = $(".read_error_box");
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
    
    
    
    $(document).ready(
    		 function(){

    		 $("#stuNoid").blur(
    		 
    			    function()
    			    {	
    			    	
    			    //真实场景下的ajax调用		
    				$.ajax(
    			    			{
    			    				
    			    		  url: "studentlogin/stuNo1",
    			    		  
    			    		  cache: false,
    			    		  
    			    		  type: "GET",
    			    		  
    			    		  dataType:"json",
    			    		  
    			    		  async: true,
    			    		  
    		         		  data: {stuNo:$("#stuNoid").val()},
    		         		  
    			    		  success: function(msg){ 
    			    		     
    			    		     if (msg==true)
    			    		     {
    			    		    
    			    		      $("#stuNoid").focus();
    			    		      layer.msg("此学号存在,请重新输入", {icon:5} );
    			    		     
    			    		      
    			    		     }
    			    		     
    			    		     else
    			    		     {
    			    		       $("#stuNowrongid").text("");
    			    		       $("#stuNowrongid").css("color","green");
    			    		       $("#stuPassid").focus();
    			    		      
    			    		       $("#buttonid").attr("class","btn btn-primary radius");
    			    		     }
    			    		     
    			    		    
    			    		   },
    			    		   
    			    		  error:function(errordata){
    			    			  
    			   				/* alert("wrong!!"+errordata); */
    			   				alert("学号不规范");
    			    			  
    			   			   }
    			    		   
    			    		}
    			    		
    			    		);
    			
    			
    			    }
    			    
    			    );	    
    			    
    			
    		}

    		);
    
    
    
    
    
    
    
    
    
    $(document).ready(
   		 function(){ 

   $("#schCodeid").blur(function() {
   	
   	$.ajax({

   		url : "admin/schName22",

   		cache : false,

   		type : "GET",

   		dataType : "json",

   		async : true,

   		data : {
   			schCode: $("#schCodeid").val()
   			
   		},

   		success : function(msg) {

   			//业务代码，改变页面的数据		     
   			// alert(msg);

   			if (msg == true) {
   				
   				$("#schCodewrongid").text("");
   				$("#schCodewrongid").css("color","");
   				$("#buttonid").attr("class","btn btn-primary radius");
   				
   				
   			}
   			else {
   				$("#schCodeid").focus();
   				layer.msg("该学校还未注册,请重新输入", {icon:5} );
   			}

   		},


   	});
   });});
    
    
    
    
    
    $(document).ready(
      		 function(){ 

      $("#schCodeid1").blur(function() {
      	
      	$.ajax({

      		url : "admin/schName22",

      		cache : false,

      		type : "GET",

      		dataType : "json",

      		async : true,

      		data : {
      			schCode: $("#schCodeid1").val()
      			
      		},

      		success : function(msg) {

      			//业务代码，改变页面的数据		     
      			// alert(msg);

      			if (msg == true) {
      				
      				$("#schCodewrongid1").text("");
      				$("#schCodewrongid1").css("color","");
      				$("#buttonid").attr("class","btn btn-primary radius");
      				
      				
      			}
      			else {
      				$("#schCodeid1").focus();
      				layer.msg("该学校还未注册,请重新输入", {icon:5} );
      			}

      		},


      	});
      });}); 
    
    
    
    
    
    $(document).ready(
   		 function(){

   		 $("#teaCodeid").blur(
   		 
   			    function()
   			    {	
   			    	
   			    //真实场景下的ajax调用		
   				$.ajax(
   			    			{
   			    				
   			    		  url: "teacherlogin/teaCode",
   			    		  
   			    		  cache: false,
   			    		  
   			    		  type: "GET",
   			    		  
   			    		  dataType:"json",
   			    		  
   			    		  async: true,
   			    		  
   		         		  data: {teaCode:$("#teaCodeid").val()},
   		         		  
   			    		  success: function(msg){ 
   			    		     
   			    		     if (msg==true)
   			    		     {
   			    		    
   			    		      $("#teaCodeid").focus();
   			    		      layer.msg("此老师编号存在,请重新输入", {icon:5} );
   			    		     
   			    		      
   			    		     }
   			    		     
   			    		     else
   			    		     {
   			    		       $("#teaCodewrongid").text("");
   			    		       $("#teaCodewrongid").css("color","green");
   			    		       $("#teaPassid").focus();
   			    		      
   			    		       $("#buttonid").attr("class","btn btn-primary radius");
   			    		     }
   			    		     
   			    		    
   			    		   },
   			    		   
   			    		  error:function(errordata){
   			    			  
   			   				/* alert("wrong!!"+errordata); */
   			   				alert("编号不规范");
   			    			  
   			   			   }
   			    		   
   			    		}
   			    		
   			    		);
   			
   			
   			    }
   			    
   			    );	    
   			    
   			
   		}

   		);
   
   
   
</script>
  

</head>

<body>
<div id="tab">
  <ul class="tab_menu">
    <li class="selected">学生注册</li>
    <li>老师注册</li>
    
  </ul>
  <div class="tab_box"> 
    <!-- 学生登录开始 -->
    <div>
      <div class="read_error_box"></div>
      <form  action="studentlogin/studentRegister" method="post" class="read_login_error">
      
      
      <div id="">
          <label>学校&nbsp;&nbsp;&nbsp;代号：</label>
           <input id="schCodeid"  name="schCode" type="text"  autocomplete="off"  placeholder="请输入学校代号"
          nullmsg="学校代号不能为空"   datatype="n4-10" errormsg="学校代号在4~10个数字之间"  
         readermsg="验证通过"/> <span id="schCodewrongid"></span> 
        </div>
        
        <div id="">
          <label>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</label>
         <input id="stuNoid"   name="stuNo" type="text"  autocomplete="off"  placeholder="请输入学号"  
         nullmsg="学号不能为空"   datatype="n4-10" errormsg="学号在4~10个数字之间"  
         readermsg="验证通过"/>
         <span id="stuNowrongid"></span>    
      </div>
       
         <div id="username">
          <label>密&nbsp;&nbsp;&nbsp;码：</label>
           <input id="stuPassid"  name="stuPass" type="text"  autocomplete="off"  placeholder="请输入密码"
            nullmsg="密码不能为空"   datatype="*4-10" errormsg="密码在4~10个字符之间"  
         readermsg="验证通过"/><br>   
        </div>
        
         
        <div id="">
          
           <input  name="stuFlag" type="hidden"  value="0">    
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
<a href="index.jsp">返回登陆</a>
        </div> 
       
       
        <div id="login">
          <button type="submit" >立即注册</button>
         
        </div>
      </form>
    </div>
    
    
   
   <!-- 导师登录开始-->
    <div class="hide">
     <div class="read_error_box"></div>
      <form  action="teacherlogin/teacherRegister"  class="read_login_error"   method="post">
      <div id="">
          <label>学校&nbsp;&nbsp;&nbsp;代号：</label>
           <input id="schCodeid1"  name="schCode" type="text"  autocomplete="off"  placeholder="请输入学校代号"
          nullmsg="学校代号不能为空"   datatype="n4-10" errormsg="学校代号在4~10个数字之间"  
         readermsg="验证通过"/> <span id="schCodewrongid1"></span> 
        </div>
      
      
        <div id="">
          <label>老 师 编 号：</label>
           <input  name="teaCode" type="text"   id="teaCodeid"  autocomplete="off"   placeholder="请输入老师编号"
             nullmsg="老师编号不能为空"   datatype="n4-10" errormsg="老师编号在4~10个数字之间"  readermsg="验证通过"/>    
       <span id="teaCodewrongid"></span>  
        </div>
        
        <div id="">
          <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
           <input  id="teaPassid" name="teaPass" type="text"     autocomplete="off"   placeholder="请输入密码"
             nullmsg="密码不能为空"   datatype="*4-10" errormsg="密码在4~10个字符之间" readermsg="密码验证通过"/>    
        </div>
        
        
         <div id="">
          
           <input  name="teaFlag" type="hidden"  value="0">    
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
<a href="index.jsp">返回登陆</a>
        </div> 
        
        <div id="login">
          <button type="submit" >立即注册</button>
         
        </div>
      </form>
    </div>
    
    
     
  </div>
</div>

<div class="screenbg">
  <ul>
    <li><a href="javascript:;"><img src="images/0.jpg"></a></li>

    <li><a href="javascript:;"><img src="images/2.jpg"></a></li> 
    <li><a href="javascript:;"><img src="images/1.jpg"></a></li>
    <li><a href="javascript:;"><img src="images/00.jpg"></a></li>
    
  </ul>
</div>
</body>
</html>
  --%>
    
   <!-- <div id="">
          <label>学&nbsp;&nbsp;&nbsp;号：</label>
         <input id="stuNoid"  required pattern="^\S{4,}$" name="stuNo" type="text" autofocus="autofocus" autocomplete="off" title="请输入4位及以上的字符" placeholder="请输入学号"> <span id="stuNowrongid"></span>    
      
   
        
        </div> -->
        
        
        <!-- 弹框不关闭,版本低
    
   <script type="text/javascript"  src="static/ts/jquery1.42.min.js"></script>  -->
   
   
  <!-- 自动 获取当前时间，无秒
    <script type="text/javascript"> 
window.onload = function(){ 
var nowDate = new Date(); 
var str = nowDate.getFullYear()+"-"+(nowDate.getMonth() + 1)+"-"+nowDate.getDate() ; 
document.getElementById("11").value=str; 
}
</script> 

 <div>
          <input type="text" name="stuCreateTime" id="11" value=""  style="display:none"> 
          
        </div>  -->
   
   
   <!-- <div id="">
         <style type="text/css">
    a:link,a:visited{
   text-decoration:none;  /*超链接无下划线*/
}
    a:hover{
   text-decoration:underline;  /*鼠标放上去有下划线*/
}
</style>
<a href="index.jsp">马上登陆</a>
        </div> -->