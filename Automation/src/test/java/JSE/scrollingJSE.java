   package JSE;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingJSE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);

	}

}
