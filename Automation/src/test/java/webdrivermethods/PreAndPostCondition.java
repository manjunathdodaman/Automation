package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPostCondition {
public static void main(String[] args) throws Throwable {
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("https://www.dassault-aviation.com/en/");
	 Thread.sleep(2000);
	 driver.manage().window().fullscreen();
	 Thread.sleep(2000);
	 driver.manage().window().minimize();
	 
	 
	 
}
}
