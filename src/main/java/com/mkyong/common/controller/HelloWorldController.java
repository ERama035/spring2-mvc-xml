package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
//for stashion-2
public class HelloWorldController extends AbstractController {
	public String fe;//st-2
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world");

		System.out.println("------");
		System.out.println("**00000**one two** ");
		
		
		
		return model;
	}

}
