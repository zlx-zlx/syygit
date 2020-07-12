package com.softjx.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softjx.model.School;
import com.softjx.model.SchoolExample;
import com.softjx.model.SchoolExample.Criteria;
import com.softjx.service.SchoolService;

@Controller
@RequestMapping("/schoollogin")
public class SchoolLoginAction {

	@Autowired
	private SchoolService schoolService;

	// 登录
	@RequestMapping(value = "/schoolLogin")
	public String schoolLogin(HttpServletRequest request,School school,Map<String, Object> map,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		SchoolExample schoolExample = new SchoolExample();
		Criteria criteria = schoolExample.createCriteria();
		
		if (school.getSchCode() != null && !"".equals(school.getSchCode())) {
			criteria.andSchCodeEqualTo(school.getSchCode());
			criteria.andSchFlagEqualTo(false);
			List<School> schools=schoolService.getSchool(schoolExample);
		if (schools.size()>0) {		
			if (schools.get(0).getSchPass().equals(school.getSchPass())) {
				HttpSession session=request.getSession();
				School school1=schools.get(0);
				session.setAttribute("school", school1);
			}else {
				out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/stuwhere/index.jsp'</script>");
				out.flush();
				out.close();
			}
		}
		else {
			out.print("<script language=\"javascript\">alert('学校代号不存在，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();
		}
		}
		else if(school.getSchCode() == null || "".equals(school.getSchCode())){
			out.print("<script language=\"javascript\">alert('学校代号不能为空，请重新输入！');window.location.href='/stuwhere/index.jsp'</script>");
			out.flush();
			out.close();	
		}
		
		return "login/schoolIndex";
	}
}
