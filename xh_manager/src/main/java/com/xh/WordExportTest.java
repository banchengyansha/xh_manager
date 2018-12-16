package com.xh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.SocketUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanMessageExample;
import com.xh.pojo.TbOldmanMessageExample.Criteria;
import com.xh.pojo.group.EvaluateMessage;
import com.xh.service.OldmanMessageService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext-*.xml")
public class WordExportTest {
	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Autowired
	private OldmanMessageService oldmanMessageService;
	
	@Test
	public void test1() throws Exception{
		List<String> idList = readFile();
		System.out.println(idList.size());
		
		
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File("D:\\eclipse_workspace\\workspace_springboot\\xh_manager\\src\\main\\webapp\\WEB-INF\\ftl\\"));
		configuration.setDefaultEncoding("UTF-8");
		
		Template template = configuration.getTemplate("1.ftl");
		
		HashSet<String> set = new HashSet<>();
		List<String> name = new ArrayList<>();
		for (String id : idList) {
			
			TbOldmanMessageExample example = new TbOldmanMessageExample();
			Criteria criteria = example.createCriteria();
			criteria.andIdCartEqualTo(id);
			List<TbOldmanMessage> list = oldmanMessageMapper.selectByExample(example );
			
			if(list != null && list.size()>0){
				Integer id_ = list.get(0).getId();
				Map<String, String> map = oldmanMessageService.getResultMessage(id_);
				
				File file = new File("D:/idList/评估结果-"+map.get("name")+".doc");
				if(file.exists()){
					file = new File("D:/idList/评估结果-"+map.get("name")+"(2).doc");
				}
				
				FileWriter writer = new FileWriter(file);
				
				set.add(map.get("name"));
				name.add(map.get("name"));
//				System.out.println(set.size()+ " .... " + name.size());
				
				template.process(map, writer);
				
				writer.close();
			}else{
				System.out.println("未找到数据 : "+id);
			}
		}
		
		System.out.println(set);
		System.out.println(name);
	}
	
	
	public List<String> readFile() throws Exception{
		String filename = "D:\\eclipse_workspace\\workspace_springboot\\xh_manager\\src\\main\\java\\id.txt";
		List<String> idList = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
		
		String id = null;
		while((id = reader.readLine())!=null){
			idList.add(id);
		}
		
		reader.close();
		
		return idList;
	}
}
