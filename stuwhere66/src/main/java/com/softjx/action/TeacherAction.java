package com.softjx.action;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.softjx.dao.SchoolMapper;
import com.softjx.dao.StudentMapper;
import com.softjx.dao.StudentMapper2;
import com.softjx.model.Position;
import com.softjx.model.PositionExample;
import com.softjx.model.School;
import com.softjx.model.SchoolExample;
import com.softjx.model.StuStatusCount;
import com.softjx.model.Student;
import com.softjx.model.Student2;
import com.softjx.model.StudentExample;
import com.softjx.model.StudentExample.Criteria;
import com.softjx.model.StudentExample2;
import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;
import com.softjx.model.Way;
import com.softjx.model.WayExample;
import com.softjx.service.PositionService;
import com.softjx.service.SchoolService;
import com.softjx.service.StudentService;
import com.softjx.service.TeacherService;
import com.softjx.service.WayService;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;


@Controller
@RequestMapping("/teacher")
@SessionAttributes(value = { "teacher" }, types = { String.class })
public class TeacherAction {
	@Autowired
	private TeacherService teacherService; 
	
	
		@Autowired
	StudentMapper studentMapper;
		
		@Autowired
		StudentMapper2 studentMapper2;
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SchoolService schoolService;
	
	@Autowired
	private WayService wayService;
	@Autowired
	private PositionService positionService;
	
	@Autowired
	SchoolMapper schoolMapper;

	
	

	
	
	

   
	
	
	
	
    
	
	
	
	
	
	
	
	
	
	
	 
	
			
	
	
	
	// 条件分页查询所有数据
		@RequestMapping("/studentPage")

		public String selectQuesitonByNameii(Map<String, Object> map,Student student){
			/*//获取session中存贮的student对象
			Teacher teacher=(Teacher)map.get("teacher");
		    TeacherExample  teacherexample=new TeacherExample();
*/
			StudentExample  studentexample=new StudentExample();
			StudentExample.Criteria criteria=studentexample.createCriteria();
			//criteria.andSchCodeEqualTo(teacher.getSchCode());
		    
			//criteria.andStuFlagEqualTo(false);
			
			
			if (student.getStuNo()!=null && !"".equals(student.getStuNo())) {
				criteria.andStuNoLike("%"+student.getStuNo()+"%");
			}
			if (student.getStuStatus() != null) {
				criteria.andStuStatusEqualTo(student.getStuStatus());
			}
			if (student.getStuYear() != null) {
				criteria.andStuYearEqualTo(student.getStuYear());
			}
			if (student.getStuMajor() !=null) {
				criteria.andStuMajorEqualTo(student.getStuMajor());
			}
		
			
			List<Student> list = studentService.getStudent(studentexample);

			
			map.put("student", list);
			
			return "teacher/teacher-information";
		}
	
	
	
		

		//按毕业动态查询
			//@ResponseBody
			@RequestMapping("selectStudentBysta")
			public String selectQuesitonByName1(Map<String, Object> map,Student student){

				//获取session中存贮的student对象
				Teacher teacher=(Teacher)map.get("teacher");
			    TeacherExample  teacherexample=new TeacherExample();
				
				
				StudentExample  studentexample=new StudentExample();
				StudentExample.Criteria criteria=studentexample.createCriteria();
				
				criteria.andSchCodeEqualTo(teacher.getSchCode());
				criteria.andStuStatusLike("%"+student.getStuStatus()+"%");
				criteria.andStuMajorLike("%"+student.getStuMajor()+"%");
			
				criteria.andStuNoLike("%"+student.getStuNo()+"%");
			
				criteria.andStuFlagEqualTo(false);
				List<Student> list=studentService.getStudent(studentexample);
				
				map.put("student", list);
				return "teacher/teacher-information";
			}
		
		
		
			
			
			
			
