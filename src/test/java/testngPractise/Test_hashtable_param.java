package testngPractise;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class Test_hashtable_param {

	
	public static ExcelReader excel=null;
	@Test(dataProvider="getData")
	public void test_hash(Hashtable<String,String> data)
	{
		System.out.println(data.get("username"));
	}
	@DataProvider
	public static Object[][] getData()
	{
        if(excel== null)
        {
        	excel=new ExcelReader("C:\\Users\\niroopa\\Desktop\\testng_data.xlsx");
        }
        
        String sheetName="LoginTest2";
        int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		Object[][] data=new Object[rows-1][1];
		
		Hashtable<String,String> table=null;
		
		for(int rownum=2;rownum<=rows;rownum++)
		{
			table=new Hashtable<String,String>();
			for(int colnum=0;colnum<cols;colnum++)
			{
				table.put(excel.getCellData(sheetName, colnum, 1),excel.getCellData(sheetName, colnum, rownum));
				data[rownum-2][0]=table;
			}
		}
		return data;
		
		
	}
	
}
