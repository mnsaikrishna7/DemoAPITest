package com.testcases;

import org.testng.annotations.Test;
import com.utilities.Payload;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static org.hamcrest.Matchers.*;

public class Test01{
	
	@Test
	public void getUSer() {
		
		System.out.println("Getting user details!!");  //Displaying the action we're performing
		
		RestAssured.baseURI = "https://reqres.in";   // Base URL details
		
		/*In the below code generating logs at pre-requisite level and response level
		 * GET is the HTTP method
		 * Validating status Code and Server details
		 * and Extracting response in the form of String and storing into the variable resp		 * 
		 */
		 
		String resp = given().log().all().header("Content-Type","application/json").				     
				      when().get("/api/users/2").
				      then().log().all().
				      statusCode(200).header("Server", "cloudflare").
				      extract().response().asString();
				
		JsonPath js = new JsonPath(resp); // Parsing the json response
		
		String name = js.getString("data.first_name"); //After parsing the JSON, fetching parameter details
		Assert.assertEquals("Janet", name);
		System.out.println("The extracted name from the response is : " + name);
	}

}
