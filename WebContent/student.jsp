<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>学生界面</title>
</head>
<body>
	<center>
        <h1 style="color:red">学生界面</h1>
 		<form action="student_information.jsp">
 		<input type="submit" value="个人基本信息">
 		</form>
 		<form action="select_lesson" method="post">
 		<input type="submit" value="课程选择">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="课程查询">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="课程学习">
 		</form>
 		<form action="question_student.jsp">
 		<input type="submit" value="提问">
 		</form>
 		<form action="login_student" method="post">
 		<input type="submit" value="作业上传">
 		</form>
    </center>
</body>
</html>