package springmvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class ItemsController1 implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<Items> items=new ArrayList<>();
		items.add(new Items("联想笔记本", 6000, "thinkpad T430 联想笔记本"));
		items.add(new Items("苹果", 5000, "iphone6 苹果手机"));
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("item",items);
		//指定视图
		modelAndView.setViewName("/jsps/springmvc.jsp");
		
		return modelAndView;
	}
}
