package com.xh.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xh.mapper.TbOldmanLinkmessageMapper;
import com.xh.mapper.TbOldmanLivingmessageMapper;
import com.xh.mapper.TbOldmanMentalityMapper;
import com.xh.mapper.TbOldmanMessageMapper;
import com.xh.mapper.TbOldmanPerceptionMapper;
import com.xh.mapper.TbOldmanRecentmessageMapper;
import com.xh.mapper.TbOldmanSocialParticipationMapper;
import com.xh.pojo.BaseCode;
import com.xh.pojo.PageResult;
import com.xh.pojo.TbOldmanLinkmessage;
import com.xh.pojo.TbOldmanLinkmessageExample;
import com.xh.pojo.TbOldmanLivingmessage;
import com.xh.pojo.TbOldmanMentality;
import com.xh.pojo.TbOldmanMessage;
import com.xh.pojo.TbOldmanMessageExample;
import com.xh.pojo.TbOldmanMessageExample.Criteria;
import com.xh.pojo.TbOldmanPerception;
import com.xh.pojo.TbOldmanRecentmessage;
import com.xh.pojo.TbOldmanRecentmessageExample;
import com.xh.pojo.TbOldmanSocialParticipation;
import com.xh.pojo.group.AllMessage;
import com.xh.pojo.group.EvaluateMessage;
import com.xh.service.AbilityGradeLevelService;
import com.xh.service.BaseCodeService;
import com.xh.service.OldmanMessageService;
import com.xh.util.NoUtils;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

@Service
@Transactional
public class OldmanMessageServiceImpl implements OldmanMessageService{
	
	private static Logger log = Logger.getLogger(OldmanLinkMessageServiceImpl.class);
	
	@Autowired
	private TbOldmanMessageMapper oldmanMessageMapper;
	
	@Autowired
	private AbilityGradeLevelService abilityGradeLevelService;
	
	@Autowired
	private TbOldmanLinkmessageMapper linkmessageMapper;
	
	@Autowired
	private TbOldmanRecentmessageMapper recentmessageMapper;
	
	@Autowired
	private TbOldmanLivingmessageMapper livingmessageMapper;
 	
	@Autowired
	private TbOldmanMentalityMapper mentalityMapper;
	
	@Autowired
	private TbOldmanPerceptionMapper perceptionMapper;
	
	@Autowired
	private TbOldmanSocialParticipationMapper participationMapper;
	
	@Autowired
	private FreeMarkerConfigurer configurer;
	
	@Autowired
	private BaseCodeService baseCodeService;
	
	@Autowired
	private NoUtils noUtils;
	
	@Override
	public Integer add(TbOldmanMessage message) {
		
		message.setCreatetime(new Date());
		message.setUpdatetime(new Date());
		
		String evaluateNo = noUtils.generateEvaluateNo();
		message.setEvaluateNo(evaluateNo);
		
		oldmanMessageMapper.insert(message);
		
		return message.getId();
	}

	@Override
	public void updateAbilityGrade(Integer id) {
		
		//计算能力等级
		Integer level = abilityGradeLevelService.getAbilityLevel(id);
		log.info("计算MessageId 为 : " + id + " 的老人的能力等级 , 初步计算能力等级为 : " + level);
		
		//更新数据库的能力等级字段
		TbOldmanMessage oldmanMessage = oldmanMessageMapper.selectByPrimaryKey(id);
		oldmanMessage.setPrimaryLevel(level);
		oldmanMessage.setFinalLevel(level);
		oldmanMessage.setUpdatetime(new Date());
		
		oldmanMessageMapper.updateByPrimaryKeySelective(oldmanMessage);
	}

	@Override
	public EvaluateMessage findOne(Integer id) {
		
		EvaluateMessage evaluateMessage = new EvaluateMessage();
		
		TbOldmanMessage oldmanMessage = oldmanMessageMapper.selectByPrimaryKey(id);
		TbOldmanLinkmessage linkmessage = linkmessageMapper.selectByPrimaryKey(id);
		TbOldmanRecentmessage recentmessage = recentmessageMapper.selectByPrimaryKey(id);
		
		evaluateMessage.setLinkmessage(linkmessage);
		evaluateMessage.setOldmanMessage(oldmanMessage);
		evaluateMessage.setRecentmessage(recentmessage);
		
		return evaluateMessage;
	}

