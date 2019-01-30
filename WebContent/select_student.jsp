<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息查询</title>
</head>
<body>
	<center>
    	<h1 style="color:red">学生信息查询</h1>
    	<form action="select_studentdata" method="post">
                <table border="0">
                    <tr>
                        <td>请输入要查找的学生姓名：</td>
                        <td><input type="text" name="student_name"></td>
                    </tr>
                </table>
            <br>
                <input type="submit" value="确认">
            </form>
        	<table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
   			
     			<td>学号</td><td>姓名</td><td>性别</td>
     			<td>年龄</td><td>家庭住址</td><td>电话</td>
     			<td>邮箱</td>
    		</tr>
    		<tr>

				<td>${student.student_id}</td>
				<td>${student.student_name}</td>
				<td>${student.student_sex}</td>
				<td>${student.student_age}</td>
				<td>${student.student_address}</td>
				<td>${student.student_phone}</td>
				<td>${student.student_mailaddress}</td>
			
			</tr>
			</table>
            <form action="teacher.jsp">
                <input type="submit" value="返回" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>