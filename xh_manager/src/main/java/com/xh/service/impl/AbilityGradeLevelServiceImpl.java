package com.xh.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbAbilityGradeLevelMapper;
import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.pojo.TbAbilityGradeLevel;
import com.xh.pojo.TbAbilityGradeLevelExample;
import com.xh.pojo.TbAbilityGradeLevelExample.Criteria;
import com.xh.pojo.TbOldmanMessage;
import com.xh.service.AbilityGradeLevelService;

@Service
public class AbilityGradeLevelServiceImpl implements AbilityGradeLevelService{
	
	private static Logger log = Logger.getLogger(AbilityGradeLevelServiceImpl.class);
	
	@Autowired
	private TbAbilityGradeLevelMapper abilityGradeLevelMapper;
	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	/**
	 * 计算能力等级
	 */
	@Override
	public Integer getAbilityLevel(Integer messageId) {
		
		log.info("开始计算ID 为 : " + messageId + "  的老人的能力等级信息数据 .... ");

		TbOldmanMessage oldmanMessage = oldmanMessageMapper.selectByPrimaryKey(messageId);
		
		TbAbilityGradeLevelExample example = new TbAbilityGradeLevelExample();
		Criteria criteria = example.createCriteria();
		criteria.andLevelDailyLivingEqualTo(oldmanMessage.getLevelDailyLiving());
		criteria.andLevelMentalityStatusEqualTo(oldmanMessage.getLevelMentality());
		criteria.andLevelPerceptionEqualTo(oldmanMessage.getLevelPerception());
		criteria.andLevelSocialParticipationEqualTo(oldmanMessage.getLevelSocialPartipation());
		List<TbAbilityGradeLevel> list = abilityGradeLevelMapper.selectByExample(example);
		
		if(list != null && list.size()>0){
			return list.get(0).getAbilityLevel();
		}
		
		//当日常生活活动为0.精神状态、感知觉与沟通有一项为1及以上，或社会参与为2，判定为轻度失能。 
		if(oldmanMessage.getLevelDailyLiving() == 0 
				&& (oldmanMessage.getLevelMentality()>=1 || oldmanMessage.getLevelPerception()>=1 || oldmanMessage.getLevelSocialPartipation()==2)){
			log.info(" 当日常生活活动为0.精神状态、感知觉与沟通有一项为1及以上，或社会参与为2，判定为轻度失能。 ");
			return 1;
		}
		
		//当日常生活活动为1.后三项有一项为0或1，判定为轻度失能；
		if(oldmanMessage.getLevelDailyLiving() == 1 
				&& (oldmanMessage.getLevelMentality()==0 || oldmanMessage.getLevelMentality()==1 
				|| oldmanMessage.getLevelPerception()==0 || oldmanMessage.getLevelPerception()==1 
				|| oldmanMessage.getLevelSocialPartipation()==0 || oldmanMessage.getLevelSocialPartipation()==1)){
			log.info("当日常生活活动为1.后三项有一项为0或1，判定为轻度失能；");
			return 1;
		}
		
		//当日常生活活动为1. 后三项均为2或某一项为3，则判定为中度失能。 
		if(oldmanMessage.getLevelDailyLiving() == 1 && oldmanMessage.getLevelMentality()==2 && oldmanMessage.getLevelPerception()==2 && oldmanMessage.getLevelSocialPartipation()==2){
			log.info("当日常生活活动为1. 后三项均为2或某一项为3，则判定为中度失能。 ");
			return 2;
		}
		if(oldmanMessage.getLevelDailyLiving() == 1 && (oldmanMessage.getLevelMentality()==3 || oldmanMessage.getLevelPerception()==3 || oldmanMessage.getLevelSocialPartipation()==3)){
			log.info("当日常生活活动为1. 后三项均为2或某一项为3，则判定为中度失能。 ");
			return 2;
		}
		
		//当日常生活活动为2.后三项全部为2或某一项为3，判定为重度失能，否则为中度失能。
		if(oldmanMessage.getLevelDailyLiving() == 2 && oldmanMessage.getLevelMentality()==2 && oldmanMessage.getLevelPerception()==2 && oldmanMessage.getLevelSocialPartipation()==2){
			log.info("当日常生活活动为2.后三项全部为2或某一项为3，判定为重度失能，否则为中度失能。");
			return 3;
		}
		if(oldmanMessage.getLevelDailyLiving() == 2 && (oldmanMessage.getLevelMentality()==3 || oldmanMessage.getLevelPerception()==3 || oldmanMessage.getLevelSocialPartipation()==3)){
			log.info("当日常生活活动为2.后三项全部为2或某一项为3，判定为重度失能，否则为中度失能。");
			return 3;
		}
		if(oldmanMessage.getLevelDailyLiving() == 2){
			log.info("当日常生活活动为2.后三项全部为2或某一项为3，判定为重度失能，否则为中度失能。");
			return 2;
		}
		
		return 0;
	}

}
