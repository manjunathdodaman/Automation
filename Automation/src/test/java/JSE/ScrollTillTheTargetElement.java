package JSE;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
   
public class ScrollTillTheTargetElement {
	public static void main(String[] args) throws InterruptedException {
 WebDriver	driver =	new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://www.google.com/doodles");
 Thread.sleep(2000);
 JavascriptExecutor jse = (JavascriptExecutor) driver;
 for(;;) {
	 try {
//WebElement israelIndependanceDoodle = driver.findElement(By.xpath("//a[text()='Israel Independence Day 2023']"));
WebElement israelIndependanceDoodle = driver.findElement(By.xpath("//*[@id=\"homepage\"]"));
		israelIndependanceDoodle.click();
		break;
		
	 }catch ( NoSuchElementException e) {
		// TODO: handle exception
		 jse.executeScript("window.scrollBy(0,500)");
		 driver.quit();
	}
 }
	}
}

