package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "hello world");

		System.out.println(" qqqqqqqqqqqqqqqqqq ---sourve fetch");

		System.out.println(" abcns'paskmsndslcndslvnldsndsndskcnkldnlkdncc ---sourve fetch");
		System.out.println("ppppppppppppppppppppppppppppppppppp ---sourve fetch");
		System.out.println("ppppppppppppppppppppppppppppppppppp ---sourve fetch");
		System.out.println("ppppppppppppppppppppppppppppppppppp ---sourve fetch");
		System.out.println("ppppppppppppppppppppppppppppppppppp ---sourve fetch");

		return model;
	}

}
