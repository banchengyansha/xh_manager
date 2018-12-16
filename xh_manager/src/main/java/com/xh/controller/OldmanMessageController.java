package com.xh.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.alibaba.fastjson.JSON;
import com.xh.pojo.BaseCode;
import com.xh.pojo.PageResult;
import com.xh.pojo.Result;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanPerception;
import com.xh.pojo.group.AllMessage;
import com.xh.pojo.group.EvaluateMessage;
import com.xh.service.AbilityItemService;
import com.xh.service.BaseCodeService;
import com.xh.service.OldmanLivingMessageService;
import com.xh.service.OldmanMentalityService;
import com.xh.service.OldmanMessageService;
import com.xh.service.OldmanPerceptionService;
import com.xh.service.OldmanSocialParticipationService;
import com.xh.util.ExcelUtils;
import com.xh.util.ExcelUtils.CellData;
import com.xh.util.ExcelUtils.ExcelSheet;

import freemarker.template.Configuration;
import freemarker.template.Template;


@RestController
@RequestMapping("/oldmanMessage")
public class OldmanMessageController {
	
	private static Logger log = Logger.getLogger(OldmanMessageController.class);
	
	@Autowired
	private OldmanMessageService oldmanMessageService;
	
	@Autowired
	private BaseCodeService baseCodeService;
	
	@Autowired
	private OldmanLivingMessageService livingMessageService;
	
	@Autowired
	private OldmanMentalityService mentalityService;
	
	@Autowired
	private OldmanPerceptionService perceptionService;
	
	@Autowired
	private OldmanSocialParticipationService participationService;
	
	@Autowired
	private AbilityItemService abilityItemService;
	
