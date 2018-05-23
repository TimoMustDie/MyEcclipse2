package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService service;
	@GetMapping(value="/hello")
	public String sayHi(@RequestParam(value="name") String name) {
		return service.hello(name);
	}
}
