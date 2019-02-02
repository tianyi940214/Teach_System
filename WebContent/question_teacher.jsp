<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>老师答疑</title>
</head>
<body>
<center>
    	<h1 style="color:red">答疑界面</h1>
        	<table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
   			
     			<td>问题编号</td><td>学生编号</td><td>提问学生</td>
     			<td>提问内容</td><td>提问科目</td><td>任课老师</td><td>答疑内容</td>
    		</tr>
			<c:forEach items="${requestScope.question}" var="question">
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
			<br>
			<br>
			<form action="question_answer" method="post">
 		<table width="300" height = "20" border="0" bordercolor="#A0A0A0">
  	  <tr>
		<th>问题编号：</th>
		<td><input type="text" name="question_id"></td>
 	  </tr>
 	  </table>
 		<label><strong>答疑内容：</strong></label><br>
    <textarea  name="question_answer" cols="50" rows="10"></textarea><br>
    <input type="submit" value="确定"  name="submit" />
 		</form>
            <form action="teacher.jsp">
            <br>
            <br>
                <input type="submit" value="返回" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>