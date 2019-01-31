package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.Dao;

public class Zhuce {
	public static String zhuce_student(String student_username,String student_password,
			String student_name,String student_age,String student_sex,String student_address,
			String student_phone,String student_mailaddress){
		try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("insert into student(student_username,student_password,student_name,student_age,student_sex,student_address,student_phone,student_mailaddress) values(?,?,?,?,?,?,?,?)");
            p.setString(1, student_username);
            p.setString(2, student_password);
            p.setString(3, student_name);
            p.setString(4, student_age);
            p.setString(5, student_sex);
            p.setString(6, student_address);
            p.setString(7, student_phone);
            p.setString(8, student_mailaddress);
            boolean rs = p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
	public static String check_student(String student_username){
		try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from student where student_username = ?");
            p.setString(1, student_username);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                String user = rs.getString("student_username");
                System.out.println(user);
                Dao.close(rs, p, conn);
                return user;
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	public static String zhuce_teacher(String teacher_username,String teacher_password,
			String teacher_name,String teacher_age,String teacher_sex,String teacher_address,
			String teacher_phone,String teacher_mailaddress){
		try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("insert into teacher(teacher_username,teacher_password,teacher_name,teacher_age,teacher_sex,teacher_address,teacher_phone,teacher_mailaddress) values(?,?,?,?,?,?,?,?)");
            p.setString(1, teacher_username);
            p.setString(2, teacher_password);
            p.setString(3, teacher_name);
            p.setString(4, teacher_age);
            p.setString(5, teacher_sex);
            p.setString(6, teacher_address);
            p.setString(7, teacher_phone);
            p.setString(8, teacher_mailaddress);
            boolean rs = p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
	public static String check_teacher(String teacher_username){
		try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from teacher where teacher_username = ?");
            p.setString(1, teacher_username);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                String user = rs.getString("teacher_username");
                System.out.println(user);
                Dao.close(rs, p, conn);
                return user;
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
}
