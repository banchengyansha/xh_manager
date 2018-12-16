package com.xh.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanRecentmessageMapper;
import com.xh.pojo.TbOldmanRecentmessage;
import com.xh.service.OldmanRecentMessageService;

@Service
public class OldmanRecentMessageServiceImpl implements OldmanRecentMessageService{
	
	@Autowired
	private TbOldmanRecentmessageMapper oldmanRecentmessageMapper;
 	
	@Override
	public void add(TbOldmanRecentmessage message) {
		message.setCreateTime(new Date());
		message.setUpdateTime(new Date());
		
		oldmanRecentmessageMapper.insert(message);
		
	}

	
}
