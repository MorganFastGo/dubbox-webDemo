package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.DubboxService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Reference
	private DubboxService service;
	
	@RequestMapping("/showName.do")
	@ResponseBody
	public String showName() {
     return service.getString();

	}
	

}
