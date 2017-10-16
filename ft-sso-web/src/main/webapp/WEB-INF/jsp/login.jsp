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

<body>

	<div class="container">
			<div class="row">
				<div class="col-md-6">
					<img src="holder.js/100px350" />
				</div>
				<div class="col-md-4">
					<form id="logForm" action="" role="form">
						<div class="form-group">
							<label for="">用户名</label>
							<input type="text" class="form-control" id="username"
							placeholder="用户名">
						</div>
						
						<div class="form-group">
							<label for="">密码</label>
							<input type="password" class="form-control" id="password"
							placeholder="密码">
						</div>

						<div class="form-group">
							<label for="">验证码</label>
							<input type="text" class="form-control" id="validcode"
							placeholder="验证码">
						</div>
						
						<div class="form-group">
							<input type="button" class="btn btn-primary" value="登录">
							<input type="button" class="btn btn-primary" value="注册"
							onclick="javascrtpt:toReg()">
						<script>
							function toReg() {
								//颜面跳转
								location.href = "/page/register";
							}
						</script>
						</div>
					</form>
				</div>
			</div>

		</div>
</body>


</html>