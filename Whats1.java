package first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whats1 {
	public static void main(String args[]) throws InterruptedException, AWTException
	{
	WebDriver driver;
	Robot r=new Robot();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	  
	   Thread.sleep(20000);
   driver.findElement(By.xpath("//*[@class='_3FRCZ copyable-text selectable-text']")).sendKeys("potti");
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
   driver.findElement(By.xpath("(//*[@class='_3FRCZ copyable-text selectable-text'])[2]")).sendKeys("helo pottid");
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
   
  
   
   
	}
  
   

	
}
