  package checkboxHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
  /* WebElement chkBox = driver.findElement(By.xpath("//form//input[@value='orange']"));
   chkBox.click();
   System.out.println(chkBox.isSelected());
   driver.close();*/

WebElement chkBox = driver.findElement(By.xpath("//form//input[@value='yellow']"));
chkBox.click();
System.out.println(chkBox.isSelected());
driver.close();
 
   
	}
	

}
