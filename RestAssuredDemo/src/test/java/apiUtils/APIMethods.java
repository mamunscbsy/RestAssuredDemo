package apiUtils;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class APIMethods {
	//create a Get_api() method and pass parameters and return type will be boolean
	public boolean Get_api(String url, int expectedStatusCode) {
		
		//After hitting url we are getting statuscode and store it in a variable and return type will be int 
		int actualStatusCode = given().when().get(url).getStatusCode();
		
		//Validate stauscode
		if(actualStatusCode == expectedStatusCode) {
			return true;
		}
		return false;
	}
 public boolean Post_api(String url, int expectedStatusCode, JSONObject requestBody) {
	int actualStatusCode =  given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.post(url)
		.getStatusCode();
	
	//validating statusCode
	if(actualStatusCode == expectedStatusCode) {
		return true;
	}
	return false;
 }
 public boolean Put_api(String url, int expectedStatusCode, JSONObject requestBody) {
		int actualStatusCode =  given()
			.header("Content-Type","application/json")
			.accept(ContentType.JSON)
			.body(requestBody.toJSONString())
			.when()
			.put(url)
			.getStatusCode();
		
		//validating statusCode
		if(actualStatusCode == expectedStatusCode) {
			return true;
		}
		return false;
	 }
 public boolean Patch_api(String url, int expectedStatusCode, JSONObject requestBody) {
		int actualStatusCode =  given()
			.header("Content-Type","application/json")
			.accept(ContentType.JSON)
			.body(requestBody.toJSONString())
			.when()
			.patch(url)
			.getStatusCode();
		
		//validating statusCode
		if(actualStatusCode == expectedStatusCode) {
			return true;
		}
		return false;
	 }
 
 public boolean Delete_api(String url, int expectedStatusCode) {
		int actualStatusCode =  given()
			.header("Content-Type","application/json")
			.accept(ContentType.JSON)
			//.body(requestBody.toJSONString())
			.when()
			.delete(url)
			.getStatusCode();
		
		//validating statusCode
		if(actualStatusCode == expectedStatusCode) {
			return true;
		}
		return false;
	 }
}
