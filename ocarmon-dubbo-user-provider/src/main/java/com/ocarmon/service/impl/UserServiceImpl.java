/**
 * 
 */
package com.ocarmon.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.ocarmon.service.UserService;




/** 
* @author 李浩铭 
* @since 2018年3月16日 上午10:28:59
*/
@Service
public class UserServiceImpl implements UserService{
	public String sayHello() {
		// TODO Auto-generated method stub
		return null;
	}

	public String test() {
		return "user:hello world";
	}

	



	

}
