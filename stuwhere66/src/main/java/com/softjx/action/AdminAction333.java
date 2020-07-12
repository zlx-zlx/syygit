package com.softjx.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.softjx.dao.SchoolMapper;
import com.softjx.dao.StudentMapper;
import com.softjx.dao.StudentMapper2;
import com.softjx.model.Admin;
import com.softjx.model.Position;
import com.softjx.model.PositionExample;
import com.softjx.model.School;
import com.softjx.model.SchoolExample;
import com.softjx.model.Student;
import com.softjx.model.Student2;
import com.softjx.model.StudentExample;
import com.softjx.model.StudentExample.Criteria;
import com.softjx.model.StudentExample2;
import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;
import com.softjx.model.Way;
import com.softjx.model.WayExample;
import com.softjx.service.AdminService;
import com.softjx.service.PositionService;
import com.softjx.service.SchoolService;
import com.softjx.service.StudentService;
import com.softjx.service.TeacherService;
import com.softjx.service.WayService;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;











@Controller
@RequestMapping("/admin333")
@SessionAttributes(value = { "admin" }, types = { String.class })
public class AdminAction333 {
	@Autowired
	private TeacherService teacherService; 
	
	//自动生成课程Mapper，用于查询课程表
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
	@Autowired
	private AdminService adminService;

	
	//查看个人信息
		@RequestMapping("/adminShow")
		public String getTeacher1() {

			return "admin/admin-show";
		}
		
		

		 // 查询个人信息
		@RequestMapping("/adminInfo")
		public String getStudentss() {
			return "admin/adminInfo";
		}
		
		
		
		
		// 跳转修改密码页面
			@RequestMapping("/toUpdatePassword")
			public String toUpdatePassword() {

				return "admin/update-password";
			}
			
			
			
			
			
			// 修改密码
			@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
			public String updatePassword(Admin admin, Map<String, Object> map) {
				if (admin.getAdPass()!=null && !"".equals(admin.getAdPass())) {
					Admin admin1=(Admin) map.get("admin");
					
					
					
					adminService.updateAdmin(admin);
					return "admin/success";
				}
				return null;
						
			}
			
			
			//将页面显示到学生端
			@RequestMapping("/adminShowSchool")
			public String chapterShowStudent(Map<String, Object> map,String schCode){
				
				School school=new School();
				school.setSchCode(schCode);
				SchoolExample  schoolExample=new 	SchoolExample();
				com.softjx.model.SchoolExample.Criteria criteria=schoolExample.createCriteria();
				criteria.andSchFlagEqualTo(false);
				List<School> schoolsList=schoolService.getSchool(schoolExample);
				//要想同
				map.put("listSchools", schoolsList);
				
				return "admin/chapter_list_student";
			}
			
		
			
			//查询所有课程并展示
			@RequestMapping("/showCourse")
			public String showCourse(Map<String, Object>map){
				SchoolExample  schoolExample=new 	SchoolExample();
				//查询所有课程
				List<School> list=schoolService.getSchool(schoolExample);
				map.put("listSchool", list);
			
				return "admin/courseChoose";
			}
			
			
			

			//查询所有课程并展示
			@RequestMapping("/showPo")
			public String showPo(Map<String, Object>map){
				PositionExample  positionExample=new 	PositionExample();
				com.softjx.model.PositionExample.Criteria criteria=positionExample.createCriteria();
				criteria.andPoFlagEqualTo(false);
				//查询所有课程
				List<Position> list= positionService.getPosition(positionExample);
				map.put("listPo", list);
			
				return "admin/position-list";
			}
			
			
			
			//将页面显示到教师端
			@RequestMapping("/chapterShowTable11")
			public String chapterShowTable(Map<String, Object> map,String schCode){
				
				School school=new School();
				school.setSchCode(schCode);
				List<School> chaptersList=schoolService.selectSchoolByIf(school);
				
				Student student=studentMapper.selectByPrimaryKe(schCode);
				map.put("listChapters", chaptersList);
				map.put("student", student);
				map.put("chapterCount", chaptersList.size());
				return "admin/chapter-list";
			}
			
			
			@RequestMapping("/chapterShowTable")
			public String toPaperPage3(Map<String, Object> map,@RequestParam(value = "schCode") String schCode) {

				StudentExample studentExample=new StudentExample();
				Criteria criteria=studentExample.createCriteria();
				criteria.andSchCodeEqualTo(schCode);
				criteria.andStuFlagEqualTo(false);
				List<Student> lists=studentService.getStudent(studentExample);
				
				map.put("lists", lists);
				return "admin/chapter-list";
			}
			
	
	

			@RequestMapping("/chapterShowTable2")
			public String toPaperPage(Map<String, Object> map,@RequestParam(value = "schCode") String schCode) {

				TeacherExample teacherExample=new TeacherExample();
				com.softjx.model.TeacherExample.Criteria criteria=teacherExample.createCriteria();
				criteria.andSchCodeEqualTo(schCode);
				criteria.andTeaFlagEqualTo(false);
				List<Teacher> lists=teacherService.getTeacher(teacherExample);
				
				map.put("lists", lists);
				return "admin/chapter-list1";
				//return "admin/chapter_list_student";
	
			
			}
	
	
	
