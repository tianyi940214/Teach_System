<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>学生个人基本信息</title>
</head>
<body>
	<center>
    	<h1 style="color:red">学生个人基本信息</h1>
        	<table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
     			<td>学号</td><td>姓名</td><td>性别</td>
     			<td>年龄</td><td>家庭住址</td><td>电话</td>
     			<td>邮箱</td><td>课程</td>
    		</tr>

    		<tr>
				<td>${entity.student_id }</td>
				<td>${entity.student_name  }</td>
				<td>${entity.student_sex  }</td>
				<td>${entity.student_age  }</td>
				<td>${entity.student_address  }</td>
				<td>${entity.student_phone  }</td>
				<td>${entity.student_mailaddress  }</td>
			
			</tr>
			</table>
            <form action="student.jsp">
                <input type="submit" value="返回" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>