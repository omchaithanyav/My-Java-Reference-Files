package sdetessentials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class retrieveDataFromDB_JDBC {

	public static void main(String[] args) throws SQLException {
		//Maven Dependency: mysql-connector
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		
		Statement stmt = con.createStatement();
		String s = "select * from CustomerInfo limit 1";
		
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next()) {
			String bookName = rs.getString("BookName");
			String date = rs.getString("PurchasedDate");
			String location = rs.getString("Location");
			int amt = rs.getInt("Amount");
			
			System.out.println(bookName+" "+date+" "+amt+" "+location);
		}
		
		con.close();
		
	} 

}
