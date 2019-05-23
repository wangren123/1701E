package com.wr.entity;

/**
 * 帖子类别实体
 * @author user
 *
 */
public class ArcType {

	private Integer id; // 编号
	private String typeName; // 类别名称
	private Integer sortNo; // 排列序号
	private String keywords; // 关键�? 页面seo用到
	private String description; // 类别描述 页面seo用到
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getSortNo() {
		return sortNo;
	}
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
