package com.xh.mapper;

import com.xh.pojo.TbOldmanLinkmessage;
import com.xh.pojo.TbOldmanLinkmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface TbOldmanLinkmessageMapper {
	
    int countByExample(TbOldmanLinkmessageExample example);

    int deleteByExample(TbOldmanLinkmessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanLinkmessage record);

    int insertSelective(TbOldmanLinkmessage record);

    List<TbOldmanLinkmessage> selectByExample(TbOldmanLinkmessageExample example);

    TbOldmanLinkmessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanLinkmessage record, @Param("example") TbOldmanLinkmessageExample example);

    int updateByExample(@Param("record") TbOldmanLinkmessage record, @Param("example") TbOldmanLinkmessageExample example);

    int updateByPrimaryKeySelective(TbOldmanLinkmessage record);

    int updateByPrimaryKey(TbOldmanLinkmessage record);
    
}



