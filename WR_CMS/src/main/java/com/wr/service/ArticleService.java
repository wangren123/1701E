package com.wr.service;

import java.util.List;
import java.util.Map;

import com.wr.entity.Article;

/**
 * 帖子Service接口
 * @author user
 *
 */
public interface ArticleService {

	/**
	 * 获取�?新的7条帖�?
	 * @return
	 */
	public List<Article> getNewest();
	
	/**
	 * 获取�?�?7条推荐的帖子
	 * @return
	 */
	public List<Article> getRecommend();
	
	/**
	 * 获取�?�?5条幻灯的帖子
	 * @return
	 */
	public List<Article> getSlide();
	
	/**
	 * 根据帖子类别来查找最新的8条数�?
	 * @param typeId
	 * @return
	 */
	public List<Article> getIndex(Integer typeId);
	
	/**
	 * 通过id查询帖子
	 * @param id
	 * @return
	 */
	public Article findById(Integer id);
	
	/**
	 * 获取上一个帖�?
	 * @param id
	 * @return
	 */
	public Article getLastArticle(Integer id);
	
	/**
	 * 获取下一个帖�?
	 * @param id
	 * @return
	 */
	public Article getNextArticle(Integer id);
	
	/**
	 * 更新帖子
	 * @param article
	 * @return
	 */
	public Integer update(Article article);
	
	/**
	 * 根据条件分页查询帖子
	 * @param map
	 * @return
	 */
	public List<Article> list(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
}
