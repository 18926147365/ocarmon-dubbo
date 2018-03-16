/**
 * 
 */
package com.ocarmon.service.impl;

import org.springframework.stereotype.Service;

import com.ocarmon.service.UserService;




/** 
* @author 李浩铭 
* @since 2018年3月16日 上午10:28:59
*/
@Service("userService")
public class UserServiceImpl implements UserService{

	/* (non-Javadoc)
	 * @see com.cl.user.servicei.UserService#sayHello()
	 */
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cl.user.servicei.UserService#test()
	 */
	@Override
	public String test() {
		return "user:hello world";
	}

	



	

}
