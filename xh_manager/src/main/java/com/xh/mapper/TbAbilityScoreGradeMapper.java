package com.xh.mapper;

import com.xh.pojo.TbAbilityScoreGrade;
import com.xh.pojo.TbAbilityScoreGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAbilityScoreGradeMapper {
    int countByExample(TbAbilityScoreGradeExample example);

    int deleteByExample(TbAbilityScoreGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAbilityScoreGrade record);

    int insertSelective(TbAbilityScoreGrade record);

    List<TbAbilityScoreGrade> selectByExample(TbAbilityScoreGradeExample example);

    TbAbilityScoreGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAbilityScoreGrade record, @Param("example") TbAbilityScoreGradeExample example);

    int updateByExample(@Param("record") TbAbilityScoreGrade record, @Param("example") TbAbilityScoreGradeExample example);

    int updateByPrimaryKeySelective(TbAbilityScoreGrade record);

    int updateByPrimaryKey(TbAbilityScoreGrade record);
}