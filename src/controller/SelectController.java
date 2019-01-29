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
	public ModelAndView  select( // ��ǰ̨ҳ�洫��ֵ����model��
            HttpServletRequest request){ // ��ǰ̨ҳ��ȡ�õ�ֵ
        	String username = request.getParameter("student_username");
        	User student = Select.select(username);
        	System.out.println(student);
        	ModelAndView modelAndView = new ModelAndView();
        	modelAndView.addObject("student", student);
            modelAndView.setViewName("student_information");
            return modelAndView;
	}
	@RequestMapping(value="/select_teacher",method=RequestMethod.POST)
	public ModelAndView  select1( // ��ǰ̨ҳ�洫��ֵ����model��
            HttpServletRequest request){ // ��ǰ̨ҳ��ȡ�õ�ֵ
        	String username = request.getParameter("teacher_username");
        	System.out.println(username);
        	User teacher = Select.select1(username);
        	System.out.println(teacher);
        	ModelAndView modelAndView = new ModelAndView();
        	modelAndView.addObject("teacher", teacher);
            modelAndView.setViewName("teacher_information");
            return modelAndView;
	}
	@RequestMapping(value="/select_studentdata",method=RequestMethod.POST)
	public ModelAndView  select2( // ��ǰ̨ҳ�洫��ֵ����model��
            HttpServletRequest request){ // ��ǰ̨ҳ��ȡ�õ�ֵ
        	String username = request.getParameter("student_name");
        	User student = Select.select2(username);
        	System.out.println(student);
        	ModelAndView modelAndView = new ModelAndView();
        	modelAndView.addObject("student", student);
            modelAndView.setViewName("select_student");
            return modelAndView;
	}

}
