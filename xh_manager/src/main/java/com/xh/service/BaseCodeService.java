package com.xh.service;

import java.util.List;

import com.xh.pojo.BaseCode;

public interface BaseCodeService {
	
	public List<BaseCode> findBaseCodeByTypeCode(String typeCode);
	
	public List<BaseCode> findBaseCodeByTypeCodeList(List<String> typeCodeList);
	
	public List<BaseCode> findAll();
}
