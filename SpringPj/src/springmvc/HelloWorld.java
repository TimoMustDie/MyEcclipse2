package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	@RequestMapping
	public String hello() {
		System.out.println("hello world");
		return "result";
	}
}