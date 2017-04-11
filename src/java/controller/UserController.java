package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("user/form")
	public String showForm() {
		return "user/login";
	}
	
	@RequestMapping("user/login")
	public String login2(ModelMap model, HttpServletRequest request) {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		if(user.equals("PS04375") && pass.equals("123")){
			model.addAttribute("name", user);
			model.addAttribute("pass", pass);
			return "user/info";
		}
		model.addAttribute("message", "Tài khoản hoặc mật khẩu không đúng!");
		return "user/login";
	}
}
