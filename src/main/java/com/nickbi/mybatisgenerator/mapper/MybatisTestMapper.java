package com.nickbi.mybatisgenerator.mapper;

import com.nickbi.mybatisgenerator.model.MybatisTest;
import com.nickbi.mybatisgenerator.model.MybatisTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MybatisTestMapper {
    int countByExample(MybatisTestExample example);

    int deleteByExample(MybatisTestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MybatisTest record);

    int insertSelective(MybatisTest record);

    List<MybatisTest> selectByExample(MybatisTestExample example);

    MybatisTest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MybatisTest record, @Param("example") MybatisTestExample example);

    int updateByExample(@Param("record") MybatisTest record, @Param("example") MybatisTestExample example);

    int updateByPrimaryKeySelective(MybatisTest record);

    int updateByPrimaryKey(MybatisTest record);
}