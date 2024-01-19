package crossBrowsingTesting;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesLogic {

	public static void main(String[] args) throws IOException  {
		Properties prop = new Properties();
		File file = new File("data.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		WebDriver driver = null;
		
		
	if (browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}else if (browserName.equalsIgnoreCase("firefox")) {
		driver =new FirefoxDriver();
	}else if (browserName.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}else {
		System.out.println("provide the valid browser ");
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.quit();
	}

}
