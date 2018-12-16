package com.xh.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanMessageExample;
import com.xh.pojo.TbOldmanMessageExample.Criteria;

@Component
public class NoUtils {
	
	@Autowired
	private TbOldmanMessageMapper messageMapper;
	
	/**
	 * 生成评估编号 , 编号生成规则为 :  年月日  + 四位顺序数 ------> 201809100001
	 * @return
	 */
	public String generateEvaluateNo(){
		
		String nextNo = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String nowdate = sdf.format(new Date());
		
		TbOldmanMessageExample example = new TbOldmanMessageExample();
		Criteria criteria = example.createCriteria();
		criteria.andEvaluateNoLike(nowdate+"____");
		example.setOrderByClause("evaluate_no DESC");
		List<TbOldmanMessage> messageList = messageMapper.selectByExample(example );
		
		if(messageList != null && messageList.size() > 0) {
			TbOldmanMessage message = messageList.get(0);
			String evaluateNo = message.getEvaluateNo();
			if(evaluateNo.length()==12){
				String sortNum = evaluateNo.substring(8);
				int num = Integer.parseInt(sortNum) + 1;
				nextNo = nowdate + String.format("%04d",num);
				System.out.println(nextNo);
				return nextNo;
			}
		}
		
		return  nowdate + "0001";
		
	}
	
	
}
