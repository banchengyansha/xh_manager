package com.xh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.mapper.BaseCodeMapper;
import com.xh.pojo.BaseCode;
import com.xh.service.BaseCodeService;

@Service
@Transactional
public class BaseCodeServiceImpl implements BaseCodeService{
	
	@Autowired
	private BaseCodeMapper baseCodeMapper;
	
	@Override
	public List<BaseCode> findBaseCodeByTypeCode(String typeCode) {
		if(typeCode!=null && !typeCode.equals("")){
			return baseCodeMapper.findBaseCodeByTypeCode(typeCode);
		}
		return null;
	}

	@Override
	public List<BaseCode> findBaseCodeByTypeCodeList(List<String> typeCodeList) {
		if(typeCodeList!=null && typeCodeList.size()>0){
			return baseCodeMapper.findBaseCodeByTypeCodeList(typeCodeList);
		}
		return null;
	}

	@Override
	public List<BaseCode> findAll() {
		List<BaseCode> list = baseCodeMapper.findAll();
		return list;
	}

}
