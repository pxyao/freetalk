<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FreeTalk注册</title>
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<script src="/js/jquery-2.1.1.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/holder.min.js"></script>
</head>
	<body>
		<div class="container">
			<div class="row">
				<h1>欢迎注册FreeTalk</h1></div>
			<div class="row">
				<div class="col-md-6">
					<form id="regForm" action="" role="">
						<div class="form-group">
							<label for="">用户名<span style="color:red">*</span> </label>
							<div id="username_div" class="row">
								<div class="col-md-7">
									<input id="username" name="username" type="text" class="form-control" id="username" placeholder="用户名">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="">密码<span style="color:red">*</span></label>
							<div id="password_div" class="row">
								<div class="col-md-7">
									<input id="password" name="password" type="password" class="form-control" id="password" placeholder="密码">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="">确认密码<span style="color:red">*</span></label>
							<div id="repassword_div" class="row">
								<div class="col-md-7">
									<input id="repassword" type="password" class="form-control" id="password" placeholder="确认密码">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="">电话<span style="color:red">*</span></label>
							<div id="phone_div" class="row">
								<div class="col-md-7">
									<input id="phone" name="phone" type="text" class="form-control" id="username" placeholder="电话">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="">邮箱<span style="color:red">*</span></label>
							<div id="email_div" class="row">
								<div class="col-md-7">
									<input id="email" name="email" type="text" class="form-control" id="username" placeholder="邮箱">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="">验证码</label>
							<div id="validatecode_div" class="row">
								<div class="col-md-7">
									<input id="validatecode" type="text" class="form-control" id="validcode" placeholder="验证码">
								</div>
							</div>
						</div>

						<div id="reg_btn_div" class="form-group">
							<input type="button" class="btn btn-primary" value="注册" onclick="javascrtpt:Register()">
							<script>
								function Register() {
									var REGIST = {
										checkInput: function() {
											var error=false;
											var repassword = $("#repassword").val();
											var phone = $("#phone").val();
											var email = $("#email").val();
											var validatecode = $("#validatecode").val();
											if($("#username").val() == "") {
												$("#username_div").append("<div id='username_tag' class='col-md-5'><div class='alert alert-danger' id='usernameErr'>用户名不能为空<div></div>");
												error=true;
											}
											if($("#password").val() == "") {
												$("#password_div").append("<div id='password_tag' class='col-md-5'><div class='alert alert-danger' id='passwordErr'>密码不能为空<div></div>");
												error=true;
											}
											if($("#password").val() != $("#repassword").val()) {
												$("#repassword_div").append("<div id='repassword_tag' class='col-md-5'><div class='alert alert-danger' id='passwordErr'>两次密码不一致<div></div>");
												error=true;
											}
											if($("#username").val() != "" && ($("#username").val().length < 5 || $("#username").val().length > 20)) {
												$("#username_tag").remove();
												$("#username_div").append("<div id='username_tag' class='col-md-5'><div class='alert alert-danger' id='usernameErr'>用户名长度不正确<div></div>");
												error=true;
											}
											var pho = /^1[3|4|5|8][0-9]\d{4,8}$/;
											if(!pho.test($("#phone").val())) {
												$("#phone_div").append("<div id='phone_tag' class='col-md-5'><div class='alert alert-danger' id='passwordErr'>手机号格式不正确<div></div>");
												error=true;
											}
											var em = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
											if(!em.test($("#email").val())) {
												$("#email_div").append("<div id='email_tag' class='col-md-5'><div class='alert alert-danger' id='passwordErr'>手机号格式不正确<div></div>");
												error=true;
											}
											return error;
										}
									};
									//首先删除所有错误标签
									$("#username_tag").remove();
									$("#password_tag").remove();
									$("#phone_tag").remove();
									$("#email_tag").remove();
									$("#suctag").remove();
									
									if(!REGIST.checkInput()){
										alert("前台校验成功提交表单");
										$.post("/sso/register",
											$("#regForm").serialize(),
											function(data){
												if(data.status==200){
													alert("注册成功,系統已经给您的邮箱发送了一封邮件，请查收！");
													//判断是否成功注册 如果成功了就显示标签
													$("#reg_btn_div").append("<a style='text-decoration: none;' id='suctag' href='http://localhost:8081'>&nbsp;&nbsp;&nbsp;&nbsp;注册成功，点击返回登录</a>");
												}else{
													alert(data.msg);
												}
											});
									}
								}
							</script>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>

</html>