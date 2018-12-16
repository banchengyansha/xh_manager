package com.xh.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.service.SummaryService;

@Service
public class SummaryServiceImpl implements SummaryService{

	private static Logger log = Logger.getLogger(SummaryServiceImpl.class);
	
	@Autowired
	private TbOldmanMessageMapper messageMapper;
	
	@Override
	public Map<String, Integer> countGender() {
		Map<String,Integer> genderMap = new HashMap<String, Integer>();
		List<Map<String, Integer>> list = messageMapper.countGender();
		
		if(list != null){
			for (Map<String, Integer> map : list) {
				genderMap.put("gender_"+map.get("gender"), Integer.parseInt(map.get("gendercount")+""));
			}
		}
		
		log.info("统计性别结果 : " + genderMap);
		return genderMap;
	}
	
	
	
	
	@Override
	public Map<String, Integer> countAbility() {
		Map<String,Integer> abilityMap = new HashMap<String, Integer>();
		List<Map<String,Integer>> list = messageMapper.countAbility();
		
		if(list != null){
			for (Map<String, Integer> map : list) {
				abilityMap.put("ability_"+map.get("primary_level"), Integer.parseInt(map.get("ability")+""));
			}
		}
		
		log.info("统计能力等级结果 : " + abilityMap);
		return abilityMap;
	}

	@Override
	public Map<String, Integer> countAge() {
		
		Map<String,Integer> ageMap = new HashMap<String, Integer>();
		
		String dateTime_90 = DateTime.now().plusYears(-90).toString("yyyy-MM-dd HH:mm:ss");
		String dateTime_80 = DateTime.now().plusYears(-80).toString("yyyy-MM-dd HH:mm:ss");
		String dateTime_70 = DateTime.now().plusYears(-70).toString("yyyy-MM-dd HH:mm:ss");
		String dateTime_60 = DateTime.now().plusYears(-60).toString("yyyy-MM-dd HH:mm:ss");
		
		Integer age_60 = messageMapper.countAge(dateTime_60,null);
		Integer age_60_70 = messageMapper.countAge(dateTime_70,dateTime_60);
		Integer age_70_80 = messageMapper.countAge(dateTime_80,dateTime_70);
		Integer age_80_90 = messageMapper.countAge(dateTime_90,dateTime_80);
		Integer age_90 = messageMapper.countAge(null,dateTime_90);
		
		ageMap.put("age_60", age_60);
		ageMap.put("age_60_70", age_60_70);
		ageMap.put("age_70_80", age_70_80);
		ageMap.put("age_80_90", age_80_90);
		ageMap.put("age_90", age_90);
		
		log.info("统计年龄段结果 : " + ageMap);
		
		return ageMap;
	}
	
	

	

	@Override
	public Map<String, Integer> countLivingCondition() {
		Map<String,Integer> livingMap = new HashMap<String, Integer>();
		List<Map<String,Integer>> list = messageMapper.countLivingCondition();
		
		if(list != null){
			for (Map<String, Integer> map : list) {
				livingMap.put("living_"+map.get("living_condition"), Integer.parseInt(map.get("living")+""));
			}
		}
		
		log.info("统计居住情况结果 : " + livingMap);
		return livingMap;
	}




	@Override
	public Map<String, Integer> countArea() {
		Map<String,Integer> areaMap = new HashMap<String, Integer>();
		List<Map<String,Object>> list = messageMapper.countArea();
		
		log.info("查询数据库 , 区域情况结果 : " + list);
		
		Integer countOther = 0;
		if(list != null){
			for (Map<String, Object> map : list) {
				String area = map.get("area")+"";
				if("莲湖区".equals(area)){
					areaMap.put("lh", Integer.parseInt(map.get("areacount")+""));
				}else if("碑林区".equals(area)){
					areaMap.put("bl", Integer.parseInt(map.get("areacount")+""));
				}else if("新城区".equals(area)){
					areaMap.put("xc", Integer.parseInt(map.get("areacount")+""));
				}else{
					countOther += Integer.parseInt(map.get("areacount")+"");
				}
			}
		}
		
		areaMap.put("other", countOther);
		log.info("区域情况结果 : " + areaMap);
		return areaMap;
	}


