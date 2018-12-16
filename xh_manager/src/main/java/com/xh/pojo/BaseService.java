package com.xh.pojo;

public class BaseService {
	
	private Integer id;
	
	private String name;
	
	private Integer parentId;
	
	private Integer rowspan;
	
	private Integer colspan;

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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getRowspan() {
		return rowspan;
	}

	public void setRowspan(Integer rowspan) {
		this.rowspan = rowspan;
	}

	public Integer getColspan() {
		return colspan;
	}

	public void setColspan(Integer colspan) {
		this.colspan = colspan;
	}

	@Override
	public String toString() {
		return "BaseService [id=" + id + ", name=" + name + ", parentId="
				+ parentId + ", rowspan=" + rowspan + ", colspan=" + colspan
				+ "]";
	}
	
}
