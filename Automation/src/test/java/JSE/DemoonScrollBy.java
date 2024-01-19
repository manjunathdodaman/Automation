package JSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoonScrollBy {
	public static void main(String[] args) throws InterruptedException {

         WebDriver	driver 	= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	

		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,3000)");

		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,-500)");

		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(0,3000)");

		Thread.sleep(2000); 
		jse.executeScript("window.scrollTo(0,-500)");
		driver.quit();
}
}