	@Autowired
	private FreeMarkerConfigurer configurer;
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbOldmanMessage oldmanMessage){
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			
			oldmanMessage.setCreateuser(username);
			oldmanMessage.setUpdateuser(username);
			
			Integer id = oldmanMessageService.add(oldmanMessage);
			
			return new Result(true, id+"");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	
	
	
	
	@RequestMapping("/delete")
	public Result delete(Integer[] ids){
		
		try {
			oldmanMessageService.deleteById(ids);
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
		
	}
	
	
	
	
	@RequestMapping("/confirmResult")
	public Result confirmResult(Integer id){
		try {
			oldmanMessageService.updateAbilityGrade(id);
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	
	
	
	@RequestMapping("/findOne")
	public EvaluateMessage findOne(Integer id){
		return oldmanMessageService.findOne(id);
	}
	
	@RequestMapping("/findOneBaseMessage")
	public TbOldmanMessage findOneBaseMessage(Integer id){
		return oldmanMessageService.findById(id);
	}
	
	
	@RequestMapping("/search")
	public PageResult<TbOldmanMessage> findByPage(Integer pageNum, Integer pageSize, @RequestBody TbOldmanMessage oldmanMessage) {
		return oldmanMessageService.findByPage(pageNum, pageSize, oldmanMessage);
	}
	
	
	
	@RequestMapping("/downloadResult")
	public void downloadResult(HttpServletResponse response , Integer id)throws Exception{
		Map<String,String> resultMap = oldmanMessageService.getResultMessage(id);
		
		Writer out = null;
		String fileName = "评估结果-"+resultMap.get("name")+".doc";
		
		try {
			response.setContentType("application/x-msdownload;");
			response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
			
			Configuration configuration = configurer.getConfiguration();
			Template template = configuration.getTemplate("1.ftl");
			
			out = response.getWriter();
			template.process(resultMap, out);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
		}
	}
	
	
	
	
	@RequestMapping("/exportDataList")
	public void exportDataList(HttpServletResponse response , TbOldmanMessage oldmanMessage)throws Exception{
		
		//查询符合条件的数据集合 
		List<Map<String,String>> resultList = oldmanMessageService.findOldmanMessageListByCriteria(oldmanMessage);
		
		Writer out = null;
		String fileName = "评估结果列表.xls";
		
		try {
			response.setContentType("application/x-msdownload;");
			response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
			generateExcelWithStyle(resultList , response);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
		}
	}

	
	/**
	 * 生成Excel文件
	 * @param resultList
	 * @param response
	 * @throws Exception
	 */
	private void generateExcelWithStyle(List<Map<String, String>> resultList, HttpServletResponse response) throws Exception {
		
		List<ExcelSheet> sheetList = new ArrayList<ExcelSheet>();
		ExcelSheet sheet = new ExcelSheet();
		sheet.setSheetName("数据报表");
		
		
		//组装数据列表的头信息 
		List<CellData> headerList = new ArrayList<CellData>();
		List<Map<String, String>> configList = loadProperties();
		List<String> keyList = new ArrayList<String>();
		for (Map<String, String> map : configList) {
			Collection<String> values = map.values();
			CellData headerCell = new CellData();
			headerCell.setContent(values.iterator().next());
			headerList.add(headerCell);
			
			Set<String> set = map.keySet();
			keyList.add(set.iterator().next());
		}
		sheet.setSheetWithStyleTitle(headerList); //头信息
		System.out.println("keyList : " + keyList);
		
		
		//组装数据列表的内容列表数据
		List<List<CellData>> contentList = new ArrayList<List<CellData>>();
		List<CellData> content = null;
		for (Map<String,String> map : resultList) {
			content = new ArrayList<CellData>();
			for (String key : keyList) {
				CellData contentCell = new CellData();
				contentCell.setContent(map.get(key));
				content.add(contentCell);
			}
			contentList.add(content);
		}
		sheet.setSheetWithStyleContent(contentList);
		
		
		sheetList.add(sheet);
		
		ExcelUtils.generateExcelWithStyle(sheetList,response.getOutputStream());
		
	}
	
	
	//按照配置文件, 顺序加载配置文件中的配置信息.
	public List<Map<String,String>> loadProperties() throws Exception {
		List<Map<String,String>> configList = new ArrayList<Map<String,String>>();
		
		String path = this.getClass().getResource("/").getPath()+"dataconfig.txt";
		
		BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
		String line = null;
		Map<String,String> map = null;
		while((line = reader.readLine()) != null){
			map = new HashMap<String,String>();
			if(line!=null && !"".equals(line)){
				String[] str = line.split("=");
				map.put(str[0], str[1]);
				configList.add(map);
			}
		}
		reader.close();
		log.info("从文件中加载表头信息 , configList : " + configList);
		return configList;
	}
	
	
	
	
	@RequestMapping("/downloadDetailResult")
	public void downloadDetailResult(HttpServletResponse response , Integer id)throws Exception{
		
		AllMessage message = oldmanMessageService.getDetailResultMessage(id);
		
		List<BaseCode> list = baseCodeService.findAll();
		Map<Integer,String> baseCodeMap = getBaseCodeMap(list);
		
		Writer out = null;
		String fileName = "老年人能力评估 - 祥和 -"+message.getOldmanMessage().getName()+".xls";
		
		try {
			response.setContentType("application/x-msdownload;");
			response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
			
			Configuration configuration = configurer.getConfiguration();
			Template template = configuration.getTemplate("2.ftl");
			
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("message", message);
			
			Integer age = getAge(message);
			map.put("age", age);//11836
			
			map.put("beliefValue", baseCodeMap.get(message.getOldmanMessage().getBelief()));
			
			
			//计算各项能力的分数。
			//生活能力得分
			if(message.getLivingmessage()!=null){
				Integer score = livingMessageService.getLivingMessageScore(message.getLivingmessage());
				map.put("livingScore", score);
			}
			
			//精神状态
			if(message.getMentality()!=null){
				Integer score = mentalityService.getMentalityScore(message.getMentality());
				map.put("mentalityScore", score);
			}
			
			
			//感知觉与沟通
			if(message.getPerception()!=null){
				//Integer score = participationService.getMentalityScore(message.getMentality());
				Integer score = 0;
				Map<Integer, Integer> scoreMap = abilityItemService.getScoreLevelMapping();
				TbOldmanPerception perception = message.getPerception();
				
				if(perception.getCommunicationLevel()!=null){
					score += scoreMap.get(perception.getCommunicationLevel());
				}
				if(perception.getConsciousnessLevel()!=null){
					score += scoreMap.get(perception.getConsciousnessLevel());
				}
				if(perception.getHearingLevel()!=null){
					score += scoreMap.get(perception.getHearingLevel());
				}
				if(perception.getVisionLevel()!=null){
					score += scoreMap.get(perception.getVisionLevel());
				}
				
				map.put("perceptionScore", score);
			}
			
			
			//社会参与
			if(message.getSocialParticipation()!=null){
				Integer score = participationService.getSocialParticipationScore(message.getSocialParticipation());
				map.put("participationScore", score);
			}
			
			
			log.info("模板中的数据模型为 ： " + JSON.toJSONString(map));
			
			out = response.getWriter();
			template.process(map, out);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
		}
	}





	private Map<Integer, String> getBaseCodeMap(List<BaseCode> list) {
		Map<Integer,String> baseCodeMap = new HashMap<Integer, String>();
		
		if(list != null){
			for (BaseCode baseCode : list) {
				baseCodeMap.put(baseCode.getId(), baseCode.getItemName());
			}
		}
		
		return baseCodeMap;
	}





	private Integer getAge(AllMessage message) {
		Integer age = null;
		
		//由出生日期获得年龄
        Calendar cal = Calendar.getInstance();
        Date birthday = message.getOldmanMessage().getBirthday();
        
        if (cal.before(birthday)) {
            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        
        cal.setTime(birthday);
 
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
 
        age = yearNow - yearBirth;
 
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            }else{
                age--;
            }
        }
        return age;
    }

	
	
	@RequestMapping("/downloadTemplate")
	public ResponseEntity<byte[]> downloadTemplate(HttpServletResponse response) throws Exception{
		String fileName = "评估详情模板.xls";
		
		String filePath = OldmanMessageController.class.getClassLoader().getResource("file/"+fileName).getFile();
		log.info("下载的文件路径是 : " + URLDecoder.decode(filePath));
		
        File file=new File(URLDecoder.decode(filePath));
        HttpHeaders headers = new HttpHeaders();  
        String _fileName=new String(fileName.getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", _fileName); 
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM); 
        
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);  
        
	}
	
	
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbOldmanMessage message){
		try {
			oldmanMessageService.update(message);
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	
}
