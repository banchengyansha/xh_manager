package com.xh.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.mapper.AbilityItemMapper;
import com.xh.mapper.TbAbilityItemOptionMapper;
import com.xh.pojo.AbilityItem;
import com.xh.pojo.TbAbilityItemOption;
import com.xh.service.AbilityItemService;

@Service
@Transactional
public class AbilityItemServiceImpl implements AbilityItemService{
	
	@Autowired
	private AbilityItemMapper abilityItemMapper;
	
	@Autowired
	private TbAbilityItemOptionMapper abilityItemOptionMapper;
	
	@Override
	public List<AbilityItem> findAllAbilityItemListById(String part) {
		if(part != null && !"".equals(part)){
			return abilityItemMapper.findAllAbilityItemListById(part);
		}
		return null;
	}
	
	@Override
	public Map<Integer , Integer> getScoreLevelMapping(){
		Map<Integer , Integer> map = new HashMap<Integer, Integer>();
		List<TbAbilityItemOption> list = abilityItemOptionMapper.selectByExample(null);
		if(list != null){
			for (TbAbilityItemOption itemOption : list) {
				map.put(itemOption.getId(), itemOption.getScore());
			}
		}
		
		return map;
	}

	@Override
	public List<TbAbilityItemOption> findAll() {
		List<TbAbilityItemOption> list = abilityItemOptionMapper.selectByExample(null);
		return list;
	}

}
