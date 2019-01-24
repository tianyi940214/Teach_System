package controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.LoginCheck;

@Controller
public class LoginController {
	@RequestMapping(value="/login_student",method=RequestMethod.POST)
	public String login(Model model, // ��ǰ̨ҳ�洫��ֵ����model��
            HttpServletRequest request){ // ��ǰ̨ҳ��ȡ�õ�ֵ
        String username = request.getParameter("student_username");
        String password = request.getParameter("student_password");
        String user_name = LoginCheck.check(username, password);
        if(user_name != null && user_name != ""){
            model.addAttribute("msg", user_name);
            return "student";
        }else{
            return "login_student";
        }
	}
	@RequestMapping(value="/login_teacher",method=RequestMethod.POST)
	public String login2(Model model, // ��ǰ̨ҳ�洫��ֵ����model��
            HttpServletRequest request){ // ��ǰ̨ҳ��ȡ�õ�ֵ
        String username = request.getParameter("teacher_username");
        String password = request.getParameter("teacher_password");
        String user_name = LoginCheck.check2(username, password);
        if(user_name != null && user_name != ""){
            model.addAttribute("msg", user_name);
            return "teacher";
        }else{
            return "login_teacher";
        }
	}
}
