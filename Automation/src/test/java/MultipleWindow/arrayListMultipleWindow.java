package MultipleWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayListMultipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.findElement(By.id("newWindowBtn")).click();
driver.findElement(By.id("newTabBtn")).click();
driver.findElement(By.id("newWindowsBtn")).click();
System.out.println(driver.getTitle());

ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
for(int i=0; i<windows.size(); i++) {
	driver.switchTo().window(windows.get(i));
	System.out.println("My Current Window title:"+driver.getTitle());
	driver.close();

}



	
	
}
 




	
	
	



		
		
	}


