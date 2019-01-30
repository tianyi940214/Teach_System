package service;

import java.sql.Connection;
import java.sql.PreparedStatement;


import dao.Dao;

public class Question {
	public static String questionSave(String question){
        try {
            Connection conn = Dao.getConnection();
            PreparedStatement p = conn.prepareStatement("insert into question(question) values(?)");
            p.setString(1, question);
            boolean rs = p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
