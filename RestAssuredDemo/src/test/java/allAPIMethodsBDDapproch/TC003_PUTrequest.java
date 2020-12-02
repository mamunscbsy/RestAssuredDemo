package allAPIMethodsBDDapproch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TC003_PUTrequest {
	
	//@Test
	public void putRequest() {
		
		JSONObject requestBody = new JSONObject();
		
		requestBody.put( "name", "morpheus1");
		requestBody.put("job", "zion resident1");
		
		given()
		.accept(ContentType.JSON)
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.put("https://reqres.in/api/users/2")
		.then().statusCode(200)
		.log().all();
			
	}
	@Test
	public void putRequest02() {
		
		//Update an employee record
		
		JSONObject requestBody = new JSONObject();
		
		//We are updating below emplyee records
		requestBody.put("name", "test1");
		requestBody.put("salary", "12345");
		requestBody.put("age", "50");
		requestBody.put("id", "289970");
		
		//System.out.println(requestBody);
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.put("http://dummy.restapiexample.com/api/v1/update/21")
		.then()
		.statusCode(200)
		.log().all();
			
	}

}
