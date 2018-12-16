package com.xh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xh.pojo.BaseCode;

public interface BaseCodeMapper {
	
	public List<BaseCode> findBaseCodeByTypeCode(String typeCode);
	
	public List<BaseCode> findBaseCodeByTypeCodeList(@Param("typeCodeList")List<String> typeCodeList);
	
	public List<BaseCode> findAll();
	
}
