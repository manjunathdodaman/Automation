package crossBrowsingTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTestNg {
@Test
@Parameters("browser")
	public void browserDemo (String b) {
	
		String browserName = b;
		WebDriver driver= null;
	
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
