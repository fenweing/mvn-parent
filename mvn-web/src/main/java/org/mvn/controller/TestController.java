package org.mvn.controller;

import javax.servlet.http.HttpServletRequest;

import org.mvn.common.User;
import org.mvn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value = "/mvn")
public class TestController {
	@Autowired
	TestService tService;

	@RequestMapping(value = "/test1",method={RequestMethod.GET})
	@ResponseBody
	public User test1(HttpServletRequest request) {
		String name = request.getParameter("name");
//		String name = obj.getString("name");
		return tService.getUserByName(name);
	}
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public User test(@RequestBody JSONObject obj) {
		String name = obj.getString("name");
//		String name = obj.getString("name");
		return tService.getUserByName(name);
	}
}
