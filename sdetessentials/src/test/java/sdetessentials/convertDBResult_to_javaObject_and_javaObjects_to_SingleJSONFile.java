package sdetessentials;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class convertDBResult_to_javaObject_and_javaObjects_to_SingleJSONFile {
	
	public static void main(String[] args) throws SQLException, StreamWriteException, DatabindException, IOException {
		//Maven Dependency: mysql-connector
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
		
		//Maven Dependencies: gson, json-simple
		
		JSONArray jsonr = new JSONArray();
		for(int i=0;i<ar.size();i++) {
			//converting java object into JSON string
			Gson g = new Gson();
			String jsonString = g.toJson(ar.get(i));
			jsonr.add(jsonString); //add Json string to Json array
		}
		
		JSONObject jo = new JSONObject();
		jo.put("data", jsonr);
		
		//System.out.println(jo.toJSONString());
		
		String jsonFormattedString = jo.toJSONString().replace("\\\"", "\""); //remove escape characters
		//System.out.println(jsonFormattedString);
		
		String finalJson = jsonFormattedString.replace("\"{","{").replace("}\"","}");
		System.out.println(finalJson);
		
		
		con.close();
		
		System.out.println("Done");
		
	}
}
