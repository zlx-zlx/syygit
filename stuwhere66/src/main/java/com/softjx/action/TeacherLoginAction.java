package com.softjx.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;
import com.softjx.service.TeacherService;

@Controller
@RequestMapping("/teacherlogin")
public class TeacherLoginAction {

	@Autowired
	private TeacherService teacherService;

	// 登录
	@RequestMapping(value = "/teacherLogin")
	public String teacherLogin(HttpServletRequest request,Teacher teacher,Map<String, Object> map,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		TeacherExample teacherExample = new TeacherExample();
		TeacherExample.Criteria criteria = teacherExample.createCriteria();
		
		if (teacher.getTeaCode() != null && !"".equals(teacher.getTeaCode())) {
			criteria.andTeaCodeEqualTo(teacher.getTeaCode());
			criteria.andTeaFlagEqualTo(false);
			List<Teacher> teachers=teacherService.getTeacher(teacherExample);
		if (teachers.size()>0) {		
			if (teachers.get(0).getTeaPass().equals(teacher.getTeaPass())) {
				HttpSession session=request.getSession();
				Teacher teacher1=teachers.get(0);
				session.setAttribute("teacher", teacher1);
			}else {
				out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
		}
		else {
			out.print("<script language=\"javascript\">alert('老师编号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		}
		}
		else if(teacher.getTeaCode() == null || "".equals(teacher.getTeaCode())){
			out.print("<script language=\"javascript\">alert('老师编号不能为空，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();	
		}
		
		return "login/teacherIndex";
	}
	
	
	
	@RequestMapping("/login2")
	public String toPaperPage2(){
		
		return "login/teacherIndex";
	}
	
	
	
	
	
	
	
	
	
	
	 
    @RequestMapping(value= "/teaindx",method=RequestMethod.POST)
	
	public String login(  Teacher teacher ,
			@RequestParam(value="teaCode",required=true) String teaCode,
			@RequestParam(value="teaPass",required=true) String teaPass,
			@RequestParam(value="vcode",required=true) String vcode ,
		HttpServletRequest request ,HttpServletResponse response
			) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		TeacherExample teacherExample = new TeacherExample();
		TeacherExample.Criteria criteria = teacherExample.createCriteria();
		
		if (teacher .getTeaCode() != null && !"".equals(teacher .getTeaCode())) {
			criteria.andTeaCodeEqualTo(teacher.getTeaCode());
			criteria.andTeaFlagEqualTo(false );
			List<Teacher> teachers=teacherService.getTeacher(teacherExample);
			if (teachers.size()>0) {		
				if (teachers.get(0).getTeaPass().equals(teacher.getTeaPass())) {
					HttpSession session=request.getSession();
					Teacher teacher1=teachers.get(0);
					session.setAttribute("teacher", teacher1);
				}else {
					out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
					out.flush();
					out.close();
				}
			}

			else {
				out.print("<script language=\"javascript\">alert('老师编号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
			}
		
		
		String loginCpacha =(String)request.getSession().getAttribute("loginCpacha");
		
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
		
		
		return  "login/teacherIndex";
	}
		
	
	
	
	
	

	//执行注册业务
	 
	@RequestMapping(value = "/teacherRegister", method = RequestMethod.POST)
	
	public String addStudent(Teacher teacher ,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//当前学号是否存在
		boolean exits=false;
		TeacherExample teacherExample = new TeacherExample();
		TeacherExample.Criteria criteria = teacherExample.createCriteria();
		
		if (teacher .getTeaCode() != null && !"".equals(teacher.getTeaCode()))
			
			criteria.andTeaCodeEqualTo(teacher.getTeaCode());
		    criteria.andTeaFlagEqualTo(false);
		    teacher.setTeaCreateTime(new Date());
		   
		List<Teacher> teachers = teacherService.getTeacher(teacherExample);
	     if (teachers.size()>0)
	    	 exits=true;
	     else
	    	 exits=false;
		if (!exits)
		{
			teacherService.addTeacher(teacher);	
		   
		    out.print("<script language=\"javascript\">alert('注册成功,马上登陆！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();	
		}
		
		else
		{
		
			return "redirect:/register.jsp";
		}
		//return "forward:/teacher/studentinfo";
		return "redirect:/register.jsp";
	}

	
	
	
	
	
	
	
	//根据姓名查询，姓名相同，就不能添加
	
    @ResponseBody
	@RequestMapping("/teaCode")
	public boolean getStudentNo(Teacher teacher) {
		boolean exits=false;
		TeacherExample teacherExample=new TeacherExample();
		com.softjx.model.TeacherExample.Criteria criteria=teacherExample.createCriteria();
		
		if (teacher.getTeaCode()!= null && !"".equals(teacher.getTeaCode()));
		 criteria.andTeaCodeEqualTo(teacher.getTeaCode());
		 criteria.andTeaFlagEqualTo(false );
		List<Teacher> teachers = teacherService.getTeacher(teacherExample);
		
		
		if (teachers.size()>0)
	    	 exits=true;
		
	     else
	    	 exits=false;
	     
		return exits;
		
	}



	
	
	
	
	// 表单是时间类型的处理方法
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// true允许表单的值为空
	}

	
	
}
