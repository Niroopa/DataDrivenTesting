package testngPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class Test_Param {
	
	
	public static ExcelReader excel=null;
	
	@Test(dataProvider="getData")
	public void testParam(String username,String password,String is_Correct){
		
		System.out.println(username+ "   "+password+"   "+is_Correct);
		
	}

	@DataProvider
	public static Object[][] getData()
	{
		
		if(excel == null)
		{
			excel=new ExcelReader("C:\\Users\\niroopa\\Desktop\\testng_data.xlsx");
		}
		String sheetName="LoginTest";
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int rownum=2;rownum<=rows;rownum++)
		{
			for(int colnum=0;colnum<cols;colnum++){
				
			data[rownum-2][colnum]=excel.getCellData(sheetName, colnum, rownum);
			}
		}
		return data;
		
	}
}
