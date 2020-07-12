package com.softjx.action;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softjx.model.Admin;
import com.softjx.model.AdminExample;
import com.softjx.service.AdminService;
import com.softjx.service.TeacherService;
import com.softjx.utils.CpachaUtil;

@Controller
@RequestMapping("/adminlogin")
public class AdminLoginAction {

	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private AdminService adminService;

	// 登录
	@RequestMapping(value = "/adminLogin")
	public String teacherLogin(HttpServletRequest request,Admin admin,Map<String, Object> map,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();
		
		if (admin.getAdName() != null && !"".equals(admin.getAdName())) {
			criteria.andAdNameEqualTo(admin.getAdName());
			
			List<Admin> admins=adminService.getAdmin(adminExample);
		if (admins.size()>0) {		
			if (admins.get(0).getAdPass().equals(admin.getAdPass())) {
				HttpSession session=request.getSession();
				Admin admin1=admins.get(0);
				session.setAttribute("admin", admin1);
			}else {
				out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
		}
		else {
			out.print("<script language=\"javascript\">alert('用户名不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		}
		}
		else if(admin.getAdName() == null || "".equals(admin.getAdName())){
			out.print("<script language=\"javascript\">alert('用户名不能为空，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();	
		}
		
		return "login/adminIndex";
	}
	
	
	
	@RequestMapping("/login2")
	public String toPaperPage2(){
		
		return "login/adminIndex";
	}
	

	/*@RequestMapping(value="/pp",method=RequestMethod.GET)
	public ModelAndView pp (ModelAndView model){
	model.setViewName("hgghhhjj");
	model.addObject("djj","dsvnd");
	return model;
	}
	
	
	
	@RequestMapping(value="/logg",method=RequestMethod.GET)
	public ModelAndView logg(ModelAndView model){
	model.setViewName("index");
	return model;
	}*/
	
	 //生成验证码
	
	@RequestMapping(value="/get_cpacha",method=RequestMethod.GET)
	public void get_cpacha(HttpServletRequest request,
			@RequestParam(value="vl",defaultValue="4",required=false) Integer vl,
			@RequestParam(value="w",defaultValue="98",required=false) Integer w,
			@RequestParam(value="h",defaultValue="33 ",required=false) Integer h,
			HttpServletResponse response){
		CpachaUtil cpachaUtil = new CpachaUtil(vl,w,h);
		String generatorVCode = cpachaUtil.generatorVCode();
		request.getSession().setAttribute("loginCpacha", generatorVCode);
		BufferedImage generatorRotateVCodeImage = cpachaUtil.generatorRotateVCodeImage(generatorVCode, true);
		try {
			ImageIO.write(generatorRotateVCodeImage, "gif", response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
     
	
	/*@RequestMapping(value= "/logg",method=RequestMethod.POST)
	@ResponseBody
	public Map <String,String> login(
			@RequestParam(value="adName",required=true) String adName,
			@RequestParam(value="adPass",required=true) String adPass,
			@RequestParam(value="vcode",required=true) String vcode ,
		HttpServletRequest request
			){
		Map <String ,String > ret=new HashMap<String ,String >();
		if (StringUtils.isEmpty(adName)){
			ret.put("type", "error");
			ret.put("msg", "yhm不能为空!");
			return ret ;
		}
		if (StringUtils.isEmpty(vcode)){
			ret.put("type", "error");
			ret.put("msg", "验证码不能为空!");
			return ret ;
		}
		String loginCpacha =(String)request.getSession().getAttribute("loginCpacha");
		
			if (StringUtils.isEmpty(loginCpacha)){
				ret.put("type", "error");
				ret.put("msg", "session失效");
				return ret ;
			}
			if (!vcode.toUpperCase().equals(loginCpacha.toUpperCase())){
				ret.put("type", "error");
				ret.put("msg", "yzm错误");
				return ret ;
			}
			request.getSession().setAttribute(loginCpacha, null);
		ret.put("type", "success");
		ret.put("msg", "登陆成功!");
		 return ret ;
	}
	*/
	
	
	
	/*
	@RequestMapping(value= "/logg",method=RequestMethod.POST)
	@ResponseBody
	public String login(  Admin  admin,
			@RequestParam(value="adName",required=true) String adName,
			@RequestParam(value="adPass",required=true) String adPass,
			@RequestParam(value="vcode",required=true) String vcode ,
		HttpServletRequest request ,HttpServletResponse response
			) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Map <String ,String > ret=new HashMap<String ,String >();
		AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();
		
		if (admin.getAdName() != null && !"".equals(admin.getAdName())) {
			criteria.andAdNameEqualTo(admin.getAdName());
			
			List<Admin> admins=adminService.getAdmin(adminExample);
			
			
			String loginCpacha =(String)request.getSession().getAttribute("loginCpacha");
			if (StringUtils.isEmpty(loginCpacha)){
			
			if (!vcode.toUpperCase().equals(loginCpacha.toUpperCase())){
				request.getSession().setAttribute(loginCpacha, null);
			
			
			}else {
				out.print("<script language=\"javascript\">alert('session失效，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
		}
		else {
			out.print("<script language=\"javascript\">alert('验证码错误，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		}
		
		}
		return  "login/adminIndex";
	}
		*/
				
				
			
		
		
		
		
		
		
//验证验证码
	@RequestMapping(value= "/adindx",method=RequestMethod.POST)
	
	public String login(  Admin  admin,
			@RequestParam(value="adName",required=true) String adName,
			@RequestParam(value="adPass",required=true) String adPass,
			@RequestParam(value="vcode",required=true) String vcode ,
		HttpServletRequest request ,HttpServletResponse response
			) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();
		
		
		if (admin.getAdName() != null && !"".equals(admin.getAdName())) {
			criteria.andAdNameEqualTo(admin.getAdName());
			
			List<Admin> admins=adminService.getAdmin(adminExample);
			if (admins.size()>0) {		
				if (admins.get(0).getAdPass().equals(admin.getAdPass())) {
					HttpSession session=request.getSession();
					Admin admin1=admins.get(0);
					session.setAttribute("admin", admin1);
				}else {
					out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
					out.flush();
					out.close();
				}
			}

			else {
				out.print("<script language=\"javascript\">alert('用户名不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
			}
		
		
		String loginCpacha =(String)request.getSession().getAttribute("loginCpacha");
		//if (StringUtils.isEmpty(loginCpacha)){
		
		if (StringUtils.isEmpty(loginCpacha)){
			out.print("<script language=\"javascript\">alert('长时间未操作,session失效，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		}
		
		if (!vcode.toUpperCase().equals(loginCpacha.toUpperCase())){
			//request.getSession().setAttribute(loginCpacha, null);
		
			out.print("<script language=\"javascript\">alert('验证码错误，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		
	}
		
		request.getSession().setAttribute(loginCpacha, null);
		
		
		return  "login/adminIndex";
	}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	





	
	
	
	

	// 表单是时间类型的处理方法
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// true允许表单的值为空
	}

	


}
