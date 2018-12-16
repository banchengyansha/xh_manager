package com.xh.service.impl;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanLivingmessageMapper;
import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.pojo.TbOldmanLivingmessage;
import com.xh.pojo.TbOldmanMessage;
import com.xh.service.AbilityItemService;
import com.xh.service.AbilityScoreGradeService;
import com.xh.service.OldmanLivingMessageService;

@Service
public class OldmanLivingMessageServiceImpl implements OldmanLivingMessageService{
	
	@Autowired
	private TbOldmanLivingmessageMapper oldmanLivingmessageMapper;
 	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Autowired
	private AbilityItemService abilityItemService;
	
	@Autowired
	private AbilityScoreGradeService abilityScoreGradeService;
	
	
	@Override
	public Integer add(TbOldmanLivingmessage message) throws Exception {
		
		//插入日常生活能力数据
		message.setCreateTime(new Date());
		message.setUpdateTime(new Date());
		oldmanLivingmessageMapper.insert(message);
		
		//更新数据库表中的生活能力等级数据.
		Integer level = getLevel(message);//获取生活能力等级数据
		
		TbOldmanMessage record = new TbOldmanMessage();
		record.setId(message.getId());
		record.setLevelDailyLiving(level);
		oldmanMessageMapper.updateByPrimaryKeySelective(record);
		
		return level;
	}
	
	
	
	private Integer getLevel(TbOldmanLivingmessage message) throws Exception{
		
		Integer score = getLivingMessageScore(message);
		Integer level = abilityScoreGradeService.getLevelByScoreAndCat(score, 1);
		
		return level;
		
	}
	
	
	
	public Integer getLivingMessageScore(TbOldmanLivingmessage message) throws Exception{
		
		Map<Integer, Integer> scoreLevelMapping = abilityItemService.getScoreLevelMapping();
		Integer score = 0;
		
		Field[] fields = TbOldmanLivingmessage.class.getDeclaredFields();
		for (Field field : fields) {
			if(!field.getName().equals("id") && !field.getName().equals("createTime") && !field.getName().equals("updateTime")){
				field.setAccessible(true);
				Object object = field.get(message);
				
				if(object != null){
					Integer itemId = Integer.valueOf(object.toString());
					score += scoreLevelMapping.get(itemId);
				}
			}
		}
		
		return score;
	}
	
	
	
	
}
