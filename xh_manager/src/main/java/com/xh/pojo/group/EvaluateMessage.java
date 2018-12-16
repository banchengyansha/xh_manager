package com.xh.pojo.group;

import com.xh.pojo.TbOldmanLinkmessage;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanRecentmessage;

public class EvaluateMessage {
	
	private TbOldmanMessage oldmanMessage;
	
	private TbOldmanLinkmessage linkmessage;
	
	private TbOldmanRecentmessage recentmessage;

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
	
	
	
}
