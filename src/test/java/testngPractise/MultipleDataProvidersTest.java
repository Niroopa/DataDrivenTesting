package testngPractise;

import org.testng.annotations.Test;

public class MultipleDataProvidersTest {

	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dataprovider1")
	public void testData(String username,String password)
	{
		System.out.println(username+"---"+password);
	}
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dataprovider1")
	public void testData1(String fname,String lname,String email)
	{
		System.out.println(fname+"---"+lname+"---"+email);
	}
}
