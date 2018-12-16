package com.xh.pojo;

public class AbilityItemOption {
	
	private Integer id;
	
	private String optionName;
	
	private Integer itemId;
	
	private Integer score;
	
	private Integer sort;
	
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AbilityItemOption [id=" + id + ", optionName=" + optionName
				+ ", itemId=" + itemId + ", score=" + score + ", sort=" + sort
				+ ", description=" + description + "]";
	}
	
	
	
}
