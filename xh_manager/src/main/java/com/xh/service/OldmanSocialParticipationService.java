package com.xh.service;

import com.xh.pojo.TbOldmanSocialParticipation;

public interface OldmanSocialParticipationService {
	
	public Integer add(TbOldmanSocialParticipation socialParticipation)throws Exception;
	
	public Integer getSocialParticipationScore(TbOldmanSocialParticipation socialParticipation) throws Exception;
	
}
