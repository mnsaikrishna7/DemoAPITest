package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.utilities.Payload;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

public class Test02 {
	
	@Test
	public void addUser() {
		
		System.out.println("Adding user details!!");	//displaying the type of action performing
		
		RestAssured.baseURI = "https://reqres.in";  // base URL
		
		/* we're using POST HTTP method
		 * resonse is extracted and stored as string
		 */
		
		String addResponse = given().log().all().header("Content-Type","application/json")
				.body(Payload.addUSer())
				.when().post("/api/users")
				.then().log().all()
				.statusCode(201).extract().response().asString();
		
	
		
		JsonPath js = new JsonPath(addResponse); //Parsing JSON
		
		String name = js.getString("name");
		String job = js.getString("job");
		
		Assert.assertEquals("saikrishna", name); // Response Validation
		Assert.assertEquals("Test Engineer", job);
		 
		System.out.println("The name from JSON parsed data is : "+name+" And the job of the person is : " +job);  // printing name parameter from parsed data
						
	}
	

}
