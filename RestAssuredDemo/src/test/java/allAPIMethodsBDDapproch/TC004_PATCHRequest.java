package allAPIMethodsBDDapproch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TC004_PATCHRequest {
	
	@Test
	public void patchRequest() {
		JSONObject requestBody = new JSONObject();
		requestBody.put("name", "John");
		requestBody.put("Job", "HousingKeeping");
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
