package controller;

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
            HttpServletRequest request){
			String lesson = request.getParameter("add_lesson");
			String add_lesson = Lesson.add_lesson(lesson);
				return null;
	}
}
