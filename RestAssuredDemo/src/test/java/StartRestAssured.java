import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StartRestAssured {

	@Test
	public void Test_01() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		//Response response = RestAssured.get("http://example.com/employee/10");
		
		/*response.getStatusCode();
		response.body();
		response.getHeaders();
		response.getTime();*/
		
		System.out.println(response.getStatusCode());
		//System.out.println(response.body());
		System.out.println(response.getHeaders());
		//System.out.println(response.getTime());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		//Assert.assertEquals(response.getStatusCode(), 404);
	}
}