			@RequestMapping("/chapterShowTable233")
			public String toPaperPag11e(Map<String, Object> map,@RequestParam(value = "schCode") String schCode) {

				TeacherExample teacherExample=new TeacherExample();
				com.softjx.model.TeacherExample.Criteria criteria=teacherExample.createCriteria();
				criteria.andSchCodeEqualTo(schCode);
				criteria.andTeaFlagEqualTo(false);
				List<Teacher> lists=teacherService.getTeacher(teacherExample);
				
				map.put("lists", lists);
				return "admin/chapter-list1";
				//return "admin/chapter_list_student";
	
			
			}
	
			//将页面显示到教师端
			@RequestMapping("/chapterShowTable33")
			public String chapterShowTable22(Map<String, Object> map,String schCode){
				
				
				TeacherExample teacherExample=new TeacherExample();
				com.softjx.model.TeacherExample.Criteria criteria=teacherExample.createCriteria();
				
				criteria.andTeaFlagEqualTo(false);
				Teacher teacher=new Teacher();
				teacher.setSchCode(schCode);
				List<Teacher> chaptersList=teacherService.selectvTeacherByIf(teacher);
				
				School school=schoolMapper.selectByPrimaryKee(schCode);
				
				map.put("listChapters", chaptersList);
				//map.put("school", school);
				
				
				return "admin/chapter-list1111";
			}
			
	
	
	

			//将页面显示到教师端
			@RequestMapping("/chapterShowTable34")
			public String chapterShowTable221(Map<String, Object> map,String schCode){
				
				Student  student=new Student();
				student.setSchCode(schCode);
				List<Student> chaptersList=studentService.selectvStudentByIf(student);
				
				School school=schoolMapper.selectByPrimaryKee(schCode);
				
				map.put("listChapters", chaptersList);
				map.put("school", school);
				
				//return "admin/chapter-list1111";
				return "admin/chapter-list2222";
			}
			
	
	
	
			@RequestMapping("/removequestion")
			public String removeQuestion(HttpServletRequest request, Map<String, Object> map ,Student student) {
				String schCode = request.getParameter("schCode");
				int stuId = Integer.valueOf(request.getParameter("stuId"));
				
				int count = studentService.deleteStudentFalse(stuId);
				System.err.println(count);
				
				return "admin/addChapterSuccess";
				//return "admin/chapter-list2222";
				//return "forward:../admin/chapterShowTable34?schCode=" + schCode;
			}

		

		//按毕业动态查询
			//@ResponseBody
			@RequestMapping("selectSchoolBysta")
			public String selectQuesitonByName1(Map<String, Object> map,School school){

				
				SchoolExample   schoolexample=new SchoolExample();
				SchoolExample.Criteria criteria= schoolexample.createCriteria();
				
				
				criteria.andSchNameLike("%"+ school.getSchName()+"%");
			
				criteria.andSchFlagEqualTo(false);
				List<School> list= schoolService.getSchool(schoolexample);
				
				map.put("listSchools", list);
				return "admin/chapter_list_student";
				//return "forward:../admin/adminShowSchool";
				
			}
		
		

			//按毕业动态查询
				//@ResponseBody
				@RequestMapping("selectPo")
				public String selectQuesitonByName11(Map<String, Object> map,Position position){

					
					PositionExample  positionexample=new PositionExample();
					PositionExample.Criteria criteria= positionexample.createCriteria();
					
					
					criteria.andPoNameLike("%"+ position.getPoName()+"%");
				
					criteria.andPoFlagEqualTo(false);
					List<Position> list= positionService.getPosition(positionexample);
					
					map.put("listPo", list);
					return "admin/position-list";
					
					
				}
			
		
		
			
			// 跳转添加学生
			@RequestMapping("/toAddSchool")
			
			public String question(Map<String, Object> map){
				
			   SchoolExample  schoolExample=new 	SchoolExample();
			   SchoolExample.Criteria criteria= schoolExample.createCriteria();
				
				criteria.andSchFlagEqualTo(false);
				
				List<School> list=schoolService.getSchool(schoolExample);
				
				map.put("school", list);
				
				return "admin/school-add";
					
				}
				
			// 跳转添加学生
						@RequestMapping("/toAddPo")
						
						public String questionq(Map<String, Object> map){
							PositionExample  positionexample=new PositionExample();
							PositionExample.Criteria criteria= positionexample.createCriteria();
							
							criteria.andPoFlagEqualTo(false);
							
							List<Position> list= positionService.getPosition(positionexample);
							
							
							map.put("position", list);
							
							return "admin/po-add";
								
							}
							
						
						
						// 完善学生信息页面
						@RequestMapping(value = "/addPo", method = RequestMethod.POST)
						public String updateNewsqq(Position position, Map<String, Object> map) {
						
						
							if (position.getPoName()!=null && !"".equals(position.getPoName())) {
								
								
								position.setPoFlag(false);
								
								positionService.addPosition(position);
								
								
										return "admin/addChapterSuccess";		
										
							}
							return null;
									
						} 
			// 跳转添加学生
						@RequestMapping("/toAddTeacher")
						
