package com.neosoft;

import java.sql.*;



public class JDBCTest {

	public static void main(String[] args) {
		
		final String DB_url="jdbc:mysql://localhost:3306/mydb";
		final String DB_USER="root";
		final String DB_PASSWORD="Kumarvinay99@";
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement pst=null;
		CallableStatement cst=null;

		
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			//create the connection
			
			con=DriverManager.getConnection(DB_url,DB_USER,DB_PASSWORD);
			System.out.println("Connection established");
			
			//use object to perform querries
			
			st=con.createStatement();
			
			//creating a table
			String createTableQuery="CREATE TABLE IF NOT EXISTS sample"
					+"(sid INT AUTO_INCREMENT PRIMARY KEY,sname VARCHAR(50) NOT NULL)";
			
			
			
			System.out.println("Table creation : "+st.executeUpdate(createTableQuery));
			//insert record into table
			
			String insertQuery="INSERT INTO sample(sname) VALUES('abcd'),('zxy'),('ghj')";
			System.out.println("Record insertion : "+st.executeUpdate(insertQuery));
			
			String updateQuery="UPDATE sample SET sname='abc' WHERE sid=1";
			System.out.println("Record insertion : "+st.executeUpdate(updateQuery));
			
			String deleteQuery="DELETE FROM sample WHERE sid=4";
			System.out.println("Record deletion : "+st.executeUpdate(deleteQuery));
			
			String selectQuery="SELECT * FROM sample";
			rs=st.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println(rs.getInt("sid")+"\t"+rs.getString("sname"));
			}
			rs.close();
			//using prepared statement
			
			String selectPrepareQuery="SELECT * FROM  sample WHERE sid=?";
			pst=con.prepareStatement(selectPrepareQuery);
			pst.setInt(1, 2);
			rs=pst.executeQuery();
			if(rs.next())
				System.out.println(rs.getInt("sid")+"\t"+rs.getString("sname"));
			
			
			System.out.println("----------------");
			
			/*
			 * pst.setInt(1, 1); rs=pst.executeQuery(); if(rs.next())
			 * System.out.println(rs.getInt("sid")+"\t"+rs.getString("sname"));
			 * 
			 * rs.close(); pst.close();
			 * 
			 * String insertPrepareQuery="INSERT INTO SAMPLE VALUES(?,?)";
			 * pst=con.prepareStatement(insertPrepareQuery); pst.setInt(1, 4);
			 * pst.setString(2,"Sachin");
			 * System.out.println("Prepared statement insertion"); pst.setInt(1, 5);
			 * pst.setString(2,"Sandeep");
			 * System.out.println("Prepared statement insertion"); pst.setInt(1, 6);
			 * pst.setString(2,"Sandy"); System.out.println("Prepared statement insertion");
			 * 
			 * pst.close();
			 */
			
			//Batch insertion using pst
			
			/*
			 * String[] names=new String[] {
			 * "Sarwar","Abhay","kavita","vishal","Arif","Neha","Azhan","Vinay" };
			 * 
			 * String insertPrepareBatchQuery="INSERT INTO sample(sname) VALUES(?)";
			 * pst=con.prepareStatement(insertPrepareBatchQuery); for(String name:names) {
			 * pst.setString(1, name); pst.addBatch(); }
			 * 
			 * System.out.println("Record Added..."+pst.executeBatch().length); pst.close();
			 */
			
			//calling stored procedure
			
			/*
			 * String prepareCallQuery = "CALL mydb.GetEmpDeptno(?)"; cst =
			 * con.prepareCall(prepareCallQuery); cst.setInt(1, 20); rs =
			 * cst.executeQuery(); while(rs.next()) {
			 * System.out.print("Empno : "+rs.getInt("empno")+", Ename:"+rs.getString(
			 * "ename"));
			 * System.out.print(", Empsal : "+rs.getDouble("sal")+", DLoc:"+rs.getString(
			 * "loc")+"\n"); }
			 * 
			 * rs.close();
			 */
			
			//getting metdata from resultset
			/*
			 * String selectPrepareQuery2="SELECT * FROM  sample";
			 * rs=st.executeQuery(selectPrepareQuery2); ResultSetMetaData
			 * rsmd=rs.getMetaData(); int column_counter=rsmd.getColumnCount();
			 * System.out.println("No of columns"+column_counter);
			 * 
			 * for(int i=1;i<=column_counter;i++) {
			 * System.out.println(rsmd.getColumnName(column_counter)); } rs.close();
			 */
			//getting metdata from database
			
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println("Driver name:"+dbmd.getDriverName());
			System.out.println("Driver version:"+dbmd.getDriverVersion());
			System.out.println("user name:"+dbmd.getUserName());
			System.out.println("Db product name:"+dbmd.getDatabaseProductName());
			System.out.println("Db product version:"+dbmd.getDatabaseProductVersion());
			System.out.println("Tablee data");
			
			System.out.println("Table name ####");
			//String tables[]= {"TABLE"};
			//rs=dbmd.getProcedures(con.getCatalog(), null, null);
			
			rs=dbmd.getTables(con.getCatalog(),null, null,null);
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			
			rs.close();
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pst != null)
					st.close();
				
				if(st != null)
					st.close();
				
				if(con != null)
					con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
