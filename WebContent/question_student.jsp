<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生提问</title>
</head>
<body>
	<center>
		
        <h1 style="color:red">学生提问界面</h1>
        <form action="question_student" method="post">
					
					请输入您的姓名：
					<input type="text" name="student_name">
			 		<input type="submit" value="确认">
			 </form>
        <table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
   			
     			<td>问题编号</td><td>学生编号</td><td>提问学生</td>
     			<td>提问内容</td><td>提问科目</td><td>任课老师</td><td>答疑内容</td>
    		</tr>
			<c:forEach items="${requestScope.question_student}" var="question">
    		<tr>
			
				<td>${question.question_id}</td>
				<td>${question.student_id}</td>
				<td>${question.student_name}</td>
				<td>${question.question}</td>
				<td>${question.lesson}</td>
				<td>${question.teacher_name}</td>
				<td>${question.answer}</td>
			</c:forEach>
			</table>
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