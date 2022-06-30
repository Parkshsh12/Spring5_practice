package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.LoginCommand;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping
	public String form(Model model, @ModelAttribute("login")LoginCommand loginCommand) {
		List<String> loginTypes = new ArrayList<String>();
		loginTypes.add("일반회원");
		loginTypes.add("기업회원");
		loginTypes.add("헤드헌터회원");
		model.addAttribute("loginTypes", loginTypes);
		return "login/form";
	}
}
