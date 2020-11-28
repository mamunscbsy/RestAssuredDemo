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

public class PatchTests {
	public APIMethods apiMethods;
	public JSONObject requesyBody;
	
  @Test
  public void updateUsers() {
	 
	  requesyBody = new JSONObject();
		
	  requesyBody.put( "name", "Mamun");
	  requesyBody.put("job", "SDET");
	  
	  System.out.println(requesyBody);
		
		Assert.assertTrue(apiMethods.Patch_api(APIurls.UpdatePaUsers, 200, requesyBody), "Expected status code to be 200:OK"); 
   }
  @BeforeMethod
  public void beforeMethod() {
	  requesyBody = new JSONObject(); 
  }

  @AfterMethod
  public void afterMethod() {
	  requesyBody = null;
  }

  @BeforeClass
  public void beforeClass() {
	  apiMethods = new  APIMethods();
  }

  @AfterClass
  public void afterClass() {
	  apiMethods = null; 
  }

}
