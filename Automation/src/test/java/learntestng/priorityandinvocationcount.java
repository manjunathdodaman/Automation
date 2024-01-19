package learntestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priorityandinvocationcount {
WebDriver driver;	
	@Test
	public void loginpage() {
		System.out.println("loginpage has been executed");
		
	}
	@Test
	
	public void homepage() {
		System.out.println("homepage has been executed");
	}
	@Test
	
	public void productpage(){
		System.out.println("productpage has been executed");
	}
	@Test
	
	public void addtocart() {
		System.out.println("addtocart has been executed");
	}
	@Test
	public void paymentpage() {
		System.out.println("paymentpage has been executed");
	}
	@BeforeMethod
	public void executeBeforeMethod() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
		 @AfterMethod
	public void executeAfterMethod() {

		driver.manage().window().minimize();
		driver.quit();
		
	}
}



