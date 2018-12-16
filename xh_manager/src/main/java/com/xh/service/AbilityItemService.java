package com.xh.service;

import java.util.List;
import java.util.Map;

import com.xh.pojo.AbilityItem;
import com.xh.pojo.TbAbilityItemOption;

public interface AbilityItemService {
	
	public List<AbilityItem> findAllAbilityItemListById(String part);
	
	
	public Map<Integer , Integer> getScoreLevelMapping();

	
	public List<TbAbilityItemOption> findAll();
	
}
