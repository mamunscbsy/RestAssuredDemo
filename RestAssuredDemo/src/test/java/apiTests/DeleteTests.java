package apiTests;

import org.testng.annotations.Test;

import apiUtils.APIMethods;
import apiUtils.APIurls;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DeleteTests {
	public APIMethods apiMethods;
		
  @Test
  public void deleteUser() {
	  
	  Assert.assertTrue(apiMethods.Delete_api(APIurls.deleteUser, 204), "Expected status code to be 204:OK"); 
	  
  }
  @Test
  public void deleteEmployee() {
	  
	  Assert.assertTrue(apiMethods.Delete_api(APIurls.deleteEmployee, 200), "Expected status code to be 200:OK"); 
	  
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
