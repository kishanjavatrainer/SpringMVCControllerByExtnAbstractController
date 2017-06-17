package com.infotech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloworldController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		return new ModelAndView("welcomePage", "helloMessage", "Hello,"+req.getParameter("userName"));
	}
	
}
