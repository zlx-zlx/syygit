<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="static/favicon.ico" >
<LINK rel="Shortcut Icon" href="static/favicon.ico" />

<link href="static/zw/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/zw/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/zw/skin.css" rel="stylesheet" type="text/css" id="skin" />
<link href="static/zw/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="static/zw/css/style.css" rel="stylesheet" type="text/css" />
 
<!-- <link rel="stylesheet" href="static/xx/css/index.css" media="all" />  -->
<link rel="stylesheet" href="static/xx/layui/css/layui.css" media="all" />



	<link rel="stylesheet" href="static/xx/layui/css/index.css" media="all" /> 
<title>学生界面</title>
<meta name="keywords" content="H-ui.admin v2.3,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v2.3，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<header class="Hui-header cl"> <a class="Hui-logo l"
		title="高校学生毕业去向管理系统学生端" href="studentlogin/login3">高校学生毕业去向管理系统 学生端</a> 


	<ul class="Hui-userbar">
	 
		
		  <li>学生</li>
		<li class="dropDown dropDown_hover"><a class="dropDown_A">${student.stuNo}<i class="Hui-iconfont">&#xe6d5;</i></a>
		
			<ul class="dropDown-menu radius box-shadow">
			
				<li><a onclick="member_show('个人信息','student/studentShow','10001','360','400')">个人信息</a></li>
				 <li ><a href="javascript:;" class="showNotice"><i class="layui-icon">&#xe645;</i><cite >系统公告</cite><span class="layui-badge-dot"></span></a></li>
			
				<li><a href="index.jsp">切换账户</a></li>
				<li><a href="javascript:loginOut();">退出</a></li>
				
			</ul>
		</li> 
		
		
			
				
		
		
		 <li id="Hui-msg"> <a href="https://mail.qq.com/cgi-bin/loginpage" target="_blank" title="消息"><span class="badge badge-danger">99+</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
		
		<!--  <li class="layui-nav-item lockcms" pc>
						<a href="javascript:;"><i class="seraph icon-lock"></i><cite>锁屏</cite></a>
					</li> -->
	</ul>
	
	
	
	
	
	
	<a aria-hidden="false" class="Hui-nav-toggle" href="#"></a> </header>
<aside class="Hui-aside">
	<input runat="server" id="divScrollValue" type="hidden" value="" />
	<div class="menu_dropdown bk_2">
		
	
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i>个人信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="student/studentInfo" href="javascript:void(0)">个人信息</a></li>
					<li><a _href="student/questionPaperPage" href="javascript:void(0)">查看个人信息</a></li>
					<li><a _href="student/toUpdateNews" href="javascript:void(0)">完善个人信息</a></li>
					
					
					
				</ul>
			</dd>
		</dl>
		
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe616;</i>毕业去向管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="student/toInsertWay" href="javascript:void(0)">毕业去向登记</a></li>
					<li><a _href="student/waySee" href="javascript:void(0)">毕业去向查看</a></li>
					
				</ul>
			</dd>
		</dl>
		
		
		
			
	
	</div>
</aside>
 
 <div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
 
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="main.html">我的桌面</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group">
			<a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;">
				<i class="Hui-iconfont">&#xe6d4;</i>
			</a>
			<a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;">
				<i class="Hui-iconfont">&#xe6d7;</i>
			</a>
		</div>
	</div>
	<div id="iframe_box" class="Hui-article">

		 <div class="show_iframe">
			<div style="display: none" class="loading"></div>
			<iframe scrolling="no" frameborder="0" src="main.html"></iframe>
		</div>
		
	
		
	</div>
</section> 




  <script type="text/javascript" src="static/xx/layui/layui.js"></script>  
	<script type="text/javascript" src="static/xx/js/index.js"></script> 
	<script type="text/javascript" src="static/xx/js/cache.js"></script>
 
<!-- <script type="text/javascript" src="static/layui/layui.js"></script> -->

<script type="text/javascript" src="static/zw/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/zw/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/zw/js/H-ui.js"></script> 
<script type="text/javascript" src="static/zw/js/H-ui.admin.js"></script> 
<script type="text/javascript">
 //公告层
