package com.xh.mapper;

import com.xh.pojo.TbAbilityItemOption;
import com.xh.pojo.TbAbilityItemOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAbilityItemOptionMapper {
    int countByExample(TbAbilityItemOptionExample example);

    int deleteByExample(TbAbilityItemOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAbilityItemOption record);

    int insertSelective(TbAbilityItemOption record);

    List<TbAbilityItemOption> selectByExample(TbAbilityItemOptionExample example);

    TbAbilityItemOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAbilityItemOption record, @Param("example") TbAbilityItemOptionExample example);

    int updateByExample(@Param("record") TbAbilityItemOption record, @Param("example") TbAbilityItemOptionExample example);

    int updateByPrimaryKeySelective(TbAbilityItemOption record);

    int updateByPrimaryKey(TbAbilityItemOption record);
}