package com.xh.service;

import java.util.List;
import java.util.Map;

public interface SummaryService {
	
	public Map<String,Integer> countGender();
	
	public Map<String,Integer> countAbility();
	
	public Map<String,Integer> countAge();
	
	public Map<String,Integer> countLivingCondition();
	
	public Map<String,Integer> countArea();
	
	public Map<String,Integer[]> countLivingEat();
	
	public Map<String,Integer[]> countLivingStool();
	
	public Map<String,Integer[]> countLivingUrination();
	
	public Map<String,Integer[]> countLivingWalk();
	
	public Map<String,Integer[]> countPerceptionConsciousness();
	
	public Map<String,Integer[]> countPerceptionVision();
	
	public Map<String,Integer[]> countPerceptionHearing();
	
	public Map<String,Integer[]> countPerceptionCommunication();
	
	
	
	public Map<String,Integer[]> countSocialLiving();
	
	public Map<String,Integer[]> countSocialTimeSpace();
	
	public Map<String,Integer[]> countSocialPerson();
	
	public Map<String,Integer[]> countSocialJob();
	
	public Map<String,Integer[]> countSocialCommunication();
	
	
	
	
}
