package learntestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 


public class PrePostExecution {
	WebDriver driver;
	
	
	@Test(priority = 1,invocationCount = 2)
	public void loginPage() {
		System.out.println("login page has been executed");
		
	}
	@Test(priority = 1,invocationCount = 2)
	public void homePage() {
		System.out.println("home page has been executed");
	}
	@Test(priority = 1,invocationCount = 2)
	public void productPage() {
		System.out.println("prodcut page has been executed");
	}
	@Test(priority = 1,invocationCount = 2)
	public void addtocartPage() {
		System.out.println("add to cart page has been executed");
	}
	@Test(priority = 1,invocationCount = 2)
	public void payemntPage() {
		System.out.println("payment page has been executed");
	}
	@BeforeMethod
	public void executeBeforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
}
	
@AfterMethod
   public void executeAfterMethod() {
	driver.manage().window().minimize();
	driver.close();
}
}
