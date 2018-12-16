package com.xh.mapper;

import com.xh.pojo.TbOldmanAbilityGrade;
import com.xh.pojo.TbOldmanAbilityGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOldmanAbilityGradeMapper {
    int countByExample(TbOldmanAbilityGradeExample example);

    int deleteByExample(TbOldmanAbilityGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanAbilityGrade record);

    int insertSelective(TbOldmanAbilityGrade record);

    List<TbOldmanAbilityGrade> selectByExample(TbOldmanAbilityGradeExample example);

    TbOldmanAbilityGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanAbilityGrade record, @Param("example") TbOldmanAbilityGradeExample example);

    int updateByExample(@Param("record") TbOldmanAbilityGrade record, @Param("example") TbOldmanAbilityGradeExample example);

    int updateByPrimaryKeySelective(TbOldmanAbilityGrade record);

    int updateByPrimaryKey(TbOldmanAbilityGrade record);
}