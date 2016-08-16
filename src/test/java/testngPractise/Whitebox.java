package testngPractise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Whitebox {
	
	public static void main(String args[])
	{
		
			
		WebDriver driver=new FirefoxDriver();
		driver.get("http//whiteboxqa.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
					
		String mainWin=driver.getWindowHandle();
		System.out.println("get title:"+driver.getTitle()+"printing url:"+driver.getCurrentUrl());
		driver.findElement(By.xpath("#headerfblogin")).click();
		
		
		Set<String> windows=driver.getWindowHandles();
		for(String child:windows)
		{
			driver.switchTo().window(child);
			String title=driver.getTitle();
			if(title.equalsIgnoreCase("Facebook"))
			{
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pmsapcrm@gmail.com");
				driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("training");
				driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
			}
		}
		driver.close();

	}

}
