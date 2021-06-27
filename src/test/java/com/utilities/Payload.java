package com.utilities;

public class Payload {
	
	public static String addUSer() {
		
		return "{\r\n" + 
				"    \"name\": \"saikrishna\",\r\n" + 
				"    \"job\": \"Test Engineer\"\r\n" + 
				"}";
		
	}

	
	public static String upateUser() {
		
		return "{\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"id\": 2,\r\n" + 
				"        \"email\": \"janet.weaver@reqres.in\",\r\n" + 
				"        \"first_name\": \"Saikrishna\",\r\n" + 
				"        \"last_name\": \"Nirnakar\",\r\n" + 
				"        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n" + 
				"    },\r\n" + 
				"    \"support\": {\r\n" + 
				"        \"url\": \"https://reqres.in/#support-heading\",\r\n" + 
				"        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n" + 
				"    }\r\n" + 
				"}";
		
	}
}
