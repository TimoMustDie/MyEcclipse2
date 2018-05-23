package org.ssm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HelloSSM extends MultiActionController{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	private String viewPage;
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		Map<String,String> model=new HashMap<>();
		model.put("helloWorld", "update: ");
		
		return new ModelAndView(getViewPage(),model);
	}
	public void setViewPage(String viewPage) {
		this.viewPage=viewPage;
	}
	public String getViewPage() {
		return viewPage;
	}
}
