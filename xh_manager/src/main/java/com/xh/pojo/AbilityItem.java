package com.xh.pojo;

import java.util.List;

public class AbilityItem {
	
	private Integer id ;
	
	private String name;
	
	private String description;
	
	private String part;
	
	private String note;
	
	private List<AbilityItemOption> optionList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public List<AbilityItemOption> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<AbilityItemOption> optionList) {
		this.optionList = optionList;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "AbilityItem [id=" + id + ", name=" + name + ", description="
				+ description + ", part=" + part + "]";
	}
	
	
	
}
