package com.xh.service;

import com.xh.pojo.TbOldmanLivingmessage;

public interface OldmanLivingMessageService {
	
	public Integer add(TbOldmanLivingmessage message) throws Exception ;
	
	public Integer getLivingMessageScore(TbOldmanLivingmessage message) throws Exception;
	
}
