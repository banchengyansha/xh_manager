package com.xh.mapper;

import java.util.List;

import com.xh.pojo.AbilityItem;

public interface AbilityItemMapper {
	
	public List<AbilityItem> findAllAbilityItemListById(String part);
	
}
