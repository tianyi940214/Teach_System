package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import dao.Dao;
import entity.User;

public class Select {
	public static User select(String student_username){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from student where student_username=?");
            p.setString(1, student_username);
            ResultSet rs = p.executeQuery();
            if(rs.next()){

                String student_id = rs.getString("student_id");
                String student_name = rs.getString("student_name");
                String student_sex = rs.getString("student_sex");
                String student_age = rs.getString("student_age");
                String student_address = rs.getString("student_address");
                String student_phone = rs.getString("student_phone");
                String student_mailaddress = rs.getString("student_mailaddress");
                User user = new User(student_id, student_name, student_sex, student_age, student_address, student_phone, student_mailaddress);
                Dao.close(rs, p, conn);
                System.out.println(student_id);
                System.out.println(student_name);
                System.out.println(student_sex);
                System.out.println(student_age);
                System.out.println(student_address);
                System.out.println(student_phone);
                System.out.println(student_mailaddress);
                System.out.println(user);
                return user;

                
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	public static User select1(String teacher_username){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from teacher where teacher_username=?");
            p.setString(1, teacher_username);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                String teacher_id = rs.getString("teacher_id");
                String teacher_name = rs.getString("teacher_name");
                String teacher_sex = rs.getString("teacher_sex");
                String teacher_age = rs.getString("teacher_age");
                String teacher_address = rs.getString("teacher_address");
                String teacher_phone = rs.getString("teacher_phone");
                String teacher_mailaddress = rs.getString("teacher_mailaddress");
                String teacher_password = rs.getString("teacher_password");
                User user = new User(teacher_id,teacher_name,teacher_sex,teacher_age,teacher_address,teacher_phone,teacher_mailaddress,teacher_password);
                Dao.close(rs, p, conn);
                System.out.println(teacher_id);
                System.out.println(teacher_name);
                System.out.println(teacher_sex);
                System.out.println(teacher_age);
                System.out.println(teacher_address);
                System.out.println(teacher_phone);
                System.out.println(teacher_mailaddress);
                System.out.println(teacher_password);
                System.out.println(user);
                return user;

                
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	public static User select2(String student_name){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from student where student_name=?");
            p.setString(1, student_name);
            ResultSet rs = p.executeQuery();
            if(rs.next()){

                String student_id = rs.getString("student_id");
                String student_sex = rs.getString("student_sex");
                String student_age = rs.getString("student_age");
                String student_address = rs.getString("student_address");
                String student_phone = rs.getString("student_phone");
                String student_mailaddress = rs.getString("student_mailaddress");
                User user = new User(student_id, student_name, student_sex, student_age, student_address, student_phone, student_mailaddress);
                Dao.close(rs, p, conn);
                System.out.println(student_id);
                System.out.println(student_name);
                System.out.println(student_sex);
                System.out.println(student_age);
                System.out.println(student_address);
                System.out.println(student_phone);
                System.out.println(student_mailaddress);
                System.out.println(user);
                return user;

                
            }
            Dao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}