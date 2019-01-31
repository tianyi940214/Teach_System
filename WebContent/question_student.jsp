<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生提问</title>
</head>
<body>
	<center>
        <h1 style="color:red">学生提问界面</h1>
 		<form action="questiondata" method="post">
 		<table width="300" height = "20" border="0" bordercolor="#A0A0A0">
  	  <tr>
		<th>姓名：</th>
		<td><input type="text" name="student_name"></td>
 	  </tr>
 	  <tr>
		<th>课程名称：</th>
		<td><input type="text" name="lesson"></td>
 	  </tr>
 	  <tr>
		<th>任课老师：</th>
		<td><input type="text" name="teacher_name"></td>
 	  </tr>
 	  </table>
 		<label><strong>提问内容：</strong></label><br>
    <textarea  name="questiondata" cols="50" rows="10"></textarea><br>
    <input type="submit" value="确定"  name="submit" />
 		</form>
    </center>
</body>
</html>