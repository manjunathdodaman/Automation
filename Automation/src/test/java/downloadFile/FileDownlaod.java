

package downloadFile;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownlaod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();  
		ChromeOptions options = new ChromeOptions();
		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		    chromePrefs.put("profile.default_content_settings.popups", 0);
		    String downloadFilepath = System.getProperty("user.dir");
		    chromePrefs.put("download.default_directory", downloadFilepath);
		    options.setExperimentalOption("prefs", chromePrefs);
		    
		   WebDriver driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://omayo.blogspot.com/p/page7.html");
		  driver.findElement(By.linkText("ZIP file")).click();
		  
		  
		  
				
		


	}

}
