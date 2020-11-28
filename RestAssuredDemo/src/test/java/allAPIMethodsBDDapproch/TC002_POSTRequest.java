package allAPIMethodsBDDapproch;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC002_POSTRequest{
	
	//@Test
	public void postRequest01() {
		
		JSONObject requestBody = new JSONObject();
		//JSONObject requesyBody = new JSONObject();
		
		requestBody.put("email","eve.holt@reqres.in");
		requestBody.put("password", "pistol");
		
		System.out.println(requestBody);
		System.out.println(requestBody.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.post("https://reqres.in/api/register")
		.then()
		.statusCode(200)
		.log().body();
		}
	
	//@Test
	public void postRequestUnsuccessful() {
		
		JSONObject requestBody = new JSONObject();
		
		requestBody.put("email", "sydney@fife");
		
		System.out.println(requestBody);
		
		given()
		//.header("Content-Type","application/json")
		//.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.post("https://reqres.in/api/register")
		.then()
		.statusCode(400)
		.log().all();
	}
	//@Test
	public void postRequestUnsuccessful01() {
		JSONObject requestBody = new JSONObject();
		requestBody.put("email", "sydney@fife");
		
		System.out.println(requestBody);
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.post("https://reqres.in/api/register")
		.then()
		.statusCode(400)
		.log().all();
	
}
	@Test
	public void postRequest02() {
		
		
		JSONObject requesyBody = new JSONObject();
		
		//POST request we need to pass body
		//Create new record in database
		requesyBody.put("name", "test");
		requesyBody.put("salary", "123");
		requesyBody.put("age", "23");
		requesyBody.put("id", "28997");
		
		System.out.println(requesyBody);
		
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requesyBody.toJSONString())
		.when()
		.post("http://dummy.restapiexample.com/api/v1/create")
		.then()
		.statusCode(200)
		//.log().all()
		.log().body();
		
	}	
}