package sdetessentials;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonToJavaObject {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper om = new ObjectMapper();
		
		File jsonFile = new File("D:\\Eclipse\\My java files\\sdetessentials\\custinfo0.json");
		
		customerDetails cd = om.readValue(jsonFile, customerDetails.class);
		
		System.out.println(cd.getBookName());
		System.out.println(cd.getDate());
		System.out.println(cd.getLocation());
		System.out.println(cd.getAmt());
		
	}

}
