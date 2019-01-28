package controller;






import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.User;
import service.Select;
@Controller
public class SelectController {
	@RequestMapping(value="/select_student",method=RequestMethod.POST)
	public ModelAndView  select( // 向前台页面传的值放入model中
            HttpServletRequest request){ // 从前台页面取得的值
        	String username = request.getParameter("student_username");
        	User student = Select.select(username);
        	System.out.println(student);
        	ModelAndView modelAndView = new ModelAndView();
        	modelAndView.addObject("student", student);
            modelAndView.setViewName("student_information");
            return modelAndView;
	}
	@RequestMapping(value="/select_teacher",method=RequestMethod.POST)
	public ModelAndView  select1( // 向前台页面传的值放入model中
            HttpServletRequest request){ // 从前台页面取得的值
        	String username = request.getParameter("teacher_username");
        	System.out.println(username);
        	User teacher = Select.select1(username);
        	System.out.println(teacher);
        	ModelAndView modelAndView = new ModelAndView();
        	modelAndView.addObject("teacher", teacher);
            modelAndView.setViewName("teacher_information");
            return modelAndView;
	}

}
