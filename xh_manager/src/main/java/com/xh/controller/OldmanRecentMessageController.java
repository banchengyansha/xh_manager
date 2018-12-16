package com.xh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.pojo.Result;
import com.xh.pojo.TbOldmanRecentmessage;
import com.xh.service.OldmanRecentMessageService;


@RestController
@RequestMapping("/oldmanRecentMessage")
public class OldmanRecentMessageController {
	
	@Autowired
	public OldmanRecentMessageService oldmanRecentMessageService;
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbOldmanRecentmessage message){
		try {
			oldmanRecentMessageService.add(message);
			
			return new Result(true, message.getId()+"");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	
	
	
	
	@RequestMapping("/delete")
	public Result delete(Integer[] ids){
		
		try {
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
		
	}
	
}
