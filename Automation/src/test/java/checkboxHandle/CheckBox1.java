package checkboxHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {
 
	public static void main(String[] args) {
		WebDriver	driver	= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

/*List<WebElement> chkBox = driver.findElements(By.xpath("//form//input[@type='checkbox']"));
for(int i=0; i<chkBox.size();i++) {
	chkBox.get(i).click();
	chkBox.get(i).getAttribute("value");
	driver.close();
}*/
		
List<WebElement> chkBox = driver.findElements(By.xpath("//form//input[@type='checkbox']"));
 
for(int i=0; i<chkBox.size(); i++) {
	chkBox.get(i).click();
	chkBox.get(i).getAttribute("value");
	driver.close();
}
}
	}


