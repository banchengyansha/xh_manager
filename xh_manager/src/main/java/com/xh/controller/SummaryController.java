package com.xh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.service.SummaryService;

@RestController
@RequestMapping("/summary")
public class SummaryController {
	
	@Autowired
	private SummaryService summaryService;
	
	@RequestMapping("/countGender")
	public Map<String,Integer> countGender(){
		Map<String, Integer> genderCount = summaryService.countGender();	
		return genderCount;
	}
	
	
	@RequestMapping("/countLivingCondition")
	public Map<String,Integer> countLivingCondition(){
		Map<String, Integer> livingCount = summaryService.countLivingCondition();	
		return livingCount;
	}
	
	
	@RequestMapping("/countAbility")
	public Map<String,Integer> countAbility(){
		Map<String, Integer> abilityCount = summaryService.countAbility();	
		return abilityCount;
	}
	
	
	@RequestMapping("/countAge")
	public Map<String,Integer> countAge(){
		Map<String, Integer> ageCount = summaryService.countAge();	
		return ageCount;
	}
	
	
	@RequestMapping("/countArea")
	public Map<String,Integer> countArea(){
		Map<String, Integer> areaCount = summaryService.countArea();	
		return areaCount;
	}
	
	
	@RequestMapping("/count")
	public Map<String,Map<String,Integer>> count(){
		
		Map<String,Map<String,Integer>> returnMap = new HashMap<String, Map<String,Integer>>();
		
		Map<String, Integer> genderCount = summaryService.countGender();
		Map<String, Integer> ageCount = summaryService.countAge();	
		Map<String, Integer> abilityCount = summaryService.countAbility();
		Map<String, Integer> livingCount = summaryService.countLivingCondition();	
		Map<String, Integer> areaCount = summaryService.countArea();
		
		returnMap.put("gender",genderCount);
		returnMap.put("age",ageCount);
		returnMap.put("ability",abilityCount);
		returnMap.put("living",livingCount);
		returnMap.put("area",areaCount);
		
		return returnMap;
	}
	
	
	@RequestMapping("/countLivingEat")
	public Map<String,Integer[]> countLivingEat(){
		return summaryService.countLivingEat();
	}
	
	
	
	@RequestMapping("/countLivingStool")
	public Map<String,Integer[]> countLivingStool(){
		return summaryService.countLivingStool();
	}
	
	
	
	@RequestMapping("/countLivingUrination")
	public Map<String,Integer[]> countLivingUrination(){
		return summaryService.countLivingUrination();
	}
	
	
	@RequestMapping("/countLivingWalk")
	public Map<String,Integer[]> countLivingWalk(){
		return summaryService.countLivingWalk();
	}
	
	
	
	@RequestMapping("/countPerceptionConsciousness")
	public Map<String,Integer[]> countPerceptionConsciousness(){
		return summaryService.countPerceptionConsciousness();
	}
	
	
	@RequestMapping("/countPerceptionVision")
	public Map<String,Integer[]> countPerceptionVision(){
		return summaryService.countPerceptionVision();
	}
	
	
	@RequestMapping("/countPerceptionHearing")
	public Map<String,Integer[]> countPerceptionHearing(){
		return summaryService.countPerceptionHearing();
	}
	
	
	@RequestMapping("/countPerceptionCommunication")
	public Map<String,Integer[]> countPerceptionCommunication(){
		return summaryService.countPerceptionCommunication();
	}
	
	@RequestMapping("/countSocialLiving")
	public Map<String,Integer[]> countSocialLiving(){
		return summaryService.countSocialLiving();
	}
	
	@RequestMapping("/countSocialTimeSpace")
	public Map<String,Integer[]> countSocialTimeSpace(){
		return summaryService.countSocialTimeSpace();
	}
	
	@RequestMapping("/countSocialPerson")
	public Map<String,Integer[]> countSocialPerson(){
		return summaryService.countSocialPerson();
	}
	
	@RequestMapping("/countSocialJob")
	public Map<String,Integer[]> countSocialJob(){
		return summaryService.countSocialJob();
	}
	
	@RequestMapping("/countSocialCommunication")
	public Map<String,Integer[]> countSocialCommunication(){
		return summaryService.countSocialCommunication();
	}
	
}
