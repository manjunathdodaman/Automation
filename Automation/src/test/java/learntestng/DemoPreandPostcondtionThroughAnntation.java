package learntestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPreandPostcondtionThroughAnntation {
WebDriver driver;


public void executeBeforeClass() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
}
public void executeAfterClass() {
	
}
}
