package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.Question;

@Controller
public class QuestionController {
	@RequestMapping(value="/questiondata",method=RequestMethod.POST)
	public String login(HttpServletResponse response, // 向前台页面传的值放入model中
            HttpServletRequest request) throws IOException{ // 从前台页面取得的值
        String questiondata = request.getParameter("questiondata");
        System.out.println(questiondata);
        String question = Question.questionSave(questiondata);
        response.setCharacterEncoding("UTF-8");  
        response.setHeader("Content-type", "text/html;charset=UTF-8");  
        PrintWriter out = null;
        
        if(questiondata != null && questiondata != ""){
        	out = response.getWriter();  
        	out.print("<script>alert('" + "问题提交成功" + "');window.location.href='"  
                    + "/Teach_System/question.jsp" + "';</script>"); 
        	out.flush();
        }else{
        	out = response.getWriter();  
        	out.print("<script>alert('" + "问题提交失败" + "');window.location.href='"  
                    + "/Teach_System/question.jsp" + "';</script>"); 
        	out.flush();  
        }
	return null;
	}
}