						public String question1(Map<String, Object> map){
							
							TeacherExample teacherExample=new TeacherExample();
							com.softjx.model.TeacherExample.Criteria criteria=teacherExample.createCriteria();
							
							criteria.andTeaFlagEqualTo(false);
                           SchoolExample  example=new SchoolExample();
							
							SchoolExample.Criteria criteria1=example.createCriteria();
							criteria1.andSchFlagEqualTo(false);
						
							List<School> list3=schoolService.getSchool(example);
							map.put("school", list3);
							
							List<Teacher> list=teacherService.getTeacher(teacherExample);
							
							map.put("teacher", list);
							
							return "admin/teacher-add";
								
							}
			


						
						
						
			
						
						
						
						
						
					/*	//添加章节界面
						@RequestMapping("/chapter-add")
						public ModelAndView addChapter(String courseId,String courseName,String corpId){
							ModelAndView modelAndView=new ModelAndView();
							Map<String, Object> map=new HashMap<String, Object>();
							map.put("courseId", courseId);
							map.put("courseName", courseName);
							map.put("corpId", corpId);
							modelAndView.addObject("map",map);
							modelAndView.setViewName("chapter/chapter-add");
							return modelAndView;
						}			
						*/
						
						//添加章节界面
						@RequestMapping("/chapter-add")
						public ModelAndView addChapter(String schCode){
							ModelAndView modelAndView=new ModelAndView();
							Map<String, Object> map=new HashMap<String, Object>();
							map.put("schCode", schCode);
							//map.put("schName", schName);
							
							modelAndView.addObject("map",map);
							//modelAndView.setViewName("admin/teacher-add");
							
							modelAndView.setViewName("admin/chapter-add");
							return modelAndView;
						}			
						


						//添加章节界面
						@RequestMapping("/chapter-addstudent")
						public ModelAndView addChapter11(String schCode,String schName){
							ModelAndView modelAndView=new ModelAndView();
							Map<String, Object> map=new HashMap<String, Object>();
							map.put("schCode", schCode);
							map.put("schName", schName);
							
							modelAndView.addObject("map",map);
							modelAndView.setViewName("admin/student-add");
							
							//modelAndView.setViewName("admin/chapter-add");
							return modelAndView;
						}			
						
						
						
						
						//添加章节
						@RequestMapping(value="/addChapterAction",method=RequestMethod.POST)
						public String addChapterAction(Map<String, Object>map,Teacher teacher){
							//获取session中存贮的student对象
							
						    teacher.setTeaFlag(false);
							
							teacher.setTeaCreateTime(new Date());
							
							
							//调用service层添加章节到数据库
							teacherService.addTeacher(teacher);
							
							//将课程id添加到map中
							map.put("schCode", teacher.getSchCode());
							
							return "admin/addChapterSuccess";
							//return "forward:../admin/chapterShowTable33";
							 
						}
								
						
						//添加章节
						@RequestMapping(value="/addStudentAction",method=RequestMethod.POST)
						public String addChapterAction11(Map<String, Object>map,Student student){
							//获取session中存贮的student对象
							
							 student.setStuFlag(false);
							
							 student.setStuCreateTime(new Date());
							
							
							//调用service层添加章节到数据库
							 studentService.addStudent(student);
							
							//将课程id添加到map中
							map.put("schCode",  student.getSchCode());
							
							return "admin/addChapterSuccess";
							//return "forward:../admin/chapterShowTable34";
							 
						}
								
						
						
						
						
						
						

						//根据课程id和章节id查询章节
						@RequestMapping("/selectChapterByIdAction")
						public String selectChapterByIdAction(Map<String, Object> map,Teacher teacher){
							//根据课程id，章节id查询出响应章节，并返回页面
							
							List<Teacher> list=null;
							if(teacher.getTeaId()!=null&&teacher.getSchCode()!=null){
								list=teacherService.selectvTeacherByIf(teacher);
							}
							School school=schoolMapper.selectByPrimaryKee(teacher.getSchCode());
							map.put("teacher", list.get(0));
							map.put("school", school);
							return "admin/chapter-update";
						}
						
			

						//修改章节
						@RequestMapping(value="/updateChapter",method=RequestMethod.POST)
						public String updateChapter(Map<String, Object>map,Teacher teacher){
							
							teacherService.updateTeacher(teacher);
							
							return "admin/addChapterSuccess";
						}
			
						
						
						
						

						//根据课程id和章节id查询章节
						@RequestMapping("/selectStudentByIdAction")
						public String selectChapterByIdActionq(Map<String, Object> map,Student student){
							//根据课程id，章节id查询出响应章节，并返回页面
							
							List<Student> list=null;
							if(student.getStuId()!=null&&student.getSchCode()!=null){
								list=studentService.selectvStudentByIf(student);
							}
							School school=schoolMapper.selectByPrimaryKee(student.getSchCode());
							map.put("student", list.get(0));
							map.put("school", school);
							return "admin/student-update";
						}
						
						
						
						
						//修改章节
						@RequestMapping(value="/updateStudent",method=RequestMethod.POST)
						public String updateChapterq(Map<String, Object>map,Student student){
							
							studentService.updateStudent(student);
							
							return "admin/update-success";
						}
			
						
						
						
					
