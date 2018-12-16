package com.xh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.pojo.AbilityItem;
import com.xh.pojo.TbAbilityItemOption;
import com.xh.service.AbilityItemService;

@RestController
@RequestMapping("/abilityItem")
public class AbilityItemController {
	
	@Autowired
	private AbilityItemService abilityItemService;
	
	@RequestMapping("/findAllAbilityItemListByPart")
	public List<AbilityItem> findAllAbilityItemListByPart(String part){
		return abilityItemService.findAllAbilityItemListById(part);
	}
	
	
	@RequestMapping("/findAllOption")
	public List<TbAbilityItemOption> findAllOption(){
		return abilityItemService.findAll();
	}
	
	
}
