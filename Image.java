package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "Users\\C:\\user\\Downloads\\chromedriver.exe");
		
		//selecting an image
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://abhyas.vbithyd.ac.in/login/index.php");
		driver.findElement(By.xpath("//*[@title='coding.Studio(); Learning Portal']"));
		//System.out.println(dri);
		if(driver.getTitle().equals("coding.Studio(); Learning Portal"))
		{
			System.out.print("this is home page");
					
		}
		else
		{
			System.out.print("this is not home page");
					
		}
		
		
		

		
		
	}

}
