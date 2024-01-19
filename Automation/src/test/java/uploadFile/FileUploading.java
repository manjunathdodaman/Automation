package uploadFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://omayo.blogspot.com/");
	//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\maharajaScreenshot.png");
	
String projectPath =	 System.getProperty("user.dir");
 driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"\\manyogi\\maharajas.png");
		
	}

	
}
