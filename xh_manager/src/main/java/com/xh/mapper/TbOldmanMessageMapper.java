package com.xh.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanMessageExample;

public interface TbOldmanMessageMapper {
	
    int countByExample(TbOldmanMessageExample example);

    int deleteByExample(TbOldmanMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOldmanMessage record);

    int insertSelective(TbOldmanMessage record);

    List<TbOldmanMessage> selectByExample(TbOldmanMessageExample example);

    TbOldmanMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOldmanMessage record, @Param("example") TbOldmanMessageExample example);

    int updateByExample(@Param("record") TbOldmanMessage record, @Param("example") TbOldmanMessageExample example);

    int updateByPrimaryKeySelective(TbOldmanMessage record);

    int updateByPrimaryKey(TbOldmanMessage record);
    
    List<Map<String,Integer>> countGender();
    
    public List<Map<String,Integer>> countAbility();
	
	public Integer countAge(@Param("start") String start , @Param("end") String end);
	
	public List<Map<String,Integer>> countLivingCondition();

	List<Map<String, Object>> countArea();
	
	List<Map<String,Object>> countLivingEat();
    
	List<Map<String,Object>> countLivingStool();
	
	List<Map<String,Object>> countLivingUrination();
	
	List<Map<String,Object>> countLivingWalk();
	
	List<Map<String,Object>> countPerceptionConsciousness();
	
	List<Map<String,Object>> countPerceptionVision();
	
	List<Map<String,Object>> countPerceptionHearing();
	
	List<Map<String,Object>> countPerceptionCommunication();
	
	
	List<Map<String,Object>> countSocialLiving();
	
	List<Map<String,Object>> countSocialTimeSpace();
	
	List<Map<String,Object>> countSocialPerson();
	
	List<Map<String,Object>> countSocialJob();
	
	List<Map<String,Object>> countSocialCommunication();
	
	
}