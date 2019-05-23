package com.wr.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wr.dao.LinkDao;
import com.wr.entity.Link;
import com.wr.service.LinkService;

/**
 * 友情链接Service实现�?
 * @author user
 *
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Resource
	private LinkDao linkDao;
	
	public List<Link> list(Map<String, Object> map) {
		return linkDao.list(map);
	}

}
