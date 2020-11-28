package apiTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import apiUtils.APIMethods;
import apiUtils.APIurls;

public class GetTests {

	public APIMethods apiMethods;

	@BeforeClass
	public void beforeTest() {
		apiMethods = new APIMethods();
	}

	@Test
	public void getAllEmployees() {

		//apiMethods = new APIMethods();
		Assert.assertTrue(apiMethods.Get_api(APIurls.getAllEmployees, 200), "Expected the status code to be 200:OK");

	}

	@Test
	public void getSingleEmployee() {
		//apiMethods = new APIMethods();
		Assert.assertTrue(apiMethods.Get_api(APIurls.getSingleEmployee,  200), "Expected the status code to be 200:OK");
	}
	@Test
	public void getAllUsers() {
		//apiMethods = new APIMethods();
		Assert.assertTrue(apiMethods.Get_api(APIurls.getAllUsers,  200), "Expected the status code to be 200:OK");

	}
	@Test
	public void getFullCountryName() {
		Assert.assertTrue(apiMethods.Get_api(APIurls.getFullCountryName, 200), "Expected the status code to be 200:OK");
	}

	@Test
	public void getCountryName() {
		Assert.assertTrue(apiMethods.Get_api(APIurls.getCountryName, 200), "Expected the status code to be 200:OK");
	}
	@Test
	public void getCapitalCity() {
		Assert.assertTrue(apiMethods.Get_api(APIurls.getCapitalCity, 200), "Expected the status code to be 200:OK");
	}
	@AfterClass
	public void afterTest() {
		apiMethods = null;
	}
}
