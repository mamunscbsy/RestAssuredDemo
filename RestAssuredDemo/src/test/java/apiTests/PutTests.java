package apiTests;

import org.testng.annotations.Test;

import apiUtils.APIMethods;
import apiUtils.APIurls;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PutTests {
	public APIMethods apiMethods;
	public JSONObject requesyBody;
	
  @Test
  public void updateEmployee() {
	  requesyBody = new JSONObject();
		
	  requesyBody.put( "name", "morpheus1");
	  requesyBody.put("job", "zion resident1");
	  
	  System.out.println(requesyBody);
		
		Assert.assertTrue(apiMethods.Put_api(APIurls.updateEmployee, 200, requesyBody), "Expected status code to be 200:OK"); 
  }
  @Test
  public void updateUser() {
	  requesyBody = new JSONObject();
		
	  requesyBody.put( "name", "morpheus");
	  requesyBody.put("job", "zion resident");
	  
	  System.out.println(requesyBody);
		
		Assert.assertTrue(apiMethods.Put_api(APIurls.updateUser, 200, requesyBody), "Expected status code to be 200:OK"); 
  }
  @BeforeClass
  public void beforeClass() {
	  apiMethods = new APIMethods();
  }

  @AfterClass
  public void afterClass() {
	  apiMethods = null;
  }
  @BeforeMethod
  public void beforeMethod() {
	   requesyBody = new JSONObject();
  }
@AfterMethod
public void afterMethod() {
	requesyBody = null;
}
}
