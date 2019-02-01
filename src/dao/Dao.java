package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
public static Connection getConnection(){
        
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/db_database01?characterEncoding=utf8";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","netcloud");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("���ݿ��������س���");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("���ݿ����");
        }
        return conn;
    }
     //�ر����ͨ��
    public static void close(ResultSet rs,PreparedStatement p,Connection conn)
    {
        try
        {
            if(!rs.isClosed()){
                rs.close();
            }
            if(!p.isClosed()){
                p.close();
            }
            if(!conn.isClosed()){
                conn.close();
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("���ݹرճ���");
        }
    }
    //�ر����ͨ��
    public static void close(PreparedStatement p,Connection conn)
    {
        try
        {
            if(!p.isClosed()){
                p.close();
            }
            if(!conn.isClosed()){
                conn.close();
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("���ݹرճ���");
        }
    }
}
