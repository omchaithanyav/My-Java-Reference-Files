package sdetessentials;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class convertDBResult_to_javaObject_and_javaObject_to_JSONFile {
	
	public static void main(String[] args) throws SQLException, StreamWriteException, DatabindException, IOException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		
		Statement stmt = con.createStatement();
		String s = "select * from CustomerInfo limit 1";
		
		ResultSet rs = stmt.executeQuery(s);
		
		customerDetails cd = new customerDetails();
		while(rs.next()) {
			String bookName = rs.getString("BookName");
			String date = rs.getString("PurchasedDate");
			String location = rs.getString("Location");
			int amt = rs.getInt("Amount");
			
			cd.setBookName(bookName);
			cd.setDate(date);
			cd.setLocation(location);
			cd.setAmt(amt);
		}
		
		//System.out.println(cd.getBookName());
		//System.out.println(cd.getAmt());
		
		//Using Jackson API, convert java object into JSON file 
		//Maven Dependencies: Jackson Core, Jackson Databind, Jackson annotations
		
		File jsonfile = new File("D:\\Eclipse\\My java files\\sdetessentials\\custinfo.json");
		
		ObjectMapper om = new ObjectMapper();
		om.writeValue(jsonfile,cd);
		
		
		con.close();
		
		System.out.println("Done");
		
	}
}
