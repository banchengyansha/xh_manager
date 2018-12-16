package com.xh.service.impl;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.mapper.TbOldmanSocialParticipationMapper;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanSocialParticipation;
import com.xh.service.AbilityItemService;
import com.xh.service.AbilityScoreGradeService;
import com.xh.service.OldmanSocialParticipationService;

@Service
public class OldmanSocialParticipationServiceImpl implements OldmanSocialParticipationService{
	
	@Autowired
	private TbOldmanSocialParticipationMapper participationMapper;
	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Autowired
	private AbilityItemService abilityItemService;
	
	@Autowired
	private AbilityScoreGradeService abilityScoreGradeService;
 	
	@Override
	public Integer add(TbOldmanSocialParticipation socialParticipation) throws Exception {
		
		socialParticipation.setCreateTime(new Date());
		socialParticipation.setUpdateTime(new Date());
		
		participationMapper.insert(socialParticipation);
		
		//更新数据库表中的生活能力等级数据.
		Integer level = getLevel(socialParticipation);//获取生活能力等级数据
		
		TbOldmanMessage record = new TbOldmanMessage();
		record.setId(socialParticipation.getId());
		record.setLevelSocialPartipation(level);
		
		oldmanMessageMapper.updateByPrimaryKeySelective(record);
		
		return level;
		
	}

	
	private Integer getLevel(TbOldmanSocialParticipation socialParticipation) throws Exception{
		
		Integer score = getSocialParticipationScore(socialParticipation);
		
		Integer level = abilityScoreGradeService.getLevelByScoreAndCat(score, 4);
		
		return level;
		
	}
	
	
	
	public Integer getSocialParticipationScore(TbOldmanSocialParticipation socialParticipation) throws Exception{
		
		Map<Integer, Integer> scoreLevelMapping = abilityItemService.getScoreLevelMapping();
		
		Integer score = 0;
		
		Field[] fields = socialParticipation.getClass().getDeclaredFields();
		for (Field field : fields) {
			if(!field.getName().equals("id") && !field.getName().equals("createTime") && !field.getName().equals("updateTime")){
				field.setAccessible(true);
				Object object = field.get(socialParticipation);
				
				if(object != null){
					Integer itemId = Integer.valueOf(object.toString());
					score += scoreLevelMapping.get(itemId);
				}
			}
		}
		
		return score;
	}
	
}
