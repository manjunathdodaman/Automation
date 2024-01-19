package ScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShots {

	public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.the-maharajas.com/");
	    File f =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       Files.copy(f, new File("./manyogi/maharajascreenshot.png"));

	  
	}
	

}
