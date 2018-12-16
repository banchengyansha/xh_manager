package com.xh.service;

import com.xh.pojo.TbOldmanMentality;

public interface OldmanMentalityService {
	
	public Integer add(TbOldmanMentality oldmanMentality)  throws Exception ;
	
	public Integer getMentalityScore(TbOldmanMentality message) throws Exception;
	
}
