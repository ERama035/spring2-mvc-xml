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

		System.out.println("------");
		System.out.println("***********");
		
		System.out.println("pusing to branch");
		System.out.println("pusing to upstream");
		
			System.out.println("------");
		System.out.println("***********");
		
		System.out.println("pusing to branch");
		System.out.println("pusing to upstream------------------");
		System.out.println("pusing to upstream----------------------");
		System.out.println("pusing to upstream-------------------------");
		System.out.println("pusing to upstream----------------------------");
		
		System.out.println("========================*****************************************====");
		
		
		System.out.println("pusing to to to to to ");
		

			System.out.println(" ********hhhh***********test2 gfh****************------");
			System.out.println(" *******************test2 gfhgfh 9999999**********-----");
	
		System.out.println("ppppppppppppppppppppppppppppppppppp");
		System.out.println("ppppppppppppppppppppppppppppppppppp");
		System.out.println("ppppppppppppppppppppppppppppppppppp ---sourve tree pull");
		System.out.println("ppppppppppppppppppppppppppppppppppp ---sourve fetch-- rk-1-0987-----654321----iiiii--nnnnnnnnnnnnnnnnn");
		return model;
	}

}
