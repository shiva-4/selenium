package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public  class Whats{
	public static void main(String args[]) throws InterruptedException
	{
		//drop down list
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://register.gotowebinar.com/register/724503805577442827");
		Thread.sleep(5000);
		 WebElement abc =driver.findElement(By.id("customQuestion2"));
		 Select sl=new Select(abc);
		 sl.selectByIndex(1);
		 WebElement bc=driver.findElement(By.id("customQuestion0"));
		 Select s1=new Select(bc);
		 s1.selectByVisibleText("EC");
	
		
		
	
	}
}
       
  
  
