/**
 * 
 */
package com.ocarmon.service.impl;

import org.springframework.stereotype.Service;

import com.ocarmon.service.PeopleService;

/** 
* @author 李浩铭 
* @since 2018年3月16日 下午3:28:33
*/
@Service("peopleService")
public class PeopleServiceImpl implements PeopleService{

	@Override
	public String test() {
		return "people: hello world";
	}

	
}
