<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录FreeTalk</title>
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<script src="/js/jquery-2.1.1.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/holder.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<style>
.container {
	margin-top: 100px;
}
</style>

<div class="container">
			<div class="row">
				<div class="col-md-6">
					<img src="holder.js/100px350" />
				</div>
				<div class="col-md-4">
					<form id="logForm" action="page/login" method="post">
						<div class="form-group">
							<label for="">用户名</label>
							<input name="username" type="text" class="form-control" id="username" placeholder="用户名">
						</div>
						
						<div class="form-group">
							<label for="">密码</label>
							<input name="password" type="password" class="form-control" id="password" placeholder="密码">
						</div>

						<div class="form-group">
							<label for="">验证码</label>
							<input name="validateCode" type="text" class="form-control" id="validcode" placeholder="验证码">
						</div>
						
						<div class="form-group">
							<button id="login_btn" type="button" class="btn btn-primary">登录</button>
							<button id="reg_btn" type="button" class="btn btn-primary">注册</button>
						<script>
							var LOGIN = {
								checkInput:function() {
									var un = $("#username").val();
									var pd = $("#password").val();
									if(un == ""){
										alert("用户名不能为空");
										return false;
									}
									if(pd == ""){
										alert("密码不能为空");
										return false;
									}
									if(un.length<=3){
										alert("用户名长度不正确")
										return false;
									}
									if(pd.length<=3){
										alert("密码长度不正确")
										return false;
									}
									return true;
								}
							};
							
							$("#login_btn").click(function(){
								//校验用户名密码是否合法
								var un = $("#username").val();
								var pd = $("#password").val();
								if(LOGIN.checkInput()){
									alert("后台校验");
									$.post("/sso/login",
											$("#logForm").serialize(),
											function(data){
												if(data.status==200){
													alert("正确");
												}
											});
								}
							});
							
							$("#reg_btn").click(function(){
								location.href="/page/register";
							});
							

						</script>
						</div>
					</form>
				</div>
			</div>

		</div>
	</body>


</html>