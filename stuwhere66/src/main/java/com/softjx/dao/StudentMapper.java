package com.softjx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.softjx.model.Student;
import com.softjx.model.StudentExample;
import com.softjx.vo.StudentSchoolVo;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer stuId);
    Student selectByPrimaryKe(String schCode);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    //自定义
    //多表查询
      List<Student> selectByExampleWithSchool(StudentExample example);
      
     
      
      //多表查询,自定义的
      List<StudentSchoolVo> getStudentSchoolSqlVo();
      
}