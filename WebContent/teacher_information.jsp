<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>老师个人基本信息</title>
</head>
<body>
	<center>
    	<h1 style="color:red">老师个人基本信息</h1>
    	<form action="select_teacher" method="post">
                <table border="0">
                    <tr>
                        <td>请再次输入您的账号：</td>
                        <td><input type="text" name="teacher_username"></td>
                    </tr>
                </table>
            <br>
                <input type="submit" value="确认">
            </form>
        	<table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
   			
     			<td>教师编号</td><td>姓名</td><td>性别</td>
     			<td>年龄</td><td>家庭住址</td><td>电话</td>
     			<td>邮箱</td>
    		</tr>
    		<tr>

				<td>${teacher.teacher_id}</td>
				<td>${teacher.teacher_name}</td>
				<td>${teacher.teacher_sex}</td>
				<td>${teacher.teacher_age}</td>
				<td>${teacher.teacher_address}</td>
				<td>${teacher.teacher_phone}</td>
				<td>${teacher.teacher_mailaddress}</td>
			
			</tr>
			</table>
            <form action="teacher.jsp">
                <input type="submit" value="返回" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>