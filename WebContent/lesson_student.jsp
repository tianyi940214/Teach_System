<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息查询</title>
</head>
<body>
	<center>
    	<h1 style="color:red">课程查询</h1>
    	<form action="select_lessonStudent" method="post">
                <table border="0">
                    <tr>
                        <td>请输入要查找的用户名：</td>
                        <td><input type="text" name="student_username"></td>
                    </tr>
                </table>
            <br>
                <input type="submit" value="确认">
            </form>
        	<table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
   			
     			<td>课程名称</td><td>课程星期</td><td>课程时间</td>
     			<td>任课老师</td><td>学生姓名</td>
    		</tr>
    		<c:forEach items="${requestScope.lesson_SelectStudent}" var="lesson_student">
    		<tr>

				<td>${lesson_student.lesson}</td>
				<td>${lesson_student.schedule_week}</td>
				<td>${lesson_student.schedule_time}</td>
				<td>${lesson_student.teacher_name}</td>
				<td>${lesson_student.student_name}</td>	
			</c:forEach>
			</table>
            <form action="student.jsp">
                <input type="submit" value="返回" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>