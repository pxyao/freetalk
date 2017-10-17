package per.freetalk.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import per.freetalk.common.pojo.ftResult;
import per.freetalk.sso.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("")
	public String showlogin(){
		return "login";
	}
	
	@RequestMapping("/sso/login")
	@ResponseBody
	public ftResult login(String username,String password){
		if (username != null && password != null) {
			return loginService.login(username, password);
		}
		return ftResult.build(203, "用户名，密码不能为空");
	}

}
