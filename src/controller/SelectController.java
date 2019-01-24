package controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.User;
import service.SelectService;

@Controller
public class SelectController {
	@Autowired(required=false)
	private SelectService selectService;
	@RequestMapping(value="/select_student",method=RequestMethod.POST)
	@ResponseBody
	public List<User> 
	selectByStudent_username(@RequestParam String student_username){
	        try {
	            List<User> list = this.selectService.selectByStudent_username(student_username);
	            return list;
	        } catch (ClassNotFoundException | SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return null;    
	    }

	
}