function showNotice(){
    layer.open({
        type: 1,
        title: "系统公告",
        area: '300px',
        shade: 0.8,
        id: 'LAY_layuipro',
        btn: ['知道了'],
        moveType: 1,
        content: '<div style="padding:15px 20px; text-align:justify; line-height: 22px; text-indent:2em;border-bottom:1px solid #e2e2e2;"><p class="layui-red">请使用系统前请务必仔细阅读左上角公告，避免使用中遇到一些简单的问题造成困扰。</p></pclass></p><p>学生自行注册登录的请务必完善自己的个人信息,注意自己的密码安全。</div>',
        success: function(layero){
            var btn = layero.find('.layui-layer-btn');
            btn.css('text-align', 'center');
            btn.on("click",function(){
                tipsShow();
            });
        },
        cancel: function(index, layero){
            tipsShow();
        }
    });
}
function tipsShow(){
    window.sessionStorage.setItem("showNotice","true");
    if($(window).width() > 432){  //如果页面宽度不足以显示顶部“系统公告”按钮，则不提示
        layer.tips('系统公告躲在了这里', '#userInfo', {
            tips: 3,
            time : 1000
        });
    }
}
$(".showNotice").on("click",function(){
    showNotice();
})
 

//锁屏
function lockPage(){
    layer.open({
        title : false,
        type : 1,
        content : '<div class="admin-header-lock" id="lock-box">'+
                        '<div class="admin-header-lock-img">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="static/images/tx.jpg" class="userAvatar"/></div>'+
                        '<div class="admin-header-lock-name" id="lockUserName">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生:${student.stuNo}</div>'+
                        '<div class="input_btn">'+
                            '<input type="password" class="admin-header-lock-input layui-input" autocomplete="off" placeholder="请输入密码解锁.." name="lockPwd" id="lockPwd" />'+
                            '<button class="layui-btn" id="unlock">解锁</button>'+
                        '</div>'+
                        '<p>请输入登录密码，否则不会解锁成功哦！！！</p>'+
                    '</div>',
        closeBtn : 0,
        shade : 0.9,
        success : function(){
            //判断是否设置过头像，如果设置过则修改顶部、左侧和个人资料中的头像，否则使用默认头像
            if(window.sessionStorage.getItem('userFace') &&  $(".userAvatar").length > 0){
                $(".userAvatar").attr("src",$(".userAvatar").attr("src").split("images/")[0] + "images/" + window.sessionStorage.getItem('userFace').split("images/")[1]);
            }
        }
    })
    $(".admin-header-lock-input").focus();
}
$(".lockcms").on("click",function(){
    window.sessionStorage.setItem("lockcms",true);
    lockPage();
})
// 判断是否显示锁屏
if(window.sessionStorage.getItem("lockcms") == "true"){
    lockPage();
}
// 解锁
$("body").on("click","#unlock",function(){
    if($(this).siblings(".admin-header-lock-input").val() == ''){
        layer.msg("请输入解锁密码！");
        $(this).siblings(".admin-header-lock-input").focus();
    }else{
        if($(this).siblings(".admin-header-lock-input").val() == "${student.stuPass}"){
            window.sessionStorage.setItem("lockcms",false);
            $(this).siblings(".admin-header-lock-input").val('');
            layer.closeAll("page");
        }else{
            layer.msg("密码错误，请重新输入！");
            $(this).siblings(".admin-header-lock-input").val('').focus();
        }
    }
});
$(document).on('keydown', function(event) {
    var event = event || window.event;
    if(event.keyCode == 13) {
        $("#unlock").click();
    }
}); 

  







//退出登陆
function loginOut() {
	 if(confirm("是否确认退出")){
		 location.replace("<%=path%>/index.jsp"); //loginOut即是你所要转的退出登录的地址
       }else{
	        return false;
       }
   
}


/* 
if(window.history.replaceState) {
	window.history.replaceState(null,null,window.location.href);
}

 */
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}

/*用户-查看*/
function member_show(title, url, id, w, h) {
	layer_show(title, url, w, h);
}




</script> 
<script type="text/javascript">
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s)})();
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F080836300300be57b7f34f4b3e97d911' type='text/javascript'%3E%3C/script%3E"));
</script>
</body>
</html> 






