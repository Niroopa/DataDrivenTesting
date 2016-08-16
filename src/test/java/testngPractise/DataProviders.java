package testngPractise;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

public class DataProviders {

@DataProvider(name="dataprovider1")
public static Object[][] getData(Method m)
{   Object [][] data=null;
  
    if(m.getName().equals("testData"))
    {  
    data=new Object[2][2];
	data[0][0]="Bahubali";
	data[0][1]="hxjxhajksdhsj";
	
	data[1][0]="Srimantudu";
	data[1][1]="hhdjadakjdj";
	
	
}else if(m.getName().equals("testData1"))
{
	data=new Object[2][3];
	data[0][0]="Chiranjeevi";
	data[0][1]="hxjxxsccvdsj";
	data[0][2]="chiru@gmail.com";
	
	data[1][0]="Mahesh Babu";
	data[1][1]="hhjhdcn";
	data[1][2]="mahesh@gmail.com";

}
	return data;


/*@DataProvider(name="dataprovider2")
public static Object[][] getLogin()
{
	Object[][] data=new Object[2][3];
	data[0][0]="Chiranjeevi";
	data[0][1]="hxjxxsccvdsj";
	data[0][2]="chiru@gmail.com";
	
	data[1][0]="Mahesh Babu";
	data[1][1]="hhjhdcn";
	data[1][2]="mahesh@gmail.com";
	return data;
	
}*/

}
}

