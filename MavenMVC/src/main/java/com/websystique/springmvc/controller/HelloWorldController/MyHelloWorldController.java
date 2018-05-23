package com.websystique.springmvc.controller.HelloWorldController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MyHelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "hello world from maven spring mvc");
		return "welcome";
	}
	@RequestMapping(value="helloagain",method=RequestMethod.GET)//映射web请求到指定的处理器类或者处理方法
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting","hello world again, from maven spring mvc");
		return "welcome";
	}
}