package per.freetalk.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.remoting.exchange.Request;

import per.freetalk.common.pojo.ftResult;
import per.freetalk.common.utils.CookieUtils;
import per.freetalk.sso.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("")
	public String showlogin() {
		return "login";
	}

	@RequestMapping(value="/sso/login",method=RequestMethod.POST)
	@ResponseBody
	public ftResult login(String username, String password, HttpServletRequest request, HttpServletResponse response) {
		if (username != null && password != null) {
			ftResult result = loginService.login(username, password);
			//把登录令牌放到cookie中
			if (result.getStatus()==200) {
				CookieUtils.setCookie(request, response, "COOKIE_TOKEN", result.getData().toString());
			}
			return result;
		}
		return ftResult.build(203, "用户名，密码不能为空");
	}
}
