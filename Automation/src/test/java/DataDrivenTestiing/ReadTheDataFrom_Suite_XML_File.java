package DataDrivenTestiing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadTheDataFrom_Suite_XML_File {
	WebDriver driver;
	@Parameters({"browser","url","username","password"})
	@Test
	
public void getTheDataXMLFile(String browsername,String url, String username,String Password) throws InterruptedException {
	if (browsername.equals("chrome")) {
	driver	= new ChromeDriver();
	}else if (browsername.equals("edge")) {
	driver	= new EdgeDriver();
	
	}else if (browsername.equals("firefox")) {
		driver = new FirefoxDriver();
	}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	WebElement	 usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.clear();
	Thread.sleep(2000);
	usernameTextField.sendKeys(username);
	Thread.sleep(2000);
 WebElement passwordTextField	= driver.findElement(By.id("password"));
 passwordTextField.clear();
 Thread.sleep(2000);
 passwordTextField.sendKeys(Password);
 Thread.sleep(2000);
 driver.findElement(By.xpath("//button[text()='Sign in']"));
 driver.manage().window().minimize();
 driver.quit();
 
	}
}

