package com.softjx.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("returnPage")
public class Topage {

	
	
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private WayService wayService;
	
	@Autowired
	private PositionService positionService;
	
	
	/**
	 * ��ת�����������ҳ��
	 * 
	 * @return
	 */
	/*@RequestMapping("toaddQuestion")
	public String toAddQuestion(ModelMap map) {
		QuestionTypeExample example1=new QuestionTypeExample();
		com.pctc.model.QuestionTypeExample.Criteria criteria1=example1.createCriteria();
		criteria1.andQtDeleteEqualTo(false);
		List<QuestionType> list = questionTypeService.selectAllQuestionType(example1);
		map.put("qTypelist", list);
		CourseChapterExample example=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria=example.createCriteria();
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> list2=courseChapterService.selectAllCourseChapter(example);
		map.put("courseChapter", list2);
		InstitutionsExample example2=new InstitutionsExample();
		Criteria criteria2=example2.createCriteria();
		criteria2.andInsDeleteEqualTo(false);//��ѯ����
		List<Institutions> list3=institutionsService.selectAllInstitutions(example2);
		map.put("institutions", list3);
		return "question/questionbankadd";// ����ѯ��������Ϣ���ص����ҳ��
	}*/
	
	
	
	
	@RequestMapping("toaddQuestion")
	public String toAddQuestion(ModelMap map) {
		
		SchoolExample  example=new SchoolExample();
		
		SchoolExample.Criteria criteria=example.createCriteria();
		criteria.andSchFlagEqualTo(false);
		List<School> list3=schoolService.getSchool(example);
		map.put("school", list3);
		return "student/questionbankadd";
	
	}
	
	
	
	
	
	
	@RequestMapping("toQuestionInfo")
	public String toQuestionInfo(Map<String, Object> map){
		StudentExample  studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andStuFlagEqualTo(false);
		List<Student> list=studentService.getStudentWithSchool(studentExample);
		map.put("student", list);
		return "student/student-information";
	}
	
	
	
	@RequestMapping("toQuestionInfo1")
	public String toQuestionInfo1(Map<String, Object> map){
		WayExample  wayExample=new WayExample();
		WayExample.Criteria criteria=wayExample.createCriteria();
		criteria.andWayFlagEqualTo(false);
		List<Way> list=wayService.getWayWithPo(wayExample);
		map.put("way", list);
		return "student/student-information2";
	}
	
	
	
	
	
	/*@RequestMapping("toQuestionInfo2")
	public String toQuestionInfo11(Map<String, Object> map){
		StudentExample  studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andStuFlagEqualTo(false);
		List<Student> list=studentService.getStudentWithSchool(studentExample);
		map.put("student", list);
		return "teacher/teacher-information";
	}
	*/
	
	
	
	
}
