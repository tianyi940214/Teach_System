package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class Select {
	public List<User> selectByStudent_username(Connection conn, String student_username)throws SQLException{

		String sql = "select * from student where student_username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, student_username);
        ResultSet rs = ps.executeQuery();
        List<User> list = new ArrayList<User>();
        User entity = null;
        while (rs.next()) {
            // 创建Entity的实例，可以保存结果集中的一行数据
            entity = new User();
            // 将结果集当前行指定列的数据存入Entity类实例对应的成员变量中
            entity.setStudent_id(rs.getString("student_id"));
            entity.setStudent_name(rs.getString("student_name"));
            entity.setStudent_sex(rs.getString("student_sex"));
            entity.setStudent_age(rs.getString("student_age"));
            entity.setStudent_address(rs.getString("student_address"));
            entity.setStudent_phone(rs.getString("student_phone"));
            entity.setStudent_mailaddress(rs.getString("student_mailaddress"));
            //将封装后的Entity实例添加到List集合中
            list.add(entity);
        }
        return list;
    }
}