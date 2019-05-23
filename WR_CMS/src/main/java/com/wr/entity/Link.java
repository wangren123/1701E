package com.wr.entity;

/**
 * 友情链接对象�?
 * @author user
 *
 */
public class Link {

	private Integer id; // 编号
	private String name; // 连接名称
	private String url; // 地址
	private Integer sortNo; // 排序
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getSortNo() {
		return sortNo;
	}
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	
	
}
