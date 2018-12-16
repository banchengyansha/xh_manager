package com.xh.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

@SuppressWarnings("all")
public class FreemarkerDemo {
	
	public static void main(String[] args) throws Exception {
		
		Configuration configuration=new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File("D:\\"));
		configuration.setDefaultEncoding("utf-8");
		
		Template template = configuration.getTemplate("1.ftl");
		
		Map map=new HashMap();
		map.put("id", "00001");
		map.put("name", "徐善文");
		map.put("gender", "男");
		map.put("birthday", "2018-01-01");
		map.put("evaluateGroup", "祥和");
		map.put("evaluateName", "唐燕");
		map.put("levelDailyLiving", "能力完好");
		map.put("levelMentality", "能力完好");
		map.put("levelPerception", "能力完好");
		map.put("levelSocialPartipation", "能力完好");
		map.put("primaryLevel", "轻度失能");
		map.put("finalLevel", "轻度失能");
		
		
		Writer out =new FileWriter(new File("d:\\评估结果.doc"));
		
		template.process(map, out);
		
		out.close();
		
	}
	
}
