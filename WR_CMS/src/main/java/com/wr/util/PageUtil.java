package com.wr.util;

/**
 * 分页工具�?
 * @author user
 *
 */
public class PageUtil {

	/**
	 * 生成上下页代�?
	 * @param totalNum
	 * @param currentPage
	 * @param pageSize
	 * @param typeId
	 * @return
	 */
	public static String genUpAndDownPagation(int totalNum,int currentPage,int pageSize,String typeId){
		int totalPage=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
		StringBuffer pageCode=new StringBuffer();
		if(currentPage==1){
			pageCode.append("<a>上一�?</a>");
		}else{
			pageCode.append("<a href='"+PropertiesUtil.getValue("host")+"/arcType/"+typeId+".html?page="+(currentPage-1)+"'>上一�?</a>");
		}
		pageCode.append("&nbsp;&nbsp;");
		if(currentPage==totalPage){
			pageCode.append("<a>下一�?</a>");
		}else{
			pageCode.append("<a href='"+PropertiesUtil.getValue("host")+"/arcType/"+typeId+".html?page="+(currentPage+1)+"'>下一�?</a>");
		}
		return pageCode.toString();
	}
}
