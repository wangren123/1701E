package com.wr.service;

import com.wr.entity.Manager;

/**
 * 管理员Service接口
 * @author user
 *
 */
public interface ManagerService {

	/**
	 * 通过用户名查询用�?
	 * @param userName
	 * @return
	 */
	public Manager getByUserName(String userName);
}