							@RequestMapping("/paperDelete")
							public void paperDelete(Integer stuId, HttpServletResponse response,Student  student) {
								PrintWriter out = null;
								try {
								  out = response.getWriter();
								} catch (IOException e) {
									e.printStackTrace();
								}
								
								// 将试卷删除
								StudentExample example = new StudentExample();
							Criteria criteria = example.createCriteria();
							        student.setStuFlag(true);
								criteria.andStuIdEqualTo(stuId);
								int recordNumber = studentService.deleteStudentFalse(stuId);
								
								// 判断是否删除成功
								if(recordNumber==1){
									out.print("<script language=\"javascript\">alert('删除成功！');"
											+ "window.location.href='adminShowSchool';</script>");
								} else {
									out.print("<script language=\"javascript\">alert('删除失败');"
											+ "window.location.href='chapterShowTable34';</script>");
								}
								out.flush();
								out.close();
							}
							
						
						
						
							@RequestMapping("/teacherDelete")
							public void paperDelete1(Integer teaId, HttpServletResponse response,Teacher teacher) {
								PrintWriter out = null;
								try {
								  out = response.getWriter();
								} catch (IOException e) {
									e.printStackTrace();
								}
								
								// 将试卷删除
								TeacherExample example = new TeacherExample();
							com.softjx.model.TeacherExample.Criteria criteria = example.createCriteria();
							teacher.setTeaFlag(true);
								criteria.andTeaIdEqualTo(teaId);
								int recordNumber = teacherService.deleteTeacherFalse(teaId);
								
								// 判断是否删除成功
								if(recordNumber==1){
									out.print("<script language=\"javascript\">alert('删除成功！');"
											+ "window.location.href='chapterShowTable33';</script>");
								} else {
									out.print("<script language=\"javascript\">alert('删除失败');"
											+ "window.location.href='chapterShowTable33';</script>");
								}
								out.flush();
								out.close();
							}
							
						
						
			// 完善学生信息页面
			@RequestMapping(value = "/addSchool", method = RequestMethod.POST)
			public String updateNewsq(School school, Map<String, Object> map) {
			
			
				if (school.getSchName()!=null && !"".equals(school.getSchName())) {
					//获取session中存贮的student对象
					Admin admin=(Admin)map.get("admin");
					school.setSchCreateTime(new Date());
					school.setSchCreateBy(admin.getAdName());
					
					school.setSchFlag(false);
					
							schoolService.addSchool(school);
					
					//return "forward:../admin/adminShowSchool";
							return "admin/addChapterSuccess";		
							
				}
				return null;
						
			} 
			/*//添加章节时，校验章节名数据库中是否存在
			@ResponseBody
			@RequestMapping(value="/checkChapterName",method=RequestMethod.POST)
			public boolean checkChapterName(School school){
				
				//查询数据库，是否有同名的章节名称
				//保证章节对象中只有章节名不为空，根据章节名查询章节。
				List<School> list=schoolService.selectSchoolByIf(school);
				//System.out.println(list);
				boolean msg=true;
				if(list.size()>0){
					//数据库中存在该章节名
					msg=false;
				}
				return msg;
			}*/
			
			
			
			
			//根据姓名查询，姓名相同，就不能添加
			
			    @ResponseBody
				@RequestMapping("/schName2")
				public boolean getStudentNo2(School school) {
					boolean exits=false;
			    	
					   SchoolExample  schoolExample=new 	SchoolExample();
					   SchoolExample.Criteria criteria= schoolExample.createCriteria();
						
					if (school.getSchName()!= null && !"".equals(school.getSchName()));
					 criteria.andSchNameEqualTo(school.getSchName());
					 criteria.andSchFlagEqualTo(false );
					List<School> schools = schoolService.getSchool(schoolExample);
					
					
					if (schools.size()>0)
				    	 exits=true;
					
				     else
				    	 exits=false;
				     
					return exits;
					
				}
			
			
			
			    
			  //根据姓名查询，姓名相同，就不能添加
				
			    @ResponseBody
				@RequestMapping("/poName")
				public boolean getStudentNo2q(Position position) {
					boolean exits=false;
			    	
					PositionExample positionExample=new 	PositionExample();
					PositionExample.Criteria criteria= positionExample.createCriteria();
						
					if (position.getPoName()!= null && !"".equals(position.getPoName()));
					 criteria.andPoNameEqualTo(position.getPoName());
					 criteria.andPoFlagEqualTo(false );
					List<Position> positions = positionService.getPosition(positionExample);
					
					
					if (positions.size()>0)
				    	 exits=true;
					
				     else
				    	 exits=false;
				     
					return exits;
					
				}
			
			
			    
			    
			    
//根据姓名查询，姓名相同，就不能添加
				
			    @ResponseBody
				@RequestMapping("/poCode")
				public boolean getStudentNo2qq(Position position) {
					boolean exits=false;
			    	
					PositionExample positionExample=new 	PositionExample();
					PositionExample.Criteria criteria= positionExample.createCriteria();
						
					if (position.getPoCode()!= null && !"".equals(position.getPoCode()));
					 criteria.andPoCodeEqualTo(position.getPoCode());
					 criteria.andPoFlagEqualTo(false );
					List<Position> positions = positionService.getPosition(positionExample);
					
					
					if (positions.size()>0)
				    	 exits=true;
					
				     else
				    	 exits=false;
				     
					return exits;
					
				}
			
			    
			//根据姓名查询，姓名相同，就不能添加
				
