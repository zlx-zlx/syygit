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

import com.softjx.model.Student;
import com.softjx.model.StudentExample;
import com.softjx.model.StudentExample.Criteria;
import com.softjx.service.StudentService;









@Controller
@RequestMapping("/studentlogin")
public class StudentLoginAction {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/login3")
	public String toPaperPage3(){
		
		return "login/studentIndex";
	}

	/*// 登录
	@RequestMapping(value = "/studentLogin")
	public String studentLogin(HttpServletRequest request,Student student,Map<String, Object> map,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		StudentExample studentExample = new StudentExample();
		
		
		
		Criteria criteria = studentExample.createCriteria();
		
		if (student.getStuNo() != null && !"".equals(student.getStuNo())) {
			criteria.andStuNoEqualTo(student.getStuNo());
			
			criteria.andStuFlagEqualTo(false);
			List<Student> students=studentService.getStudent(studentExample);
		if (students.size()>0) {		
			if (students.get(0).getStuPass().equals(student.getStuPass())) {
				HttpSession session=request.getSession();
				Student student1=students.get(0);
				session.setAttribute("student", student1);
			}else {
				out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
				
				out.flush();
				out.close();
			}
		}
		else {
			out.print("<script language=\"javascript\">alert('学号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		}
		}
		else if(student.getStuNo() == null || "".equals(student.getStuNo())){
			out.print("<script language=\"javascript\">alert('学号不能为空，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();	
		}
		
		return "login/studentIndex";
		
	}
	*/
	
	
	
	

	/*// 登录
		@RequestMapping(value = "/studentLogin")
		public String studentLogin(HttpServletRequest request,Student student,Map<String, Object> map,HttpServletResponse response) throws IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			StudentExample studentExample = new StudentExample();
			
			
			
			Criteria criteria = studentExample.createCriteria();
			
			if (student.getStuNo() != null && !"".equals(student.getStuNo())) {
				criteria.andStuNoEqualTo(student.getStuNo());
				
				criteria.andStuFlagEqualTo(false);
				List<Student> students=studentService.getStudent(studentExample);
			if (students.size()>0) {		
				if (students.get(0).getStuPass().equals(student.getStuPass())) {
					HttpSession session=request.getSession();
					Student student1=students.get(0);
					session.setAttribute("student", student1);
				}else {
					out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
					
					out.flush();
					out.close();
				}
			}
			else {
				out.print("<script language=\"javascript\">alert('学号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
			}
			else if(student.getStuNo() == null || "".equals(student.getStuNo())){
				out.print("<script language=\"javascript\">alert('学号不能为空，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();	
			}
			
			return "login/studentIndex";
			
		}
	*/
	
	
	  
      
	
	
	
	/*// 登录1111
			@RequestMapping(value = "/studentLogin")
			public String studentLogin(HttpServletRequest request,Student student,Map<String, Object> map,HttpServletResponse response) throws IOException {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				StudentExample studentExample = new StudentExample();
				
				
				
				Criteria criteria = studentExample.createCriteria();
				
				if (student.getStuNo() != null && !"".equals(student.getStuNo())) {
					criteria.andStuNoEqualTo(student.getStuNo());
					
					criteria.andStuFlagEqualTo(false);
					List<Student> students=studentService.getStudent(studentExample);
				if (students.size()>0) {		
					if (students.get(0).getStuPass().equals(student.getStuPass())) {
						HttpSession session=request.getSession();
						Student student1=students.get(0);
						session.setAttribute("student", student1);
					}else {
						out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
						
						out.flush();
						out.close();
					}
				}
				else {
					out.print("<script language=\"javascript\">alert('学号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
					out.flush();
					out.close();
				}
				}
				
				
				
				return "login/studentIndex";
				
			}
	
	*/
	
	
	
	  
	
	/*@RequestMapping(value="check")
	public String check(HttpServletRequest request, HttpServletResponse response,String num) throws IOException {{
		HttpSession session = request.getSession();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//String num = request.getParameter("num");
		String key = (String) session.getAttribute("key");
		System.out.println(num);
		System.out.println(key);
		if (key.equals(num)) {
			
			System.err.println("输入正确");
		} else {
           out.print("<script language=\"javascript\">alert('验证码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
			
			out.flush();
			out.close();
			
		}
			//System.err.println("验证码错误");
		}
		
	   return "login/studentIndex";
		//return "index.jsp";
	}*/
	
	
	
	
		
		
		
