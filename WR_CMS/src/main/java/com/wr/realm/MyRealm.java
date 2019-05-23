package com.wr.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.wr.entity.Manager;
import com.wr.service.ManagerService;

/**
 * 自定义Reaml
 * @author user
 *
 */
public class MyRealm extends AuthorizingRealm{

	@Resource
	private ManagerService managerService;
	
	/**
	 * 为当前登录用户授予角色和权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 验证当前登录的用�?
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String) token.getPrincipal();
		Manager manager=managerService.getByUserName(userName);
		if(manager!=null){
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", manager);
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(manager.getUserName(), manager.getPassword(), "xxx");
			return authcInfo;
		}else{
			return null;
		}
	}

}
