package com.xh.mapper;

import com.xh.pojo.TbOldmanRecentmessage;
import com.xh.pojo.TbOldmanRecentmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOldmanRecentmessageMapper {
    int countByExample(TbOldmanRecentmessageExample example);

    int deleteByExample(TbOldmanRecentmessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanRecentmessage record);

    int insertSelective(TbOldmanRecentmessage record);

    List<TbOldmanRecentmessage> selectByExample(TbOldmanRecentmessageExample example);

    TbOldmanRecentmessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanRecentmessage record, @Param("example") TbOldmanRecentmessageExample example);

    int updateByExample(@Param("record") TbOldmanRecentmessage record, @Param("example") TbOldmanRecentmessageExample example);

    int updateByPrimaryKeySelective(TbOldmanRecentmessage record);

    int updateByPrimaryKey(TbOldmanRecentmessage record);
}