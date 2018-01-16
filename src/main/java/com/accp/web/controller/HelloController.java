package com.accp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("sex",1);
		List<String> userList = new ArrayList<>();
		userList.add("张三");
		userList.add("李四");
		userList.add("王五");
		model.addAttribute("userList",userList);
		model.addAttribute("name","李勇");
		return "index";
	}
}
