package ScreenShotAs;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureHeightAndWidthForDynamicpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://www.google.com/doodles");
    JavascriptExecutor jse =(JavascriptExecutor)driver;
long  doodlesPageHeight01 = (long) jse.executeScript("return document.body.scrollHeight");
System.out.println("doodlesPageHeight="+doodlesPageHeight01);
 Thread.sleep(2000);
 driver.navigate().refresh();
 Thread.sleep(2000);
 long  doodlesPageHeight02 = (long) jse.executeScript("return document.body.scrollHeight");
 System.out.println("doodlesPageHeight="+doodlesPageHeight02);
 

     
	}

}
