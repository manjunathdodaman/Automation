package JSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickByUsingJSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(2000);
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("document.getElementById(\"loginButton\").submit();");

		
	}

}
