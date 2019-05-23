package com.wr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wr.dao.ManagerDao;
import com.wr.entity.Manager;
import com.wr.service.ManagerService;

/**
 * 管理员Service实现�?
 * @author user
 *
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{

	@Resource
	private ManagerDao managerDao;

	public Manager getByUserName(String userName) {
		return managerDao.getByUserName(userName);
	}
}
