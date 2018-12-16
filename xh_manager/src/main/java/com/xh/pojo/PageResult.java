package com.xh.pojo;

import java.util.List;

/**
 * 分页返回的实体类
 */
public class PageResult<T>{
	
	private long total; // 总记录数
	private List<T> rows; // 返回每页的数据的集合
	
	public PageResult(long total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
