package com.xh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.pojo.TbOldmanMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext-dao.xml"})
public class UpdateDataMain {
	
	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Test
	public void updateData(){
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("610102", "新城区");
		map.put("610103", "碑林区");
		map.put("610104", "莲湖区");
		
		List<TbOldmanMessage> list = oldmanMessageMapper.selectByExample(null);
		if(list != null){
			for (TbOldmanMessage tbOldmanMessage : list) {
				
				/*
				if(!tbOldmanMessage.getLivingAddress().startsWith("新城区") 
						&& !tbOldmanMessage.getLivingAddress().startsWith("碑林区")
						&& !tbOldmanMessage.getLivingAddress().startsWith("莲湖区")){
					
					String code = tbOldmanMessage.getIdCart().substring(0, 6);
					
					System.out.println("修改前 : "+tbOldmanMessage.getIdCart() + "\t\t" + tbOldmanMessage.getLivingAddress());
					
					String prefix = map.get(code);
					if(prefix!=null){
						tbOldmanMessage.setLivingAddress(prefix+tbOldmanMessage.getLivingAddress());
					}
					
					System.out.println("修改后 : "+tbOldmanMessage.getIdCart() + "\t\t" + tbOldmanMessage.getLivingAddress());
					
					System.out.println();
					
					
					oldmanMessageMapper.updateByPrimaryKeySelective(tbOldmanMessage);
					
				}
				*/
				
				if(tbOldmanMessage.getLivingAddress().contains("西安")){
					System.out.println(tbOldmanMessage.getIdCart());
				}
				
			}
		}
		
	}
	
	
}
