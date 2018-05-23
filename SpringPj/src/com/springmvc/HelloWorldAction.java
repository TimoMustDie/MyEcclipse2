package com.springmvc;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldAction{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	private String viewPage;
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		Map<String,String> model=new HashMap<>();
		model.put("show", "update: ");
		System.out.println(getViewPage()+"\n\n\n\n\n\n\n"+req.getParameter("msg1"));
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/jsps/show.jsp");
		mView.addObject("helloWorld", "hhhhhhh");
		return mView;
		//return new ModelAndView("show",model);
	}
	public HelloWorldAction() {
		// TODO Auto-generated constructor stub
	}
	public HelloWorldAction(String viewPage) {
		this.viewPage=viewPage;
	}
	public void setViewPage(String viewPage) {
		this.viewPage=viewPage;
	}
	public String getViewPage() {
		return viewPage;
	}
}
