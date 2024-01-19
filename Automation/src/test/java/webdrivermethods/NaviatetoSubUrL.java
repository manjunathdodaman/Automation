package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviatetoSubUrL {

	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.dassault-aviation.com/en/");
Thread.sleep(2000);
URL mainUrl =  new URL("https://www.dassault-aviation.com/en/");
  URL grouppage =  new URL(mainUrl,"group/");
  driver.navigate().to(grouppage);
  Thread.sleep(2000);
  URL spacepage =  new URL(mainUrl,"space/");
  driver.navigate().to(spacepage);
  Thread.sleep(2000);
  driver.manage().window().minimize();
  driver.close();
  

	}

}
