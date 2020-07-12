package com.softjx.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.softjx.model.Position;
import com.softjx.model.PositionExample;
import com.softjx.model.School;
import com.softjx.model.SchoolExample;
import com.softjx.model.Student;
import com.softjx.model.StudentExample;
import com.softjx.model.Way;
import com.softjx.model.WayExample;
import com.softjx.service.PositionService;
import com.softjx.service.SchoolService;
import com.softjx.service.StudentService;
import com.softjx.service.WayService;
@Controller
@RequestMapping("/student")
@SessionAttributes(value = { "student" }, types = { String.class })
public class StudentAction {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SchoolService schoolService;
	
	@Autowired
	private WayService wayService;
	@Autowired
	private PositionService positionService;
	
	
	
	

	//查看个人信息
	@RequestMapping("/studentShow")
	//public String getStdudent() {

		
		public String questionDailyP1(Map<String, Object> map){
			//获取session中存贮的student对象
			Student student=(Student)map.get("student");
			StudentExample  studentexample=new StudentExample();
			StudentExample.Criteria criteria1=studentexample.createCriteria();
			
		    SchoolExample schoolExample=new 	SchoolExample();
		
			System.err.println(student);
			//获取条件用户选择的学生id
			criteria1.andStuNoEqualTo(student.getStuNo());
			
			
			criteria1.andStuFlagEqualTo(false);
			
			
			List<Student> List=studentService.getStudentWithSchool(studentexample);
			
			
				
				map.put("students", List);
				
				return  "student/student-show";
				
			}
			
		//return "student/student-show";
	
	
	
	
	

	 // 查询学生个人信息
	@RequestMapping("/studentInfo")
	public String getStudentss() {
		return "student/studentInfo";
	}
	
	
	
	
	
	
	
	// 跳转修改密码页面
		@RequestMapping("/toUpdatePassword")
		public String toUpdatePassword() {

			return "student/update-password";
		}
		
		
		
		
		
