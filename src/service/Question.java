package service;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;

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
}
