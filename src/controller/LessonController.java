package controller;

import java.util.List;
import java.util.Map;

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
}
