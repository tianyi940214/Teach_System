package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.SelectLesson;
import entity.User;

@Controller
public class SelectLessonController {
	@RequestMapping(value="/select_lessonStudent",method=RequestMethod.POST)
	public String  select(Map<String,Object> map,HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException{
			String student_username = request.getParameter("student_username");
			response.setCharacterEncoding("UTF-8");  
	        response.setHeader("Content-type", "text/html;charset=UTF-8");  
	        PrintWriter out = null;
			List<User> list = SelectLesson.select_lessonStudent(student_username);
			if (list != null && list.size() != 0) {
				map.put("lesson_SelectStudent", list);
	            return "lesson_student";
			} else {
				out = response.getWriter();  
	        	out.print("<script>alert('" + "输入的用户名有误或暂时还没有选课" + "');window.location.href='"  
	                    + "/Teach_System/question_student.jsp" + "';</script>"); 
	        	out.flush();
			}
			return "lesson_student";
			
	}
}