	@Override
	public PageResult<TbOldmanMessage> findByPage(Integer pageNum, Integer pageSize, TbOldmanMessage oldmanMessage) {
		
		PageHelper.startPage(pageNum, pageSize);
		
		TbOldmanMessageExample example=new TbOldmanMessageExample();
		Criteria criteria = example.createCriteria();
		
		if(oldmanMessage!=null){			
			if(oldmanMessage.getName() != null && oldmanMessage.getName().length() > 0){
				criteria.andNameLike("%"+oldmanMessage.getName()+"%");
			}
			
			if(oldmanMessage.getIdCart() != null && oldmanMessage.getIdCart().length() > 0){
				criteria.andIdCartLike("%" + oldmanMessage.getIdCart() + "%");
			}
			
			if(oldmanMessage.getLivingAddress() != null && oldmanMessage.getLivingAddress().length() > 0){
				criteria.andLivingAddressLike(oldmanMessage.getLivingAddress() + "%");
			}
		}
		
		example.setOrderByClause("updatetime desc");
		
		Page<TbOldmanMessage> page= (Page<TbOldmanMessage>)oldmanMessageMapper.selectByExample(example);		
		
		return new PageResult<TbOldmanMessage>(page.getTotal(), page.getResult());
		
	}

	@Override
	public void deleteById(Integer[] ids) {
		if(ids!=null){
			for (Integer id : ids) {
				//删除老人基本信息表的数据
				oldmanMessageMapper.deleteByPrimaryKey(id);
				
				//删除联系人信息表的数据
				linkmessageMapper.deleteByPrimaryKey(id);
				
				//删除老人近况表的数据
				recentmessageMapper.deleteByPrimaryKey(id);
				
				//删除老人生活能力表的数据
				livingmessageMapper.deleteByPrimaryKey(id);
				
				//删除老人精神状态表的数据
				mentalityMapper.deleteByPrimaryKey(id);
				
				//删除老人感知觉与沟通表的数据
				perceptionMapper.deleteByPrimaryKey(id);
				
				//删除老人社会参与表的数据
				participationMapper.deleteByPrimaryKey(id);
			}
		}
	}

	

