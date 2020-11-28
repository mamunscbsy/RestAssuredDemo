package allAPIMethodsBDDapproch;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TC005_DeleteRequest {
	
	@Test
	public void deleteRequest() {
		
		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
	}
	@Test
	public void deleteRequest01() {
		
		//Delete an employee record
		when()
		.delete("http://dummy.restapiexample.com/api/v1/delete/2")
		.then()
		.statusCode(200)
		.log().all();
}
}