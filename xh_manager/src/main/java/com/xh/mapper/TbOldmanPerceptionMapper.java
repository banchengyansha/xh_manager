package com.xh.mapper;

import com.xh.pojo.TbOldmanPerception;
import com.xh.pojo.TbOldmanPerceptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOldmanPerceptionMapper {
    int countByExample(TbOldmanPerceptionExample example);

    int deleteByExample(TbOldmanPerceptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanPerception record);

    int insertSelective(TbOldmanPerception record);

    List<TbOldmanPerception> selectByExample(TbOldmanPerceptionExample example);

    TbOldmanPerception selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanPerception record, @Param("example") TbOldmanPerceptionExample example);

    int updateByExample(@Param("record") TbOldmanPerception record, @Param("example") TbOldmanPerceptionExample example);

    int updateByPrimaryKeySelective(TbOldmanPerception record);

    int updateByPrimaryKey(TbOldmanPerception record);
}