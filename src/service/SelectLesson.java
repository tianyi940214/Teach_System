package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import entity.User;

public class SelectLesson {
	public static List<User> select_lessonStudent(String student_username) throws SQLException{
		List<User> list=new ArrayList<User>();
		Connection conn = Dao.getConnection();
		PreparedStatement p2 = conn.prepareStatement("select student_id from student where student_username = ?");
        p2.setString(1, student_username);
        ResultSet rs2 = p2.executeQuery();
        if (rs2.next()) {
        	try {
                String student_id = rs2.getString("student_id");
                PreparedStatement p = conn.prepareStatement("select * from schedule where student_id = ?");
                p.setString(1, student_id);
                ResultSet rs = p.executeQuery();
                while(rs.next()){
                    User user = new User();
                    user.setLesson(rs.getString("lesson"));
                    user.setSchedule_time(rs.getString("schedule_time"));
                    user.setSchedule_week(rs.getString("schedule_week"));
                    user.setStudent_name(rs.getString("student_name"));
                    user.setTeacher_name(rs.getString("teacher_name"));
                    list.add(user);              
                }
                Dao.close(rs, p, conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        	return list;
		}
		
        return list;
    }
}
