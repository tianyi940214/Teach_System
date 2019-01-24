<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>老师登录界面</title>
</head>
<body>
	<center>
        <h1 style="color:red">教育信息管理系统老师登录界面</h1>
            <form action="login_teacher" method="post">
                <table border="0">
                    <tr>
                        <td>账号：</td>
                        <td><input type="text" name="teacher_username"></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="teacher_password">
                        </td>
                    </tr>
                </table>
            <br>
                <input type="submit" value="登录">
            </form>
            <form action="zhuce_teacher.jsp">
                <input type="submit" value="注册">
            </form>
    </center>
</body>
</html>