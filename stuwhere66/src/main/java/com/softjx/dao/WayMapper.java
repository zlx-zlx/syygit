package com.softjx.dao;

import com.softjx.model.Way;
import com.softjx.model.WayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WayMapper {
    int countByExample(WayExample example);

    int deleteByExample(WayExample example);

    int deleteByPrimaryKey(Integer wayId);

    int insert(Way record);

    int insertSelective(Way record);

    List<Way> selectByExample(WayExample example);

    Way selectByPrimaryKey(Integer wayId);

    int updateByExampleSelective(@Param("record") Way record, @Param("example") WayExample example);

    int updateByExample(@Param("record") Way record, @Param("example") WayExample example);

    int updateByPrimaryKeySelective(Way record);

    int updateByPrimaryKey(Way record);
    
    
    
    //自定义
    //多表查询
      List<Way> selectByExampleWithPo(WayExample example);
      
    
}