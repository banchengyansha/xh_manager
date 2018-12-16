package com.xh.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xh.mapper.TbOldmanLinkmessageMapper;
import com.xh.pojo.TbOldmanLinkmessage;
import com.xh.service.OldmanLinkMessageService;

@Service
public class OldmanLinkMessageServiceImpl implements OldmanLinkMessageService{
	
	@Autowired
	private TbOldmanLinkmessageMapper oldmanLinkmessageMapper;
 	
	@Override
	public void add(TbOldmanLinkmessage message) {
		
		message.setEvaluateCreatetime(new Date());
		message.setEvaluateUpdatetime(new Date());
		
		oldmanLinkmessageMapper.insert(message);
		
	}
	
	
	
	
}
