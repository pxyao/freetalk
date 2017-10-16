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
			<h1>欢迎注册FreeTalk</h1>
		</div>
		<div class="row">
			<div class="col-md-6">
				<form id="regForm" action="" role="">
					<div class="form-group">
						<label for="">用户名<span style="color: red">*</span>
						</label> <input type="text" class="form-control" id="username"
							placeholder="用户名">
					</div>

					<div class="form-group">
						<label for="">密码<span style="color: red">*</span></label> <input
							type="password" class="form-control" id="password"
							placeholder="密码">
					</div>

					<div class="form-group">
						<label for="">确认密码<span style="color: red">*</span></label> <input
							type="password" class="form-control" id="password"
							placeholder="确认密码">
					</div>

					<div class="form-group">
						<label for="">电话<span style="color: red">*</span></label> <input
							type="text" class="form-control" id="username" placeholder="电话">
					</div>

					<div class="form-group">
						<label for="">邮箱<span style="color: red">*</span></label> <input
							type="text" class="form-control" id="username" placeholder="邮箱">
					</div>

					<div class="form-group">
						<label for="">验证码</label> <input type="text" class="form-control"
							id="validcode" placeholder="验证码">
					</div>

					<div class="form-group">
						<input type="button" class="btn btn-primary" value="注册"
							onclick="javascrtpt:Register()"> <a
							style="text-decoration: none;" id="suctag" href="login.jsp">&nbsp;&nbsp;&nbsp;&nbsp;注册成功，点击返回登录</a>
						<script>
							$(function() {
								$("#suctag").hide();
							});
							function Register() {
								//颜面跳转
								//判断是否成功注册 如果成功了就显示陶砖标签
								$("#suctag").show();
								alert("注册成功");
							}
						</script>
					</div>
				</form>
			</div>
		</div>

	</div>
</body>
</html>