	// 登录11112222
				@RequestMapping(value = "/studentLogin")
				public String studentLogin(HttpServletRequest request,Student student,Map<String, Object> map,HttpServletResponse response) throws IOException {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					StudentExample studentExample = new StudentExample();
					
					Criteria criteria = studentExample.createCriteria();
					
					if (student.getStuNo() != null && !"".equals(student.getStuNo())) {
						criteria.andStuNoEqualTo(student.getStuNo());
						
						criteria.andStuFlagEqualTo(false);
						List<Student> students=studentService.getStudent(studentExample);
					if (students.size()>0) {		
						if (students.get(0).getStuPass().equals(student.getStuPass())) {
							HttpSession session=request.getSession();
							Student student1=students.get(0);
							session.setAttribute("student", student1);
						}else {
							out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
							
							out.flush();
							out.close();
						}
					}
					else {
						out.print("<script language=\"javascript\">alert('学号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
						out.flush();
						out.close();
					}
					}
					
					
					
					return "login/studentIndex";
					
				}
		

	
	
	
	
	
			/*@RequestMapping(value="check")
			public String check(HttpServletRequest request, HttpServletResponse response,String num) throws IOException {{
				HttpSession session = request.getSession();
				
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				
				//String num = request.getParameter("num");
				String key = (String) session.getAttribute("key");
				System.out.println(num);
				System.out.println(key);
				if (key.equals(num)) {
					
					System.err.println("输入正确");
				} else {
                   out.print("<script language=\"javascript\">alert('验证码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
					
					out.flush();
					out.close();
					
				}
					//System.err.println("验证码错误");
				}
				
			   return "login/studentIndex";
				//return "index.jsp";
			}
	
		
	*/
	
	
// 注册
		/*@RequestMapping(value = "/studentRegister")
		public String studentRegister(HttpServletRequest request,Student student,Map<String, Object> map,HttpServletResponse response) throws IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			StudentExample studentExample = new StudentExample();
			Criteria criteria = studentExample.createCriteria();
			
			if (student.getStuNo() != null && !"".equals(student.getStuNo())) {
				criteria.andStuNoEqualTo(student.getStuNo());
				criteria.andStuFlagEqualTo(false);
				int count=studentMapper.insertSelective(student);
			if (student.size()>0) {		
				if (student.get(0).getStuPass().equals(student.getStuPass())) {
					HttpSession session=request.getSession();
					Student student1=student.get(0);
					session.setAttribute("student", student1);
				}else {
					out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
					out.flush();
					out.close();
				}
			}
			else {
				out.print("<script language=\"javascript\">alert('学号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
			}
			else if(student.getStuNo() == null || "".equals(student.getStuNo())){
				out.print("<script language=\"javascript\">alert('学号不能为空，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();	
			}
			
			return "teacher/studentIndex";
		}
		*/
		
		
		
		
		

	  
			
	 
	
	
	/*//执行注册业务
	 
		@RequestMapping(value = "/studentRegister", method = RequestMethod.POST)
		
		public String addStudent(Student student) {
			
			//当前学号是否存在
			boolean exits=false;
	    	StudentExample studentExample = new StudentExample();
			Criteria criteria = studentExample.createCriteria();

			if (student.getStuNo() != null && !"".equals(student.getStuNo()))
				
				criteria.andStuNoEqualTo(student.getStuNo());

			List<Student> students = studentService.getStudent(studentExample);
		     if (students.size()>0)
		    	 exits=true;
		     else
		    	 exits=false;
			if (!exits)
			{
			   studentService.addStudent(student);	
			   //return "forward:/teacher/studentinfo";
			   return "success";
			   
			
			}
			
			
			else
			{
				return "redirect:/register.jsp";
			}
		}
*/
			
			
		

		


			
				//执行注册业务
				 
				@RequestMapping(value = "/studentRegister", method = RequestMethod.POST)
				
				public String addStudent(Student student,HttpServletResponse response) throws IOException {
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					//当前学号是否存在
					boolean exits=false;
					StudentExample studentExample = new StudentExample();
					Criteria criteria = studentExample.createCriteria();
					
					if (student.getStuNo() != null && !"".equals(student.getStuNo()))
						
						criteria.andStuNoEqualTo(student.getStuNo());
					    criteria.andStuFlagEqualTo(false);
					   student.setStuCreateTime(new Date());
					   
					List<Student> students = studentService.getStudent(studentExample);
				     if (students.size()>0)
				    	 exits=true;
				     else
				    	 exits=false;
					if (!exits)
					{
					   studentService.addStudent(student);	
					   
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
			//返回的数据是json数据
			    @ResponseBody
				@RequestMapping("/stuNo1")
				public boolean getStudentNo1(Student student) {
					boolean exits=false;
			    	StudentExample studentExample = new StudentExample();
					Criteria criteria = studentExample.createCriteria();
					if (student.getStuNo()!= null && !"".equals(student.getStuNo().trim()));
						criteria.andStuNoEqualTo(student.getStuNo());
						criteria.andStuFlagEqualTo(false);
					
					List<Student> students = studentService.getStudent(studentExample);
				     if (students.size()>0)
				    	 exits=true;
				     else
				    	 exits=false;
				     
					return exits;
					
				}
			
	
	
	
			 
			  
  
			    
			    
			    
			    
			    
			    
			    
			    @RequestMapping(value= "/indx",method=RequestMethod.POST)
				
				public String login(  Student  student,
						@RequestParam(value="stuNo",required=true) String stuNo,
						@RequestParam(value="stuPass",required=true) String stuPass,
						@RequestParam(value="vcode",required=true) String vcode ,
					HttpServletRequest request ,HttpServletResponse response
						) throws IOException{
					response.setContentType("text/html;charset=utf-8");
					PrintWriter out = response.getWriter();
					
					StudentExample studentExample = new StudentExample();
					Criteria criteria = studentExample.createCriteria();
					
					
					if (student .getStuNo() != null && !"".equals(student .getStuNo())) {
						criteria.andStuNoEqualTo(student.getStuNo());
						criteria.andStuFlagEqualTo(false);
						List<Student> students=studentService.getStudent(studentExample);
						if (students.size()>0) {		
							if (students.get(0).getStuPass().equals(student.getStuPass())) {
								HttpSession session=request.getSession();
								Student student1=students.get(0);
								session.setAttribute("student", student1);
							}else {
								out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
								out.flush();
								out.close();
							}
						}

						else {
							out.print("<script language=\"javascript\">alert('学号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
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
					
					
					return  "login/studentIndex";
				}
					
					
					
					
			    
			    
			    
	
			    
	
			    
			 // 表单是时间类型的处理方法
				@InitBinder
				public void initBinder(WebDataBinder binder) {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					dateFormat.setLenient(false);
					binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// true允许表单的值为空
				}

	       
}



