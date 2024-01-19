package ScreenShotAs;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureHeightAndWidthForStaticPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
 driver.get("https://www.facebook.com/");
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    long  fbLoginPageHeight = (long) jse.executeScript("return document.body.scrollHeight");
    System.out.println("fbLoginPageHeight="+ fbLoginPageHeight);
    long  fbLoginPageWidth = (long) jse.executeScript("return document.body.scrollWidth");
    System.out.println("fbLoginPageWidth="+ fbLoginPageWidth);
    driver.navigate().refresh();
    Thread.sleep(2000);
    long  fbLoginPageHeight02 = (long) jse.executeScript("return document.body.scrollHeight");
    System.out.println("fbLoginPageHeight="+ fbLoginPageHeight02);
    long  fbLoginPageWidth02 = (long) jse.executeScript("return document.body.scrollWidth");
    System.out.println("fbLoginPageWidth="+ fbLoginPageWidth02);
    
    

	}

}
