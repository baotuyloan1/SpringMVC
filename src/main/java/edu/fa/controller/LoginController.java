package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fa.model.Fresher;
import edu.fa.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginSerice;

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
		model.addAttribute("fresher", new Fresher());
		return "login";
	}

//	SPring 3.0
	@RequestMapping(value = "dashboard")
	public String login(@ModelAttribute("fresher") Fresher fresher, Model model) {
		if (loginSerice.login(fresher)) {
			model.addAttribute("fresher", fresher);
			return "dashboard";
		}else {
			return "login";
		}
	}
}
