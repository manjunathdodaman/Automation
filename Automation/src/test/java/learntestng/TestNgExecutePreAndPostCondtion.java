package learntestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExecutePreAndPostCondtion {
	WebDriver driver ;
	
	@Test(priority = 1)
public void loginpage() {
	System.out.println("login has been executed");

}
	@Test(priority = 2)
	public void homepage() {
		System.out.println("Homepage has been executed");
	}
	@Test(priority = 3)
	public void productpage() {
		System.out.println("productpage has been executed");
}
	@Test(priority = 4)
	public void addtocartpage() {
		System.out.println("addtocartpage has been executed");
	}
	@Test(priority = 5)
	public void paymentpage() {
		System.out.println("paymentpage has been executed");
}
	@Test(priority = 6)
	public void logoutpage() {
		System.out.println("logoutpage has been executed");
}


@BeforeMethod
public void executBeforeMethod() {
	driver=	new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
}
@AfterMethod
public void executeAfterMethod() {

	driver.manage().window().minimize();
	driver.quit();
}
}
	