		// 修改密码
		@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
		public String updatePassword(Student student, Map<String, Object> map) {
			if (student.getStuPass()!=null && !"".equals(student.getStuPass())) {
				Student student1=(Student) map.get("student");
				
				student.setStuCreateBy(student1.getStuName());
				
				studentService.updateStudent(student);
				return "student/success";
			}
			return null;
					
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
		
		
		
		
		
		// 跳转完善学生信息页面1111
		@RequestMapping("/toUpdateNews")
		
		public String questionD(Map<String, Object> map){
			//获取session中存贮的student对象
			Student student1=(Student)map.get("student");
			
			StudentExample  studentexample=new StudentExample();
			StudentExample.Criteria criteria1=studentexample.createCriteria();
			
		   SchoolExample  schoolExample=new 	SchoolExample();
		
			System.err.println(student1);
			//获取条件用户选择的学生id
			criteria1.andStuNoEqualTo(student1.getStuNo());
			
			criteria1.andStuFlagEqualTo(false);
			
			List<Student> wayList=studentService.getStudentWithSchool(studentexample);
			SchoolExample.Criteria criteria=schoolExample.createCriteria();
			criteria.andSchFlagEqualTo(false);
			List<School> list3=schoolService.getSchool(schoolExample);
			
			//school=schoolService.selectSchoolByName(school.getSchName());
			//student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
			
			map.put("school", list3);
				map.put("students", wayList);
				
				
			return "student/update-news";
				//return "forward:../student/questionPaperPage";
				
			}
			
			
		
		
		

		// 完善学生信息页面
		@RequestMapping(value = "/updateNews", method = RequestMethod.POST)
		public String updateNews(Student student, Map<String, Object> map,School school) {
			
			if (student.getStuNo()!=null && !"".equals(student.getStuNo())) {
				Student student1=(Student) map.get("student");
				
				student.setStuCreateBy(student1.getStuName());
				//student.setStuCreateTime(new Date());
				
				studentService.updateStudent(student);
				//return "student/show1";
				
				
				school=schoolService.selectSchoolByName(school.getSchName());
				student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
				studentService.updateStudent(student);	
				
				return "forward:../student/questionPaperPage";
			}
			return null;
					
		}
		
		
		
		
		
		

		// 跳转完善学生信息页面1111
		@RequestMapping("/toUpdateNewsUi")
		
		public String question(Map<String, Object> map){
			//获取session中存贮的student对象
			Student student1=(Student)map.get("student");
			
			StudentExample  studentexample=new StudentExample();
			StudentExample.Criteria criteria1=studentexample.createCriteria();
			
		   SchoolExample  schoolExample=new 	SchoolExample();
		
			System.err.println(student1);
			//获取条件用户选择的学生id
			criteria1.andStuNoEqualTo(student1.getStuNo());
			
			criteria1.andStuFlagEqualTo(false);
			
			List<Student> wayList=studentService.getStudentWithSchool(studentexample);
			SchoolExample.Criteria criteria=schoolExample.createCriteria();
			criteria.andSchFlagEqualTo(false);
			List<School> list3=schoolService.getSchool(schoolExample);
			
			
			
			map.put("school", list3);
				map.put("students", wayList);
				
				
			return "student/update-newsUi";
				
				
			}
			
			
		
		
		
		
		
		
		

		
			
			
			
			
			
			
			// 跳转修改页面
			@RequestMapping("/toUpdateWay")
			public String toUpdateWay(@RequestParam(value = "wayId") Integer wayId, Map<String, Object> map) {
			Way way = wayService.getWay(wayId);
				map.put("way", way);

				return "student/update-ways";
			}
			
			
			
			
			
			
			
			
			
			// 完善学生信息页面
						@RequestMapping(value = "/updateWays", method = RequestMethod.POST)
						public String updateWays(Way way, Map<String, Object> map) {
							Student student=(Student) map.get("student");
							if (way.getStuNo()!=null && !"".equals(student.getStuNo())) {
								

								WayExample wayExample=new 	WayExample();
								WayExample.Criteria criteria1=wayExample.createCriteria();
								PositionExample positionExample=new 	PositionExample();
								
								
								
								
									System.err.println(student);
									//获取条件用户选择的学生id
									criteria1.andStuNoEqualTo(student.getStuNo());
									
									
									criteria1.andWayFlagEqualTo(false);
									
									//从考试表中拿到所有符合条件的答题信息
									//List<Way> wayList=wayService.getWay(wayExample);
									List<Way> wayList=wayService.getWayWithPo(wayExample);
									//List<Position>  position1  =positionService.getPosition(positionExample);
									
										
										map.put("ways", wayList);
										
								
								wayService.updateWay(way);
								return "student/show2";
							}
							return null;
									
						}
			
			
			
			
			
			
					
			
			
			

		
		
		
		
						// 跳转登记学生去向页面
						@RequestMapping("/toInsertWay")
						public String   toInsertWay(Way way,HttpServletResponse response, HttpSession session, Map<String, Object> map) throws Exception {
							
							//获取session中存贮的student对象
							Student student = (Student) session.getAttribute("student");
							// 查询是否登记
							WayExample  wayexample=new  WayExample();
							com.softjx.model.WayExample.Criteria criteria1 = wayexample.createCriteria();
							//criteria1.andSchCodeEqualTo(student.getSchCode());
							criteria1.andWayFlagEqualTo(false);
							//criteria1.andWayCreateByEqualTo(student.getStuName());
							//way.setWayCreateBy(student.getStuName());
							criteria1.andStuNoEqualTo(student.getStuNo());
							// 登记后禁止重复登记
							if(wayService.getWay(wayexample).size()>0) {
								PrintWriter out = response.getWriter();
								out.print("<script language=\"javascript\">alert('您的去向已登记，无需重复登记！');"
										+ "window.location.href='../student/waySee';</script>");
								out.flush();
								out.close();
							}
							
							PositionExample  example=new  PositionExample();
							PositionExample.Criteria criteria11=example.createCriteria();
							
							criteria11.andPoFlagEqualTo(false);
							List<Position> list3=positionService.getPosition(example);
							map.put("position", list3);
							return "student/insert-way";
						}
						
						
						
						
						
			
				
				
				

				
				
				
				
				
				// 接受页面的qdaily对象，添加入库.    有用的
				@RequestMapping("insertWay")
				public String InsertPosition(Way way, Map<String, Object> map, 
						HttpServletRequest request,Position position) {
					if (way != null&&way!=null) {
						
					
						way.setWayCreateTime(new Date());
						way.setWayFlag(false);
						Student student=(Student)map.get("student");//获取session中的值
						way.setWayCreateBy(student.getStuName());
						position=positionService.selectPositionByName(position.getPoName());
						way.setPoCode(position.getPoCode());//将查找的章节id赋给qBnak
						
						wayService.addWay(way);
						//wayService.updateWay(way);
					}
					String ss = "添加成功";
					map.put("info", ss);
					//return "student/success";// 转发给查询action
					//return "student/show2";// 转发给查询action
					//return "forward:../returnPage/toQuestionInfo1";// 转发给查询action
					return "forward:../student/waySee";
				
				}

				
				
				
		
				
				
				
				
				
			
	
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				

							
						
				
				//2.2跳转选择试卷名称页面33333
				@RequestMapping("questionPaperPage")
				public String questionDailyP(Map<String, Object> map){
					//获取session中存贮的student对象
					Student student=(Student)map.get("student");
					
					StudentExample  studentexample=new StudentExample();
					StudentExample.Criteria criteria1=studentexample.createCriteria();
					
				    SchoolExample schoolExample=new 	SchoolExample();
				
					System.err.println(student);
					//获取条件用户选择的学生id
					criteria1.andStuNoEqualTo(student.getStuNo());
					
					
					criteria1.andStuFlagEqualTo(false);
					
					
					List<Student> List=studentService.getStudentWithSchool(studentexample);
					
					
						
						map.put("students", List);
						
						return "student/show1";
						//return "student/questionPaperChooseQpname";
					}
					
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
								
		
		
				
				
		

			
				//2.2跳转选择试卷名称页面
				@RequestMapping("waySee")
				public String questionDaily(Map<String, Object> map){
					//获取session中存贮的student对象
					Student student=(Student)map.get("student");
					
				WayExample wayExample=new 	WayExample();
				WayExample.Criteria criteria1=wayExample.createCriteria();
				PositionExample positionExample=new 	PositionExample();
				
				
				
				
					System.err.println(student);
					//获取条件用户选择的学生id
					criteria1.andStuNoEqualTo(student.getStuNo());
					
					
					criteria1.andWayFlagEqualTo(false);
					
					//从考试表中拿到所有符合条件的答题信息
					//List<Way> wayList=wayService.getWay(wayExample);
					List<Way> wayList=wayService.getWayWithPo(wayExample);
					//List<Position>  position1  =positionService.getPosition(positionExample);
					
						
						map.put("ways", wayList);
						
						//map.put("positions", position1);
						return "student/show2";
						//return "student/questionPaperChooseQpname";
					}
					
					
				
				
				
				
				
				
				
				
				
				// 接受页面的qdaily对象，添加入库
				@RequestMapping("insertQuestion")
				public String addQiestion(Student student, Map<String, Object> map, 
						HttpServletRequest request,School school) {
					if (student!= null&&school!=null) {
						
						
					    student.setStuCreateTime(new Date());
					    student.setStuFlag(false);
					Student  student1=(Student)map.get("student");//获取session中的值
						student.setStuCreateBy(student.getStuName());
						
						
						
						
					studentService.addStudent(student1);			
					}
					String ss = "添加成功";
					map.put("info", ss);
					//return "forward:../returnPage/toQuestionInfo";// 转发给查询action
					return "student/show1";
				
				
				}		
				
				
				
				
				
				
				
				
				

				// 跳转完善学生信息页面1111
				@RequestMapping("/toUpdateWaysUi")
				
				public String questionqw(Map<String, Object> map){
					//获取session中存贮的student对象
					Student student1=(Student)map.get("student");
					
					
					PositionExample positionExample=new 	PositionExample();
					   PositionExample.Criteria criteria111=positionExample.createCriteria();
				   WayExample  wayExample=new WayExample();
				  WayExample.Criteria criteria11=wayExample.createCriteria();
				   
				   StudentExample  studentexample=new StudentExample();
					StudentExample.Criteria criteria1=studentexample.createCriteria();
					//获取条件用户选择的学生id
					criteria1.andStuNoEqualTo(student1.getStuNo());
					
					criteria1.andStuFlagEqualTo(false);
					criteria11.andStuNoEqualTo(student1.getStuNo());
					criteria11.andWayFlagEqualTo(false);
					List<Way> wayList=wayService.getWayWithPo(wayExample);
					
					criteria111.andPoFlagEqualTo(false);
					List<Position> list3=positionService.getPosition(positionExample);
					
					//school=schoolService.selectSchoolByName(school.getSchName());
					//student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
					
					    map.put("position", list3);
						map.put("ways", wayList);
						
						
					return "student/update-waysUi";
						
						
					}
					
					
				
				
				
						
				

				
				
				
				
				
			
		
				
				
				
				
				
				
				
				
				
				
				
				

				// 跳转完善学生信息页3333
				@RequestMapping("/toUpdateNewsUi123111")
				
				public String question1(Integer wayId,Map<String, Object> map){
					//获取session中存贮的student对象
					Student student1=(Student)map.get("student");
					
					
					WayExample  wayexample=new WayExample();
					WayExample.Criteria criteria1=wayexample.createCriteria();
					/*Way  way = wayService.getWay(wayId);
					map.put("way", way);*/
				   PositionExample  positionExample=new 	PositionExample();
				
					System.err.println(student1);
					//获取条件用户选择的学生id
					criteria1.andStuNoEqualTo(student1.getStuNo());
					
					criteria1.andWayFlagEqualTo(false);
					
					List<Way> wayList=wayService.getWayWithPo(wayexample);
					   PositionExample.Criteria criteria=   positionExample.createCriteria();
					criteria.andPoFlagEqualTo(false);
					List<Position> list3=positionService.getPosition(positionExample);
					
					//school=schoolService.selectSchoolByName(school.getSchName());
					//student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
					
					map.put("position", list3);
						map.put("ways", wayList);
						
						
					return "student/update-newsUi123";
						
						
					}
							
				
				
				
				// 跳转的修改页面
				@RequestMapping("/toUpdateNewsUi123")
				public String updateStudentPage22(Way way,Map<String, Object> map) {

					//获取session中存贮的student对象
					Student student1=(Student)map.get("student");

					WayExample  wayexample=new WayExample();
					WayExample.Criteria criteria1=wayexample.createCriteria();
					PositionExample  positionExample=new 	PositionExample();

					//获取条件用户选择的学生id
					criteria1.andStuNoEqualTo(student1.getStuNo());
					
					criteria1.andWayFlagEqualTo(false);
					List<Way> wayList=wayService.getWayWithPo(wayexample);
					   PositionExample.Criteria criteria=   positionExample.createCriteria();
					criteria.andPoFlagEqualTo(false);
					List<Position> list3=positionService.getPosition(positionExample);
					map.put("position", list3);
					map.put("ways", wayList);
					
					
					
					Way  wa=wayService.getWay(way.getWayId());
					
					if (wa!=null)
					{
						map.put("way",wa);
					}
					return "student/update-newsUi123";
				}
					
			
				
				
				

				// 完善学生信息页面
				@RequestMapping(value = "/updateWays123", method = RequestMethod.POST)
				public String updateNews1(Way way, Map<String, Object> map,Position position) {
					
					if (way.getStuNo()!=null && !"".equals(way.getStuNo())) {
						Student student1=(Student) map.get("student");
						way.setWayCreateTime(new Date());
						way.setWayCreateBy(student1.getStuName());
					
						way.setWayFlag(false);
						
						wayService.updateWay(way);
						//return "student/show1";
						
						
						position=positionService.selectPositionByName(position.getPoName());
						
						way.setPoCode(position.getPoCode());//将查找的章节id赋给qBnak
						wayService.updateWay(way);
						
						return "forward:../student/waySee";
					}
					return null;
							
				}
				
				
				
				
				
			
					
				   
					
					
					
					
	// 表单是时间类型的处理方法
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// true允许表单的值为空
	}

}
