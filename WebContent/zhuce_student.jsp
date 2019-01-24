<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>学生注册界面</title>
</head>
<body>
<center>
        <h1 style="color:red">学生注册界面</h1>
        <table width="300" height = "180" border="5" bordercolor="#A0A0A0">
  	  <tr>
		<th>用户名：</th>
		<td><input type="text" name="username" value="输入16个字符以内" maxlength = "16" onfocus = "if(this.value == '输入16个字符以内') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>输入密码：</th>
 		<td><input type="text" name="password" value="输入20个字符以内" maxlength = "20" onfocus = "if(this.value == '输入20个字符以内') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>确认密码：</th>
 		<td><input type="text" name="newword" value="重新输入密码" maxlength = "20" onfocus = "if(this.value == '重新输入密码') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>姓名：</th>
 		<td><input type="text" name="name" value="请输入姓名" maxlength = "20" onfocus = "if(this.value == '请输入姓名') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>年龄：</th>
 		<td><input type="text" name="age" value="请输入年龄" maxlength = "3" onfocus = "if(this.value == '请输入年龄') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>家庭住址：</th>
 		<td><input type="text" name="age" value="请输入住址" maxlength = "30" onfocus = "if(this.value == '请输入住址') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>电话：</th>
 		<td><input type="text" name="age" value="请输入电话" maxlength = "3" onfocus = "if(this.value == '请输入电话') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>邮箱：</th>
 		<td><input type="text" name="age" value="请输入邮箱" maxlength = "3" onfocus = "if(this.value == '请输入邮箱') this.value =''"></td>
 	  </tr>
 	  <tr>
 		<th>性别：</th>
 		<td><input type="radio" name="sex" value="man" checked="checked">男
 		<input type="radio" name="sex" value="woman">女</td>
 	  </tr>
 	  
	  <tr>
 		<td colspan = "2" align = "center">
 		  <input type="submit" value="注  册">    
 		  <input type="reset" value="重  置">
 		</td>
	  </tr>
	</table>	
</center>
</body>
</html>