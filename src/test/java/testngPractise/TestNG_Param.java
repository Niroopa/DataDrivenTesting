package testngPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class  TestNG_Param  {

	@Test(dataProvider = "getData")
	public void test_param(String username, String password, int age) {
		System.out.println(username + "  - " + password + "  -  " + age);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "tomhardy@gmail.com";
		data[0][1] = "abcdef";
		data[0][2] = 24;

		data[1][0] = "jackAndjill@gmail.com";
		data[1][1] = "abcdef123";
		data[1][2] = 30;

		return data;
	}
}
