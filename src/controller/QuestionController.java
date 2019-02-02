package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.User;
import service.Lesson;
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
	@RequestMapping(value="/select_question",method=RequestMethod.POST)
	public String  select_question(Map<String,Object> map){
			List<User> list = Question.question();
			map.put("question", list);
            return "question_teacher";
	}
	
	@RequestMapping(value="/question_answer",method=RequestMethod.POST)
	public String question_answer(HttpServletResponse response, 
            HttpServletRequest request) throws IOException{
        String question_answer = request.getParameter("question_answer");  
        response.setCharacterEncoding("UTF-8");  
        response.setHeader("Content-type", "text/html;charset=UTF-8");  
        PrintWriter out = null;
        String question_id = request.getParameter("question_id");
        if(question_answer == null || question_answer == ""){
        	out = response.getWriter();  
        	out.print("<script>alert('" + "答疑提交失败，请输入文字" + "');window.location.href='"  
                    + "/Teach_System/teacher.jsp" + "';</script>"); 
        	out.flush();
        }else{
            String user = Question.question_answer(question_answer,question_id);
        	if (user == null || user == "") {
        		out = response.getWriter();  
	        	out.print("<script>alert('" + "请输入正确的问题编号" + "');window.location.href='"  
	                    + "/Teach_System/teacher.jsp" + "';</script>"); 
	        	out.flush();
			} else {
				out = response.getWriter();  
	        	out.print("<script>alert('" + "答疑提交成功" + "');window.location.href='"  
	                    + "/Teach_System/teacher.jsp" + "';</script>"); 
	        	out.flush();  
			}
        	
        }
		return question_answer;
	}
	
	@RequestMapping(value="/question_student",method=RequestMethod.POST)
	public String  question_student(Map<String,Object> map,HttpServletResponse response, 
            HttpServletRequest request){
			String student_name = request.getParameter("student_name");
			List<User> list = Question.question_student(student_name);
			map.put("question_student", list);
            return "question_student";
	}
}

