package DataDrivenTestiing;

//import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnOptionalAnnotation {
WebDriver driver;
@Parameters({"browser","username"})
@Test
public void logintoActiTime(@Optional("firefox")String browser,@Optional("manager")
String username) throws InterruptedException {
	if (browser.equals("chrome")) {
	driver	= new ChromeDriver();
	}else if (browser.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if (browser.equals("safari")) {
		driver = new SafariDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
 WebElement emailTextField =driver.findElement(By.id("username"));
 emailTextField.sendKeys(username);
 Thread.sleep(2000);
 driver.manage().window().minimize();
 driver.quit();
		
}
}


	

	






