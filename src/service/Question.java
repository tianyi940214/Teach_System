package service;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import entity.User;

public class Question {
	public static String dataSave(String student_name,String lesson,String teacher_name,String questiondata){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select student_id from schedule where student_name = ? and lesson = ?");
            p.setString(1, student_name);
            p.setString(2, lesson);
            ResultSet rs = p.executeQuery();
            System.out.println("rs"+rs);
            if(rs.next()) {
            String student_id = rs.getString("student_id");
            PreparedStatement p2 = conn.prepareStatement("insert into question(student_id,student_name,lesson,teacher_name,question) values(?,?,?,?,?)");
            p2.setString(1, student_id);
            p2.setString(2, student_name);
            p2.setString(3, lesson);
            p2.setString(4, teacher_name);
            p2.setString(5, questiondata);
            boolean rs2 = p2.execute();
            p.close();
            conn.close();
            return student_id;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
	public static List<User> question(){
		List<User> list=new ArrayList<User>();
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from question group by teacher_name");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setQuestion_id(rs.getString("question_id"));
                user.setStudent_name(rs.getString("student_name"));
                user.setQuestion(rs.getString("question"));
                user.setLesson(rs.getString("lesson"));
                user.setStudent_id(rs.getString("student_id"));
                user.setTeacher_name(rs.getString("teacher_name"));
                user.setAnswer(rs.getString("answer"));
                list.add(user);     
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
	public static String question_answer(String question_answer,String question_id){
		try {
			Connection conn = Dao.getConnection();
			PreparedStatement p = conn.prepareStatement("update question set answer = ? where question_id = ?");
			p.setString(1, question_answer);
			p.setString(2, question_id);
			 boolean rs = p.execute();
	            p.close();
	            conn.close();
	            return question_id;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		}
	public static List<User> question_student(String student_name){
		List<User> list=new ArrayList<User>();
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from question where student_name = ?");
            p.setString(1, student_name);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setQuestion_id(rs.getString("question_id"));
                user.setStudent_name(rs.getString("student_name"));
                user.setQuestion(rs.getString("question"));
                user.setLesson(rs.getString("lesson"));
                user.setStudent_id(rs.getString("student_id"));
                user.setTeacher_name(rs.getString("teacher_name"));
                user.setAnswer(rs.getString("answer"));
                list.add(user);     
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
}
}