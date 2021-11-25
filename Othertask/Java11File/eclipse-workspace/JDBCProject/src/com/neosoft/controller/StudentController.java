package com.neosoft.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neosoft.model.Student;

public class StudentController {

	public static List<Student> getAllStudents() throws SQLException{
		
		List<Student> students=new ArrayList<Student>();
		Connection con=JDBCProperties.getConnection();
		
//		System.out.println(con);
		
		try {
			
			String query ="SELECT * FROM MYDB.STUDENT";
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Student student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				students.add(student);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			con.close();
		}
		return students;
		
		
		
		
		
	}

}
