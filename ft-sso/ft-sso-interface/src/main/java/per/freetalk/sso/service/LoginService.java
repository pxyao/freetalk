package per.freetalk.sso.service;

import per.freetalk.common.pojo.ftResult;

public interface LoginService {
	public ftResult login(String username,String password);
}
