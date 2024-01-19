package learntestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class executepreAndPostcondition {
	 WebDriver driver	=  new ChromeDriver();
	 @BeforeMethod
public void executeBeforeMethod() {
  //WebDriver driver	=  new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
	 @AfterMethod
public void executeAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();
	
}
}
