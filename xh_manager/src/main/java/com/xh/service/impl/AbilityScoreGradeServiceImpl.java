package com.xh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.mapper.TbAbilityScoreGradeMapper;
import com.xh.pojo.TbAbilityScoreGrade;
import com.xh.pojo.TbAbilityScoreGradeExample;
import com.xh.pojo.TbAbilityScoreGradeExample.Criteria;
import com.xh.service.AbilityScoreGradeService;

@Service
@Transactional
public class AbilityScoreGradeServiceImpl implements AbilityScoreGradeService {
	
	@Autowired
	private TbAbilityScoreGradeMapper abilityScoreGradeMapper;
	
	@Override
	public Integer getLevelByScoreAndCat(Integer score, Integer cat) {
		
		Integer level = 0;
		
		TbAbilityScoreGradeExample example = new TbAbilityScoreGradeExample();
		Criteria criteria = example.createCriteria();
		criteria.andAbilityCatEqualTo(cat);
		
		List<TbAbilityScoreGrade> list = abilityScoreGradeMapper.selectByExample(example);
		
		if(list != null){
			for (TbAbilityScoreGrade scoreGrade : list) {
				if(scoreGrade.getLowerLimitScore() <= score && scoreGrade.getUpperLimitScore() >= score){
					level = scoreGrade.getAbilityGrade();
				}
			}
		}
		
		return level;
	}

}
