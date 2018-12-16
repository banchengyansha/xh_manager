package com.xh.mapper;

import com.xh.pojo.TbOldmanMentality;
import com.xh.pojo.TbOldmanMentalityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOldmanMentalityMapper {
    int countByExample(TbOldmanMentalityExample example);

    int deleteByExample(TbOldmanMentalityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanMentality record);

    int insertSelective(TbOldmanMentality record);

    List<TbOldmanMentality> selectByExample(TbOldmanMentalityExample example);

    TbOldmanMentality selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanMentality record, @Param("example") TbOldmanMentalityExample example);

    int updateByExample(@Param("record") TbOldmanMentality record, @Param("example") TbOldmanMentalityExample example);

    int updateByPrimaryKeySelective(TbOldmanMentality record);

    int updateByPrimaryKey(TbOldmanMentality record);
}