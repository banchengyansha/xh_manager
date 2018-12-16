package com.xh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.pojo.BaseService;
import com.xh.service.BaseServiceService;

@RestController
@RequestMapping("/baseService")
public class BaseServiceController {
	
	@Autowired
	private BaseServiceService baseServiceService;
	
	@RequestMapping("/findAllBaseService")
	public Map<String,List<BaseService>> findAllBaseService(){
		Map<String,List<BaseService>> resultMap = new HashMap<String, List<BaseService>>();
		
		List<BaseService> list = baseServiceService.findAllBaseService();
		
		if(list != null){
			for (BaseService baseService : list) {
				List<BaseService> bsList = resultMap.get(baseService.getParentId()+"");
				if(bsList == null){
					bsList = new ArrayList<BaseService>();
					bsList.add(baseService);
					resultMap.put(baseService.getParentId()+"", bsList);
				}else{
					bsList.add(baseService);
				}
			}
		}
		
		return resultMap;
	}
	
}
