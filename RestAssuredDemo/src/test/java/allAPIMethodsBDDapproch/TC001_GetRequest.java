package allAPIMethodsBDDapproch;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class TC001_GetRequest {
	
	@Test
	public void getRequest01() {

		given()
		.when().get("https://reqres.in/api/users?page=2") //in get request no need to pass body
		.then()
		.statusCode(200)
		//.body(path, responseAwareMatcher) - this line is as example
		.body("data.id[3]", equalTo(10))  //what ever data you want to validate, just pass data and value
		
		.log().body();
		//.body("data.last_name[3]", equalTo("Fields"))
		//.body("data.first_name[3]", equalTo("Byron"))
		//.body("data.email[3]", equalTo("byron.fields@reqres.in"))
		//.body("data.first_name[0]", equalTo("Michael"));
		
				
	}

	//@Test
	public void getRequest02() {
		//Get all employee data
		given()
		//.header("Content-Type","application/json")
		//.accept(ContentType.JSON)
		.when().get("http://dummy.restapiexample.com/api/v1/employees")
			.then().statusCode(200)
				//.body(".data[0].employee_name", equalTo(1))
					.log().all();
	}
	//@Test
	public void getRequest03() {
		
		//Get a single employee data
		given()
		.header("Content-Type","application/json")
		.accept(ContentType.JSON)
		.when().get("http://dummy.restapiexample.com/api/v1/employee/1")
			.then().statusCode(200)
				//.body("data.employee_name", equalTo("Tiger Nixon"))
				.body("data.employee_age", equalTo(61))
				.statusLine("HTTP/1.1 200 OK")
					.log().all();
	}
}
