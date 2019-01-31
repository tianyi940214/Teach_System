package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import entity.User;

public class Lesson {
	public static List<User> lesson(){
		List<User> list=new ArrayList<User>();
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from lesson");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setLesson_id(rs.getString("lesson_id"));
                user.setLesson(rs.getString("lesson"));
                user.setLesson_week(rs.getString("lesson_week"));
                user.setLesson_time(rs.getString("lesson_time"));
                user.setTeacher_name(rs.getString("teacher_name"));
                list.add(user);     
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
	public static String add_lesson(String lesson_id) {
		try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from lesson where lesson_id = ?");
            p.setString(1, lesson_id);
            ResultSet rs = p.executeQuery();
            if(rs.next()) {
                String lesson = rs.getString("lesson_id");
                String lesson_week = rs.getString("lesson_week");
                String lesson_time = rs.getString("lesson_time");
                String teacher_name = rs.getString("teacher_name");
                PreparedStatement p2 = conn.prepareStatement("");
                p.close();
                conn.close();
                return student_id;
            }
            }catch (Exception e) {
            e.printStackTrace();
        }
         
		
		return null;
	}
		
}
