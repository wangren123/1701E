package com.wr.dao;

import com.wr.entity.Manager;

/**
 * 管理员Dao接口
 * @author user
 *
 */
public interface ManagerDao {

	/**
	 * 通过用户名查询用�?
	 * @param userName
	 * @return
	 */
	public Manager getByUserName(String userName);
	
}
