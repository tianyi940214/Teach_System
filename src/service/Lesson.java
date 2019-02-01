package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;

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
	public static String add_lesson(String lesson_id,String student_name,String student_username) {
		try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from lesson where lesson_id = ?");
            p.setString(1, lesson_id);
            ResultSet rs = p.executeQuery();
            System.out.println("1");
            if(rs.next()) {
                String lesson = rs.getString("lesson");
                String lesson_week = rs.getString("lesson_week");
                String lesson_time = rs.getString("lesson_time");
                String teacher_name = rs.getString("teacher_name");
                PreparedStatement p2 = conn.prepareStatement("select student_id from student where student_name = ? and student_username = ?");
                p2.setString(1, student_name);
                p2.setString(2, student_username);
                ResultSet rs2 = p2.executeQuery();
                System.out.println("2");
                if(rs2.next()) {
                	
                	String student_id = rs2.getString("student_id");
                	try {
						PreparedStatement p4 = conn.prepareStatement("select count(lesson_id) as count from schedule where student_id = ? and lesson_id = ? order by lesson_id");
						p4.setString(1, student_id);
						p4.setString(2, lesson_id);
						ResultSet rs4 = p4.executeQuery();
						System.out.println(rs4);
						System.out.println("3");
						if (rs4.next()) {
							int count = rs4.getInt("count");
							System.out.println(count);
							if (count == 0) {
								System.out.println(student_id);
			                	PreparedStatement p3 = conn.prepareStatement("insert into schedule(lesson,schedule_week,schedule_time,teacher_name,student_id,student_name,lesson_id) values(?,?,?,?,?,?,?)");
			                	p3.setString(1, lesson);
			                	p3.setString(2, lesson_week);
			                	p3.setString(3, lesson_time);
			                	p3.setString(4, teacher_name);
			                	p3.setString(5, student_id);
			                	p3.setString(6, student_name);
			                	p3.setString(7, lesson_id);
			                	boolean rs3 = p3.execute();
			                	System.out.println(rs3);
			                	System.out.println("4");
			                    p.close();
			                    conn.close();
			                    return lesson_id;
							} else {
								return null;
							}
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
                	
                }else {
                	p.close();
	                conn.close();
					return null;
					
				}
                

            }
            }catch (Exception e) {
            e.printStackTrace();
        }
         
		return null;

	}
		
}
