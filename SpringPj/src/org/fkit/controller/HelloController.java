package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class HelloController{
	/*��ע�⿪������Ӧ��ʵ��Controller�ӿ�
	private static final Log logger1=LogFactory.getLog(HelloController.class);
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","HelloWorld");
		mv.setViewName("/welcome.jsp");
		return mv;
	}*/
	private static final Log logger=LogFactory.getLog(HelloController.class);
	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		logger.info("hello ����������");
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","hello ����");
		mv.setViewName("/welcome.jsp");
		return mv;
	}
}
