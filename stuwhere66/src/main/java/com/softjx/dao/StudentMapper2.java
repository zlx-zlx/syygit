package com.softjx.dao;

import java.util.List;

import com.softjx.model.Status;
import com.softjx.model.StuStatusCount;
import com.softjx.model.Student;
import com.softjx.model.Student2;
import com.softjx.model.StudentExample;
import com.softjx.model.StudentExample2;
import com.softjx.model.TeacherExample;
import com.softjx.vo.StuVo;
import com.softjx.vo.StudentSchoolVo;

public interface StudentMapper2 {
   

    List<Student2> selectByExample2(StudentExample2 example2);

    List<Status> getStatus();
    
    List<StuStatusCount> getStatusCount();
    
    
    List<StuVo> selectBy(String teaCode);
  //多表查询,自定义的
    List<StuVo> getStuVo(StudentExample example);
    
  //多表查询,自定义的
    List<StuVo> getSt();
  
    List<Status> getSta(TeacherExample example);
}