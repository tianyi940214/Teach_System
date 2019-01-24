package service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.Dao;

public class LoginCheck {
	public static String check(String student_username,String student_password){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from student where student_username=? and student_password=?");
            p.setString(1, student_username);
            p.setString(2, student_password);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                String user_name = rs.getString("student_username");
                Dao.close(rs, p, conn);
                return user_name;
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
	public static String check2(String teacher_username,String teacher_password){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from teacher where teacher_username=? and teacher_password=?");
            p.setString(1, teacher_username);
            p.setString(2, teacher_password);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                String user_name = rs.getString("teacher_username");
                Dao.close(rs, p, conn);
                return user_name;
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
