package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;











import entity.User;
import service.Lesson;


@Controller
public class LessonController {

	
	@RequestMapping(value="/select_lesson",method=RequestMethod.POST)
	public String  select(Map<String,Object> map){
			List<User> list = Lesson.lesson();
			map.put("lesson", list);
            return "select_lesson";
	}
	@RequestMapping(value="/add_lesson",method=RequestMethod.POST)
	public String add_lesson(HttpServletResponse response, 
            HttpServletRequest request) throws IOException{
			String lesson = request.getParameter("add_lesson");
			String student_name = request.getParameter("student_name");
			String student_username = request.getParameter("student_username");
			String add_lesson = Lesson.add_lesson(lesson,student_name,student_username);
			response.setCharacterEncoding("UTF-8");  
	        response.setHeader("Content-type", "text/html;charset=UTF-8");  
	        PrintWriter out = null;
	        if (add_lesson != null && add_lesson != "") {
	        	out = response.getWriter();  
	        	out.print("<script>alert('" + "选课成功" + "');window.location.href='"  
	                    + "/Teach_System/student.jsp" + "';</script>"); 
	        	out.flush();
			} else {
				out = response.getWriter();  
	        	out.print("<script>alert('" + "选课失败，请输入正确的姓名或检查是否已选过" + "');window.location.href='"  
	                    + "/Teach_System/student.jsp" + "';</script>"); 
	        	out.flush();
			}
				return null;
	}
}
