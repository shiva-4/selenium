package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class online_class {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\python\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		public void testJoinMeeting() {
			// navigate through the UI to join a meeting with correct meeting id and password
			waitFor(JOIN_MEETING_BUTTON).click();
			waitFor(MEETING_ID_FIELD).sendKeys(MEETING_ID);
			driver.findElement(ACTUALLY_JOIN_MEETING_BUTTON).click();
			waitFor(PASSWORD_FIELD).sendKeys(MEETING_PW);
			driver.findElement(PASSWORD_OK_BUTTON).click();

			// prove that we made it into the meeting by finding the 'leave' button
			waitFor(LEAVE_BTN);
		
	}
	

}
