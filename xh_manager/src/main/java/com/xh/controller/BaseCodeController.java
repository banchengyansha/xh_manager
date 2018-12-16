package com.xh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.pojo.BaseCode;
import com.xh.service.BaseCodeService;

@RestController
@RequestMapping("/baseCode")
public class BaseCodeController {
	
	@Value("${marry.code.type}")
	private String marry_code_type;
	
	@Value("${culture.code.type}")
	private String culture_code_type;
	
	@Value("${live.code.type}")
	private String live_code_type;
	
	@Value("${economy.code.type}")
	private String economy_code_type;
	
	@Value("${paytype.code.type}")
	private String paytype_code_type;
	
	@Value("${evaluate.code.type}")
	private String evaluate_code_type;
	
	@Value("${relation.code.type}")
	private String relation_code_type;
	
	@Value("${belief.code.type}")
	private String belief_code_type;
	
	
	@Autowired
	private BaseCodeService baseCodeService;
	
	@RequestMapping("/findAllBaseCodeList")
	public Map<String,List<BaseCode>> findAllBaseCodeList(){
		
		Map<String,List<BaseCode>> baseCodeMap = new HashMap<String, List<BaseCode>>();
		
		List<String> typeCodeList = new ArrayList<String>();
		typeCodeList.add(culture_code_type);
		typeCodeList.add(economy_code_type);
		typeCodeList.add(evaluate_code_type);
		typeCodeList.add(live_code_type);
		typeCodeList.add(marry_code_type);
		typeCodeList.add(paytype_code_type);
		typeCodeList.add(relation_code_type);
		typeCodeList.add(belief_code_type);
		
		
		List<BaseCode> codeList = baseCodeService.findBaseCodeByTypeCodeList(typeCodeList);
		
		if(codeList != null){
			for (BaseCode baseCode : codeList) {
				if(baseCodeMap.containsKey(baseCode.getTypeCode())){
					List<BaseCode> list = baseCodeMap.get(baseCode.getTypeCode());
					list.add(baseCode);
				}else{
					List<BaseCode> baseCodeList = new ArrayList<BaseCode>();
					baseCodeList.add(baseCode);
					baseCodeMap.put(baseCode.getTypeCode(), baseCodeList);
				}
			}
		}
		
		return baseCodeMap;
	}
	
	
	@RequestMapping("/findBaseCodeByTypeCode")
	public List<BaseCode> findBaseCodeByTypeCode(String typeCode){
		List<BaseCode> list = baseCodeService.findBaseCodeByTypeCode(typeCode);
		return list;
	}
	
	
	@RequestMapping("/findAll")
	public List<BaseCode> findAll(){
		return baseCodeService.findAll();
	}
	
	
}
