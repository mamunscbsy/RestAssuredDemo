package restAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class StsrtRestAssured {
	
	@Test
	public void getRequest() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		/*response.getStatusCode();
		response.contentType();
		response.getHeaders();
		response.getTime();*/
		
		System.out.println(response.getStatusCode());
		System.out.println(response.contentType());
		System.out.println(response.getHeaders());
		System.out.println(response.getTime());
		
	}

}
