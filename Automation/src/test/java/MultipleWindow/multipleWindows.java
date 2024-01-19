package MultipleWindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.findElement(By.id("newWindowBtn")).click();
driver.findElement(By.id("newTabBtn")).click();
driver.findElement(By.id("newWindowsBtn")).click();

              Set<String> window = driver.getWindowHandles();
              for (String handle : window) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();


}
			}
}

 

	


