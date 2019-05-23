package com.wr.util;

/**
 * 导航工具�?
 * @author user
 *
 */
public class NavUtil {

	/**
	 * 生成帖子列表导航
	 * @param typeName
	 * @return
	 */
	public static String genArticleListNavigation(String typeName){
		StringBuffer navCode=new StringBuffer();
		navCode.append("当前位置�?&nbsp;&nbsp;");
		navCode.append("<a href='"+PropertiesUtil.getValue("host")+"'>主页</a>&nbsp;&nbsp;>&nbsp;&nbsp;");
		navCode.append(typeName);
		return navCode.toString();
	}
	
	/**
	 * 生成帖子详细页导�?
	 * @param typeName
	 * @param typeId
	 * @param articleTitle
	 * @return
	 */
	public static String genArticleNavigation(String typeName,Integer typeId,String articleTitle){
		StringBuffer navCode=new StringBuffer();
		navCode.append("当前位置�?&nbsp;&nbsp;");
		navCode.append("<a href='"+PropertiesUtil.getValue("host")+"'>主页</a>&nbsp;&nbsp;>&nbsp;&nbsp;");
		navCode.append("<a href='"+PropertiesUtil.getValue("host")+"/arcType/"+typeId+".html'>"+typeName+"</a>&nbsp;&nbsp;>&nbsp;&nbsp;"+articleTitle);
		return navCode.toString();
	}
}
