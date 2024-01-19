package downloadFile;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class FileDownload1 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://omayo.blogspot.com/p/page7.html");
	   driver.findElement(By.linkText("ZIP file")).click();
	 
	    

	}

}
