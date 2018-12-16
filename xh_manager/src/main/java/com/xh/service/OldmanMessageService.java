package com.xh.service;

import java.util.List;
import java.util.Map;
import com.xh.pojo.PageResult;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.group.AllMessage;
import com.xh.pojo.group.EvaluateMessage;

public interface OldmanMessageService {
	
	public Integer add(TbOldmanMessage message);
	
	public void updateAbilityGrade(Integer id);

	public EvaluateMessage findOne(Integer id);
	
	public PageResult<TbOldmanMessage> findByPage(Integer pageNum , Integer pageSize , TbOldmanMessage oldmanMessage);

	public void deleteById(Integer[] ids);
	
	public Map<String, String> getResultMessage(Integer id);

	public List<Map<String, String>> findOldmanMessageListByCriteria(TbOldmanMessage oldmanMessage);
	
	public AllMessage getDetailResultMessage(Integer id);

	public TbOldmanMessage findById(Integer id);
	
	public void update(TbOldmanMessage message);
	
}