			//按毕业动态查询
			//@ResponseBody
			@RequestMapping("selectWayBysta")
			public String selectQuesitonByName112344(Map<String, Object> map,Way way){

				//获取session中存贮的student对象
				Teacher teacher=(Teacher)map.get("teacher");
			    TeacherExample  teacherexample=new TeacherExample();
				
				
				WayExample  wayexample=new WayExample();
				WayExample.Criteria criteria=wayexample.createCriteria();
				
				criteria.andSchCodeEqualTo(teacher.getSchCode());
				criteria.andStuNoLike("%"+way.getStuNo()+"%");
				criteria.andWayEvaluateLike("%"+way.getWayEvaluate()+"%");
			
				criteria.andWayFlagEqualTo(false);
				List<Way> list=wayService.getWayWithPo(wayexample);
				//List<Way> list=wayService.getWay(wayexample);
				map.put("way", list);
				return "teacher/teacher-information2";
			}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	//按题目内容从查询题目
		//@ResponseBody
		@RequestMapping("selectStudentByNo")
		public String selectQuesitonByName(Map<String, Object> map,Student student){

			//获取session中存贮的student对象
			Teacher teacher=(Teacher)map.get("teacher");
		    TeacherExample  teacherexample=new TeacherExample();
			
			
			StudentExample  studentexample=new StudentExample();
			StudentExample.Criteria criteria=studentexample.createCriteria();
			
			criteria.andSchCodeEqualTo(teacher.getSchCode());
			criteria.andStuNoLike("%"+student.getStuNo()+"%");
			criteria.andStuFlagEqualTo(false);
			List<Student> list=studentService.getStudent(studentexample);
			
			map.put("student", list);
			return "teacher/teacher-information";
		}
	
		
	
	// 跳转的修改页面
	@RequestMapping("/toUpdateNewsUi")
	public String updateStudentPage(Student student,Map<String, Object> map) {
		Student stu=studentService.getStudent(student.getStuId());
		
		if (stu!=null)
		{
			map.put("student",stu);
		}
		return "teacher/update-newsUi";
	}
	
	
	
	
	
	
	
	
	
	
	
	//修改数据、
		@RequestMapping("/studentUpdate222")
		public String updateStudent(Student student) {
			studentService.updateStudent(student);
			
			return "forward:../teacher/toQuestionInfo2";
		
		}
	
	// 跳转完善学生信息页面1111
				@RequestMapping("/toUpdateNewsUi878")
				
