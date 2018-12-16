package com.xh.mapper;

import com.xh.pojo.TbOldmanSocialParticipation;
import com.xh.pojo.TbOldmanSocialParticipationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOldmanSocialParticipationMapper {
    int countByExample(TbOldmanSocialParticipationExample example);

    int deleteByExample(TbOldmanSocialParticipationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanSocialParticipation record);

    int insertSelective(TbOldmanSocialParticipation record);

    List<TbOldmanSocialParticipation> selectByExample(TbOldmanSocialParticipationExample example);

    TbOldmanSocialParticipation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanSocialParticipation record, @Param("example") TbOldmanSocialParticipationExample example);

    int updateByExample(@Param("record") TbOldmanSocialParticipation record, @Param("example") TbOldmanSocialParticipationExample example);

    int updateByPrimaryKeySelective(TbOldmanSocialParticipation record);

    int updateByPrimaryKey(TbOldmanSocialParticipation record);
}