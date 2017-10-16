package per.freetalk.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import per.freetalk.common.pojo.ftResult;

@Controller
public class LoginController {
	
	@RequestMapping("/page/login")
	public String showlogin(){
		return "login";
	}
	
	@RequestMapping("/sso/login")
	@ResponseBody
	public ftResult login(){
		
		return ftResult.ok();
	}

}
