package com.wr.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wr.dao.ArcTypeDao;
import com.wr.entity.ArcType;
import com.wr.service.ArcTypeService;

/**
 * 帖子类别Service实现�?
 * @author user
 *
 */
@Service("arcTypeService")
public class ArcTypeServiceImpl implements ArcTypeService{

	@Resource
	private ArcTypeDao arcTypeDao;
	
	public List<ArcType> list(Map<String, Object> map) {
		return arcTypeDao.list(map);
	}

	public ArcType findById(Integer id) {
		return arcTypeDao.findById(id);
	}

}
