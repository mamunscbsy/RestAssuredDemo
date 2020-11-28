package apiTests;

import org.testng.annotations.Test;

import apiUtils.APIMethods;
import apiUtils.APIurls;

import org.testng.annotations.BeforeClass;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PostTests {
	public APIMethods apiMethods;
	public JSONObject requesyBody;
	
  @Test
  public void createEmployee() {
	  JSONObject requesyBody = new JSONObject();
	  	
	  	requesyBody.put("name", "test");
		requesyBody.put("salary", "123");
		requesyBody.put("age", "23");
	
		
		Assert.assertTrue(apiMethods.Post_api(APIurls.createEmployee, 200, requesyBody), "Expected status code to be 200:OK"); 
  }
  
  @Test
  public void createUser() {
	  requesyBody = new JSONObject();
	 	  
	  	requesyBody.put("name", "morpheus");
		requesyBody.put("job", "leader");
		
		
		Assert.assertTrue(apiMethods.Post_api(APIurls.createUser, 201, requesyBody), "Expected status code to be 201:OK"); 
  }
		@BeforeClass
  public void beforeClass() {
	  apiMethods = new APIMethods();
  }

  @AfterClass
  public void afterClass() {
	  apiMethods = null;
  }

}
