package com.dipali.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonProcessingException {
		 
		Student s1=new Student();
		s1.setsId(1);
		s1.setsName("dipali");
		s1.setsAge(22);
		s1.setsRank("2");
		System.out.println(s1);
		
		
		ObjectMapper om=new ObjectMapper();
		String string = om.writeValueAsString(s1);
		System.out.println(string);
	}
	
	
}
// Marshaling Operation i.e java object to json conversion using objectMapper method writeValueAsString