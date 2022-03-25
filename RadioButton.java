package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("file:///C:/Users/user/Desktop/html%20working/selenium.html");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@value='Potato']")).click();
		 //  int a = driver.findElements(By.xpath("//input [@name='group2']")).size();  
	       // System.out.println(a);  
	      //  for(int i=1;i<=a;i++)  
	       // {  
	            //driver.findElements(By.xpath("//input[@name='group2']")).get(2).click();  
	       // }  
	            driver.get("https://www.testandquiz.com/selenium/testing.html");
	            driver.findElement(By.xpath("(//*[@value='Automation'])[1]")).click();
	        driver.findElement(By.xpath("(//*[@value='Performance'])[1]")).click();
		
	}

}
