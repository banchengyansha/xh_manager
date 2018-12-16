package com.xh.mapper;

import com.xh.pojo.TbAbilityGradeLevel;
import com.xh.pojo.TbAbilityGradeLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAbilityGradeLevelMapper {
    int countByExample(TbAbilityGradeLevelExample example);

    int deleteByExample(TbAbilityGradeLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAbilityGradeLevel record);

    int insertSelective(TbAbilityGradeLevel record);

    List<TbAbilityGradeLevel> selectByExample(TbAbilityGradeLevelExample example);

    TbAbilityGradeLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAbilityGradeLevel record, @Param("example") TbAbilityGradeLevelExample example);

    int updateByExample(@Param("record") TbAbilityGradeLevel record, @Param("example") TbAbilityGradeLevelExample example);

    int updateByPrimaryKeySelective(TbAbilityGradeLevel record);

    int updateByPrimaryKey(TbAbilityGradeLevel record);
}