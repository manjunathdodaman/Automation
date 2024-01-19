package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelRunDemo {
	WebDriver driver =null;

	@Test
	public void test1() throws InterruptedException  {
		System.out.println("Test1 HasBeen Executed"+Thread.currentThread().getId());
		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test2 HasBeen Executed"+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.close();
}
}
