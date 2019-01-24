package service;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.List;

import dao.Dao;
import entity.User;
public class SelectService {
	 public List<User> selectByStudent_username(String student_username) throws ClassNotFoundException, SQLException{
	        Connection conn = Dao.getConnection();
	        try{
	            Select select = new Select();
	            return select.selectByStudent_username(conn, student_username);
	        }finally{
	            conn.close();
	        }
	    }
}