	/*
	 [1, 4, 3]
	 [6, 4, 2]
	 [8, 4, 3]
	 [10, 7, 3]
	 {living_eat=1, primary_level=0, eatcount=47}
	 */
	@Override
	public Map<String, Integer[]> countLivingEat() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countLivingEat();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0};
					if(map.get("living_eat") != null && map.get("eatcount") != null){
						levelArr[Integer.parseInt(map.get("living_eat")+"")-1] = Integer.parseInt(map.get("eatcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("living_eat")+"")-1] = Integer.parseInt(map.get("eatcount")+"");
				}
			}
		}
		
		System.out.println(valueMap);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countLivingStool() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countLivingStool();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0};
					if(map.get("living_stool_control") != null && map.get("stoolcount") != null){
						levelArr[Integer.parseInt(map.get("living_stool_control")+"")-11] = Integer.parseInt(map.get("stoolcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("living_stool_control")+"")-11] = Integer.parseInt(map.get("stoolcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countLivingUrination() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countLivingUrination();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0};
					if(map.get("living_urination_control") != null && map.get("urinationcount") != null){
						levelArr[Integer.parseInt(map.get("living_urination_control")+"")-14] = Integer.parseInt(map.get("urinationcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("living_urination_control")+"")-14] = Integer.parseInt(map.get("urinationcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countLivingWalk() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countLivingWalk();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0};
					if(map.get("living_walk") != null && map.get("walkcount") != null){
						levelArr[Integer.parseInt(map.get("living_walk")+"")-24] = Integer.parseInt(map.get("walkcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("living_walk")+"")-24] = Integer.parseInt(map.get("walkcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countPerceptionConsciousness() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countPerceptionConsciousness();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0};
					if(map.get("consciousness_level") != null && map.get("consciousnesscount") != null){
						levelArr[Integer.parseInt(map.get("consciousness_level")+"")-40] = Integer.parseInt(map.get("consciousnesscount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("consciousness_level")+"")-40] = Integer.parseInt(map.get("consciousnesscount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countPerceptionVision() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countPerceptionVision();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("vision_level") != null && map.get("visioncount") != null){
						levelArr[Integer.parseInt(map.get("vision_level")+"")-44] = Integer.parseInt(map.get("visioncount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("vision_level")+"")-44] = Integer.parseInt(map.get("visioncount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countPerceptionHearing() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countPerceptionHearing();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("hearing_level") != null && map.get("hearingcount") != null){
						levelArr[Integer.parseInt(map.get("hearing_level")+"")-49] = Integer.parseInt(map.get("hearingcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("hearing_level")+"")-49] = Integer.parseInt(map.get("hearingcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countPerceptionCommunication() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countPerceptionCommunication();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0};
					if(map.get("communication_level") != null && map.get("communicationcount") != null){
						levelArr[Integer.parseInt(map.get("communication_level")+"")-54] = Integer.parseInt(map.get("communicationcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("communication_level")+"")-54] = Integer.parseInt(map.get("communicationcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countSocialLiving() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countSocialLiving();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("living_ability") != null && map.get("livingcount") != null){
						levelArr[Integer.parseInt(map.get("living_ability")+"")-58] = Integer.parseInt(map.get("livingcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("living_ability")+"")-58] = Integer.parseInt(map.get("livingcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countSocialTimeSpace() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countSocialTimeSpace();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("time_space_orientation") != null && map.get("timecount") != null){
						levelArr[Integer.parseInt(map.get("time_space_orientation")+"")-68] = Integer.parseInt(map.get("timecount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("time_space_orientation")+"")-68] = Integer.parseInt(map.get("timecount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countSocialPerson() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countSocialPerson();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("personage_orientation") != null && map.get("personcount") != null){
						levelArr[Integer.parseInt(map.get("personage_orientation")+"")-73] = Integer.parseInt(map.get("personcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("personage_orientation")+"")-73] = Integer.parseInt(map.get("personcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countSocialJob() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countSocialJob();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("job_ability") != null && map.get("jobcount") != null){
						levelArr[Integer.parseInt(map.get("job_ability")+"")-63] = Integer.parseInt(map.get("jobcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("job_ability")+"")-63] = Integer.parseInt(map.get("jobcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}




	@Override
	public Map<String, Integer[]> countSocialCommunication() {
		Map<String, Integer[]> valueMap = new HashMap<String, Integer[]>();
		
		List<Map<String,Object>> list = messageMapper.countSocialCommunication();
		if(list != null){
			for (Map<String, Object> map : list) {
				Integer[] levelArr = valueMap.get("level_"+map.get("primary_level"));
				
				if(levelArr == null){
					levelArr = new Integer[]{0,0,0,0,0};
					if(map.get("communication_ability") != null && map.get("communicationcount") != null){
						levelArr[Integer.parseInt(map.get("communication_ability")+"")-78] = Integer.parseInt(map.get("communicationcount")+"");
					}
					valueMap.put("level_"+map.get("primary_level"), levelArr);
				}else{
					levelArr[Integer.parseInt(map.get("communication_ability")+"")-78] = Integer.parseInt(map.get("communicationcount")+"");
				}
				
			}
		}
		
		System.out.println(list);
		for(String key : valueMap.keySet()){
			System.out.println(key);
			System.out.println(Arrays.asList(valueMap.get(key)));
		}
		return valueMap;
	}

	
	
}
