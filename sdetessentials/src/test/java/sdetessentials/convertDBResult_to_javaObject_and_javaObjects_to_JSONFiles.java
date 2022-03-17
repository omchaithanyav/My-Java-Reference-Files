package sdetessentials;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class convertDBResult_to_javaObject_and_javaObjects_to_JSONFiles {
	
	public static void main(String[] args) throws SQLException, StreamWriteException, DatabindException, IOException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
		
		Statement stmt = con.createStatement();
		String s = "select * from CustomerInfo";
		
		ArrayList<customerDetails> ar = new ArrayList<customerDetails>();
		ResultSet rs = stmt.executeQuery(s);
		
		
		while(rs.next()) {
			String bookName = rs.getString("BookName");
			String date = rs.getString("PurchasedDate");
			String location = rs.getString("Location");
			int amt = rs.getInt("Amount");
			
			customerDetails cd = new customerDetails();
			
			cd.setBookName(bookName);
			cd.setDate(date);
			cd.setLocation(location);
			cd.setAmt(amt);
			
			ar.add(cd);
		}
		
		//System.out.println(cd.getBookName());
		//System.out.println(cd.getAmt());
		
		//Using Jackson API, convert java object into JSON file 
		//Maven Dependencies: Jackson Core, Jackson Databind, Jackson annotations
		
		for(int i=0;i<ar.size();i++) {
			File jsonfile = new File("D:\\Eclipse\\My java files\\sdetessentials\\custinfo"+i+".json");
			
			ObjectMapper om = new ObjectMapper();
			om.writeValue(jsonfile,ar.get(i));
		}
		
		
		
		con.close();
		
		System.out.println("Done");
		
	}
}
