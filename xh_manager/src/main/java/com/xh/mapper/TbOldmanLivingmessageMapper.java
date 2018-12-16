package com.xh.mapper;

import com.xh.pojo.TbOldmanLivingmessage;
import com.xh.pojo.TbOldmanLivingmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOldmanLivingmessageMapper {
    int countByExample(TbOldmanLivingmessageExample example);

    int deleteByExample(TbOldmanLivingmessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanLivingmessage record);

    int insertSelective(TbOldmanLivingmessage record);

    List<TbOldmanLivingmessage> selectByExample(TbOldmanLivingmessageExample example);

    TbOldmanLivingmessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanLivingmessage record, @Param("example") TbOldmanLivingmessageExample example);

    int updateByExample(@Param("record") TbOldmanLivingmessage record, @Param("example") TbOldmanLivingmessageExample example);

    int updateByPrimaryKeySelective(TbOldmanLivingmessage record);

    int updateByPrimaryKey(TbOldmanLivingmessage record);
}