	@Override
	public Map<String, String> getResultMessage(Integer id) {
		
		Map<String,String> map=new HashMap<String,String>();
		
		String[] genders = {"","男","女"};
		String[] abilityGrade = {"能力完好","轻度受损","中度受损","重度受损"};
		String[] abilityLevel = {"能力完好","轻度失能","中度失能","重度失能"};
		
		
		EvaluateMessage em = findOne(id);
		
		map.put("id", em.getOldmanMessage().getId()+"");
		map.put("name", em.getOldmanMessage().getName());
		
		String gender = em.getOldmanMessage().getGender();
		if(gender!=null){
			map.put("gender", genders[Integer.parseInt(gender)]);
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(em.getOldmanMessage().getBirthday() != null){
			map.put("idCart", em.getOldmanMessage().getIdCart());
		}
		
		map.put("evaluateGroup", em.getLinkmessage().getEvaluateGroup());
		map.put("evaluateName", em.getLinkmessage().getEvaluateName());
		
		if(em.getOldmanMessage().getLevelDailyLiving() != null){
			map.put("levelDailyLiving", abilityGrade[em.getOldmanMessage().getLevelDailyLiving()]);
		}
		
		if(em.getOldmanMessage().getLevelMentality() != null){
			map.put("levelMentality", abilityGrade[em.getOldmanMessage().getLevelMentality()]);
		}
		
		if(em.getOldmanMessage().getLevelPerception() != null){
			map.put("levelPerception", abilityGrade[em.getOldmanMessage().getLevelPerception()]);
		}
		
		if(em.getOldmanMessage().getLevelSocialPartipation() != null){
			map.put("levelSocialPartipation", abilityGrade[em.getOldmanMessage().getLevelSocialPartipation()]);
		}
		
		if(em.getOldmanMessage().getPrimaryLevel() != null){
			map.put("primaryLevel", abilityLevel[em.getOldmanMessage().getPrimaryLevel()]);
		}
		
		if(em.getOldmanMessage().getFinalLevel() != null){
			map.put("finalLevel", abilityLevel[em.getOldmanMessage().getFinalLevel()]);
		}
		
		return map;
	}

	@Override
	@SuppressWarnings("all")
	public List<Map<String, String>> findOldmanMessageListByCriteria(TbOldmanMessage oldmanMessage) {
		
		List<Map<String,String>> resultList = new ArrayList<Map<String,String>>();
		
		String[] genders = {"","男","女"};
		String[] abilityGrade = {"能力完好","轻度受损","中度受损","重度受损"};
		String[] abilityLevel = {"能力完好","轻度失能","中度失能","重度失能"};
		
		//获取符合条件的记录
		List<TbOldmanMessage> messageList = findListByCriteria(oldmanMessage);		
		if(messageList==null || messageList.size()==0){
			return new ArrayList<Map<String,String>>();
		}
		
		//获取符合条件记录的ID列表
		List<Integer> ids = new ArrayList<Integer>();
		for (TbOldmanMessage message : messageList) {
			ids.add(message.getId());
		}
		
		//获取联系人数据
		List<TbOldmanLinkmessage> linkList = findLinkListByIds(ids);
		Map<Integer,TbOldmanLinkmessage> linkMap = new HashMap<Integer, TbOldmanLinkmessage>();
		if(linkList!=null){
			for (TbOldmanLinkmessage link : linkList) {
				linkMap.put(link.getId(), link);
			}
		}
		
		
		//获取老人近况列表数据
		List<TbOldmanRecentmessage> recentList = findRecentListByIds(ids);
		
		//获取基础数据
		Map<Integer,String> codeMap = new HashMap<Integer, String>();
		List<BaseCode> baseCodeList = baseCodeService.findAll();
		for (BaseCode baseCode : baseCodeList) {
			codeMap.put(baseCode.getId(), baseCode.getItemName());
		}
		
		Map<String,String> map = null;
		for (TbOldmanMessage message : messageList) {
			
			if(message !=null){
				map = new HashMap<String, String>();
				map.put("ID", message.getId()+"");
				map.put("NAME", message.getName());
				map.put("IDCART", message.getIdCart());
				if(!StringUtils.isEmpty(message.getGender())){
					map.put("GENDER", genders[Integer.parseInt(message.getGender())]);
				}
				if(!StringUtils.isEmpty(message.getBirthday())){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					map.put("BIRTHDAY", sdf.format(message.getBirthday()));
				}
				map.put("NATION", message.getNation());
				map.put("BELIEF", codeMap.get(message.getBelief()));
				map.put("MARITALSTATUS", codeMap.get(message.getMaritalStatus()) );
				
				map.put("SOCIALSECURITYCARD", message.getSocialSecurityCard());
				map.put("CULTUREDEGREE", codeMap.get(message.getCultureDegree()));
				map.put("LIVINGADDRESS", message.getLivingAddress());
				
				map.put("LIVINGCONDITION", codeMap.get(message.getLivingCondition()));
				map.put("ECONOMICSOURCE", codeMap.get(message.getEconomicSource()));
				map.put("PAYMENTTYPE", codeMap.get(message.getPaymentType()));
				map.put("ASSESSMENTREASON", codeMap.get(message.getAssessmentReason()));
				
				if(!StringUtils.isEmpty(message.getLevelDailyLiving()))
					map.put("LEVELDAILYLIVING", abilityGrade[message.getLevelDailyLiving()]);
				if(!StringUtils.isEmpty(message.getLevelMentality()))
					map.put("LEVELMENTALITY", abilityGrade[message.getLevelMentality()]);
				if(!StringUtils.isEmpty(message.getLevelPerception()))
					map.put("LEVELPERCEPTION", abilityGrade[message.getLevelPerception()]);
				if(!StringUtils.isEmpty(message.getLevelSocialPartipation()))
					map.put("LEVELSOCIALPARTIPATION", abilityGrade[message.getLevelSocialPartipation()]);
				
				
				if(!StringUtils.isEmpty(message.getPrimaryLevel()))
					map.put("PRIMARYLEVEL", abilityLevel[message.getPrimaryLevel()]);
				if(!StringUtils.isEmpty(message.getFinalLevel()))
					map.put("FINALLEVEL", abilityLevel[message.getFinalLevel()]);
				
				SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				if(!StringUtils.isEmpty(message.getCreatetime()))
					map.put("CREATETIME", s.format(message.getCreatetime()));
				if(!StringUtils.isEmpty(message.getUpdatetime()))
					map.put("UPDATETIME", s.format(message.getUpdatetime()));
				
				
				//获取联系人信息
				TbOldmanLinkmessage linkmessage = linkMap.get(message.getId());
				if(linkmessage!=null){
					map.put("PROVIDERNAME", linkmessage.getProviderName());
					map.put("PROVIDERRELATION",codeMap.get(linkmessage.getProviderRelation()));
					map.put("LINKMAN1NAME",linkmessage.getLinkman1Name() );
					map.put("LINKMAN1PHONE",linkmessage.getLinkman1Phone() );
					map.put("LINKMAN2NAME",linkmessage.getLinkman2Name() );
					map.put("LINKMAN2PHONE",linkmessage.getLinkman2Phone() );
					map.put("LINKMAN3NAME",linkmessage.getLinkman3Name());
					map.put("LINKMAN3PHONE",linkmessage.getLinkman3Phone());
					map.put("EVALUATENAME", linkmessage.getEvaluateName());
					map.put("EVALUATEPHONE",linkmessage.getEvaluatePhone());
					map.put("EVALUATEGROUP", linkmessage.getEvaluateGroup());
					map.put("EVALUATEADDRESS", linkmessage.getEvaluateAddress());
					map.put("EVALUATEEMAIL",linkmessage.getEvaluateEmail());
				}
				
				resultList.add(map);
			}
		}
		
		return resultList;
	}
	
	
	private List<TbOldmanRecentmessage> findRecentListByIds(List<Integer> ids) {
		TbOldmanRecentmessageExample example = new TbOldmanRecentmessageExample();
		com.xh.pojo.TbOldmanRecentmessageExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		List<TbOldmanRecentmessage> list = recentmessageMapper.selectByExample(example);
		return list;
	}
	
	
	
	private List<TbOldmanLinkmessage> findLinkListByIds(List<Integer> ids) {
		TbOldmanLinkmessageExample example = new TbOldmanLinkmessageExample();
		com.xh.pojo.TbOldmanLinkmessageExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		List<TbOldmanLinkmessage> list = linkmessageMapper.selectByExample(example);
		return list;
	}

	private List<TbOldmanMessage> findListByCriteria(TbOldmanMessage oldmanMessage) {
		TbOldmanMessageExample example=new TbOldmanMessageExample();
		Criteria criteria = example.createCriteria();
		if(oldmanMessage!=null){			
			if(oldmanMessage.getName() != null && oldmanMessage.getName().length() > 0){
				criteria.andNameLike("%"+oldmanMessage.getName()+"%");
			}
			
			if(oldmanMessage.getIdCart() != null && oldmanMessage.getIdCart().length() > 0){
				criteria.andIdCartLike("%" + oldmanMessage.getIdCart() + "%");
			}
			
			if(oldmanMessage.getLivingAddress() != null && oldmanMessage.getLivingAddress().length() > 0){
				criteria.andLivingAddressLike(oldmanMessage.getLivingAddress() + "%");
			}
		}
		example.setOrderByClause("updatetime desc");
		List<TbOldmanMessage> messageList = oldmanMessageMapper.selectByExample(example);
		return messageList;
	}

	@Override
	public AllMessage getDetailResultMessage(Integer id) {
		AllMessage message = new AllMessage();
		
		TbOldmanMessage oldmanMessage = oldmanMessageMapper.selectByPrimaryKey(id);
		message.setOldmanMessage(oldmanMessage);
		
		TbOldmanLinkmessage linkmessage = linkmessageMapper.selectByPrimaryKey(id);
		message.setLinkmessage(linkmessage);
		
		TbOldmanRecentmessage recentmessage = recentmessageMapper.selectByPrimaryKey(id);
		message.setRecentmessage(recentmessage);
		
		TbOldmanLivingmessage livingmessage = livingmessageMapper.selectByPrimaryKey(id);
		message.setLivingmessage(livingmessage);
		
		TbOldmanMentality mentality = mentalityMapper.selectByPrimaryKey(id);
		message.setMentality(mentality);
		
		TbOldmanPerception perception = perceptionMapper.selectByPrimaryKey(id);
		message.setPerception(perception);
		
		TbOldmanSocialParticipation socialParticipation = participationMapper.selectByPrimaryKey(id);
		message.setSocialParticipation(socialParticipation);
		
		return message;
	}

	@Override
	public TbOldmanMessage findById(Integer id) {
		return oldmanMessageMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TbOldmanMessage message) {
		oldmanMessageMapper.updateByPrimaryKeySelective(message);
	}
	
	
	
}
