/**
 * 
 */
package com.ocarmon.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocarmon.service.PeopleService;
import com.ocarmon.service.UserService;

/** 
* @author 李浩铭 
* @since 2018年3月16日 上午11:00:20
*/
@Controller
public class HelloController {
	
	@Resource
	private UserService userService;
	
	@Resource PeopleService peopleService;
	
	@ResponseBody
	@RequestMapping("/toUser")
	public String toUser() {
		return userService.test();
	}
	@ResponseBody
	@RequestMapping("/toPeople")
	public String toPeople() {
		return peopleService.test();
	}
	
}
