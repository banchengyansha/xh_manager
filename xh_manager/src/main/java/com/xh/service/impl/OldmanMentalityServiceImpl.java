package com.xh.service.impl;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanMentalityMapper;
import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.pojo.TbOldmanMentality;
import com.xh.pojo.TbOldmanMessage;
import com.xh.service.AbilityItemService;
import com.xh.service.AbilityScoreGradeService;
import com.xh.service.OldmanMentalityService;

@Service
public class OldmanMentalityServiceImpl implements OldmanMentalityService{
	
	@Autowired
	private TbOldmanMentalityMapper mentalityMapper;
	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Autowired
	private AbilityItemService abilityItemService;
	
	@Autowired
	private AbilityScoreGradeService abilityScoreGradeService;
 	
	@Override
	public Integer add(TbOldmanMentality oldmanMentality) throws Exception {
		
		oldmanMentality.setCreateTime(new Date());
		oldmanMentality.setUpdateTime(new Date());
		
		mentalityMapper.insert(oldmanMentality);
		
		
		//更新数据库表中的生活能力等级数据.
		Integer level = getLevel(oldmanMentality);//获取生活能力等级数据
		
		TbOldmanMessage record = new TbOldmanMessage();
		record.setId(oldmanMentality.getId());
		record.setLevelMentality(level);
		
		oldmanMessageMapper.updateByPrimaryKeySelective(record);
		
		return level;
	}

	
	private Integer getLevel(TbOldmanMentality oldmanMentality) throws Exception{
		
		Integer score = getMentalityScore(oldmanMentality);
		
		Integer level = abilityScoreGradeService.getLevelByScoreAndCat(score, 2);
		
		return level;
		
	}
	
	
	
	public Integer getMentalityScore(TbOldmanMentality message) throws Exception{
		
		Map<Integer, Integer> scoreLevelMapping = abilityItemService.getScoreLevelMapping();
		
		Integer score = 0;
		
		Field[] fields = message.getClass().getDeclaredFields();
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
