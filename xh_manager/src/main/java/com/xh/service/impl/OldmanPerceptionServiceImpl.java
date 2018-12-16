package com.xh.service.impl;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.mapper.TbOldmanPerceptionMapper;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanPerception;
import com.xh.service.AbilityItemService;
import com.xh.service.AbilityScoreGradeService;
import com.xh.service.OldmanPerceptionService;

@Service
public class OldmanPerceptionServiceImpl implements OldmanPerceptionService{
	
	@Autowired
	private TbOldmanPerceptionMapper oldmanPerceptionMapper;
 	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Autowired
	private AbilityItemService abilityItemService;
	
	@Autowired
	private AbilityScoreGradeService abilityScoreGradeService;
	
	@Override
	public Integer add(TbOldmanPerception perception) throws Exception {
		
		perception.setCreateTime(new Date());
		perception.setUpdateTime(new Date());
		oldmanPerceptionMapper.insert(perception);
		
		
		//更新数据库表中的生活能力等级数据.
		Integer level = getLevel(perception);//获取生活能力等级数据
		
		TbOldmanMessage record = new TbOldmanMessage();
		record.setId(perception.getId());
		record.setLevelPerception(level);
		oldmanMessageMapper.updateByPrimaryKeySelective(record);
		
		return level;
		
	}
	
	
	private Integer getLevel(TbOldmanPerception perception) throws Exception{
		
		
		Map<Integer, Integer> scoreLevelMapping = abilityItemService.getScoreLevelMapping();
		
		//意识水平分数
		Integer consciousnessScore = scoreLevelMapping.get(perception.getConsciousnessLevel());
		//视力分数
		Integer visionScore = scoreLevelMapping.get(perception.getVisionLevel());
		//听力分数
		Integer hearingScore = scoreLevelMapping.get(perception.getHearingLevel());
		//沟通交流分数
		Integer communicationScore = scoreLevelMapping.get(perception.getCommunicationLevel());
		
		//0能力完好：意识清醒0，且视力和听力评为0或1，沟通评分为0
		if(consciousnessScore==0 && (visionScore == 0 || visionScore == 1) && (hearingScore == 0 || hearingScore == 1) && communicationScore == 0){
			return 0;
		}
		
		//1轻度受损：意识清醒0，但视力或听力中至少一项为2，或沟通评分为1
		if(consciousnessScore==0 && (visionScore == 2 || hearingScore == 2 || communicationScore == 1)){
			return 1;
		}
		
		//2中度受损：意识清醒0，但视力或听力中至少一项为3，或沟通评为为2
		if(consciousnessScore==0 && (visionScore == 3 || hearingScore == 3 || communicationScore == 2)){
			return 2;
		}
		
		//2中度受损：或嗜睡1，视力或听力评定为3级以下，沟通评定为2及以下。
		if(consciousnessScore==1 && (visionScore < 3 || hearingScore < 3 || communicationScore < 2)){
			return 2;
		}
		
		//3中度受损：意识清醒或嗜睡0/1，但视力或听力中至少一项评为4，或沟通评定为3；
		if((consciousnessScore==0 || consciousnessScore==1) && (visionScore ==4 || hearingScore == 4 || communicationScore == 3)){
			return 3;
		}
		
		//3中度受损：或嗜睡(文档可能有误, 可能是昏睡)/昏迷    2/3。
		if(consciousnessScore==2 || consciousnessScore==3 ){
			return 3;
		}
		
		return 0;
		
	}
	
	
}
