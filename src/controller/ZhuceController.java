package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.Zhuce;

@Controller
public class ZhuceController {
	@RequestMapping(value="/zhuce_student",method=RequestMethod.POST)
	public String zhuce(HttpServletResponse response, 
            HttpServletRequest request) throws IOException{
        String student_username = request.getParameter("student_username");
        String student_password = request.getParameter("student_password");
        String student_password2 = request.getParameter("student_password2");
        String student_name = request.getParameter("student_name");
        String student_age = request.getParameter("student_age");
        String student_address = request.getParameter("student_address");
        String student_phone = request.getParameter("student_phone");
        String student_mailaddress = request.getParameter("student_mailaddress");
        String student_sex = request.getParameter("student_sex");
        String user = Zhuce.check_student(student_username);
        System.out.println(user);
        response.setCharacterEncoding("UTF-8");  
        response.setHeader("Content-type", "text/html;charset=UTF-8");  
        PrintWriter out = null;
        if(student_username == null || student_username == ""){
        	out = response.getWriter();  
        	out.print("<script>alert('" + "请输入用户名" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
        }else if (student_password == null || student_password == "" || student_password2 == null || student_password2 == "" || !student_password.equals(student_password2) ) {
        	out = response.getWriter();  
        	out.print("<script>alert('" + "请输入正确的密码" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (student_name == null || student_name == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入姓名" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (student_age == null || student_age == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入年龄" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (student_address == null || student_address == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入地址" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (student_phone == null || student_phone == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入电话" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (student_mailaddress == null || student_mailaddress == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入邮箱" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (student_sex == null || student_sex == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入性别" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else if (user != null && user != "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "用户名已存在" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();
		}else{
        	String zhuce_student = Zhuce.zhuce_student(student_username, student_password, 
            		student_name, student_age, student_sex, student_address, student_phone, student_mailaddress);
        	out = response.getWriter();  
        	out.print("<script>alert('" + "注册成功" + "');window.location.href='"  
                    + "/Teach_System/login_student.jsp" + "';</script>"); 
        	out.flush();  
        }
	return null;
	}
	@RequestMapping(value="/zhuce_teacher",method=RequestMethod.POST)
	public String zhuce2(HttpServletResponse response, 
            HttpServletRequest request) throws IOException{
        String teacher_username = request.getParameter("teacher_username");
        String teacher_password = request.getParameter("teacher_password");
        String teacher_password2 = request.getParameter("teacher_password2");
        String teacher_name = request.getParameter("teacher_name");
        String teacher_age = request.getParameter("teacher_age");
        String teacher_address = request.getParameter("teacher_address");
        String teacher_phone = request.getParameter("teacher_phone");
        String teacher_mailaddress = request.getParameter("teacher_mailaddress");
        String teacher_sex = request.getParameter("teacher_sex");
        String user = Zhuce.check_teacher(teacher_username);
        response.setCharacterEncoding("UTF-8");  
        response.setHeader("Content-type", "text/html;charset=UTF-8");  
        PrintWriter out = null;
        if(teacher_username == null || teacher_username == ""){
        	out = response.getWriter();  
        	out.print("<script>alert('" + "请输入用户名" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
        }else if (teacher_password == null || teacher_password == "" || teacher_password2 == null || teacher_password2 == "" || !teacher_password.equals(teacher_password2) ) {
        	out = response.getWriter();  
        	out.print("<script>alert('" + "请输入正确的密码" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (teacher_name == null || teacher_name == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入姓名" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (teacher_age == null || teacher_age == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入年龄" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (teacher_address == null || teacher_address == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入地址" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (teacher_phone == null || teacher_phone == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入电话" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (teacher_mailaddress == null || teacher_mailaddress == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入邮箱" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (teacher_sex == null || teacher_sex == "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "请输入性别" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else if (user != null && user != "") {
			out = response.getWriter();  
        	out.print("<script>alert('" + "用户名已存在" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();
		}else{
        	String zhuce_student = Zhuce.zhuce_teacher(teacher_username, teacher_password, 
        			teacher_name, teacher_age, teacher_sex, teacher_address, teacher_phone, teacher_mailaddress);
        	out = response.getWriter();  
        	out.print("<script>alert('" + "注册成功" + "');window.location.href='"  
                    + "/Teach_System/login_teacher.jsp" + "';</script>"); 
        	out.flush();  
        }
	return null;
	}
}
