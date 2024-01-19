package DataDrivenTestiing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ReadTheCommonData {
	WebDriver driver;
@Test
	public void LoginToActiTime() throws IOException, InterruptedException {
	FileInputStream  fis = new FileInputStream("./src/test/resources/fileextension.properties");
	    Properties pobj =  new Properties();
	    pobj.load(fis);
   String browsername =     pobj.getProperty("browser");
   if (browsername.equals("chrome")) {
	        driver = new ChromeDriver();
   }
	        else if (browsername.equals("firefox")) {
	        	
				driver = new FirefoxDriver();
	}
	        else if (browsername.equals("safari")) {
			driver	= new SafariDriver();
			}
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   Thread.sleep(2000);
   driver.get(pobj.getProperty("url"));
   Thread.sleep(2000);
    WebElement  usernameTextField = driver.findElement(By.id("username"));
    usernameTextField.sendKeys(pobj.getProperty("username"));
    Thread.sleep(2000);
     WebElement  passwordTextFiled = driver.findElement(By.name("pwd"));
     passwordTextFiled.sendKeys(pobj.getProperty("password"));
     Thread.sleep(2000);
     driver.findElement(By.id("loginButton")).click();
     Thread.sleep(2000);
     driver.manage().window().minimize();
     driver.quit();
     
	}

}
