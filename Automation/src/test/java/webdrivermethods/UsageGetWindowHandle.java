package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageGetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver   driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/signup/");
   String wid = driver.getWindowHandle();
   System.out.println(wid);
   driver.quit();
  

}
}
