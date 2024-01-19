   package MultipleWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class windowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newTabBtn")).click();
		driver.findElement(By.id("newWindowsBtn")).click();
		/*Set<String> window = driver.getWindowHandles();
		for(String handle : window) {
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			driver.close();
			
			
		}*/
		/*System.out.println(driver.getTitle());
		ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
		for(int i=1; i<windows.size();i++) {
			driver.switchTo().window(windows.get(i));
			System.out.println("My Current Window is:"+driver.getTitle());
			driver.close();
		}*/
	System.out.println(driver.getTitle());
	ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
	for(int i=0 ; i<windows.size(); i++) {
		driver.switchTo().window(windows.get(i));
		System.out.println("My current Window is:"+driver.getTitle());
		driver.close();
	}

		
	}

}
