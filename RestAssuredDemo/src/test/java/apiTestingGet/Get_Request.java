package apiTestingGet;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Request {
	
	@Test
	void getRequest() {
		//Specify base URI
		//RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RestAssured.baseURI = "https://reqres.in/api/users?page";
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET, "2");
			
		//Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);
		
		//Status code verification 
		int statusCode = response.getStatusCode();
		System.out.println("Status Code is: " + statusCode);
		
		//Status line verification
		String statusLine = response.getStatusLine();
		System.out.println("Status Line is :" + statusLine);
		
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}

}
