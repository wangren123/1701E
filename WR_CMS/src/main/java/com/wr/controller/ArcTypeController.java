package com.wr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wr.entity.ArcType;
import com.wr.entity.Article;
import com.wr.entity.PageBean;
import com.wr.service.ArcTypeService;
import com.wr.service.ArticleService;
import com.wr.util.NavUtil;
import com.wr.util.PageUtil;
import com.wr.util.PropertiesUtil;
import com.wr.util.StringUtil;

/**
 * 帖子类别Controller�?
 * @author user
 *
 */
@Controller
@RequestMapping("/arcType")
public class ArcTypeController {

	@Resource
	private ArticleService articleService;
	
	@Resource
	private ArcTypeService arcTypeService;
	
	/**
	 * 根据类型查询查询帖子结果
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{id}")
	public ModelAndView list(@PathVariable("id") Integer id,@RequestParam(value="page",required=false) String page)throws Exception{
		ModelAndView mav=new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(PropertiesUtil.getValue("listPageSize")));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("typeId", id);
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Article> articleList=articleService.list(map);
		Long total=articleService.getTotal(map);
		ArcType arcType=arcTypeService.findById(id);
		mav.addObject("articleList", articleList);
		mav.addObject("arcType", arcType);
		mav.addObject("navCode", NavUtil.genArticleListNavigation(arcType.getTypeName()));
		mav.addObject("pageCode", PageUtil.genUpAndDownPagation(total.intValue(), Integer.parseInt(page), Integer.parseInt(PropertiesUtil.getValue("listPageSize")), String.valueOf(id)));
		mav.setViewName("articleList");
		return mav;
	}
}
