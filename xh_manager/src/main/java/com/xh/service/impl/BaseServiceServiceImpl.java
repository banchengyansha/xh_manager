package com.xh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.mapper.BaseServiceMapper;
import com.xh.pojo.BaseService;
import com.xh.service.BaseServiceService;

@Service
@Transactional
public class BaseServiceServiceImpl  implements BaseServiceService{

	@Autowired
	private BaseServiceMapper baseServiceMapper;
	
	@Override
	public List<BaseService> findAllBaseService() {
		return baseServiceMapper.findAllBaseService();
	}

}
