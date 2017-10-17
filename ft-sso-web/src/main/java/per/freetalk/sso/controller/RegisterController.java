package per.freetalk.sso.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import per.freetalk.common.pojo.ftResult;
import per.freetalk.pojo.FtUser;
import per.freetalk.sso.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/page/register")
	public String showReg(){
		return "register";
	}
	
	@RequestMapping("/sso/register")
	@ResponseBody
	public ftResult regist(FtUser user){
		ftResult result = null;
		if (user.getUsername() != null && user.getPassword() != null) {
			/*
			 * TODO 此处校验邮箱 电话 的合法性  为了方便测试。暂时未完成
			 */
			user.setCreated(new Date());
			result = registerService.regist(user);
		}
		return result;
	}
}
