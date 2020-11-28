package allAPIMethodsBDDapproch;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_post {
	
	@Test
	public void Test1() {
		
		//way-1
		//In POST request we need to pass Body(Key,Value). So,we need create Map Object for pass JSON format as body
	
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "morpheus");
		map.put("job", "leader");
		 
		System.out.println(map); //its not return a good format or JSON format
		
		JSONObject requestBody = new JSONObject(map);
		
		
				
		System.out.println(requestBody); // If it is not create JSON format we use below line
		System.out.println(requestBody.toJSONString()); */ // It will create directly JSON format by using .toJSONString() method
		
		//way-2
		//By creating JSONObject we can also assign Key and Value to the Object without creating Map Object
		
		JSONObject requestBody = new JSONObject();
		requestBody.put("name", "morpheus");
		requestBody.put("job", "leader");
		
		System.out.println(requestBody);
		System.out.println(requestBody.toJSONString());
		
		given()
		.body(requestBody.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
	
	}
@Test
	public void Test2() {
		
		JSONObject requestBody = new JSONObject();
		requestBody.put("email", "eve.holt@reqres.in");
		requestBody.put( "password", "cityslicka");
		
		System.out.println(requestBody);
		
		given()
		.body(requestBody.toJSONString())
		.when()
		.post("https://reqres.in/api/login")
		.then()
		.statusCode(400);
		
	}
}
