package com.wr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wr.entity.Manager;
import com.wr.service.ManagerService;
import com.wr.util.Md5Util;
import com.wr.util.ResponseUtil;

import net.sf.json.JSONObject;

/**
 * 管理员Controller�?
 * @author user
 *
 */
@Controller
@RequestMapping("/manager2")
public class ManagerController {

	@Resource
	private ManagerService managerService;
	
	/**
	 * 用户登录
	 * @param manager
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String login(Manager manager,HttpServletResponse response)throws Exception{
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(manager.getUserName(), Md5Util.md5(manager.getPassword(), Md5Util.SALT));
		JSONObject result=new JSONObject();
		try{
			subject.login(token);	
			result.put("success", true);
		}catch(Exception e){
			result.put("success", false);
			result.put("errorInfo", "用户名或密码错误");
			e.printStackTrace();
		}
		ResponseUtil.write(response, result);
		return null;
	}
}
