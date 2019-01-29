<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>老师界面</title>
</head>
<body>
	<center>
        <h1 style="color:red">老师界面</h1>
 		<form action="teacher_information.jsp">
 		<input type="submit" value="个人基本信息">
 		</form>
 		<form action="select_student.jsp">
 		<input type="submit" value="学生信息查询">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="课程查询">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="课程进度确认">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="答疑">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="作业确认">
 		</form>
    </center>
</body>
</html>