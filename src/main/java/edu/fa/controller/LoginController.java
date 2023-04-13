package edu.fa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fa.model.Fresher;

@Controller
public class LoginController {

//	Value sẽ được mapping với url
//	Spring 2.0
//	@RequestMapping(value = "login")
//	public ModelAndView showLogin() {
//		ModelAndView mav = new ModelAndView("login");
//		mav.addObject("fresher", new Fresher("BaoNguyen", "Java"));
//		return mav;
//	}

//	SPring 3.0
	@RequestMapping(value = "login")
	public String showLogin(Model model) {
		model.addAttribute("fresher", new Fresher("BaoNguyen", "Java"));
		return "login";
	}
}
