package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer{
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		ServletRegistration.Dynamic registration=arg0.addServlet("dispatcher",new DispatcherServlet() );
		registration.setInitParameter("contextConfigLocation", "classpath:spring/*.xml");
		registration.setLoadOnStartup(1);
		registration.addMapping("/*");
	}
}
