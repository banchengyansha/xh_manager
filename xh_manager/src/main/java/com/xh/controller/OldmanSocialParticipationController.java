package com.xh.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.xh.pojo.Result;
import com.xh.pojo.TbOldmanSocialParticipation;
import com.xh.service.OldmanSocialParticipationService;
import com.xh.util.Constants;


@RestController
@RequestMapping("/oldmanSocialParticipation")
public class OldmanSocialParticipationController {
	
	@Autowired
	public OldmanSocialParticipationService socialParticipationService;
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbOldmanSocialParticipation socialParticipation){
		try {
			
			Integer level = socialParticipationService.add(socialParticipation);
			
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("id", socialParticipation.getId());
			map.put("msg","社会参与等级评估结果为 : " + level+" , " + Constants.LEVEL_GRADE[level]);
			
			return new Result(true, JSON.toJSONString(map));
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	
	
	
	
	@RequestMapping("/delete")
	public Result delete(Integer[] ids){
		
		try {
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
		
	}
	
}
