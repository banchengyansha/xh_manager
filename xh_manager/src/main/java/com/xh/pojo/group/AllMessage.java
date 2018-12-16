package com.xh.pojo.group;

import com.xh.pojo.TbOldmanLinkmessage;
import com.xh.pojo.TbOldmanLivingmessage;
import com.xh.pojo.TbOldmanMentality;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanPerception;
import com.xh.pojo.TbOldmanRecentmessage;
import com.xh.pojo.TbOldmanSocialParticipation;

public class AllMessage {
	
	//基本信息
	private TbOldmanMessage oldmanMessage;
	
	//联系人信息
	private TbOldmanLinkmessage linkmessage;
	
	//老人近况
	private TbOldmanRecentmessage recentmessage;
	
	//日常生活能力
	private TbOldmanLivingmessage livingmessage;
	
	//精神状态
	private TbOldmanMentality mentality;
	
	//感知觉与沟通
	private TbOldmanPerception perception;
	
	//社会参与
	private TbOldmanSocialParticipation socialParticipation;

	public TbOldmanMessage getOldmanMessage() {
		return oldmanMessage;
	}

	public void setOldmanMessage(TbOldmanMessage oldmanMessage) {
		this.oldmanMessage = oldmanMessage;
	}

	public TbOldmanLinkmessage getLinkmessage() {
		return linkmessage;
	}

	public void setLinkmessage(TbOldmanLinkmessage linkmessage) {
		this.linkmessage = linkmessage;
	}

	public TbOldmanRecentmessage getRecentmessage() {
		return recentmessage;
	}

	public void setRecentmessage(TbOldmanRecentmessage recentmessage) {
		this.recentmessage = recentmessage;
	}

	public TbOldmanLivingmessage getLivingmessage() {
		return livingmessage;
	}

	public void setLivingmessage(TbOldmanLivingmessage livingmessage) {
		this.livingmessage = livingmessage;
	}

	public TbOldmanMentality getMentality() {
		return mentality;
	}

	public void setMentality(TbOldmanMentality mentality) {
		this.mentality = mentality;
	}

	public TbOldmanPerception getPerception() {
		return perception;
	}

	public void setPerception(TbOldmanPerception perception) {
		this.perception = perception;
	}

	public TbOldmanSocialParticipation getSocialParticipation() {
		return socialParticipation;
	}

	public void setSocialParticipation(TbOldmanSocialParticipation socialParticipation) {
		this.socialParticipation = socialParticipation;
	}

	@Override
	public String toString() {
		return "AllMessage [oldmanMessage=" + oldmanMessage + ", linkmessage=" + linkmessage + ", recentmessage="
				+ recentmessage + ", livingmessage=" + livingmessage + ", mentality=" + mentality + ", perception="
				+ perception + ", socialParticipation=" + socialParticipation + "]";
	}
	
	
}
