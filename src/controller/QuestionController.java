package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.User;
import service.Question;

@Controller
public class QuestionController {
	@RequestMapping(value="/questiondata",method=RequestMethod.POST)
	public String question(HttpServletResponse response, 
            HttpServletRequest request) throws IOException{
        String questiondata = request.getParameter("questiondata");
        System.out.println(questiondata);     
        response.setCharacterEncoding("UTF-8");  
        response.setHeader("Content-type", "text/html;charset=UTF-8");  
        PrintWriter out = null;
        String student_name = request.getParameter("student_name");
        String lesson = request.getParameter("lesson");
        String teacher_name = request.getParameter("teacher_name");
        System.out.println(student_name + lesson + teacher_name);
        if(questiondata == null || questiondata == ""){
        	out = response.getWriter();  
        	out.print("<script>alert('" + "问题提交失败，请输入文字" + "');window.location.href='"  
                    + "/Teach_System/question_student.jsp" + "';</script>"); 
        	out.flush();
        }else{
            String user = Question.dataSave(student_name, lesson, teacher_name,questiondata);
        	if (user == null || user == "") {
        		out = response.getWriter();  
	        	out.print("<script>alert('" + "请检查姓名，课程和任课老师是否填写正确" + "');window.location.href='"  
	                    + "/Teach_System/question_student.jsp" + "';</script>"); 
	        	out.flush();
			} else {
				out = response.getWriter();  
	        	out.print("<script>alert('" + "问题提交成功" + "');window.location.href='"  
	                    + "/Teach_System/question_student.jsp" + "';</script>"); 
	        	out.flush();  
			}
        	
        }
	return null;
	}
}

