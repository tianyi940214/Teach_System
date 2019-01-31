<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生注册界面</title>
</head>
<body>
<center>
        <h1 style="color:red">学生注册界面</h1>
        <form action="zhuce_student" method="post">
        <table width="300" height = "180" border="5" bordercolor="#A0A0A0">
  	  <tr>
		<th>用户名：</th>
		<td><input type="text" name="student_username" maxlength = "16" ></td>
 	  </tr>
 	  <tr>
 		<th>输入密码：</th>
 		<td><input type="text" name="student_password" maxlength = "20"></td>
 	  </tr>
 	  <tr>
 		<th>确认密码：</th>
 		<td><input type="text" name="student_password2" maxlength = "20"></td>
 	  </tr>
 	  <tr>
 		<th>姓名：</th>
 		<td><input type="text" name="student_name" maxlength = "20"></td>
 	  </tr>
 	  <tr>
 		<th>年龄：</th>
 		<td><input type="text" name="student_age" maxlength = "3"></td>
 	  </tr>
 	  <tr>
 		<th>家庭住址：</th>
 		<td><input type="text" name="student_address" maxlength = "30"></td>
 	  </tr>
 	  <tr>
 		<th>电话：</th>
 		<td><input type="text" name="student_phone" maxlength = "30"></td>
 	  </tr>
 	  <tr>
 		<th>邮箱：</th>
 		<td><input type="text" name="student_mailaddress" maxlength = "30"></td>
 	  </tr>
 	  <tr>
 		<th>性别：</th>
 		<td><input type="radio" name="student_sex" value="man" checked="checked">男
 		<input type="radio" name="student_sex" value="woman">女</td>
 	  </tr>
 	  
	  <tr>
 		<td colspan = "2" align = "center">
 		  <input type="submit" value="注  册">    
 		  <input type="reset" value="重  置">
 		</td>
	  </tr>
	</table>	
	</form>
</center>
</body>
</html>