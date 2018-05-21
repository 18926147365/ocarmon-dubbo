/**
 * 
 */
package com.ocarmon.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.ocarmon.service.PeopleService;

/** 
* @author 李浩铭 
* @since 2018年3月16日 下午3:28:33
*/
@Service
public class PeopleServiceImpl implements PeopleService{

	public String test() {
		return "people: hello world";
	}

	
}