			    @ResponseBody
				@RequestMapping("/schName22")
				public boolean getStudentNo222(School school) {
					boolean exits=false;
			    	
					   SchoolExample  schoolExample=new SchoolExample();
					   SchoolExample.Criteria criteria= schoolExample.createCriteria();
						
					if (school.getSchCode()!= null && !"".equals(school.getSchCode()));
					 criteria.andSchCodeEqualTo(school.getSchCode());
					 criteria.andSchFlagEqualTo(false);
					List<School> schools = schoolService.getSchool(schoolExample);
					
					
					if (schools.size()>0)
				    	 exits=true;
					
				     else
				    	 exits=false;
				     
					return exits;
					
				}
			
			
			
			
			
			
			
			
		    
					//根据姓名查询，姓名相同，就不能添加
						
					    @ResponseBody
						@RequestMapping("/schName222")
						public boolean getStudentNo222q(Teacher teacher) {
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
	/*//根据id删除题库题目
			@ResponseBody
			@RequestMapping("selectStudentByNo")
			
				public String deleteStudentFalse11(Student student,Map<String, Object> map) {
				
				Student stu=studentService.getStudent(student.getStuNo());
					
				if (stu!=null)
				{
					map.put("student",stu);
				}
			}*/

		
	
	// 跳转的学校修改页面
	@RequestMapping("/toUpdateNewsUi")
	public String updateStudentPage(School school,Map<String, Object> map) {
		School sch=schoolService.getSchool(school.getSchId());
		
		if (sch!=null)
		{
			map.put("school",sch);
		}
		return "admin/update-schoolUi";
	}
	

	// 跳转的学校修改页面
	@RequestMapping("/toUpdatePoUi")
	public String updateStudentPageq(Position position,Map<String, Object> map) {
		Position sch=positionService.getPosition(position.getPoId());
		
		if (sch!=null)
		{
			map.put("po",sch);
		}
		return "admin/update-poUi";
	}
	
	
	

	//修改数据、
		@RequestMapping("/poUpdate")
		public String updateStudent11q(Position position) {
		
			
			positionService.updatePosition(position);
			
			return "forward:../admin/showPo";
		
		}
		//根据id删除
		@ResponseBody
		@RequestMapping(value="deletePo",method=RequestMethod.POST)
		public int deleteSchoolFa(Position position,Map<String, Object> map) {
			
			int i=0;
			int count=positionService.deletePositionFalse(position.getPoId());
			if(count==0){
				i=0;
			}else{
				i=1;
			}
			return i;
		}
	//根据id删除
	@ResponseBody
	@RequestMapping(value="deleteStudent",method=RequestMethod.POST)
	public int deleteSchoolFalse1(Student student,Map<String, Object> map) {
		student.setStuFlag(true);
		int i=0;
		int count=studentService.deleteStudentFalse(student.getStuId());
		if(count==0){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
	
	
	
	
	
	
	
	//修改数据、
		@RequestMapping("/studentUpdate222")
		public String updateStudent11(School school) {
		
			
			schoolService.updateSchool(school);
			
			return "forward:../admin/adminShowSchool";
		
		}
	
		
		//根据id删除
				@ResponseBody
				@RequestMapping(value="deleteSchool",method=RequestMethod.POST)
				public int deleteSchoolFalse(School school,Map<String, Object> map) {
					int i=0;
					int count=schoolService.deleteSchoolFalse(school.getSchId());
					if(count==0){
						i=0;
					}else{
						i=1;
					}
					return i;
				}

				//根据id删除
				@ResponseBody
				@RequestMapping(value="deleteSchool2222",method=RequestMethod.POST)
				public int deleteSchoolFalse1(Teacher teacher,Map<String, Object> map) {
					int i=0;
					int count=teacherService.deleteTeacherFalse(teacher.getTeaId());
					if(count==0){
						i=0;
					}else{
						i=1;
					}
					return i;
				}	
				// 跳转的学校修改页面
				@RequestMapping("/toUpdateTeacherUi")
				public String updateStudentPage1(Teacher teacher,Map<String, Object> map) {
					Teacher sch=teacherService.getTeacher(teacher.getTeaId());
					
					if (sch!=null)
					{
						map.put("teacher",sch);
					}
					return "admin/update-teacherUi";
				}
				
		
				//修改数据、
				@RequestMapping("/UpdateTeacher")
				public String updateStudent111(Teacher teacher) {
				
					
					teacherService.updateTeacher(teacher);
					
					return "forward:../admin/chapterShowTable2";
				
				}
				
				
				//根据id删除
				@ResponseBody
				@RequestMapping(value="deleteTeacher",method=RequestMethod.POST)
				public int deleteTeacherFalse(Teacher teacher,Map<String, Object> map) {
					int i=0;
					int count=teacherService.deleteTeacherFalse(teacher.getTeaId());
					if(count==0){
						i=0;
					}else{
						i=1;
					}
					return i;
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
			
			
			/*QuestionTypeExample example1=new QuestionTypeExample();
			com.pctc.model.QuestionTypeExample.Criteria criteria2=example1.createCriteria();
			criteria2.andQtDeleteEqualTo(false);
			List<QuestionType> list = questionTypeService.selectAllQuestionType(example1);
			map.put("qTypelist", list);
			map.put("questionBnak", qBnak);*/
			return "teacher/update-newsUi";
			
			//return "question/questionbankupdate";// 返回修改页面
		}
	
	
		/*// 完善学生信息页面
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
						
						return "forward:../teacher/toQuestionInfo2";
					}
					return null;
							
				}
				*/
	
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
				
				//school=schoolService.selectSchoolByName(school.getSchName());
				//student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
				
				map.put("school", list3);
				map.put("students", wayList);
					
				
				
				
				
				
				/*Student student = studentService.getStudent(stuId);
				map.put("student", student);*/

				return "student/update-newsUi";
				//return "student/student-update";
			}
	
	
	
	
	
	
	/*// 跳转完善学生信息页面1111
			@RequestMapping("/toUpdateNewsUi")
			
			public String question(Map<String, Object> map){
				//获取session中存贮的student对象
			Teacher teacher1=(Teacher)map.get("teacher");
				
				StudentExample  studentexample=new StudentExample();
				StudentExample.Criteria criteria1=studentexample.createCriteria();
				
			   SchoolExample  schoolExample=new 	SchoolExample();
			
				System.err.println(teacher1);
				//获取条件用户选择的学生id
				//criteria1.andStuNoEqualTo(student1.getStuNo());
				criteria1.andStuNoEqualTo(teacher1.getSchCode());
				criteria1.andStuFlagEqualTo(false);
				
				List<Student> wayList=studentService.getStudentWithSchool(studentexample);
				SchoolExample.Criteria criteria=schoolExample.createCriteria();
				criteria.andSchFlagEqualTo(false);
				List<School> list3=schoolService.getSchool(schoolExample);
				
				//school=schoolService.selectSchoolByName(school.getSchName());
				//student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
				
				map.put("school", list3);
				map.put("students", wayList);
					
					
				return "student/update-newsUi";
					
					
				}
				
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*//根据id删除题库题目
		@ResponseBody
		@RequestMapping("deleteStudent")
		//public int  delectQuestionBnak(Student student){
		public String updateStudentPage33(@RequestParam(value = "stuId") Integer stuId, Student student,Map<String, Object> map) {
			
				//public String deleteStudentFalse(Integer stuId) {
				//int stu=studentService.deleteStudentFalse(student.getStuId());
				studentService.deleteStudentFalse(stuId);
				
				//return "teacher/teacher-information";
				return "teacher/teacher-information";
		}
*/
	
		
		

		
		
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
		
		
		
		
	
	@RequestMapping("toQuestionInfo3")
	public String toQuestionInfo88(Map<String, Object> map){
		     //获取session中存贮的student对象
				Teacher teacher=(Teacher)map.get("teacher");
			
				/*StudentExample  studentExample=new StudentExample();
				StudentExample.Criteria criteria=studentExample.createCriteria();
				criteria.andStuFlagEqualTo(false);*/
				
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
	
	
	
	
	
	

	
	
	

		
		
		
	/*
	// 查询学生个人信息
	@RequestMapping("/students")
	public String getStdudents(Map<String, Object> map){
			
		StudentExample  studentExample=new StudentExample();
		
		StudentExample.Criteria criteria=studentExample.createCriteria();
		
		criteria.andStuFlagEqualTo(false);
		List<Student> list=studentService.getStudentWithSchool(studentExample);
		map.put("student", list);
		return "student/student--information";
	}*/
	
	
	
	
	

		
		
	
	
	
	
	
	/*// 跳转完善学生信息页面
		@RequestMapping("/toUpdateNews")
		public String toUpdateNews( ModelMap map) {
			Student student=(Student)map.get("student");
			 StudentExample  studentexample=new StudentExample();
			StudentExample.Criteria criteria1=studentexample.createCriteria();
			
			
			//获取条件用户选择的学生id
			criteria1.andStuNoEqualTo(student.getStuNo());
			
			
			criteria1.andStuFlagEqualTo(false);
                SchoolExample  example=new SchoolExample();
                StudentExample  studentexample1=new StudentExample();
			SchoolExample.Criteria criteria=example.createCriteria();
			criteria.andSchFlagEqualTo(false);
			List<School> list3=schoolService.getSchool(example);
			
			List<Student> studentList=studentService.getStudentWithSchool(studentexample1);
			//List<Position>  position1  =positionService.getPosition(positionExample);
			
				
				map.put("students", studentList);
			    map.put("school", list3);
			return "student/update-news";
		}*/
		
	
		
		
		
		
		
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
			
			
		
		
		
		
		
		
		

		/*// 跳转完善学生信息页面1111
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
			
			//school=schoolService.selectSchoolByName(school.getSchName());
			//student1.setSchCode(school.getSchCode());//将查找的章节id赋给qBnak
			
			map.put("school", list3);
				map.put("students", wayList);
				
				
			return "student/update-newsUi";
				
				
			}
			*/
			
		
		
		
		
		
		
		/*// 完善学生信息页面
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
		*/
		
		
		

		
			
			
			
			
			
			
			// 跳转修改页面
			@RequestMapping("/toUpdateWay")
			public String toUpdateWay(@RequestParam(value = "wayId") Integer wayId, Map<String, Object> map) {
			Way way = wayService.getWay(wayId);
				map.put("way", way);

				return "student/update-ways";
			}
			
			
			
			
			/*// 完善学生信息页面
			@RequestMapping(value = "/updateWays", method = RequestMethod.POST)
			public String updateWays(Way way, Map<String, Object> map) {
				
				if (way.getStuNo()!=null && !"".equals(way.getStuNo())) {
					Student student1=(Student) map.get("student");
					
					
					
					wayService.updateWay(way);
					return "student/show2";
				}
				return null;
						
			}
		
		
		*/
			
			
			
			
			
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
			
			
			
			
			
			
					
			
			
			
		
/*SchoolExample  example=new SchoolExample();
		
		SchoolExample.Criteria criteria=example.createCriteria();
		criteria.andSchFlagEqualTo(false);
		List<School> list3=schoolService.getSchool(example);
		map.put("school", list3);
		return "student/questionbankadd";
	
	}
	*/
		
		
		
		/*
		CourseChapterExample example=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria=example.createCriteria();
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> list2=courseChapterService.selectAllCourseChapter(example);
		map.put("courseChapter", list2);
		*/
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
		
		
		
				// 登记学生去向页面
				/*@RequestMapping(value = "/insertWay", method = RequestMethod.POST)
				public String InsertPosition(Way way, Map<String, Object> map) {
					@SuppressWarnings("unused")
					WayExample wayexample=new WayExample();
					
						
						way.setWayCreateBy(way.getStuNo());
						//student.setStuCreateTime(new Date());
						
					
						wayService.addWay(way);
					
				return "student/success";
					
				}*/
							
				
				
				

				// 登记学生去向页面
			/*
				@RequestMapping(value = "/insertWay", method = RequestMethod.POST)
				public String InsertPosition(Way way, Map<String, Object> map, String poName) {
					WayExample wayexample=new WayExample();
					PositionExample  example=new  PositionExample();
					PositionExample.Criteria criteria=example.createCriteria();
					
						way.setWayCreateBy(way.getStuNo());
						
				
						String poCode=positionService.getPoName(poName).get(0).getPoCode();
						//way.setPoCode(((Map<String, Object>) example).get(0).positionService.getPosition(example);
						//Integer typeNo=typeService.getTypeName(typeName).get(0).getTypeNo();
						way.setWayFlag(false);
					    way.setWayCreateTime(new Date());
						
					    wayService.addWay(way);
						
					
				return "student/success";
					
				}
							*/
				
				
				
				
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

				
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				/*
				SchoolExample  example=new SchoolExample();
				
				SchoolExample.Criteria criteria=example.createCriteria();
				criteria.andSchFlagEqualTo(false);
				List<School> list3=schoolService.getSchool(example);
				map.put("school", list3);
				*/
				
				
				
				
				
				
				
		
		
		
		/*
		@RequestMapping("/studentShow")
		public String getStudentif1(Map<String, Object> map, Student student) {
			StudentExample studentExample = new StudentExample();
			
			List<Student> students = studentService.getStudentWithSchool(studentExample);
			map.put("studentss", students);
			return "student/student-show";
		}*/
		
		
		
		
		
		
		
		
		
		
		
		/*@RequestMapping("/studentShow")
		public String getStudentif1(Student student, Map<String, Object> map) {
			System.out.println(student.getStuPass());
			StudentExample studentExample = new StudentExample();
				Student student1=(Student) map.get("student");
				
				

				studentService.getStudentWithSchool(studentExample);
				return "student/student-show";
			}
			*/
					

/*
		@RequestMapping("/studentShow")
		public String showQuestionErrorUI(@RequestParam(value = "pagenum", defaultValue = "1") Integer pagenum,HttpServletRequest request,Map<String , Object> map){
			//获取到学生id
			
			Student stu=(Student) request.getSession().getAttribute("student");
			int id=stu.getStuId();
			List<StudentSchoolVo> list=studentService.getStudentSchoolSqlVo();
			
			
			map.put("stuVo", list);
			
			return "student/student-show";
		}*/

		
		
		
		
		/*@RequestMapping("/studentShow")
		public String toHistory(HttpServletRequest request, Map<String, Object> map) {
			HttpSession session = request.getSession();
			//map.put("StudentSchoolVo", studentService.((Integer) session.getAttribute("studentId")));
			Student stu=(Student) request.getSession().getAttribute("student");
			int id=stu.getStuId();
			StudentExample example = new StudentExample();
			
			List<StudentSchoolVo> list=studentService.getStudentSchoolSqlVo();
			map.put("StudentSchoolVo", studentService.getStudentSchoolVo(example));
			map.put("stuVo", stu);
			return "student/student-show";
		}*/
		
		
		
		
		
		
		
		
		
		/*//2.2跳转选择试卷名称页面
				@RequestMapping("questionPaperPage")
				public String questionDailyPaperToFor(Map<String, Object> map){
					//获取session中存贮的student对象
					Student student=(Student)map.get("student");
				SchoolExample schoolExample=new SchoolExample();
				SchoolExample.Criteria criteria=schoolExample.createCriteria();
					System.err.println(student);
					//获取条件用户选择的学生id
					criteria.andSchCodeEqualTo(student.getSchCode());
					criteria.andSchFlagEqualTo(false);
					
					//从考试表中拿到所有符合条件的答题信息
					List<School> schoolList=schoolService.getSchool(schoolExample);
		            //防止符合条件的答题信息库为空
					if(schoolList.size()==0){
					//if(student.getStuAddress().isEmpty()){
					
						return "student/questionPaperInfoError";
					}else{
						//定义一个存放试卷名称的list
						List<School> schools=new ArrayList<School>();
						
						//防止试卷名称重复
						for(int i=0;i<schoolList.size()-1;i++){
							if(!schoolList.get(i).getSchName().equals(schoolList.get(i+1).getSchName())){
								schools.add(schoolList.get(i));
							}
						}
						schools.add(schoolList.get(schoolList.size()-1));
						map.put("schools", schools);
						
						
						return "student/show1";
						//return "student/questionPaperChooseQpname";
					}
					
					}*/
					
						
		
				
				
				
				
				
				
				
				
				
				
/*
				//2.2跳转选择试卷名称页面33333
						@RequestMapping("questionPaperPage")
						public String questionDailyPaperToFor(Map<String, Object> map){
							//获取session中存贮的student对象
							Student student=(Student)map.get("student");
						SchoolExample schoolExample=new SchoolExample();
						SchoolExample.Criteria criteria=schoolExample.createCriteria();
							System.err.println(student);
							//获取条件用户选择的学生id
							criteria.andSchCodeEqualTo(student.getSchCode());
							criteria.andSchFlagEqualTo(false);
							
							//从考试表中拿到所有符合条件的答题信息
							List<School> schoolList=schoolService.getSchool(schoolExample);
							
							
							
							StudentExample  studentexample=new StudentExample();
							StudentExample.Criteria criteria1=studentexample.createCriteria();
							
							List<Student> list=studentService.getStudentWithSchool(studentexample);
							map.put("student", list);
							
							
				           
								//定义一个存放试卷名称的list
								//List<School> schools=new ArrayList<School>();
								
								
								//schools.add(schoolList.get(schoolList.size()-1));
								map.put("schools", schoolList);
								
								
								return "student/show1";
								//return "student/questionPaperChooseQpname";
							}*/
							
							
						
				
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
					
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
								
		
		
				
				/*//2.2跳转选择试卷名称页面333
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
					List<Way> wayList=wayService.getWay(wayExample);
		            
					List<Position>  position1  =positionService.getPosition(positionExample);
					
						
						map.put("ways", wayList);
						
						map.put("positions", position1);
						return "student/show2";
						//return "student/questionPaperChooseQpname";
					}
					
					*/
					
				
		

			
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
					
					
				
				
				/*//2.2跳转选择试卷名称页面
				
				@SuppressWarnings("unused")
				@RequestMapping("waySee")
				public String waySee(Map<String, Object> map){
					 WayExample wayExample = null;
					//获取session中存贮的student对象
					Student student=(Student)map.get("student");
					PositionExample  example=new  PositionExample();
					PositionExample.Criteria criteria=example.createCriteria();
					
				
					List<Position> list3=positionService.getPosition(example);
					map.put("position", list3);
				
					
						List<Way> ways = wayService.getWay(wayExample);
						map.put("wayss", ways);
						
						return "student/show2";
						
					}
					*/
					
				
						
				

				/*//2.2跳转选择试卷名称页面
				@RequestMapping("waySee")
				public String question(Map<String, Object> map){
					//获取session中存贮的student对象
					Student student=(Student)map.get("student");
				WayExample wayExample=new WayExample();
				WayExample.Criteria criteria=wayExample.createCriteria();
				
					//获取条件用户选择的学生id
					criteria.andStuNoEqualTo(student.getStuNo());
					criteria.andWayFlagEqualTo(false);
					
					//从考试表中拿到所有符合条件的答题信息
					List<Way> wayList=wayService.getWay(wayExample);
						
						map.put("wayss", wayList);
						
						
						return "student/show2";
						//return "student/questionPaperChooseQpname";
					}
					
					*/
				
						
				
				
				
				
				
				
				/*// 查询所有数据
				@RequestMapping("/students")
				public String getStdudents(Map<String, Object> map) {
					StudentExample studentExample = null;

					List<Student> students = studentService.getStudents(studentExample);
					map.put("students", students);
					return "studentList";
				}
				*/
				
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
				
				
				

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



				    
				    
				    
				    
				    
				    
				  
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
				
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					/*// 跳转的修改页面
					@RequestMapping("/toUpdateNewsUi")
					public String updateStudentPage99(Way way,Map<String, Object> map) {
						Way wa=wayService.getWay(way.getWayId());
						PositionExample  positionExample=new 	PositionExample();

						
						
						
						
						
						
						if (wa!=null)
						{
							map.put("way",wa);
						}
						return "teacher/update-newsUi";
					}	 
					*/
					
						
						
									 
				
					
					
					
					

					// 跳转的修改页面
					@RequestMapping("/toUpdateWayssUi123")
					public String updateStudentPage22(@RequestParam(value = "wayId") Integer wayId,Student studen, Way way,Map<String, Object> map) {

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
