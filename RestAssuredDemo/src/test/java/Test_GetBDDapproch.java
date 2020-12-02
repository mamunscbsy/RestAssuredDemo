import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Test_GetBDDapproch {
	
	@Test
	public void Test_02() {
		//List of Users
		
		given().when().get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.id[3]", equalTo(10)). //it's a Array that's why we put in index
		body("data.last_name[3]", equalTo("Fields")).log().all() //print body in the log, if put log().all(); then print all the log
		.statusLine("HTTP/1.1 200 OK");
	}
	@Test
	public void Test_01() {
		
		//single user
		
		given().when().get("https://reqres.in/api/users/2")
		.then().statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all()
		.log().body()
		.body("data.id", equalTo(2))
		.body("data.first_name", equalTo("Janet"))
		.body("data.last_name", equalTo("Weaver"));
		
		
	}

}