				public String question(@RequestParam(value = "stuId") Integer stuId,Map<String, Object> map){
					
					
					StudentExample  studentexample=new StudentExample();
					StudentExample.Criteria criteria1=studentexample.createCriteria();
					
				   
					criteria1.andStuFlagEqualTo(false);
					/*Student student = studentService.getStudent(stuId);
					map.put("student", student);*/

					Student student=studentService.getStudent(stuId);
					
					
					map.put("student" ,student);
						
						
					return "teacher/update-newsUi";
						
						
					}
					
		
	
	
	
	
	
	
	
	
	// 跳转修改页面
		@RequestMapping("/studentUpdate22222")
		public String studentUpdateInput11(@RequestParam(value = "stuId") Integer stuId, Map<String, Object> map) {
			Student student = studentService.getStudent(stuId);
			map.put("student", student);

			return "teacher/update-newsUi";
			//return "student/student-update";
		}
	
	
	// 根据页面传入的参数去数据库查找数据，。将查找到的数据返回给修改页面
		@RequestMapping("/studentUpdate222ee")
		public String toupdateQuestionBnak(@RequestParam(value = "stuId") Integer stuId,Student student,  Map<String, Object> map) {
			if (student.getStuId() != null && !"".equals(student.getStuId().toString().trim())) {
				//student = studentService.getQusetionBankById(student.getStuId());
				student = studentService.getStudent(stuId);
				map.put("student", student);
			}
			SchoolExample  schoolExample=new 	SchoolExample();
			SchoolExample.Criteria criteria=schoolExample.createCriteria();
			criteria.andSchFlagEqualTo(false);
			//criteria.andCcDeleteEqualTo(false);
			List<School> list2=schoolService.getSchool(schoolExample);
			map.put("school", list2);
			
			
			
			return "teacher/update-newsUi";
			
			
		}
	
	
		
	
		// 完善学生信息页面
		@RequestMapping(value = "/updateNews", method = RequestMethod.POST)
		public String updateNews(Student student, Map<String, Object> map) {
			
			if (student.getStuNo()!=null && !"".equals(student.getStuNo())) {
				Student student1=(Student) map.get("student");
				
				student.setStuCreateBy(student1.getStuName());
				//student.setStuCreateTime(new Date());
				
				studentService.updateStudent(student);
				//return "student/show1";
				
				
				return "forward:../teacher/toQuestionInfo2";
			}
			return null;
					
		}
		
	

	
	// 跳转修改页面1111
			@RequestMapping("/studentUpdate11111")
			public String studentUpdateInput(@RequestParam(value = "stuId") Integer stuId, Map<String, Object> map) {

				StudentExample  studentexample=new StudentExample();
				
			   SchoolExample  schoolExample=new 	SchoolExample();
			   List<Student> wayList=studentService.getStudentWithSchool(studentexample);
				SchoolExample.Criteria criteria=schoolExample.createCriteria();
				criteria.andSchFlagEqualTo(false);
				List<School> list3=schoolService.getSchool(schoolExample);
				
				
				map.put("school", list3);
				map.put("students", wayList);
				

				return "student/update-newsUi";
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		//根据id删除
		@ResponseBody
		@RequestMapping(value="deleteStudent",method=RequestMethod.POST)
		public int deleteTeacherFalse(Student student,Map<String, Object> map) {
			int i=0;
			int count=studentService.deleteStudentFalse(student.getStuId());
			if(count==0){
				i=0;
			}else{
				i=1;
			}
			return i;
		}

				
		

		
		
		//根据id删除
				@ResponseBody
				@RequestMapping(value="deleteWay",method=RequestMethod.POST)
				public int deleteWayFalse(Way way,Map<String, Object> map) {
					int i=0;
					int count=wayService.deleteWayFalse(way.getWayId());
					if(count==0){
						i=0;
					}else{
						i=1;
					}
					return i;
				}

		
	
	//将页面显示到学生端
		@RequestMapping("/chapterShowStudent")
		public String chapterShowStudent(Map<String, Object> map,String schCode){
			
			School school=new School();
			school.setSchCode(schCode);
			SchoolExample  schoolExample=new 	SchoolExample();
			List<School> schoolsList=schoolService.getSchool(schoolExample);
			
			
			
			map.put("listSchools", schoolsList);
			
			
			
			return "school/chapter_list_student";
		}
		
	
	
	
		
		@RequestMapping("toQuestionInfo4")
		public String toQuestionInfo1111(Map<String, Object> map ,String schCode){
			
			
		     
		     School school=new School();
				school.getSchCode();
				SchoolExample  schoolExample=new 	SchoolExample();
				
				StudentExample  studentExample=new StudentExample();
				StudentExample.Criteria criteria=studentExample.createCriteria();
				criteria.andStuFlagEqualTo(false);
				List<Student> studentsList=studentService.getStudent(studentExample);
				
			
			 criteria.andSchCodeEqualTo(studentExample.getOrderByClause());
			//List<Student> list=studentService.getStudentWithSchool(studentExample);
			
			
			map.put("student", studentsList);
			return "teacher/teacher-information";
		}
		
		
		
	
	
	
	
	
	
	
	@RequestMapping("toQuestionInfo2")
	public String toQuestionInfo11(Map<String, Object> map){
		
		//获取session中存贮的student对象
		Teacher teacher=(Teacher)map.get("teacher");
	    TeacherExample  teacherexample=new TeacherExample();
		TeacherExample.Criteria criteria11=teacherexample.createCriteria();
		criteria11.andSchCodeEqualTo(teacher.getSchCode());
	     SchoolExample  schoolExample=new 	SchoolExample();
	
		StudentExample  studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andStuFlagEqualTo(false);
		
		criteria.andSchCodeEqualTo(teacher.getSchCode());
		//List<Student> list=studentService.getStudentWithSchool(studentExample);
		
		List<Student> list=studentService.getStudent(studentExample);
		
		//List<Student> list=studentService.getStudentWithSchool(studentExample);
		map.put("student", list);
		return "teacher/teacher-information";
	}
	
	
	
	
		
		
		
		
	
	@RequestMapping("toQuestionInfo3")
	public String toQuestionInfo88(Map<String, Object> map){
		     //获取session中存贮的student对象
				Teacher teacher=(Teacher)map.get("teacher");
			
				
				
				//criteria.andSchCodeEqualTo(teacher.getSchCode());
				WayExample  wayExample=new WayExample();
				WayExample.Criteria criteria1=wayExample.createCriteria();
				criteria1.andWayFlagEqualTo(false);
				criteria1.andSchCodeEqualTo(teacher.getSchCode());
				
				
				
				//List<Student> list=studentService.getStudent(studentExample);
				
				List<Way> list1=wayService.getWayWithPo(wayExample);
				
				//List<Way> list1=wayService.getWay(wayExample);
				map.put("way", list1);
				map.put("student", list1);
		
				return "teacher/teacher-information2";
		
		
	}
	
	
	
	
	
	

	//查看个人信息
	@RequestMapping("/teacherShow")
	public String getTeacher() {

		return "teacher/teacher-show";
	}
	
	
	
	

	 // 查询学生个人信息
	@RequestMapping("/teacherInfo")
	public String getStudentss() {
		return "teacher/teacherInfo";
	}
	
	
	
	
	// 跳转修改密码页面
		@RequestMapping("/toUpdatePassword")
		public String toUpdatePassword() {

			return "teacher/update-password";
		}
		
		// 跳转修改密码页面
				@RequestMapping("/toUpdateName")
				public String toUpdatePassword2() {

					return "teacher/update-name";
				}
		
		
		
		// 修改密码
		@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
		public String updatePassword(Teacher teacher, Map<String, Object> map) {
			if (teacher.getTeaPass()!=null && !"".equals(teacher.getTeaPass())) {
				Teacher teacher1=(Teacher) map.get("teacher");
				
				teacher.setTeaCreateBy(teacher1.getTeaName());
				
				teacherService.updateTeacher(teacher);
				return "teacher/success";
			}
			return null;
					
		}
		
		
		
		
		
		
		// 修改密码
				@RequestMapping(value = "/updateName", method = RequestMethod.POST)
				public String updatePassword2(Teacher teacher, Map<String, Object> map) {
					
						Teacher teacher1=(Teacher) map.get("teacher");
						
						teacher.setTeaCreateBy(teacher1.getTeaName());
						
						teacherService.updateTeacher(teacher);
						return "teacher/success2";
					
							
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
				public String   toInsertWay(ModelMap map) {
					PositionExample  example=new  PositionExample();
					PositionExample.Criteria criteria=example.createCriteria();
					
					criteria.andPoFlagEqualTo(false);
					List<Position> list3=positionService.getPosition(example);
					map.put("position", list3);
					return "student/insert-way";
				}
		
		
		
				
							
				
				
				

				
				
				
				
				// 接受页面的qdaily对象，添加入库
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
					
					
					
					    map.put("position", list3);
						map.put("ways", wayList);
						
						
					return "student/update-waysUi";
						
						
					}
					
					
				
				
				
				
				
				
			
		
				
				
				
				
				
				// 跳转添加学生
				@RequestMapping("/toAddStudent")
				
				public String question(Map<String, Object> map){
					//获取session中存贮的对象
					Teacher teacher=(Teacher)map.get("teacher");
					
					
					StudentExample  studentexample=new StudentExample();
					StudentExample.Criteria criteria1=studentexample.createCriteria();
					
				   SchoolExample  schoolExample=new 	SchoolExample();
				
					
					criteria1.andStuFlagEqualTo(false);
					
					List<Student> wayList=studentService.getStudentWithSchool(studentexample);
					SchoolExample.Criteria criteria=schoolExample.createCriteria();
					criteria.andSchFlagEqualTo(false);
					List<School> list3=schoolService.getSchool(schoolExample);
					
					
					
					map.put("school", list3);
						map.put("students", wayList);
						
						
					return "teacher/update-news123";
						//return "forward:../student/questionPaperPage";
						
					}
					
					
				
				
				

				// 完善学生信息页面
				@RequestMapping(value = "/updateNews5555", method = RequestMethod.POST)
				public String updateNews(Student student, Map<String, Object> map,School school) {
					
					if (student.getStuNo()!=null && !"".equals(student.getStuNo())) {
						Teacher teacher=(Teacher)map.get("teacher");
						student.setStuCreateTime(new Date());
						student.setStuCreateBy(teacher.getTeaName());
						student.setSchCode(teacher.getSchCode());
						student.setStuFlag(false);
						//student.setStuCreateTime(new Date());
						
						studentService.addStudent(student);
						//return "student/show1";
						
						
						return "forward:../teacher/toQuestionInfo2";
					}
					return null;
							
				}
							
				
				

				//根据姓名查询，姓名相同，就不能添加
				//返回的数据是json数据
				    @ResponseBody
					@RequestMapping("/stuNo2")
					public boolean getStudentNo2(Student student) {
						boolean exits=false;
				    	StudentExample studentExample = new StudentExample();
						Criteria criteria = studentExample.createCriteria();
						if (student.getStuNo()!= null && !"".equals(student.getStuNo()));
							criteria.andStuNoEqualTo(student.getStuNo());
							
						
						List<Student> students = studentService.getStudent(studentExample);
					     if (students.size()>0)
					    	 exits=true;
					     else
					    	 exits=false;
					     
						return exits;
						
					}
				
		
		
		
				    
					@RequestMapping(value = "/exportExcel")
				    	
				    	protected void doGet(HttpServletRequest request, HttpServletResponse response ,Map map) throws ServletException, IOException {
				    		
						final long serialVersionUID = 1L;
						
						//获取session中存贮的student对象
						Teacher teacher=(Teacher)map.get("teacher");
					    TeacherExample  teacherexample=new TeacherExample();
						TeacherExample.Criteria criteria11=teacherexample.createCriteria();
						criteria11.andSchCodeEqualTo(teacher.getSchCode());
					     
					
						StudentExample2  studentExample2=new StudentExample2();
						StudentExample2.Criteria criteria=studentExample2.createCriteria();
						criteria.andStuFlagEqualTo(false);
						
						criteria.andSchCodeEqualTo(teacher.getSchCode());
						List<Student2> rows=studentService.getStudent2(studentExample2);
						
				    		// 通过工具类创建writer
				    		ExcelWriter writer = ExcelUtil.getWriter();
				    		
				    		
				    		writer.addHeaderAlias("stuNo", "学号");
				    		writer.addHeaderAlias("stuName", "姓名");
				    		writer.addHeaderAlias("schCode", "所属学校");
				    		writer.addHeaderAlias("stuSex", "性别");
				    		writer.addHeaderAlias("stuBirth", "出生年月");
				    		writer.addHeaderAlias("stuPhone", "联系电话");
				    		writer.addHeaderAlias("stuStatus", "毕业动态");
				    		writer.addHeaderAlias("stuYear", "入学年份");
				    		writer.addHeaderAlias("stuEducation", "学历");
				    		writer.addHeaderAlias("stuClass", "班级");
				    		writer.addHeaderAlias("stuMajor", "专业");
				    		writer.addHeaderAlias("stuAddress", "家庭地址");
				    		writer.addHeaderAlias("stuCreateTime", "注册时间");
				    		writer.addHeaderAlias("stuFlag", "标记");
				    		
				    		// 合并单元格后的标题行，使用默认标题样式
				    		writer.merge(13, "学生信息");
				    		// 一次性写出内容，使用默认样式，强制输出标题
				    		writer.write(rows, true);
				    		
				    		//out为OutputStream，需要写出到的目标流

				    		//response为HttpServletResponse对象
				    		response.setContentType("application/vnd.ms-excel;charset=utf-8"); 
				    		//test.xls是弹出下载对话框的文件名，不能为中文，中文请自行编码
				    		response.setHeader("Content-Disposition","attachment;filename=stuInfos.xls"); 
				    		ServletOutputStream out=response.getOutputStream(); 

					    	
				    		writer.flush(out, true);
				    		// 关闭writer，释放内存
				    		writer.close();
				    		//此处记得关闭输出Servlet流
				    		IoUtil.close(out);

				    		
				    	}



				    
			  
				    
				    
	
				    

					@RequestMapping(value = "/exportExcel11")
				    	
				    	protected void doGet11(HttpServletRequest request, HttpServletResponse response ,Map map) throws ServletException, IOException {
				    		
						final long serialVersionUID = 1L;
						
						//获取session中存贮的student对象
						Teacher teacher=(Teacher)map.get("teacher");
					    TeacherExample  teacherexample=new TeacherExample();
						TeacherExample.Criteria criteria11=teacherexample.createCriteria();
						criteria11.andSchCodeEqualTo(teacher.getSchCode());
					     
					
						WayExample  wayExample=new WayExample();
						WayExample.Criteria criteria=wayExample.createCriteria();
						criteria.andWayFlagEqualTo(false);
						
						criteria.andSchCodeEqualTo(teacher.getSchCode());
						List<Way> rows=wayService.getWayWithPo(wayExample);
						
				    		// 通过工具类创建writer
				    		ExcelWriter writer = ExcelUtil.getWriter();
				    		writer.addHeaderAlias("stuCreateTime", "注册时间" );
				    		writer.addHeaderAlias("poName", "学号99" );
				    		writer.addHeaderAlias("position.poName", "职务" );
				    		/*writer.addHeaderAlias("stuNo", "学号");
				    		writer.addHeaderAlias("stuName", "姓名");
				    		writer.addHeaderAlias("schCode", "所属学校");
				    		writer.addHeaderAlias("stuSex", "性别");
				    		writer.addHeaderAlias("stuBirth", "出生年月");
				    		writer.addHeaderAlias("stuPhone", "联系电话");
				    		writer.addHeaderAlias("stuStatus", "毕业动态");
				    		writer.addHeaderAlias("stuYear", "入学年份");
				    		writer.addHeaderAlias("stuEducation", "学历");
				    		writer.addHeaderAlias("stuClass", "班级");
				    		writer.addHeaderAlias("stuMajor", "专业");
				    		writer.addHeaderAlias("stuAddress", "家庭地址");
				    		writer.addHeaderAlias("stuCreateTime", "注册时间");
				    		writer.addHeaderAlias("stuFlag", "标记");
				    		*/
				    		// 合并单元格后的标题行，使用默认标题样式
				    		writer.merge(13, "学生信息");
				    		// 一次性写出内容，使用默认样式，强制输出标题
				    		writer.write(rows, true);
				    		
				    		//out为OutputStream，需要写出到的目标流

				    		//response为HttpServletResponse对象
				    		response.setContentType("application/vnd.ms-excel;charset=utf-8"); 
				    		//test.xls是弹出下载对话框的文件名，不能为中文，中文请自行编码
				    		response.setHeader("Content-Disposition","attachment;filename=stuInfoss.xls"); 
				    		ServletOutputStream out=response.getOutputStream(); 

					    	
				    		writer.flush(out, true);
				    		// 关闭writer，释放内存
				    		writer.close();
				    		//此处记得关闭输出Servlet流
				    		IoUtil.close(out);

				    		
				    	}



				    
				    
				    
				    
				    
				    
				  
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
				
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					
						
						
									 
				
					
					
					
					

					// 跳转的修改页面
					@RequestMapping("/toUpdateWayssUi123")
					public String updateStudentPage22(@RequestParam(value = "wayId") Integer wayId,Student student, Way way,Map<String, Object> map) {

						//获取session中存贮的student对象
						Teacher teacher=(Teacher)map.get("teacher");
						
						WayExample  wayexample=new WayExample();
						
						WayExample.Criteria criteria1=wayexample.createCriteria();
						PositionExample  positionExample=new 	PositionExample();
						
						//获取条件用户选择的学生id
						criteria1.andSchCodeEqualTo(teacher.getSchCode());
						
						criteria1.andWayFlagEqualTo(false);
						List<Way> wayList=wayService.getWayWithPo(wayexample);
						   PositionExample.Criteria criteria=   positionExample.createCriteria();
						criteria.andPoFlagEqualTo(false);
						map.put("ways", wayList);
						List<Position> list3=positionService.getPosition(positionExample);
						map.put("position", list3);
						//map.put("ways", wayList);
						
						
						
						Way  wa=wayService.getWay(way.getWayId());
						
						if (wa!=null)
						{
							map.put("way",wa);
						}
						return "teacher/update-newsUi123";
					}
									
				
					
					
					
					// 完善学生信息页面
					@RequestMapping(value = "/updateWays123", method = RequestMethod.POST)
					public String updateNews1(Way way, Map<String, Object> map,Position position) {
						
						if (way.getStuNo()!=null && !"".equals(way.getStuNo())) {
							Teacher teacher=(Teacher)map.get("teacher");
							
							//way.setWayCreateBy(tteacher.getStuName());
							way.setSchCode(teacher.getSchCode());
							way.setWayFlag(false);
							
							wayService.updateWay(way);
							
							
							position=positionService.selectPositionByName(position.getPoName());
							
							way.setPoCode(position.getPoCode());//将查找的章节id赋给qBnak
							wayService.updateWay(way);
							
							return "forward:../teacher/toQuestionInfo3";
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
