package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
public static void main(String[] args) throws Throwable {
 WebDriver driver =	new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.dassault-aviation.com/en/");
 Thread.sleep(5000);
 driver.navigate().to("https://www.dassault-aviation.com/en/group/");
 Thread.sleep(5000);
 driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
 Thread.sleep(5000);
 driver.navigate().back();
 Thread.sleep(5000);    
 driver.navigate().forward();
 Thread.sleep(5000);
 driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
 Thread.sleep(5000);
 driver.navigate().to("https://www.dassault-aviation.com/en/space/");
 Thread.sleep(5000);
 driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
 Thread.sleep(5000);
 driver.manage().window().minimize();
 
 
}
}
