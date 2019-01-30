<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生选课</title>
</head>
<body>
<center>
    	<h1 style="color:red">学生选课</h1>
        	<table border="2" bgcolor="ccceee" width="650">
   			<tr bgcolor="CCCCCC" align="center">
   			
     			<td>课程编号</td><td>课程名称</td><td>课程星期</td>
     			<td>课程时间</td><td>任课老师</td>
    		</tr>
			<c:forEach items="${requestScope.lesson}" var="lessonselect">
    		<tr>
			
				<td>${lessonselect.lesson_id}</td>
				<td>${lessonselect.lesson}</td>
				<td>${lessonselect.lesson_week}</td>
				<td>${lessonselect.lesson_time}</td>
				<td>${lessonselect.teacher_name}</td>
			</tr>
			</c:forEach>
			</table>
            <form action="teacher.jsp">
                <input type="submit" value="返回" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>