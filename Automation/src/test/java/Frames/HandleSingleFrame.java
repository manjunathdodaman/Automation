package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleSingleFrame {
public static void main(String[] args) {
WebDriver	driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   // WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.get("https://demo.automationtesting.in/Frames.html");
    driver.switchTo().frame("singleFr");
    driver.findElement(By.xpath("//input[@type='text]")).sendKeys("SELENIUM");
    
}
}
