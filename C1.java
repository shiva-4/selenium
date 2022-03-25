package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		//		driver.close();
		//driver.get("https://www.w3schools.com/");
		//driver.findElement(By.id("navbtn_exercises")).click();
		//driver.get("https://www.google.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("youtube");
	//	driver.findElement(By.className("gNO89b")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//*[@class=\"LC20lb DKV0Md\"])[1]")).click();
		
		
		
		driver.get("https://gaana.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("gana.com");
		//driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).click();
		//	driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		//	Thread.sleep(5000);
		//driver.findElement(By.name("search_query")).sendKeys("dilbachara");
		//driver.findElement(By.id("search-icon-legacy")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//*[@href='/watch?v=PMCu0JtizCk'])[1]")).click();
		driver.findElement(By.id("sb")).sendKeys("Ramulo ramula");
		driver.findElement(By.className("search_btn")).click();
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//*[@src=\'https://a10.gaanacdn.com/gn_img/song/w4MKPObojg/MKPepELx3o/size_m_1572091328.jpg\']")).click();
	    Thread.sleep(30000);
	   
	    driver.findElement(By.xpath("//*[@class='play-song playPause enabled pause']")).click();



	}

}
