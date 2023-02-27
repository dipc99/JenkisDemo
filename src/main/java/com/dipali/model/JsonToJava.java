package com.dipali.model;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f=new File("Student.json");
		ObjectMapper om=new ObjectMapper();
		Student student = om.readValue(f, Student.class);
		System.out.println(student);
	}
	
}

// UnMarshaling Operation = convert Json to java object using objectMapper (method-readValue)